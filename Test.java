import java.util.Arrays;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Fibonacci[] arr = new Fibonacci[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = new Fibonacci(in.nextInt());
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.print('\n');
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i].getNearFib() + " ");
        }
        System.out.print('\n');
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i].getDist() + " ");
        }
    }
}
