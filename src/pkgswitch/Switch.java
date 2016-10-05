/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;
import java.util.Scanner;
/**
 *
 * @author Aleaya
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of days in the month");
        int days = keyboard.nextInt();
        String monthName;
        switch (days) {
            case 28: monthName = "February";
                     break;
            case 30: monthName = "April June September November";
                     break;
            case 31: monthName = "January March May July August October December";
                     break;
            default: monthName = "No month has exactly " + days + " days";
                     break;
        }
        System.out.println(monthName);
    }
    
}
