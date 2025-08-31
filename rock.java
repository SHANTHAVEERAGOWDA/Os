
import java.util.Random;
import java.util.Scanner;
public class rock {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int i = 1; int computer_winnnings = 0, user_winnings = 0;

        for (i = 1; i <= 3; i++) {

            while (i == 1) {
                System.out.println("1->Rock \n 2->paper\n3->scissor: ");
                break;
            }
            System.out.println("select any below option\t");
            int g = user.nextInt();
            Random rc = new Random();
            int cn = rc.nextInt(1, 4);


            System.out.println("you have selected  "+g);
            System.out.println("opponent have selected  "+cn);
            if ((g == 3 && cn == 1)||(g == 1 && cn == 2) ||(g == 2 && cn == 3)) {
                System.out.println("computer won!");
                computer_winnnings += 1;}
            else{
                System.out.println("human had won!");
                user_winnings += 1;
            }
        }


        System.out.println("FINAL........RESULTS ARE ");
        System.out.println("computer_winings in 3 rounds==" + computer_winnnings);
        System.out.println("user_winings in 3 rounds==" + user_winnings);

        if (computer_winnnings > user_winnings) {
            System.out.println("computer won ");
        } else if (computer_winnnings == user_winnings) {
            System.out.println("tie................");
        } else {
            System.out.println("user won ");
        }
    }}



