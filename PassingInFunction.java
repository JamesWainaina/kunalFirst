import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums = {2, 4,5 ,9,10};
        change(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void change(int[] arr){
        arr[0] = 99;

    }
    
}
