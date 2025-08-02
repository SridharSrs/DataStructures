class Solution {
    public int secondHighest(String s) {

        Set<Integer> digits = new HashSet<>();

        for ( char c : s.toCharArray()){
            if (Character.isDigit(c)){
                digits.add(c -'0');
            }
        }
        

        if (digits.size() < 2){
            return -1;
        }

        return findSecondHighest(digits);
    }

// 1,12,32 ,14,5 
    private int findSecondHighest(Set<Integer> digits){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

    for (int num : digits){
        if ( num > max1){
            max2 = max1;
            max1 = num;
        }else if (num < max1 && num > max2){
            max2 = num;
        }
    }

    return max2;

    }
}