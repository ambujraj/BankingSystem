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
public static String name="Jack";
public static int account;
public static char pass [];
}

class Main{
public static void main(String [] acc){
Scanner sc = new Scanner(System.in);
try{
Account.account = Integer.parseInt(acc[0]);
System.out.println("\t\tWelcome to Ambuj's Banking System - "+Account.name+"\t");
}
catch(Exception e){
System.out.println("\t\tWelcome to Ambuj's Banking System\t");
System.out.print("Account Number Invalid. Enter again:\t");
try{
Account.account = sc.nextInt();
}
catch(Exception ex){
System.out.println("Invalid Credentials.");
System.exit(0);
}
}
Console console = System.console();
if(console==null){
    System.out.println("Error.");
    System.exit(0);
}

Account.pass = console.readPassword("Enter the password:\t");
if(new String(Account.pass).equals("123") && Account.account==11703203){
    System.out.println("Success.");
}
else{
    System.out.println("Invalid Credentials.");
}

}
}
