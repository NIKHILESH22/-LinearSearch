import java.util.Scanner;

public class MinInArray {
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

        int min = array[0];
        for (int i = 1; i <n; i++) {
            if (array[i] < min) min = array[i];
        }
        System.out.println("Min is " + min);
        in.close();
    }
}
