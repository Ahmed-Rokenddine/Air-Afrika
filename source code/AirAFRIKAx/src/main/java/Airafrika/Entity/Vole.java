package flight_ticket_booking_servlet_project.Entity;


import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Vole {
    private int Numerodevol  ;
    private String Nom ;
    private Enum Type ;
    private String Depart ;
    private String Arrive   ;
    private Time Departuretime ;
    private Time ArrivalTime  ;

    private List<Escalations> Escalations = new ArrayList<>();

    private Avion avion;


    public int getNumerodevol () {
        return Numerodevol ;
    }
    public void setNumerodevol (int Numerodevol ) {
        this.Numerodevol  = Numerodevol ;
    }
    public String getNom () {
        return Nom ;
    }

    public Enum getType () {
        return Type;
    }
    public void setNom (String Nom ) {
        this.Nom  = Nom ;
    }
    public String getDepart () {
        return Depart ;
    }
    public void setDepart (String Depart ) {
        this.Depart  = Depart ;
    }
    public String getArrive  () {
        return Arrive  ;
    }
    public void setArrive  (String Arrive  ) {
        this.Arrive   = Arrive  ;
    }



    public Time getDeparturetime() {
        return Departuretime;
    }
    public void setDeparturetime(Time Departuretime) {
        this.Departuretime = Departuretime;
    }
    public Time getArrivalTime () {
        return ArrivalTime ;
    }
    public void setArrivalTime (Time ArrivalTime ) {
        this.ArrivalTime  = ArrivalTime ;
    }
   
   

}
