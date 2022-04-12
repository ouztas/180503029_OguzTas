public class Kunde {

    private String Name;
    private String Nachname;
    private long ID_Nummer;
    private long Telefonnummer;
    private vermieten Vermiete;
    private int Passwort;
    private int Zahlung;

    public Kunde(String Name, String Nachname, long ID_Nummer, long Telefonnummer, int Passwort){
        this.Name = Name;
        this.Nachname = Nachname;
        this.ID_Nummer = ID_Nummer;
        this.Telefonnummer = Telefonnummer;
        this.Passwort = Passwort;
    }






    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public long getID_Nummer() {
        return ID_Nummer;
    }

    public void setID_Nummer(long ID_Nummer) {
        this.ID_Nummer = ID_Nummer;
    }

    public long getTelefonnummer() {
        return Telefonnummer;
    }

    public void setTelefonnummer(long telefonnummer) {
        Telefonnummer = telefonnummer;
    }

    public vermieten getVermiete() {
        return Vermiete;
    }

    public void setVermiete(vermieten vermiete) {
        Vermiete = vermiete;
    }

    public int getPasswort() {
        return Passwort;
    }

    public void setPasswort(int passwort) {
        Passwort = passwort;
    }

    public int getZahlung() {
        return Zahlung;
    }

    public void setZahlung(int zahlung) {
        Zahlung = zahlung;
    }
}
