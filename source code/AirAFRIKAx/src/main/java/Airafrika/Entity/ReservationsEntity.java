package flight_ticket_booking_servlet_project.Entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "reservations", schema = "public", catalog = "AirAFRIKA")
public class ReservationsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "ClientName")
    private Object clientName;
    @Basic
    @Column(name = "Price")
    private BigInteger price;
    @Basic
    @Column(name = "Status")
    private Object status;
    @Basic
    @Column(name = "Type")
    private Object type;
    @Basic
    @Column(name = "Place")
    private Integer place;
    @Basic
    @Column(name = "clientcode")
    private Integer clientcode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getClientName() {
        return clientName;
    }

    public void setClientName(Object clientName) {
        this.clientName = clientName;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public Integer getClientcode() {
        return clientcode;
    }

    public void setClientcode(Integer clientcode) {
        this.clientcode = clientcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReservationsEntity that = (ReservationsEntity) o;

        if (id != that.id) return false;
        if (clientName != null ? !clientName.equals(that.clientName) : that.clientName != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (place != null ? !place.equals(that.place) : that.place != null) return false;
        if (clientcode != null ? !clientcode.equals(that.clientcode) : that.clientcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (clientName != null ? clientName.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + (clientcode != null ? clientcode.hashCode() : 0);
        return result;
    }
}
