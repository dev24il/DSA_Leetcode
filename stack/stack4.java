package stack;

public class stack4 {
    public int[] finalPrices(int[] prices) {
        int[] arr = new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int found = 0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    arr[i] = prices[i] - prices[j];
                    found++;
                    break;
                }
            }
            if(found == 0){
                arr[i] = prices[i];
            }
        }
        return arr;
    }
}
