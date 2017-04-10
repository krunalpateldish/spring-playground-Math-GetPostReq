package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


/**
 * Created by trainer2 on 4/8/17.
 */

@RestController
public class FlightController {

    @GetMapping("/flights")
    public @ResponseBody List<Flights> getFlightsJSON() throws ParseException {
            Flights flight1 = new Flights();
            Flights.Tickets tickets = new Flights.Tickets();
            List<Flights.Person> personList = new ArrayList<Flights.Person>() ;
            Flights.Person person1 = new Flights.Person();

            person1.setFirstName("Will");
            person1.setLastName("Arthur");

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
            Date date = df.parse("2017-04-21 14:34");

            flight1.setDeparts(date);
            personList.add(person1);
            tickets.setPassengers(personList);
            flight1.setTicket(tickets);
            flight1.setPrice(200);
        return Arrays.asList(flight1);
    }

}