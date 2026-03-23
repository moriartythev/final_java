import java.util.Scanner;

public class miscellaneous {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter number of elements in a array");
        n = sc.nextInt();
        ;
        double a[] = new double[n];
        System.out.println("enter elements in a array");
        int i;
        for (i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        double min = a[0];
        int pos=0;
        for(i=0;i<n;i++){
            if (a[i]<min) {
                min = a[i];
                pos = i;
            }

        }
        System.out.println(min);
        System.out.println(pos);
    }
}

