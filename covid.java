import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

abstract class covid {
    String name;
    String email;
    String location;  
    int smell;
    int breth; 
    int cough;
    int taste;
    String DB_URL = "jdbc:mysql://localhost:3306/COVID";
    String USER = "root";
    String PASS = " ";
   
    //patient newpaPatient = new patient();

    //tester method 
  public void displaysmptoms(){
      System.out.println("Most common Covid symptoms are :\n *fever \n *cough \n *tiredness \n *loss of taste or smell");
    }

    public void prevention(){
        System.out.println("Wear a mask.Save lives. \n *Wear a mask \n *Clean your hands \n *Keep a safe distance");
    }


    public void uviko19check(){
      
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
      Statement stmt = conn.createStatement();
   ) {		      
      System.out.println("Inserted records into the table...");   	  
   } catch (SQLException e) {
     System.out.println("Failed");
   } //end
    Scanner sc = new Scanner(System.in);
     //--personal info
    System.out.println("Type in your name");
    name = sc.nextLine(); 
    
    System.out.println("Enter your email");
    email = sc.nextLine(); 

    System.out.println("Location");
    location = sc.nextLine(); 
    //System.out.println(".....");
    
   
     System.out.println("Please select 1 to agree or 0 to dissagree to the following questions");
     System.out.println("Do you experience loss of smell ?");
     smell = sc.nextInt();
     System.out.println("Do you experience Difficult in breathing");
     breth = sc.nextInt();
     System.out.println("are you coughing");
     cough =sc.nextInt();
     System.out.println("Do you experience loss of test in Food ");
     taste =sc.nextInt();
       
        if(smell == 1 && breth == 1 && cough == 1 & taste ==1){
           System.out.println("you are positive");
           //send data to db here.
        }
        else{
         System.out.println("You are negative");
         //send data to db here.
        }
}
}
