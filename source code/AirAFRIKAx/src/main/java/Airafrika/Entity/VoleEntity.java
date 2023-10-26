package flight_ticket_booking_servlet_project.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Vole", schema = "public", catalog = "AirAFRIKA")
public class VoleEntity {
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Depart")
    private String depart;
    @Basic
    @Column(name = "Arrive")
    private String arrive;
    @Basic
    @Column(name = "deptime")
    private Date deptime;
    @Basic
    @Column(name = "arrtime")
    private Date arrtime;
    @Basic
    @Column(name = "Type")
    private String type;
    @Basic
    @Column(name = "Avion")
    private Integer avion;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Numero")
    private int numero;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public Date getDeptime() {
        return deptime;
    }

    public void setDeptime(Date deptime) {
        this.deptime = deptime;
    }

    public Date getArrtime() {
        return arrtime;
    }

    public void setArrtime(Date arrtime) {
        this.arrtime = arrtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAvion() {
        return avion;
    }

    public void setAvion(Integer avion) {
        this.avion = avion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VoleEntity that = (VoleEntity) o;

        if (numero != that.numero) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (depart != null ? !depart.equals(that.depart) : that.depart != null) return false;
        if (arrive != null ? !arrive.equals(that.arrive) : that.arrive != null) return false;
        if (deptime != null ? !deptime.equals(that.deptime) : that.deptime != null) return false;
        if (arrtime != null ? !arrtime.equals(that.arrtime) : that.arrtime != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (avion != null ? !avion.equals(that.avion) : that.avion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (depart != null ? depart.hashCode() : 0);
        result = 31 * result + (arrive != null ? arrive.hashCode() : 0);
        result = 31 * result + (deptime != null ? deptime.hashCode() : 0);
        result = 31 * result + (arrtime != null ? arrtime.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (avion != null ? avion.hashCode() : 0);
        result = 31 * result + numero;
        return result;
    }
}
