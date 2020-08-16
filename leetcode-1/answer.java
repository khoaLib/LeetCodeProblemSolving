class Solution {
    public int reverse(int x) {
        int ans = 0;
        int holdNum=0;
        while(x != 0){
            int numTake = x%10;
            ans = ans * 10 + numTake;
            x = x / 10;
            
            if(holdNum!= (ans-numTake)/10){
                return 0;
            }
            holdNum = ans;
        }
        
        return ans;
    }
}