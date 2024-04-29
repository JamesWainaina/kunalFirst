public class linearSearchElemnet {
    public static void main(String[] args) {
        int[] nums = {0, 119, 55, 90, 100};
        int target = 90;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }

        for (int element : arr){
            if (element == target){
                return element;
            }
        }
        return -1;
    }
    
}
