import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {

        int[][] arr = {
            {12, 13, 14,15},
            {2, 3},
            {3, 6, 8, 9}
        };

        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                System.out.println(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
