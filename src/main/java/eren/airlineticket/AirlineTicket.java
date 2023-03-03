/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.airlineticket;


import java.util.Scanner;

/**
 *
 * @author ereni
 */
public class AirlineTicket {
public static boolean[]seats = new boolean[11];

 public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      while (true){
   System.out.println("Please type 1 for First Class and 2 for Economy:");
   
            int userchoice = input.nextInt();
            if (userchoice == 1){
                int seat = assignFirstClass();
                System.out.println("Boarding pass: Seat " + seat + " in First Class.");
            }
            else if(2 == userchoice) {
                int seat = assignEconomy();
                  System.out.println("Boarding pass: Seat " + seat + " in Economy Class.");
            
              } 
               
                    }     
 }
            
 
private static int assignFirstClass(){
    for(int i = 1; i < 6; i++){
 
        if(!seats[i]){
            seats[i] = true;
            return i;
        }
    }
    return 0;
}
private static int assignEconomy(){
    for(int i = 6; i <=10 ; i++){
 
        if(!seats[i]){
            seats[i] = true;
            return i;
        }
    }
    return 0;
}


}





