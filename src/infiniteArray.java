public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 100;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        // start with a box of two
        int start = 0;
        int end = 1;
        while (end < arr.length && target > arr[end]){ // check whether the end index exceeds the length of the array.
            int newStart = end + 1;
            // double the box value
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return  binary_search(arr, target, start, end);
    }
    static int binary_search(int[] arr, int target, int start, int end){
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
        return -1;
    }
}
