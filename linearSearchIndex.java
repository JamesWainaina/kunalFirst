public class linearSearchIndex {
    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 14 , -9};
        int target = 9;
        int ans = linear(nums, target);
        System.out.println(ans);
    }

    static int linear(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }

}