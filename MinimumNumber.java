public class MinimumNumber {
    public static void main(String[] args) {
        int[] nums = {0, 119, 55, 90, -1};
        System.out.println(Minimum(nums));
    }
    static int Minimum(int[]arr){
        int ans = arr[0];
        for ( int i = 1; i < arr.length; i++){
            if (arr[i] < ans){
                ans = arr[i];

            }
        }
        return ans;
    }
}
