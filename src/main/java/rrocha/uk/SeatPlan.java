package rrocha.uk;

/**
 * Seat Plan Class
 * Multilayer array
 */

public class SeatPlan {

    char[][] seats = {{'1','1','1','0','0','0'},
        {'0','0','0','1','0','0'},
        {'0','0','0','0','0','0'},
        {'0','0','0','1','1','1'},
        {'0','0','0','0','0','0'},
        {'0','0','0','0','0','0'},
        {'1','1','0','0','0','0'},
        {'0','0','0','0','0','0'},
        {'0','0','0','0','0','0'},
        {'0','0','0','0','0','0'},
        {'0','0','0','0','0','0'},
        {'0','0','0','0','0','0'}};

    public void getSeatPlan() {

        for (char[] cs : seats) {
            for (char print : cs) {
                if(print == '0') {
                    print = '-';
                } else {
                    print = 'X';
                }
                System.out.print(print);
            }
            System.out.println();
        }

    }

}