public class richest {
    public static void main(String[] args) {
        int[][] accounts = {
            {12,78, 90},
            {56, 89, 900}
        };
        // System.out.println(maximumWealth([][90]));
        
    }

    public int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for( int person = 0; person < accounts.length; person++){
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }

            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
    
}
