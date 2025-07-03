import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, target;
        System.out.println("Enter size of array:");
        n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of sorted array:");
        for (int i =0; i <n; i++) {
            array[i] = in.nextInt();
        }

        System.out.println("Enter target element to find:");
        target =  in.nextInt();

        int start = 0;
        int end = n - 1;
        int mid;
        boolean found = false;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (array[mid] == target) {
                System.out.println("Target element found at position " + (mid + 1));
                found = true;
                break;
            }
            else if (target > array[mid])   start = mid + 1;
            else   end = mid - 1;
        }

        if (!found) System.out.println("Target element not found in array");
        in.close();
    }
}
