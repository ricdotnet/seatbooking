package rrocha.uk;

import java.util.Random;
import java.util.Scanner;

public final class SeatBooking {

    static SeatPlan seats = new SeatPlan(); //create object from SeatPlan.java
    static SeatBooking main = new SeatBooking(); //create object from SeatBooking.java

    static Random rand = new Random(); //random method to generate numbers
    static Scanner input = new Scanner(System.in); //scanner method to scan user inputs

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

                    System.out.println();
                    System.out.println("Rows A-C are First Class seats.\n"
                    + "Rows D-L are Economic Cabin.");

                    break;

                //randomly allocate a seat
                case 2:

                    //this while loop allocates a row and a collumn
                    //checks if it is empty or occupied
                    //if it is empty books the seat
                    //if it is occupied it will repeat itself and choose another seat
                    //it will repeat until a seat is booked
                    boolean booked = false;

                    //first check for seat availability
                    //if the plane is fully booked checkAvailability will return 1
                    //if has empty seats will resturn 0
                    //when full prints the message
                    if(main.checkAvailability() == 1) {
                        System.out.println("The plane is full. :(");
                    } else {
                    
                        //this while loop will run until a seat is booked
                        //if a seat is already booked it will loop and chose another one
                        //if a seat is not booked it will use that seat, book and end the loop
                        while(booked == false) {

                            int row = rand.nextInt(12); //randomly select row
                            int column = rand.nextInt(7); //randomly select column

                            //gets the seat status 1=occupied 0=empty
                            char status = seats.getSeatStatus(row+1, column+1);


                            //if the seat is empty book it and end while loop. if not repeat.
                            if (status == '1' || status == ' ') {
                                System.out.println("not a valid seat."); //temp message
                                //TO BE REMOVED LATER


                            } else if (status == '0') {
                                seats.selectRandomSeat(row+1, column+1);
                                booked = true;

                                //print the seat location
                                System.out.println(seats.getSeat(row+1, column+1));

                            }

                        } //end while loop
                    
                    }

                    break;
                
                //manually select seat
                case 3:

                    //ask the user for an input
                    System.out.print("Please choose your seat (XX - AA-LF): ");
                    String chosen_seat = input.next();

                    //call the method to set the seat
                    main.manualSeat(chosen_seat);

                    break;

                //print how many seats are booked
                case 4:

                    System.out.println("We have " + seats.bookedCount() + " booked seats.");

            }
        }

    } //end main method

    //method to check plane seat availability
    int checkAvailability() {
        if (seats.bookedCount() == 72) { //fully booked.
            return 1;
        } else {
            System.out.println(seats.bookedCount()); //line to be removed at the end.
            return 0;
        }
    }

    //method to manually set a seat
    void manualSeat(String seat) {

        if(seat.length() > 2 || seat.length() < 2) {
            System.out.println("A seat is composed by 2 values only. Eg: AA or AB...");
        } else {

            try{
                seats.selectManualSeat(seat);
                System.out.println("You booked the seat: " + seat);

                if(seats.selectManualSeat(seat) < 7) {
                    System.out.println("Your seat was booked in first class.");
                } else {
                    System.out.println("Your seat was booked in economy class.");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                //exception for when the value entered is not String
                System.out.println("Invalid seat. Make sure you select a valid seat. (AA - LF)");

            } catch (StringIndexOutOfBoundsException e) { 
                //exception for when is less than 2 values.
                //the first if statement will catch it but if not throws this message.
                System.out.println("Invalid seat. Make sure you select a valid seat. (AA - LF)");
            }
        }

    } //end manual seat method


    //menu method
    void getMenu() {

        System.out.println();
        System.out.print("##### MAIN MENU #####\n"
            + "1 - Get seat plan.\n"
            + "2 - Randomly allocate seat.\n"
            + "3 - Select seat manually.\n"
            + "Enter option: ");

    } //end menu method

} //end main class