import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter number of elements in a array");
        n = sc.nextInt();
        String a[]= new String [n];
        System.out.println("enter value to be seached ");
        String m = sc.nextLine();
        System.out.println("enter elements in a array");
        int i;
        for(i = 0;i<n;i++){
            a[i] = sc.nextLine();
        }
        for(i = 0;i<n;i++){
            if(m==a[i]){
            break;}
        }
        if(i<n){
        System.out.println("value found at:"+i);
    }
        else{
            System.out.println("element not found");
        }

}

}

