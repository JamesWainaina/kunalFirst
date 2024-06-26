import java.util.Arrays;

public class SearchTwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
            {90, 100 ,12},
            {30, 78, 56},
            {45, 1, 8}
        };
        int target = 56;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

   static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col=0; col< arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row ,col};
                }
            }
        }
        return new int[]{-1, -1};
   }

}
