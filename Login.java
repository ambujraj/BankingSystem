import java.util.Scanner;
class Login{
public static void main(String [] login){
int account = Integer.parseInt(login[0]);
Scanner sc = new Scanner(System.in);
System.out.print("Enter the password:\t");
String pass = sc.next();
if(pass.equals("123") && account==11703203){
System.out.println("Success.");
}
else{
System.out.println("Invalid Credentials.");
}

}

}
