public class Flat {
    private int squareFeet;

    private int pricePerSquareFeet;

    private int floorNumber;

    private int numberOfRooms;


public Flat(int _squareFeet, int _pricePerSquareFeet, int _floorNumber, int _numberOfRooms){
    squareFeet = _squareFeet;
    pricePerSquareFeet = _pricePerSquareFeet;
    floorNumber = _floorNumber;
    numberOfRooms = _numberOfRooms;
    }

    public int getFlatPrice() {
        return squareFeet*pricePerSquareFeet;
    }

    public void printAllValues() {
        System.out.println("square feet :" + squareFeet);
        System.out.println("price per square feet :" + pricePerSquareFeet);
        System.out.println("floor number :" + floorNumber);
        System.out.println("number of rooms :" + numberOfRooms);
    }
}



