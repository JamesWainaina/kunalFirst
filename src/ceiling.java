public class ceiling {
    public static void main(String[] args) {
        int[] nums = { 3, 7, 8, 9, 67, 78, 90};
        int target = 67;
        int ans = ceiling(nums, target);
        System.out.println(ans);
    }
    // smallest number greater than/equal to target
    static int ceiling(int[] arr, int target){

        // if the target is greater than the greatest number in the array
        if (target > arr[arr.length -1]){
            return  -1;
        }

        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            }else {
                return mid;
            }
        }
        return start;
    }
}
