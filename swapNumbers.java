class Solution {
    public int[] swapNumbers(int[] numbers) {
    numbers[0]^=numbers[1];
    numbers[1]^=numbers[0];
    numbers[0]^=numbers[1];
    return numbers;
    }
}
/*class Solution {
    public int[] swapNumbers(int[] numbers) {
        return new int[]{numbers[1],numbers[0]};
    }
}*/
    
