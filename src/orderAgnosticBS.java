public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {9, 7, 6, 5, 4, 3};
        int target = 9;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];


        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    start = mid - 1;
                } else {
                    end = mid + 1;
                }
            }else {
                    if (target > arr[mid]){
                        end = mid - 1;
                    } else{
                        start = mid + 1;
                    }
                }
        }
        return -1;
    }
}
