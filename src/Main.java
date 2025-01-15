import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number amount: ");
        int amount = in.nextInt();
//      int amount = 50;
        boolean isRegistered = true;
        int percent;
        if (isRegistered) {
            percent = 3;
        } else {
            percent = 1;
        }
//      int percent = isRegistered ? 3:1;

        int bonus = amount * percent / 100;

        if (bonus > 500) {
            bonus = 500;
        }
        System.out.println(bonus);
        in.close();
    }


}