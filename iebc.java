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
      System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
      System.out.println("Success! You are being logged in");
      System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
      //introduce the next part of the program: Registering voters
    Register startprog =new Register();
    startprog.LooperMethod();
    }
    else{
      System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nERROR! The username or password is incorrect\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
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
class Register{
  String fname,sname,lname,dist,div,loc,subloc,ward,consti,count,gen,change;
  int id,option;
  String state;
  int looper=1;
  Register(){
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    Scanner input3 = new Scanner(System.in);
    System.out.println("\nVOTER REGISTRATION\n==================================\nPlease Fill in the form below to register the voter:\nFirst Name:");
    fname = input.nextLine();
    System.out.println("Second Name:");
    sname = input.nextLine();
    System.out.println("Last Name:");
    lname = input.nextLine();
    System.out.println("ID Number:");
    try{
    id= input2.nextInt();
    }
    catch(java.util.InputMismatchException e){
      System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
      System.out.println("Sorry! The input is invalid. Please put a number only");
      System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\nTry here again:");
      id= input3.nextInt();
      System.out.println("\n");
    }
    System.out.println("District:");
    dist = input.nextLine();
    System.out.println("Division:");
    div = input.nextLine();
    System.out.println("Location:");
    loc = input.nextLine();
    System.out.println("Sub-location:");
    subloc = input.nextLine();
    System.out.println("Ward:");
    ward = input.nextLine();
    System.out.println("Constituency");
    consti = input.nextLine();
    System.out.println("County");
    count = input.nextLine();
    System.out.println("Gender:");
    gen = input.nextLine();
    showdetails();
  }
   void changeinfo(){
    System.out.println("\nChoose the detail to edit:");
    System.out.println("1. First name\t4. ID number\t7. Location\t10. Constituency\n2. Second Name\t5. District\t8. Sub-location\t11. County\n3. Last Name\t6. Division\t9. Ward\t12. Gender\n");
    Scanner input2 = new Scanner(System.in);
    Scanner input3 = new Scanner(System.in);
    try{
    option = input2.nextInt();
    }
    catch(java.util.InputMismatchException e){
      System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
      System.out.println("Sorry! The input is invalid. Please put a number only");
      System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\n");
      changeinfo();
    }
    Scanner newinputs = new Scanner(System.in);
    switch(option){
      case 1:{
        System.out.println("\nFirst Name:");
        fname=newinputs.nextLine();};
        break;
      case 2:{
        System.out.println("Second Name:");
        sname=newinputs.nextLine();};
        break;
      case 3:{
        System.out.println("Last Name:");
        lname=newinputs.nextLine();};
        break;
      case 4:{
        System.out.println("ID number:");
        try{
      id= input2.nextInt();
    }
    catch(java.util.InputMismatchException e){
      System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
      System.out.println("Sorry! The input is invalid. Please put a number only");
      System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\nTry here again:");
      id= input3.nextInt();
      System.out.println("\n");
    }
        };
      break;
      case 5:{
        System.out.println("District:");
        dist=newinputs.nextLine();};
      break;
      case 6:{
        System.out.println("Division:");
        div=newinputs.nextLine();};
      break;
      case 7:{
        System.out.println("Location:");
        subloc=newinputs.nextLine();};
      break;
      case 8:{
        System.out.println("Sub-Location:");
        fname=newinputs.nextLine();};
      break;
      case 9:{
        System.out.println("Ward:");
        ward=newinputs.nextLine();};
      break;
      case 10:{
        System.out.println("Constituency:");
        consti=newinputs.nextLine();};
      break;
      case 11:{
        System.out.println("County:");
        count=newinputs.nextLine();};
      break;
      case 12:{
        System.out.println("Gender:");
        gen=newinputs.nextLine();};
      break;
      default:System.out.println("Sorry your choice is invalid.");
    }
   showdetails();
    }
    void showdetails(){
      System.out.println("\nPlease confirm the following details:\n\n==============================================");
      System.out.println("\n\t\tVoter Details\n");
      System.out.println("Name: "+fname+" "+sname+" "+lname);
      System.out.println("ID number: "+id);
      System.out.println("District: "+dist);
      System.out.println("Division: "+div);
      System.out.println("Location: "+loc);
      System.out.println("Sub-Location: "+subloc);
      System.out.println("Ward: "+ward);
      System.out.println("Constituency: "+consti);
      System.out.println("County: "+count);
      System.out.println("Gender: "+gen+"\n");
      System.out.println("==============================================");
      System.out.println("\nIs this information correct?(y/n)");
      Scanner input = new Scanner(System.in);
      change=input.nextLine();
      if(change.equals("n")){
      changeinfo();
      }
      else if(change.equals("y")){
      System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
      System.out.println("SUCCESS! information is being uploaded!");
      System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
      exitStrategy();
      }
  }
  void LooperMethod(){
    while(looper==1){
      Register myRegister = new Register();
    }
  }
  void exitStrategy(){
     System.out.println("Exit or continue(E/C)");
     Scanner input = new Scanner(System.in);
      state = input.nextLine();
      if(state.equals("C")){
        looper=1;
      }
      else if(state.equals("E")){
        looper=0;
        System.out.println("==========================");
        System.out.println("©2017 Cryosoft Corporation");
        System.out.println("==========================");
      }
      else{
        System.out.println("\nSorry The input is invalid....\n");
        exitStrategy();
      }    
      }
}