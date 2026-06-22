public class LargestElement {
  static  int maxElement(int []arr){
    int n=arr.length;
    if(n==0){
      return 0;
    }

    int max=-1;

    for(int i=0;i<n;i++){
      if(arr[i]>max){
        max=arr[i];
      }
    }
    return max;
  }

  public static void main(String... Nagasai) {
      int []arr = {5,7,8,9,45,14,57,8,48,46};
      System.out.println("Largest element in the array is:"+ maxElement(arr));
  }
}
