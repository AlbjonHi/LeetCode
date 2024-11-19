package Solutions;

import java.util.Arrays;

/*
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
 */
public class ImageFlipping {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
    
    public static int[][] flipAndInvertImage(int[][] image) {
        int left = 0;
        int right = image[0].length - 1;
        int tmp;
        for (int row = 0; row < image.length; row++) {
            while (left <= right) {
                tmp = image[row][left];
                image[row][left] = image[row][right];
                if (image[row][left] == 0)
                    image[row][left] = 1;
                else image[row][left] = 0;
                image[row][right] = tmp;
                if (image[row][right] == 0)
                    image[row][right] = 1;
                else image[row][right] = 0;
                right--;
                left++;
            }
            left = 0;
            right = image[0].length - 1;
        }
        return image;
    }
    
    
}
