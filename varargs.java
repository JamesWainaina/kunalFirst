import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun(2,4,5,56);
        
    }
    
    static void fun(int ...d){
        System.out.println(Arrays.toString(d));
    }
}
