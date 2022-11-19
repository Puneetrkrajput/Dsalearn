package arrays;



public class buy_sell_stock {
    public static void buy_sell(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int i = 0; i < prices.length; i++) {
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }else{
                buyprice=prices[i];
            }
            
            
        }
        System.out.println("profit="+maxprofit);
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        buy_sell(prices);
    }
}
