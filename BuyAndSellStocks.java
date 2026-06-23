// BRUTE FORCE SOLUTION
public class BuyAndSellStocks {
  static int stock(int[]arr){
    int n=arr.length;
    int res=0;

    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        res=Math.max(res, arr[j]-arr[i]);
      }
    }
    return res;
  }

  public static void main(String[] args) {
      int[] arr={2,8,7,5,6,3};
      System.out.println(stock(arr));

  }
}
