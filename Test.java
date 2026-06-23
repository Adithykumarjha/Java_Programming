
import java.util.Scanner;

public class Test {
  static int sumOfArray(int[] arr){
    int n=arr.length;
    int sum=0;

    for(int i=0;i<n;i++){
      sum+=arr[i];
    }

    return sum;
  }

  public static void main(String[] args) {
      System.out.println("Enter the size of the Array:");
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();

      int[] arr = new int[n];

      for(int i=0;i<n;i++){
        System.out.println("Enter element:");
        arr[i]=sc.nextInt();
      }
      System.out.println(sumOfArray(arr));

      sc.close();
  }
}
