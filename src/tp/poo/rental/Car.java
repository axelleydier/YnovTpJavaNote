package tp.poo.rental;

public class Car {
    private Integer dateVehicule = 2;
    private String marque;

    @Override
    public String toString() {
        return this.marque + " " + this.dateVehicule;
    }

    public Car(String marque, Integer dateVehicule) {
        this.marque = marque;
        this.dateVehicule = dateVehicule;

    }

    public void shareVehicule() {
        int value = dateVehicule + 1;
    }

}
