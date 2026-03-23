import java.util.*;
public class description {
    String name;
    Long mobno;
    int days;
    int bill;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name mobile number and days");
        name =sc.nextLine();
        mobno =sc.nextLong();
        days = sc.nextInt();
    }
    void charges(){
        if(days<=3){
            bill = 1000*days;
        }
        else if(days<=7){
            bill = 900*(days-3)+1000*3;
        } else if (days>7) {
            bill = 800*(days-7)+1000*3+900*4;
        }
        bill=bill+(int) (0.18*bill);
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("mobile number:"+mobno);
        System.out.println("days:"+days);
        System.out.println("bill:"+bill);
    }
    public static void main(String[]args){
        description obj =new description();
        obj.input();
        obj.charges();
        obj.display();
    }
}
