public class lineaSearchBoolean {
    public static void main(String[] args) {
        int[] nums = {0, 119, 55, 90, 100};
        int target = 90;
        System.out.println(linearSearch(nums, target));
    }

    static boolean linearSearch(int[] arr,int target){
        if (arr.length == 0){
            return false;
        }

        for (int element : arr){
            if (element == target){
                return true;
            }
        }
        return false;
    }
    
}
