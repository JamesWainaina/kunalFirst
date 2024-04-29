public class firstlastOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 5, 5, 8, 10};
        int target = 5;
    }
    public int[] searchRange(int[] nums, int target){

        int[] ans= {-1, -1};
        //check for the first occurrence first
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        return  ans;


    }
    // fuction returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;

        //check for the first occurrence first

        int start = 0;
        int end = nums.length -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;

            }else {
                // potential answer
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

