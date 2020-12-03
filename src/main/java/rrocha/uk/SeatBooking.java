package rrocha.uk;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class SeatBooking {

    static SeatPlan seats = new SeatPlan(); //create object from SeatPlan.java
    static SeatBooking main = new SeatBooking(); //create object from SeatBooking.java

    static Random rand = new Random();
    static Scanner input = new Scanner(System.in);

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        while(true) {
            main.getMenu();
            int option = input.nextInt();
            System.out.println();

            int row = rand.nextInt(1+11); //randomly select row
            int column = rand.nextInt(1+6); //randomly select column

            //switch case for options
            switch(option) {

                //get seat plan
                case 1:
                    seats.getSeatPlan();
                    break;

                //randomly allocate a seat
                case 2:

                    

                    // while(seat_value == 1) {
                    //     row = rand.nextInt(1+11);
                    //     column = rand.nextInt(1+6);
                    // }

                    seats.getSeatValue(row, column);

                    // if(seat_value == 1) {
                    //     System.out.println("not free");
                    // } else if(seat_value == 0) {
                    //     System.out.println("free");
                    // }

                    seats.selectSeat(row, column);
                    break;

            }
        }

    } //end main method

    //menu method
    void getMenu() {

        System.out.println();
        System.out.print("##### MAIN MENU #####\n"
            + "1 - Get seat plan.\n"
            + "2 - Randomly allocate seat.\n"
            //+ "3 - Select seat manually.\n"
            + "Enter option: ");

    } //end menu method

} //end main class