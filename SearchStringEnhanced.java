import java.util.Arrays;

public class SearchStringEnhanced {
    public static void main(String[] args) {
        String nums = "Jemmo";
        char target = 'o';
        // System.out.println(searchT(nums, target));
        System.out.println(Arrays.toString(nums.toCharArray()));
    }

    static boolean searchT(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
    
}
