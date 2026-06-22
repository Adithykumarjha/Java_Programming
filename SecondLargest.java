public class SecondLargest {
  static int sLargest(int []arr){
    int n=arr.length;
    if(n==0){
      return 0;
    }
    int largest=-1;
    int second=-1;
    for(int i=0;i<n;i++){
      if(arr[i]>largest){
        largest=arr[i];
      }
    }
     for(int j=0;j<n;j++){
        if(arr[j]>second && arr[j]!=largest){
          second=arr[j];
        }
      }
      return second;
  }

  public static void main(String[] args) {
      int []arr={5,12,4,6,14,18,74,65,84,32,99};
      System.out.println("Second Largest element is:"+ sLargest(arr));
  }
}
