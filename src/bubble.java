//ascending
/*import java.util.*;
public class bubble {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter number of elements in a array");
        n = sc.nextInt();;
        double a[]= new double[n];
        System.out.println("enter elements in a array");
        int i;
        for(i = 0;i<n;i++){
            a[i] = sc.nextDouble();
        }
        System.out.println("unsorted array:");
        for(i=0;i<n;i++){
            System.out.print(a[i]+"");
        }
        System.out.println("\n");
        Double t =0.0;
        for(i=0;i<n;i++){
            for(int j =0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]= t;
                }
            }
        }
        System.out.println("sorted array:");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}*/
//descending
import java.util.*;
public class bubble {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter number of elements in a array");
        n = sc.nextInt();;
        double a[]= new double[n];
        System.out.println("enter elements in a array");
        int i;
        for(i = 0;i<n;i++){
            a[i] = sc.nextDouble();
        }
        System.out.println("unsorted array:");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
        double t =0.0;
        for(i=0;i<n;i++){
            for(int j =0;j<n-i-1;j++){
                if(a[j]<a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]= t;
                }
            }
        }
        System.out.println("sorted array:");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
