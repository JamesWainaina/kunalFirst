public class floor {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 7, 18, 90, 100};
        int target =  1;
        int ans = floorNum(nums, target);
        System.out.println(ans);

    }
    //greatest number less than/ equal to target
    static int floorNum(int[] arr, int target){
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
        return end;
    }
}

