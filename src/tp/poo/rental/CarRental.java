package tp.poo.rental;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class CarRental<e> {

    private int indexTab = 0;
    private Object tab[];

    public int maxDate;

    private int dateVehicule;



    public CarRental(int n) {
        this.tab = new Object[n];
    }

    public void add(e element) {
        tab[indexTab] = element;
        indexTab++;
    }

    public void remove(int index) {
        for (int i = index; i < indexTab ; i++) {
            tab[i] = tab[i + 1];
        }
        tab[indexTab - 1] = null;
        indexTab--;
    }

    public void print() {
        for (int i = 0; i < indexTab; i++) {
            System.out.println(tab[i]);
            System.out.println(", ");
        }
    }

    public List<Integer> toSell() {
        List<Integer> vehiculeToSells = new ArrayList<>();
        int currentYear = LocalDate.now().getYear();

        for (int i = 0; i < indexTab; i++) {
            int age = currentYear - dateVehicule;
            if (age <= maxDate) {
                System.out.println(vehiculeToSells);
            }
        }
        return vehiculeToSells;
    }
}