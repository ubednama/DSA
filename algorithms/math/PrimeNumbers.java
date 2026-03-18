import java.util.Scanner;

public class PrimeNumbers {
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();

            boolean res = isPrime(t);
            System.out.printf("Given number %d is %s a prime number.%n", t, res ? "" : "not");
        }
    }
}
