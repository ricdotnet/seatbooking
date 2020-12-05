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

            // int row = rand.nextInt(12); //randomly select row
            // int column = rand.nextInt(6); //randomly select column

            //switch case for options
            switch(option) {

                //get seat plan
                case 1:
                    seats.getSeatPlan();
                    break;

                //randomly allocate a seat
                case 2:

                    //this while loop allocates a row and a collumn
                    //checks if it is empty or occupied
                    //if it is empty books the seat
                    //if it is occupied it will repeat itself and choose another seat
                    //it will repeat until a seat is booked
                    boolean booked = false;
                    while(booked == false) {

                        int row = rand.nextInt(12); //randomly select row
                        int column = rand.nextInt(6); //randomly select column

                        char status = seats.getSeatStatus(row, column);

                        //if the seat is empty book it and end while loop. if not repeat
                        if(status == '0') {
                            seats.selectSeat(row+1, column+1);
                            booked = true;

                            //print the seat location
                            System.out.println(seats.getSeat(row+1, column+1));

                        }

                    }

                    break;
                
                case 3:

                    //ask for seat number (AA, BD, CC, etc)

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