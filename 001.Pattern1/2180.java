class Solution {
    public int countEven(int num) {

        int count = 0;

        for (int i= 1; i < = num ; i++){
            if (digitSum(i)%2==0){
                count+=1;
            }

        }
        return count;
        
    }

    private digitSum(int n){
        int result = 0;
        while (n!=0){
            result += n%10;
            n /=10;
        }

        return result;
    }
}