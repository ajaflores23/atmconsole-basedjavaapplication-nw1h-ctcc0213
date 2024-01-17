
package flores_axeljohn_atmconsole.basedapplication_bsinfotech1h;

import java.util.Scanner;

public class Flores_AxelJohn_atmconsoleBasedapplication_BSInfotech1H {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] PINAMOUNT = {1234,10000};    // The default PIN number and balance are stored here
        int limit = 0; 
        while (true){    // A loop to give the user another try if he/she entered the wrong PIN 
            limit++;
            System.out.print("Enter your PIN number: ");
            int PIN = input.nextInt();  // Enter of PIN number 
          if (PIN == PINAMOUNT[0]){ // Proceeds to the program if the entered PIN number is equal to the on stores in the array
              System.out.println("-----------------------------------------------");
              System.out.println("Welcome Axel!\n");
              break;
          }else{    // If the PIN is incorrect the user will be returned to the PIN input 
              System.out.println(" "); 
              System.out.println("Invalid PIN. Please try again.("+ (3 - limit) +"/3)");    // Displays the limit and the number of tries the user used already
          }
          if(limit==3){ // Limits the wrong input of PIN number to three tries only 
             System.out.println("You've entered an incorrect PIN too many times. Your account will be locked for 12 hours");
             System.exit(0); // Exits the program
        }
         
         }
        while (true){   
           System.out.println(" Select 1 for Check Balance\n Select 2 for Withdraw\n Select 3 for Deposit\n Select 4 for EXIT\n");  // Shows the transactions 
           System.out.print("Select your transaction: ");
           int option = input.nextInt();    // The user will input the trasaction he/she wants to do here
           System.out.println("-----------------------------------------------");
           switch(option){
               
               case 1:  // Check balance transaction
                   
                   System.out.println("Your current balance is: "+"₱" +PINAMOUNT[1]);   // Shows the current balance that is stored in the array
                   System.out.println("-----------------------------------------------");
                   System.out.println("Do you want to perform another transaction?");      // The program will ask if the user wants to do another transaction
                   System.out.println("Select 1 for YES\nSelect 2 for NO\n");
                   while(true){
                   System.out.print("Select your option: ");
                   int YS = input.nextInt();    // User will input his/her choice
                     if(YS == 1){   // The loop will break and will return to the transaction menu
                         System.out.println("-----------------------------------------------");
                         break;
                     }else if(YS == 2){     // The program will end
                         System.out.println("-----------------------------------------------");
                         System.out.println("Thank you for using ATM , please come back again!");
                         System.exit(0);
                     }else{     // If the user entered a wrong number the program will return on the Yes/No option menu
                         System.out.println(" ");
                         System.out.println("Invalid, please try again");
                     }
                   }
                   break;
               case 2:  // Withdraw Transaction
                   
                    while(true){
                    System.out.print("Enter the amount you want to withdraw: ");
                    int WD = input.nextInt();   // The user will input the amount to withdraw
                    if (WD <= PINAMOUNT[1] && WD >= 0 ){     // The amount should be equal or less than the current balance and a positve numeber
                        int rs = PINAMOUNT[1] - WD;     // The current balance will be subtracted to the amount the user want to withdraw
                        System.out.println(" ");
                        System.out.println("You've successfully withdrawn " +"₱" +WD);
                        System.out.println("Your current balance is "+"₱"+ rs);
                        System.out.println("-----------------------------------------------");
                        PINAMOUNT[1] = rs;       // The current balance in the array will be replaced by the total amount subtracted
                        break;
                    }else{      // If the amount to withdraw is more than the current balance the program will return to the withdraw input menu
                        System.out.println(" ");
                        System.out.println("The amount you've entered is more than your current balance or a negative number. Please try again");
                        System.out.println(" ");
                    }
                    }
                      System.out.println("Do you want to perform another transaction?");     // The program will ask if the user wants to do another transaction
                   System.out.println("Select 1 for YES\nSelect 2 for NO\n");
                   while(true){
                   System.out.print("Select your option: ");
                   int YS = input.nextInt();     // User will input his/her choice
                     if(YS == 1){   // The loop will break and will return to the transaction menu
                         System.out.println("-----------------------------------------------");
                         break;
                     }else if(YS == 2){      // The program will end
                         System.out.println("-----------------------------------------------");
                         System.out.println("Thank you for using ATM , please come back again!");
                         System.exit(0);
                     }else{      // If the user entered a wrong number the program will return on the Yes/No option menu
                         System.out.println(" ");
                         System.out.println("Invalid, please try again");
                     }
                   }
                     break;
                   
               case 3:      // Deposit Transaction
                    while(true){
                    System.out.print("Enter the amount you want to Deposit: ");
                    int DP = input.nextInt();    // The user will input the amount to deposit
                    if (DP >= 0){
                    int st = DP + PINAMOUNT[1];     // The amount to deposit will be added to the current balance 
                    System.out.println(" ");
                    System.out.println("You've successfully deposited "+"₱" + DP);
                    System.out.println("Your current balance now is "+"₱"+ st);
                    System.out.println("-----------------------------------------------");
                    PINAMOUNT[1] = st;  // The current balance in the array will be replaced by the total amount added
                    break;
                    }else{
                        System.out.println(" ");
                        System.out.println("The number you've entered is a negative number, please try again.");
                    }
                    }
                      System.out.println("Do you want to perform another transaction?");     // The program will ask if the user wants to do another transaction
                   System.out.println("Select 1 for YES\nSelect 2 for NO\n");
                   
                   while(true){
                   System.out.print("Select your option: ");
                   int YS = input.nextInt();     // User will input his/her choice
                     if(YS == 1){   // The loop will break and will return to the transaction menu
                         System.out.println("-----------------------------------------------");
                         break;
                     }else if(YS == 2){      // The program will end
                         System.out.println("-----------------------------------------------");
                         System.out.println("Thank you for using ATM , please come back again!");
                         System.exit(0);
                     }else{      // If the user entered a wrong number the program will return on the Yes/No option menu
                             
                         System.out.println(" ");
                         System.out.println("Invalid, please try again");
                     }
                   }
                     break;
                     
               case 4:      // Exit
                   
                   System.out.println("Thank you for using ATM , please come back again!");
                   System.exit(0);      // The program will end
               default:     // If the user entered a wrong number the program will return to the transaction menu
                   System.out.println(" ");
                   System.out.println("Invalid, Please try again.");
                   System.out.println(" ");
           }
        
        }
    
    }
    
}
