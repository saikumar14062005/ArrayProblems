package Arrays;

public class BuyAndSellStocks {

    static int buy_and_sell_stocks(int arr[]){
        int profit = 0;
        for(int i =  1 ; i < arr.length;i++ ){
            if(arr[i] > arr[i-1] ){
                profit = profit +(arr[i]-arr[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {

        int[] arr = {1,5,3,8,12};
        int k = buy_and_sell_stocks(arr);
        System.out.println(k);
    }
}
