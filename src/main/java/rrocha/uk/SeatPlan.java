package rrocha.uk;

/**
 * Seat Plan Class
 * Multilayer array
 */

public class SeatPlan {

    //char array multidimensional
    //rows and columns
    char[][] seats = {{' ','A','B','C',' ','D','E','F'},
        {'A','0','0','0',' ','0','0','0'},
        {'B','0','0','0',' ','0','0','0'},
        {'C','0','0','0',' ','0','0','0'},
        {'D','0','0','0',' ','0','0','0'},
        {'E','0','0','0',' ','0','0','0'},
        {'F','0','0','0',' ','0','0','0'},
        {'G','0','0','0',' ','0','0','0'},
        {'H','0','0','0',' ','0','0','0'},
        {'I','0','0','0',' ','0','0','0'},
        {'J','0','0','0',' ','0','0','0'},
        {'K','0','0','0',' ','0','0','0'},
        {'L','0','0','0',' ','0','0','0'}};

    //enhanced loop to print the seats plan
    public void getSeatPlan() {

        for (char[] cs : seats) {
            for (char print : cs) {
                if(print == '0') {
                    print = '-';
                } else if(print == '1') {
                    print = 'X';
                }
                System.out.printf("%s ", print);
            }
            System.out.println();
        }

    }

    //get seat location
    public String getSeat(int row, int column) {

        // if (row == 1) {
        //     seat_row = "A";
        // } else if (row == 2) {
        //     seat_row = "B";
        // } else if (row == 3) {
        //     seat_row = "C";
        // } else if (row == 4) {
        //     seat_row = "D";
        // } else if (row == 5) {
        //     seat_row = "E";
        // } else if (row == 6) {
        //     seat_row = "F";
        // } else if (row == 7) {
        //     seat_row = "G";
        // } else if (row == 8) {
        //     seat_row = "H";
        // } else if (row == 9) {
        //     seat_row = "I";
        // } else if (row == 10) {
        //     seat_row = "J";
        // } else if (row == 11) {
        //     seat_row = "K";
        // } else if (row == 12) {
        //     seat_row = "L";
        // }

        // if (column == 1) {
        //     seat_column = "A";
        // } else if (column == 2) {
        //     seat_column = "B";
        // } else if (column == 3) {
        //     seat_column = "C";
        // } else if (column == 4) {
        //     seat_column = "D";
        // } else if (column == 5) {
        //     seat_column = "E";
        // } else if (column == 6) {
        //     seat_column = "F";
        // }

        //set variables for rown and column
        String seat_row = String.valueOf(row);
        String seat_column = String.valueOf(column);

        switch(row) {
            case 1 : seat_row = "A"; break;
            case 2 : seat_row = "B"; break;
            case 3 : seat_row = "C"; break;
            case 4 : seat_row = "D"; break;
            case 5 : seat_row = "E"; break;
            case 6 : seat_row = "F"; break;
            case 7 : seat_row = "G"; break;
            case 8 : seat_row = "H"; break;
            case 9 : seat_row = "I"; break;
            case 10 : seat_row = "J"; break;
            case 11 : seat_row = "K"; break;
            case 12 : seat_row = "L"; break;
        }

        switch(column) {
            case 1 : seat_column = "A"; break;
            case 2 : seat_column = "B"; break;
            case 3 : seat_column = "C"; break;
            case 5 : seat_column = "D"; break;
            case 6 : seat_column = "E"; break;
            case 7 : seat_column = "F"; break;
        }

        return seat_row + seat_column;
    }

    //return seat status : 1=occupied 0=empty
    public char getSeatStatus(int row, int column) {
        char seat = seats[row][column];
        return seat;
    }

    //allocate seat to user
    public void selectRandomSeat(int row, int column) {
        seats[row][column] = '1';
    }

    //manually allocate seat to user
    public void selectManualSeat(String seat) {

        String row = seat.substring( /* select the first char*/ 0, /* select the second char */ 1 );
        String column = seat.substring(1, 2);

        int seat_row = '0';
        int seat_column = '0';

        switch(row) {
            case "A" : seat_row = 1; break;
            case "B" : seat_row = 2; break;
            case "C" : seat_row = 3; break;
            case "D" : seat_row = 4; break;
            case "E" : seat_row = 5; break;
            case "F" : seat_row = 6; break;
            case "G" : seat_row = 7; break;
            case "H" : seat_row = 8; break;
            case "I" : seat_row = 9; break;
            case "J" : seat_row = 10; break;
            case "K" : seat_row = 11; break;
            case "L" : seat_row = 12; break;
        }

        switch(column) {
            case "A" : seat_column = 1; break;
            case "B" : seat_column = 2; break;
            case "C" : seat_column = 3; break;
            case "D" : seat_column = 5; break;
            case "E" : seat_column = 6; break;
            case "F" : seat_column = 7; break;
        }

        seats[seat_row][seat_column] = '1';

    }

    //method to cound how many seats are booked
    public int bookedCount() {

        int counter = 0; //always start the counter as 0 before counting

        for (char[] cs : seats) {
            for (char print : cs) {
                if(print == '1') {
                    counter++;
                }
            }
        }

        return counter;

    }

}