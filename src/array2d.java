/*import java.util.*;
public class array2d {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER rows and column");
        int m = sc.nextInt();
        int n =sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("enter elements of array");
        int i;
        int j;
        for( i =0;i<m;i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
            for( i=0;i<m;i++){
                for ( j=0;j<n;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
 */
/*
import java.util.*;
public class array2d {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER rows and column");
        int m = sc.nextInt();
        int n =sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("enter elements of array");
        int i;
        int j;
        for( i =0;i<m;i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        double sqrt=1;
        int sum =0;
        for( i=0;i<m;i++){
            for ( j=0;j<n;j++){
                sum = sum + a[i][j];
            }

        }
        sqrt =Math.sqrt(sum);
        System.out.println("NORM:"+sqrt);
    }
}
 */
/*
import java.util.*;
public class array2d {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER rows and column");
        int m = sc.nextInt();
        int n =sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("enter elements of array");
        int i;
        int j;
        for( i =0;i<m;i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int pro=1;
        for(i=0;i<m;i++){
        pro =1
            for(j=0;j<n;j++){
                pro = pro*a[i][j];
            }
            System.out.println("product of row:"+pro);
        }
    }
}
 */
import java.util.*;
/*public class array2d {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER rows and column");
        int m = sc.nextInt();
        int n =sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("enter elements of array");
        int i;
        int j;
        for( i =0;i<m;i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int pro=1;
        for(j=0;j<n;j++){
            pro =1;
            for(i=0;i<m;i++){
                pro = pro*a[i][j];
            }
            System.out.println("product of column:"+pro);
        }
    }
}
 */
public class array2d {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER rows and column");
        int m = sc.nextInt();
        int n =sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("enter elements of array");
        int i;
        int j;
        for( i =0;i<m;i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int suml=0;
        int sumr=0;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    suml+=a[i][j];
                }
                if (i+j==(n-1)) {
                    sumr+=a[i][j];
                }
            }
        }
        System.out.println("Left diagonal sum = " + suml);
        System.out.println("Right diagonal sum = " + sumr);

        }
    }
