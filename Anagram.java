
import java.util.Arrays;

public class Anagram {
  static boolean  isAnagram(String s1, String s2){
    int m=s1.length();
    int n=s2.length();
    if(m != n){
      return false;
    }

    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    char arr1[]=s1.toCharArray();
    char arr2[]=s2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if(Arrays.equals(arr1,arr2)){
      return true;
    }
    return false;
    
  }

  public static void main(String... args){
    String s1="NagaSai";
    String s2="Saigana";

    System.out.println("isAnagram:"+ isAnagram(s1, s2));
  }
}
