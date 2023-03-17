package tp.poo.rental;

public class Car {
    private String marque;
    private Integer annee;

    @Override
    public String toString() {
        return this.marque + " " + this.annee;
    }

    public Car(String marque, Integer annee) {
        this.marque = marque;
        this.annee = annee;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }
}
