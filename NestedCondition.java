import java.util.Scanner;

public class NestedCondition {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        int CandidateA = sc.nextInt();
        int CandidateB = sc.nextInt();

        if (CandidateA >= CandidateB) {
            if (CandidateA == CandidateB) {
                System.out.println("Both Candidates got equal votes");
            } else {
                System.out.println("CandidateA won with " + (CandidateA - CandidateB) + " votes");
            }
        } else {
            System.out.println("CandidateB won with " + (CandidateB - CandidateA) + " votes");
        }

        sc.close();
    }
}