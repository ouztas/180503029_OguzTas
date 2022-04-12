public class Auto {

    private String Marke;
    private String Farbe;
    private int Preis;
    private int Erstellungsjahr;
    private String Kennzahl;

    public Auto(String Marke, String Farbe, int Preis, int Erstellungsjahr, String Kennzahl){
        this.Marke = Marke;
        this.Farbe = Farbe;
        this.Preis = Preis;
        this.Erstellungsjahr = Erstellungsjahr;
        this.Kennzahl = Kennzahl;

    }





    public String getMarke() {
        return Marke;
    }

    public void setMarke(String marke) {
        Marke = marke;
    }

    public String getFarbe() {
        return Farbe;
    }

    public void setFarbe(String farbe) {
        Farbe = farbe;
    }

    public int getPreis() {
        return Preis;
    }

    public void setPreis(int preis) {
        Preis = preis;
    }

    public int getErstellungsjahr() {
        return Erstellungsjahr;
    }

    public void setErstellungsjahr(int erstellungsjahr) {
        Erstellungsjahr = erstellungsjahr;
    }

    public String getKennzahl() {
        return Kennzahl;
    }

    public void setKennzahl(String kennzahl) {
        Kennzahl = kennzahl;
    }
}
