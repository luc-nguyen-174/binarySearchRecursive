import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua mang:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap vao cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Nhap vao so can tim:");
        int value = scanner.nextInt();
        int result = binarySearch(arr, 0, arr.length - 1, value);
        if (result != (-1)) {
            System.out.println("so can tim tai vi tri "+result);
        } else System.out.println("Phan tu vua nhap khong co trong mang");
    }

    static int binarySearch(int[] array, int left, int right, int value) {
        int mid = (left + right) / 2;
        while (left < right) {
            if (array[mid] == value) return mid;
            if (array[mid] < value) return binarySearch(array, mid + 1, right, value);
            else return binarySearch(array, left, mid - 1, value);
        }
        return -1;
    }
}