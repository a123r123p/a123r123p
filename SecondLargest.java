import java.util.Scanner;

public class SecondLargest {
    public static int secondLargest(int[] arr) {
        int largest = -1;
        int second = -1;

        for (int value : arr) {
            if (value > largest) {
                second = largest;
                largest = value;
            } else if (value < largest && value > second) {
                second = value;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements separated by space: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(secondLargest(arr));
        sc.close();
    }
}
