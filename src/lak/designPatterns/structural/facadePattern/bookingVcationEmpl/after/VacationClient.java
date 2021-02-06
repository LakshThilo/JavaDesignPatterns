package lak.designPatterns.structural.facadePattern.bookingVcationEmpl.after;

import java.time.LocalDate;

public class VacationClient {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2021, 8, 1);
        LocalDate endDate = LocalDate.of(2021, 8, 15);

        VacationFacade vacationFacade = new VacationFacade();
        vacationFacade.book(startDate, endDate);

        /*If I run the app again, I can see I get exactly the same output as before, so no functionality has changed.
        But this is a better structure for my app. My vacation client is decoupled from the flight, hotel and car rental
        classes. Like a real vacation booking agent, the person using it doesn't have to worry about the booking of each
        individual parts. If I did create another client that was used only for booking flights, I would still be able to
        create a flight object and call the book return journey and book outward journey the same as before, if I wanted to. */

      /**  So using the facade pattern isn't preventing me from using the functionality that was there before if I want to.
        But I have also been able to really simplify the vacation client class significantly.*/

    }

}
