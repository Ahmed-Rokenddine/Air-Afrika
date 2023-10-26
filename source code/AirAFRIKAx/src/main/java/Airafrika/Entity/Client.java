package flight_ticket_booking_servlet_project.Entity;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private int Code ;
    private String Fullname ;
    private String userEmail;
    private String userPassword;

    private int Phone ;

    private float Solde ;

    private List<Reservation> reservations = new ArrayList<>();

    public int getCode () {
        return Code ;
    }
    public void setCode (int Code ) {
        this.Code  = Code ;
    }
    public String getFullname () {
        return Fullname ;
    }
    public void setFullname (String Fullname ) {
        this.Fullname  = Fullname ;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}
