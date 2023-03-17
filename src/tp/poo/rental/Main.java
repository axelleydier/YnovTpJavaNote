package tp.poo.rental;

public class Main {
    public static void main(String[] args) {
        //Car mustang = new Car("ford mustang", 2004);
        //Camel Camel1 = new Camel(2010);
        //System.out.println(mustang);
        //System.out.println(Camel1);

        CarRental rental = new CarRental(20);
        rental.add(new Car("Ford mustang", 2000));
        rental.print();
    }
}
