import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        System.out.println("NIKHILESH");

        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array:");
        n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        int sum = 0;
        for (int i = 0; i <n; i++) {
            sum += array[i];
        }
        System.out.println("Sum is " + sum);
        in.close();
    }
}
