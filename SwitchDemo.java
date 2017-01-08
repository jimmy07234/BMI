import java.util.Scanner;
/*
 * Demo switch case
 * Input: An number 1~3
 * Output: An number
 */

public class SwitchDemo{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number 1~3:");

        switch(x){
            case 1:
                System.out.println(x);
                //break;
            case 2:
                System.out.println(x);
                break;
            case 3:
                System.out.println(x);
                break;
            default:
                System.out.println("Error!! out of range!");
                break;
        }
    }
}
