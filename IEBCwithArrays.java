//import Scanner class here
import java.util.Scanner;
public class IEBCwithArrays{
  public static void main(String args[]){
    //call the Login constructor
    Login myLogin= new Login();
  }
}

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
class Register{
  String details[]={"fname","sname","lname","dist","div","loc","subloc","ward","consti","count","gen","change","state"};
  //String fname,sname,lname,dist,div,loc,subloc,ward,consti,count,gen,change;
  int id,option,looper=1;
  Register(){
    Scanner input= new Scanner(System.in);
    Scanner input2= new Scanner(System.in);
    System.out.println("\nVOTER REGISTRATION\n==================================\nPlease Fill in the form below to register the voter:\nFirst Name:");
    //fname = input.nextLine();
    details[0] = input.nextLine();
    System.out.println("Second Name:");
    //sname = input.nextLine();
    details[1] = input.nextLine();
    System.out.println("Last Name:");
    //lname = input.nextLine();
    details[2] = input.nextLine();
    System.out.println("ID Number:");
    id= input2.nextInt();
    System.out.println("District:");
    //dist = input.nextLine();
    details[3] = input.nextLine();
    System.out.println("Division:");
    //div = input.nextLine();
    details[4] = input.nextLine();
    System.out.println("Location:");
    //loc = input.nextLine();
    details[5] = input.nextLine();
    System.out.println("Sub-location:");
    //subloc = input.nextLine();
    details[6] = input.nextLine();
    System.out.println("Ward:");
    //ward = input.nextLine();
    details[7] = input.nextLine();
    System.out.println("Constituency");
    //consti = input.nextLine();
    details[8] = input.nextLine();
    System.out.println("County");
    //count = input.nextLine();
    details[9] = input.nextLine();
    System.out.println("Gender:");
    //gen = input.nextLine();
    details[10] = input.nextLine();
    showdetails();
  }
   void changeinfo(){
    System.out.println("\nChoose the detail to edit:");
    System.out.println("1. First name\t4. ID number\t7. Location\t10. Constituency\n2. Second Name\t5. District\t8. Sub-location\t11. County\n3. Last Name\t6. Division\t9. Ward\t12. Gender\n");
    Scanner input2 = new Scanner(System.in);
    option = input2.nextInt();
    Scanner newinputs = new Scanner(System.in);
    switch(option){
      case 1:{
        System.out.println("\nFirst Name:");
        details[0]=newinputs.nextLine();};
        break;
      case 2:{
        System.out.println("Second Name:");
        details[1]=newinputs.nextLine();};
        break;
      case 3:{
        System.out.println("Last Name:");
        details[2]=newinputs.nextLine();};
        break;
      case 4:{
        System.out.println("ID number:");
        id=input2.nextInt();};
      break;
      case 5:{
        System.out.println("District:");
        details[3]=newinputs.nextLine();};
      break;
      case 6:{
        System.out.println("Division:");
        details[4]=newinputs.nextLine();};
      break;
      case 7:{
        System.out.println("Location:");
        details[5]=newinputs.nextLine();};
      break;
      case 8:{
        System.out.println("Sub-Location:");
        details[6]=newinputs.nextLine();};
      break;
      case 9:{
        System.out.println("Ward:");
        details[7]=newinputs.nextLine();};
      break;
      case 10:{
        System.out.println("Constituency:");
        details[8]=newinputs.nextLine();};
      break;
      case 11:{
        System.out.println("County:");
        details[9]=newinputs.nextLine();};
      break;
      case 12:{
        System.out.println("Gender:");
        details[10]=newinputs.nextLine();};
      break;
      default:System.out.println("Sorry your choice is invalid.");
    }
   showdetails();
    }
    void showdetails(){
      System.out.println("\nPlease confirm the following details:\n\n==============================================");
      System.out.println("\n\t\tVoter Details\n");
      System.out.println("Name: "+details[0]+" "+details[1]+" "+details[2]);
      System.out.println("ID number: "+id);
      System.out.println("District: "+details[3]);
      System.out.println("Division: "+details[4]);
      System.out.println("Location: "+details[5]);
      System.out.println("Sub-Location: "+details[6]);
      System.out.println("Ward: "+details[7]);
      System.out.println("Constituency: "+details[8]);
      System.out.println("County: "+details[9]);
      System.out.println("Gender: "+details[10]+"\n");
      System.out.println("==============================================");
      System.out.println("\nIs this information correct?(y/n)");
      Scanner input = new Scanner(System.in);
      details[11]=input.nextLine();
      if(details[11].equals("n")){
      changeinfo();
      }
      else if(details[11].equals("y")){
      System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
      System.out.println("SUCCESS! information is being uploaded!");
      System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
      System.out.println("Exit or continue(E/C)");
      details[12] = input.nextLine();
      if(details[12].equals("C")){
        looper=1;
      }
      else if(details[12].equals("E")){
        looper=0;
        System.out.println("==========================");
        System.out.println("©2017 Cryosoft Corporation");
        System.out.println("==========================");
      }
      }
  }
  void LooperMethod(){
    while(looper==1){
      Register myRegister = new Register();
    }
  }
}
