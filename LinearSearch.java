import java.util.Scanner;

class LineaSearch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, target;
        System.out.println("Enter size of array:");
        n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of array:");
        for (int i =0; i <n; i++) {
            array[i] = in.nextInt();
        }

        System.out.println("Enter target element to find:");
        target =  in.nextInt();
        boolean found = false;
        for (int i =0; i <n; i++) {
            if(array[i] == target) {
                System.out.println("Target element found at position " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Target element not found in array");
        in.close();
    }
}