public class SearchrangeString {
    public static void main(String[] args) {
        int[] arr = {1,9, 10, 90, 100, 79};
        int target = 90;
        System.out.println(linear(arr, target, 1, 4));
        
    }

    static int linear(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }

        for (int index = start; index <= end; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
    
}
