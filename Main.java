public class Main {
    public static void main(String[] args) {

        Flat myFlat = new Flat(1000, 1850, 9, 2);
        myFlat.getFlatPrice();
        System.out.println("price of flat in Rs.: " +myFlat.getFlatPrice());
        myFlat.printAllValues();
    }
}