//Fibonacci Series: (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55)

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int t1 = 0, t2 = 1;

        System.out.print("First " + n + " terms: ");

        for (int i = 0; i <n; i++) {
            System.out.print(t1 + " ");

            int sum = t1 + t2; // Calculate the next term
            t1 = t2; // Update t1 with the value of t2
            t2 = sum; // Update t2 with the sum

            // The loop will repeat until all the terms are generated
        }
    }
}
