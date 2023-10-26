package flight_ticket_booking_servlet_project.Entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "baggage", schema = "public", catalog = "AirAFRIKA")
public class BaggageEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "Weight")
    private BigInteger weight;
    @Basic
    @Column(name = "Price")
    private BigInteger price;
    @Basic
    @Column(name = "resid")
    private Integer resid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigInteger getWeight() {
        return weight;
    }

    public void setWeight(BigInteger weight) {
        this.weight = weight;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public Integer getResid() {
        return resid;
    }

    public void setResid(Integer resid) {
        this.resid = resid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaggageEntity that = (BaggageEntity) o;

        if (id != that.id) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (resid != null ? !resid.equals(that.resid) : that.resid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (resid != null ? resid.hashCode() : 0);
        return result;
    }
}
