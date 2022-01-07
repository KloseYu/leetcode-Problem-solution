int* swapNumbers(int* numbers, int numbersSize, int* returnSize)
{
*returnSize=2;
numbers[0]^=numbers[1];
numbers[1]^=numbers[0];
numbers[0]^=numbers[1];
return numbers;
}
