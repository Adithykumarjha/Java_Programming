public class countEvenOdd {
  static void count(int[]arr){
    int even=0;
    int odd=0;
    int n=arr.length;


    for(int i=0;i<n;i++){
      if(i%2==0){
        even++;
      }else{
        odd++;
      }
    }

    System.out.println("Even Count:"+even+" "+ "Odd Count:"+odd);
  }

  public static void main(String... args){
    int[] arr={2,4,5,8,6,1,3,7,4};
    count(arr);
    

  }
}
