package flight_ticket_booking_servlet_project.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Extrares", schema = "public", catalog = "AirAFRIKA")
public class ExtraresEntity {
    @Basic
    @Column(name = "idres")
    private Integer idres;
    @Basic
    @Column(name = "idextra")
    private Integer idextra;

    public Integer getIdres() {
        return idres;
    }

    public void setIdres(Integer idres) {
        this.idres = idres;
    }

    public Integer getIdextra() {
        return idextra;
    }

    public void setIdextra(Integer idextra) {
        this.idextra = idextra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExtraresEntity that = (ExtraresEntity) o;

        if (idres != null ? !idres.equals(that.idres) : that.idres != null) return false;
        if (idextra != null ? !idextra.equals(that.idextra) : that.idextra != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idres != null ? idres.hashCode() : 0;
        result = 31 * result + (idextra != null ? idextra.hashCode() : 0);
        return result;
    }
}
