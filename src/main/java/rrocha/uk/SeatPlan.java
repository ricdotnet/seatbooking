package rrocha.uk;

/**
 * Seat Plan Class
 * Multilayer array
 */

public class SeatPlan {

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

    public int getSeatStatus(int row, int column) {
        int seat = seats[row][column];
        return seat;
    }

    //get seat value (1 is taken 0 is free)
    public void getSeatValue(int row, int column) {

        System.out.print(row);
        System.out.print(column);
    }

    //allocate seat
    public void selectSeat(int row, int column) {
        seats[row][column] = '1';
    }

}