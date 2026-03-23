import java.util.*;
public class binary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter number of elements in a array");
        n = sc.nextInt();
        double a[] = new double[n];
        System.out.println("enter value to be seached ");
        double m = sc.nextDouble();
        System.out.println("enter elements in a array");
        int i;
        for (i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        int pos = -1;
        int s = 0;
        int e = n - 1;
        int mid;
        while (s <= e) {
            mid = (s + e) / 2;
            if (m == a[mid]) {
                pos = mid;
                break;
            } else if (a[mid] < m) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        if (pos == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element found at position" + (pos + 1));

        }
    }
}
