package rrocha.uk;

/**
 * Seat Plan Class
 * Multilayer array
 */

public class SeatPlan {

    //set variables for rown and column
    String seat_row, seat_column;

    //char array multidimensional
    //rows and columns
    char[][] seats = {{' ','A','B','C','D','E','F'},
        {'A','0','0','0','0','0','0'},
        {'B','0','0','0','0','0','0'},
        {'C','0','0','0','0','0','0'},
        {'D','0','0','0','0','0','0'},
        {'E','0','0','0','0','0','0'},
        {'F','0','0','0','0','0','0'},
        {'G','0','0','0','0','0','0'},
        {'H','0','0','0','0','0','0'},
        {'I','0','0','0','0','0','0'},
        {'J','0','0','0','0','0','0'},
        {'K','0','0','0','0','0','0'},
        {'L','0','0','0','0','0','0'}};

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

        if (row == 1) {
            seat_row = "A";
        } else if (row == 2) {
            seat_row = "B";
        } else if (row == 3) {
            seat_row = "C";
        } else if (row == 4) {
            seat_row = "D";
        } else if (row == 5) {
            seat_row = "E";
        } else if (row == 6) {
            seat_row = "F";
        } else if (row == 7) {
            seat_row = "G";
        } else if (row == 8) {
            seat_row = "H";
        } else if (row == 9) {
            seat_row = "I";
        } else if (row == 10) {
            seat_row = "J";
        } else if (row == 11) {
            seat_row = "K";
        } else if (row == 12) {
            seat_row = "L";
        }

        if (column == 1) {
            seat_column = "A";
        } else if (column == 2) {
            seat_column = "B";
        } else if (column == 3) {
            seat_column = "C";
        } else if (column == 4) {
            seat_column = "D";
        } else if (column == 5) {
            seat_column = "E";
        } else if (column == 6) {
            seat_column = "F";
        }

        return seat_row + seat_column;
    }

    //return seat status : 1=occupied 0=empty
    public char getSeatStatus(int row, int column) {
        char seat = seats[row][column];
        return seat;
    }

    //allocate seat to user
    public void selectSeat(int row, int column) {
        seats[row][column] = '1';
    }

}