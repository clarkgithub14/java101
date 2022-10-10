/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clarkrobin;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Clarkrobin {

    public static void main(String[] args) {
        
        
        Scanner rc = new Scanner(System.in);
     String checkn = "clark",checkpass = "robin";
         String username, userpassword;
         int pay=0;
         int C = 3;
         boolean success;
         do{
             if (C!=1)
             {
                  
                 System.out.println(" You only have "+C+" attempts");
             }
             else
             {
                   System.out.println(" You only have "+C+" attempts");
             }
               System.out.println("Enter Your Username and Password");
                 System.out.println("Enter your username:");
                 username = rc.nextLine();
                   System.out.println("Enter your password:");
                   userpassword = rc.nextLine();
                   C--;
                   if (username.equals(checkn)&userpassword.equals(checkpass))
                   {
                       success = true;
                        }
                   else
                   {
                            success = false;
                            if(C>0)
                            {
                                System.out.println(" Username or password INCORRECT.Try again ");
                            }
                            
                            }
              
         }
         while (C>0&success==false);
         
         if (success==true)
         {
                     System.out.println(" Username and Password Accesed");
                    
                     boolean x;
               
                    
                
System.out.println("what do you want to use? input (1) for simple interest and (2) for compound interest:");       
                       String use = rc.next();

                       
                       if (use.equals("1"))
                        
                       {
                            
                       {
                
                System.out.println("Enter amount:");
                int amount = rc.nextInt();
              
                  System.out.println("Enter years:");
                int years = rc.nextInt();
                  System.out.println("Enter rate:");
                int rate = rc.nextInt();
                               
                int interest = years*amount*rate/100;
                
                   System.out.println("the amount is :"+amount);
                    System.out.println("the years is :"+years); 
                      System.out.println("the rate is :"+rate);
             System.out.println("the interest is :"+interest); 
                }}
                       else if (use.equals("2"))
                       {
                           System.out.println("Enter  principal:");
                int   principal = rc.nextInt();
                
                  System.out.println("Enter Rate:");
                int Rate = rc.nextInt();
            
                  System.out.println("Enter number:");
                int number = rc.nextInt();
                
                  System.out.println("Enter time:");
                int  time = rc.nextInt();
                       
                int compoundinterest =  principal*1+Rate/number*number*time;
                
                     System.out.println("the pricipal is :" + principal);
                     System.out.println("the rate is :" + Rate);
                     System.out.println("the number is:"+number);
                     
                     System.out.println("the time is :" + time); 
                     System.out.println("the  compound interest is :"+ compoundinterest); 
                               }
                       
                       else
                       {
                           System.out.println("INVALID");
                       }
                    }
                    
             }
    }

 

