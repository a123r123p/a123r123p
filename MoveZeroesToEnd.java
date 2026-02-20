import java.util.Arrays;
import java.util.Scanner;

class Solution {
    void pushZerosToEnd(int[] arr) {
        int size = arr.length;
        if (size <= 1) {
            return;
        }

        int z = 0;
        for (int nz = 0; nz < size; nz++) {
            if (arr[nz] != 0) {
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                z++;
            }
        }
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

        Solution sol = new Solution();
        sol.pushZerosToEnd(arr);

        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
