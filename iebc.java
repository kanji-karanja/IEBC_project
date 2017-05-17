//import Scanner class here
import java.util.Scanner;
//Create login that deals with logging in to the system
class Login{
  //declare and instantiate variables that will show the number of login attempts
  int trial=1, remaining;
  //this is a constructor
  Login(){
    //Outputs the name of the system
    System.out.println("\t\tIEBC Registration System");
    System.out.println("============================================================");
    //calls the method login_sys() so that it can run the code
    login_sys();
  }
  //this is the method itself
  void login_sys(){
    //declare variables to store user input
    String username,password;
    //this is to check if the number of login attempts has not been exceeded to prevent unauthorised Registering voters
    if(trial<4){
    //prompt the user for username
    System.out.println("Please enter username:");
    //create a new scanner object
    Scanner user= new Scanner(System.in);
    //get user input for username here
    username = user.nextLine();
    //prompt the user for password
    System.out.println("Please enter password:");
    //create a new scanner object
    Scanner pass=new Scanner(System.in);
    //get user input for password
    password= pass.nextLine();
    //compare user input with the password and username that the system has stored
    if(username.equals("IEBC") && password.equals("IEBC")){
      System.out.println("\nSuccess! You are being logged in");
      //introduce the next part of the program: Registering voters
    }
    else{
      System.out.println("\nError! The username or password is incorrect");
      //subtract to get the remaining number of login attempts
      remaining=3-trial;
      //output to the user the number of remaining login attempts
      System.out.println("Number of login attempts remaining: "+remaining+"\n");
      //increment the number of login attempts
      ++trial;
      //call the method again since the login attempt was not successful
      login_sys();
    }
  }
  else{
    //the system closes
    System.out.println("You have exceeded the number of trial to Login. System will now exit!");
  }
}
}
public class iebc{
  public static void main(String args[]){
    //call the Login constructor
    Login myLogin= new Login();
  }
}
