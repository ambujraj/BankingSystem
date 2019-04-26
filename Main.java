import java.util.Scanner;
import java.io.*;
class Invalid extends Exception{
//Scanner sc = new Scanner(System.in);
//try{
//Account.account = sc.nextInt();
//}
//catch(Exception ex){
//throw new Invalid();
//}
}

class Account{
public static int account;
public static String pass;
}

class Main{
public static void main(String [] acc){
System.out.println("\t\tWelcome to Ambuj's Banking System\t\t");
Scanner sc = new Scanner(System.in);
try{
Account.account = Integer.parseInt(acc[0]);
}
catch(Exception e){
System.out.print("Account Number Invalid. Enter again:\t");
try{
Account.account = sc.nextInt();
}
catch(Exception ex){
System.out.println("Invalid Credentials.");
System.exit(0);
}
}
}
}
