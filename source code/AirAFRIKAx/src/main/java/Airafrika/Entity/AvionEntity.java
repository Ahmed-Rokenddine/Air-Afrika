package flight_ticket_booking_servlet_project.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Avion", schema = "public", catalog = "AirAFRIKA")
public class AvionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "Max places")
    private Integer maxPlaces;
    @Basic
    @Column(name = "Pilote")
    private String pilote;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getMaxPlaces() {
        return maxPlaces;
    }

    public void setMaxPlaces(Integer maxPlaces) {
        this.maxPlaces = maxPlaces;
    }

    public String getPilote() {
        return pilote;
    }

    public void setPilote(String pilote) {
        this.pilote = pilote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AvionEntity that = (AvionEntity) o;

        if (id != that.id) return false;
        if (maxPlaces != null ? !maxPlaces.equals(that.maxPlaces) : that.maxPlaces != null) return false;
        if (pilote != null ? !pilote.equals(that.pilote) : that.pilote != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (maxPlaces != null ? maxPlaces.hashCode() : 0);
        result = 31 * result + (pilote != null ? pilote.hashCode() : 0);
        return result;
    }
}
