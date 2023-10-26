package flight_ticket_booking_servlet_project.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "escalations", schema = "public", catalog = "AirAFRIKA")
public class EscalationsEntity {
    @Basic
    @Column(name = "idres")
    private Integer idres;
    @Basic
    @Column(name = "idvole")
    private Integer idvole;
    @Basic
    @Column(name = "ville")
    private String ville;
    @Basic
    @Column(name = "test")
    private Integer test;

    public EscalationsEntity(Integer test) {
        this.test = test;
    }

    public Integer getIdres() {
        return idres;
    }

    public void setIdres(Integer idres) {
        this.idres = idres;
    }

    public Integer getIdvole() {
        return idvole;
    }

    public void setIdvole(Integer idvole) {
        this.idvole = idvole;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EscalationsEntity that = (EscalationsEntity) o;

        if (idres != null ? !idres.equals(that.idres) : that.idres != null) return false;
        if (idvole != null ? !idvole.equals(that.idvole) : that.idvole != null) return false;
        if (ville != null ? !ville.equals(that.ville) : that.ville != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idres != null ? idres.hashCode() : 0;
        result = 31 * result + (idvole != null ? idvole.hashCode() : 0);
        result = 31 * result + (ville != null ? ville.hashCode() : 0);
        return result;
    }
}
