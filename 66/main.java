class Solution {
    public int[] plusOne(int[] digits) {
        int carry;
        int last = digits[digits.length - 1] + 1;
        if ( last == 10){
            digits[digits.length-1] = 0;
            carry = 1;
        } else {
            digits[digits.length-1]++ ;
            return digits;
        }
        
        for( int i = digits.length-2 ; i >= 0 ; i-- ){
            last = digits[i] + carry;
            if ( last == 10){
                digits[i] = 0;
            } else {
                digits[i]++ ;
                return digits;
            }
        }
        int newArr[] = new int[digits.length+1];
        newArr[0] = 1;
        for (int i=0 ; i< digits.length ; i++){
            newArr[i+1] = digits[i];
        }
        return newArr;
    }
}