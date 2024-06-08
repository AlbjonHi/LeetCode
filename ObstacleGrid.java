import java.util.HashMap;
import java.util.Map;

public class ObstacleGrid {
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int pathsNum = 0;
        int [][] memoGrid=obstacleGrid;
        // Find the maximum number of rows and columns
        int maxRows = obstacleGrid.length; // Number of rows
        int maxColumns = obstacleGrid[0].length;
        
        for (int m = 0; m < maxRows; m++) {
            for (int n = 0; n < maxColumns; n++) {
                if (obstacleGrid[m][n] == 1) {
                    n-=2;
                }
                if (m == maxRows - 1 && n == maxColumns - 1) {
                    pathsNum++;
                    n=-1;
                    m=0;
                }
                if (m == maxRows - 1 && n != maxColumns - 1) {
                    n++;
                    }
                
                if (n == maxColumns - 1 && m!= maxRows - 1) {
                    n--;
                    m++;
                }
            }
            
        }
        return pathsNum;
    }
}




