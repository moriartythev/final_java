/*import java.util.*;
public class STRING {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
         String str =sc.nextLine();
         int v=0;
         int c=0;
         for (int i=0;i<str.length();i++){
             char  ch = str.charAt(i);
             ch =Character.toLowerCase(ch);
             if (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
                 v++;
             }
             else if (Character.isLetter(ch)){
                 c++;
             }
         }
         if(c==v){
             System.out.println("it is superstring");
         }
         else {
             System.out.println("it is not a superstring");
         }
    }
}
 */
/*
import java.util.*;
public class STRING {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str =sc.nextLine();
        String result ="";
        for (int i=0;i<str.length();i++){
            char  ch = str.charAt(i);
            ch =Character.toLowerCase(ch);
            if (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
                ch = (char) (ch+1);
            }
            else if (Character.isLetter(ch)){
                ch =(char) (ch -1);
            }
            result =result+ch;
        }
        System.out.println(result);
        }
    }

 */
/*
import java.util.*;
public class STRING {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str =sc.nextLine();
        String result ="";
        for (int i=0;i<str.length();i++){
            char  ch = str.charAt(i);
            ch =Character.toLowerCase(ch);
            if (){
                ch = (char) ch+1;
            }
            else if (Character.isLetter(ch)){
                ch =(char) ch -1;
            }
            result =result+ch;
        }
        System.out.println(str);
    }
}
}
 */
/*
import java.util.*;
public class STRING {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str =sc.nextLine();
        String result ="";
        int c1=0;
        int c2 =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='@'){
                c1++;
            }
            if(ch=='.'){
                c2++;
            }
        }
        if(c1==1&& c2==1){
            int p = str.indexOf('@');
            int q =str.indexOf('.');
            String subdomain= str.substring(p+1,q);
            String domain =str.substring(q+1);
            if(subdomain.equals("gmail")&&domain.equals("com")){
                System.out.println("it is a vaild email ");
            }
            else{
                System.out.println("not a valid email");
            }
        }
        }

    }



 */
/*
import java.util.*;
public class STRING {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str =sc.nextLine();
        int v=0;
        int d=0;
        int s =0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);
            if(Character.isLetter(ch) ){
                v++;
            } else if (Character.isDigit(ch)){
                d++;
            }
            else{
                s++;
            }

        }
        String r ="";
        r=str.toUpperCase();
        System.out.println(r);
        System.out.println(v);
        System.out.println(d);
        System.out.println(s);

    }

}
 */
import java.util.*;
public class STRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();
        String r = "";
        for (int i = str.length() - 1; i >=0; i--) {
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);
            r=r+ch;

        }
        System.out.println(r);


    }
}




