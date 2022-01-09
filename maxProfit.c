int maxProfit(int* prices, int pricesSize){
    int maxPro = 0;
    int min = prices[0];    //先让0位置为最小
    for(int i=1; i<pricesSize; i++){
        if(prices[i] > min){
            maxPro = fmax(maxPro, prices[i] - min);   //如果后面比最小大，求差，与现有最大比取最大值
        }else if(prices[i] < min){
            min = prices[i];    //如果后面比最小还小，那么替换最小值，从这里继续算起
        }
    }
    return maxPro;
}
