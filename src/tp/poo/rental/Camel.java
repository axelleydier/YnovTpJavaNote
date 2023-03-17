package tp.poo.rental;

public class Camel {
    private Integer dateVehicule = 5;

    public Camel(Integer dateVehicule) {
        this.dateVehicule = dateVehicule;
    }

    @Override
    public String toString() {
        return " " + dateVehicule;
    }
}
