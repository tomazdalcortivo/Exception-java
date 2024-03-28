package hotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy): ");
        Date chackIn = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date chackOut = sdf.parse(sc.next());

        if (!chackOut.after(chackIn)) {
            System.out.println("Erro in reservation: check-ou date must be after chack-in date");
        } else {
            Reservation reservation = new Reservation(number, chackIn, chackOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("Enter data to update the reservation");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            chackIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            chackOut = sdf.parse(sc.next());

            Date now = new Date();
            if (chackIn.before(now) || chackIn.before(now)) {
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            } else if (!chackOut.after(chackIn)) {

            } else {
                reservation.updateDate(chackIn, chackOut);
                System.out.println("Reservation: " + reservation);
            }
        }
    }
}
