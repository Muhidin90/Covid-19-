import java.util.Scanner;
import java.sql.*;
import java.math.*;

public class App {
  
    public static void main(String[] args) {
     
    patient obj = new patient();
    Admin objA = new Admin();
    objA.getName();
    System.out.println("WELCOME TO COVID-19 TESTER");
    System.out.println("Who are you \n 1: Normal user \n 2:Admin");
    try (Scanner sc = new Scanner(System.in)) {
      int in = sc.nextInt();
      if(in==1 || in ==2 ){
         if(in ==1){
           
          System.out.println("Loading ...");
          System.out.println("Loading ......");
          System.out.println("Loading .........");
          System.out.println("Loading ............");
           System.out.println("Select from the following");   
           System.out.println("_____________________________");
           System.out.println("1.Taste covid 19");
           System.out.println("2.Know common Symptops of covid 19");
           System.out.println("3.Know prevetions of covid 19");
           System.out.println("4.Know covid 19 treatment");
           int jibu = sc.nextInt();
             if (jibu==1){
               obj.uviko19check();
             }else if(jibu ==2){
               obj.displaysmptoms();
             }else if(jibu ==3){
              obj.prevention();
             }else if(jibu ==4){

             }else{
                 System.out.println("wrong input");
             }
         }
      }else{
          System.out.println("wrong input");
      }
    }
    
        //patient obj = new patient();
     

     //obj.uviko19check();

    

        
    }
}

