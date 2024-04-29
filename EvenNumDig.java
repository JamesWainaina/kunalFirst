public class EvenNumDig {
    public static void main(String[] args) {
        int[] arr= { 5, 8, 19, 78};
        // System.out.println(findNumbers(arr));
        System.out.println(digits(-93739));
    }
    static int findNumbers(int[]nums){
        int count = 0;
        for(int num: nums){
            count++;
        }
        return count;
    }

    static boolean even(int num){
        // int NumberOfDigits = digits(num);
        // if (NumberOfDigits % 2 == 0){
        //     return true;
        // }
        // return false;
        return num % 2 == 0;
    }

    static int digits2(int num){
        if (num < 0){
            num = num * -1;

        }
        return (int)(Math.log10(num)) + 1;
    }

    static int digits(int num){
        int count = 0;
        // converting a number to poditive
        if (num < 0){
            num = num * -1;
        }
        while ( num > 0) {
            count ++;
            num = num / 10;
        
        }
        return count;
    }
}
