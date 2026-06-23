public class StockBuy {
  static int stockBuy(int[] arr){
    int n=arr.length;
    int minProfit=arr[0];
    int res=0;
    for(int i=1;i<n;i++){
      minProfit=Math.min(minProfit,arr[i]);
      res=Math.max(res,arr[i]-minProfit);
    }

    return res;
  }
  public static void main(String[] args) {
      int[] arr={2,4,8,4,6,5,2,9};
      System.out.println(stockBuy(arr));
  }
}
