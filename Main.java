import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int N = sc.nextInt();

        // printing all N natural numbers using printNaturalNumbers() method
        // of NaturalNumbers clas
        NaturalNumbers.printNaturalNumbers(N);

        // closing resource
        sc.close();
    }
}