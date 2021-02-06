package lak.designPatterns.structural.facadePattern.bookingVcationEmpl.before;

import java.time.LocalDate;

public class CarRental {

    public void book(LocalDate start, LocalDate end){

        System.out.println("Booking car fot "+ start + " to "+ end);
    }

}
