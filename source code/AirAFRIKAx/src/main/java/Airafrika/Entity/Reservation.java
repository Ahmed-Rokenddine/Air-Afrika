package flight_ticket_booking_servlet_project.Entity;

import java.util.ArrayList;
import java.util.List;

public class Reservation {

    private int id;
    private String Clientname;
    private Float Price;
    private String Status;
    private String Type;
    private int Placenumber;
    private Client client;
    private List<Escalations> Escalations = new ArrayList<>();

    private List<Baggage> baggages = new ArrayList<>();

    private List<Extrareservation> Extrareservation = new ArrayList<>();


}
