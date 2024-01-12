
package flores_axeljohn_atmconsole.basedapplication_bsinfotech1h;

import java.util.Scanner;

public class Flores_AxelJohn_atmconsoleBasedapplication_BSInfotech1H {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] PINAMOUNT = {1234,10000};
        int limit = 0;
        while (limit<3){
            limit++;
            System.out.print("Enter your PIN number: ");
            int PIN = input.nextInt();
          if (PIN == PINAMOUNT[0]){
              System.out.println("-----------------------------------------------");
              System.out.println("Welcome Axel!\n");
              break;
          }else{
              System.out.println(" ");
              System.out.println("Invalid PIN. Please try again.("+ (3 - limit) +"/3)");
          }
          if(limit==3){
             System.out.println("You've entered an incorrect PIN too many times. Your account will be locked for 12 hours");
             System.exit(0);
        }
         
         }
        while (true){
           System.out.println(" Select 1 for Check Balance\n Select 2 for Withdraw\n Select 3 for Deposit\n Select 4 for EXIT\n");
           System.out.print("Select your transaction: ");
           int option = input.nextInt();
           System.out.println("-----------------------------------------------");
           switch(option){
               
               case 1:
                   
                   System.out.println("Your current balance is: "+"₱" +PINAMOUNT[1]);
                   System.out.println("-----------------------------------------------");
                   System.out.println("Do you want to perform another transaction?");
                   System.out.println("Select 1 for YES\nSelect 2 for NO\n");
                   while(true){
                   System.out.print("Select your option: ");
                   int YS = input.nextInt();
                     if(YS == 1){
                         System.out.println("-----------------------------------------------");
                         break;
                     }else if(YS == 2){ 
                         System.out.println("-----------------------------------------------");
                         System.out.println("Thank you for using ATM , please come back again!");
                         System.exit(0);
                     }else{
                         System.out.println(" ");
                         System.out.println("Invalid, please try again");
                     }
                   }
                   break;
               case 2:
                   
                    while(true){
                    System.out.print("Enter the amount you want to withdraw: ");
                    int WD = input.nextInt();
                    if (WD < PINAMOUNT[1]){
                        int rs = PINAMOUNT[1] - WD;
                        System.out.println(" ");
                        System.out.println("You've successfully withdrawn " +"₱" +WD);
                        System.out.println("Your current balance is "+"₱"+ rs);
                        System.out.println("-----------------------------------------------");
                        PINAMOUNT[1] = rs;
                        break;
                    }else{
                        System.out.println(" ");
                        System.out.println("The amount you've entered is more than your current balance. Please try again");
                        System.out.println(" ");
                    }
                    }
                      System.out.println("Do you want to perform another transaction?");
                   System.out.println("Select 1 for YES\nSelect 2 for NO\n");
                   while(true){
                   System.out.print("Select your option: ");
                   int YS = input.nextInt();
                     if(YS == 1){
                         System.out.println("-----------------------------------------------");
                         break;
                     }else if(YS == 2){
                         System.out.println("-----------------------------------------------");
                         System.out.println("Thank you for using ATM , please come back again!");
                         System.exit(0);
                     }else{
                         System.out.println(" ");
                         System.out.println("Invalid, please try again");
                     }
                   }
                     break;
                   
               case 3:
                 
                    System.out.print("Enter the amount you want to Deposit: ");
                    int DP = input.nextInt();
                    int st = DP + PINAMOUNT[1];
                    System.out.println(" ");
                    System.out.println("You've successfully deposited "+"₱" + DP);
                    System.out.println("Your current balance now is "+"₱"+ st);
                    System.out.println("-----------------------------------------------");
                    PINAMOUNT[1] = st;
                    
                      System.out.println("Do you want to perform another transaction?");
                   System.out.println("Select 1 for YES\nSelect 2 for NO\n");
                   
                   while(true){
                   System.out.print("Select your option: ");
                   int YS = input.nextInt();
                     if(YS == 1){
                         System.out.println("-----------------------------------------------");
                         break;
                     }else if(YS == 2){
                         System.out.println("-----------------------------------------------");
                         System.out.println("Thank you for using ATM , please come back again!");
                         System.exit(0);
                     }else{
                             
                         System.out.println(" ");
                         System.out.println("Invalid, please try again");
                     }
                   }
                     break;
                     
               case 4:
                   
                   System.out.println("Thank you for using ATM , please come back again!");
                   System.exit(0);
               default:
                   System.out.println(" ");
                   System.out.println("Invalid, Please try again.");
                   System.out.println(" ");
           }
        
        }
    
    }
    
}
