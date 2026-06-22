public class SmallestElement {
  static int smallest(int[] arr){
    int n=arr.length;

    if(n==0){
      return 0;
    }
    int smallest=Integer.MAX_VALUE;

    for(int i=0;i<n;i++){
      if(arr[i]<smallest){
        smallest=arr[i];
      }
    }
    return smallest;
  }

  public static void main(String[] args) {
      int arr[]={5,7,1,6,3,8,4,9};
      System.out.println("The smallest element is:"+smallest(arr));
  }
}
