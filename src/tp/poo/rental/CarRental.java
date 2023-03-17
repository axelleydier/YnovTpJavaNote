package tp.poo.rental;

public class CarRental<e> {

    private int index = 0;
    private Object tab[];

    public CarRental(int n) {
        this.tab = new Object[n];
    }

    public void add(e element) {
        tab[index] = element;
        index++;
    }

}
