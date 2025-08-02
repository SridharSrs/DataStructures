class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums){
            int digit_count = 0;
            while (num != 0) {
                digit_count+=1;
                n /= 10;
        }
        if (digit_count%2==0){
            count+=1;
        }
        }
        return count;
        
    }
}





class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums){
            int digit_count = (int) (Math.log10(num))+1;    
            if (digit_count%2==0){
            count+=1;
        }
        }
        return count;
        
    }
}