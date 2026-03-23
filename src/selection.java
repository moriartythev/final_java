//mimimum
/*import java.util.Scanner;

public class selection {
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
        double min =0.0;
        double t =0.0;
        int pos =0;
        for(i=0;i<n-1;i++){
            min =a[i];
            pos =i;
            for (int j =i;j<n;j++){
                if(a[j]<min){
                min=a[j];
                pos =j;
                }
            }
            t=a[i];
            a[i]=a[pos];
            a[pos]=t;
        }
        System.out.println("sorted array:");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
}*/
//maximum is just  if(a[j]>min)