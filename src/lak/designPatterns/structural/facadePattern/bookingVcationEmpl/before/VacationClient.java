package lak.designPatterns.structural.facadePattern.bookingVcationEmpl.before;

import java.time.LocalDate;

/*In this example, I've got an app that's used for booking vacations. And I'm going to be refactoring it to use the facade pattern. */
public class VacationClient {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2021, 8, 1);
        LocalDate endDate = LocalDate.of(2021, 8, 15);

        Flight flight = new Flight();
        flight.bookOutwardJourney(startDate);
        flight.bookReturnJourney(endDate);

        Hotel hotel = new Hotel();
        hotel.book(startDate, endDate);

        CarRental carRental = new CarRental();
        carRental.book(startDate, endDate);

        /*If I run this app and look at the console, I can see it printed out the details about the flights, the hotel,
        and the car rental that I've booked. All of these details aren't really needed for the vacation client class.
        It would be better if I could just provide the dates and book the vacation all in one go, rather than having to
        book each different parts of it separately. So I'm going to create a facade class. */

    }

}
