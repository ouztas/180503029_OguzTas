import java.util.Date;

public class vermieten {

    private Kunde kunde;
    private Auto auto;
    private Date Mietedatum;
    private Date Abgabedatum;






    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Date getMietedatum() {
        return Mietedatum;
    }

    public void setMietedatum(Date mietedatum) {
        Mietedatum = mietedatum;
    }

    public Date getAbgabedatum() {
        return Abgabedatum;
    }

    public void setAbgabedatum(Date abgabedatum) {
        Abgabedatum = abgabedatum;
    }
}
