import java.util.*;
public class user{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the username:");
        String a=sc.nextLine();
        System.out.println("reenter the string:");
        String b=sc.nextLine();
        if(a.equals(b)){
            System.out.println("username is valid");
        }
        else{
            System.out.println("username is invalid");
        }
    }
}