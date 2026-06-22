public class CountVowels {
  static int count(String s1){
    int n=s1.length();
    s1=s1.toLowerCase();
    int count=0;

    for(int i=0;i<n;i++){
      char c = s1.charAt(i);
        if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
          count++;
        }
    }
    return count;
  }
  public static void main(String[] args) {
      String s1="NagasaiReddy";
      System.out.println("No. of vowels:"+count(s1));
  }
}
