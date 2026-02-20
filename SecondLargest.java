import java.util.Scanner;

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if (arr.length < 2) {
            return -1;
        }
        int max1, max2;
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else if (arr[0] < arr[1]) {
            max1 = arr[1];
            max2 = arr[0];
        } else {
            max1 = arr[0];
            max2 = Integer.MIN_VALUE;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        if (max2 == Integer.MIN_VALUE) {
            return -1;
        }
        return max2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements seperated by space: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        System.out.println(sol.getSecondLargest(arr));
        sc.close();
    }
}
