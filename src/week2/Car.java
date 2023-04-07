package week2;

public class Car {
    String company;
    String type;
    String color;

    void getInfo(){
        System.out.println(" Car company is "+ company +", type is "+type+", and the color is "+color);
    }
}

class test {
    public static void main(String[] args) {

        Car bmw = new Car();
        bmw.company = "BMW";
        bmw.type = "M3";
        bmw.color = "Red";

        bmw.getInfo();

        Car honda = new Car();
        honda.company = "Honda";
        honda.type = "Accord";
        honda.color = "Blue";

        honda.getInfo();

        Car peugeot = new Car();
        peugeot.company = "Peugeot";
        peugeot.type = "206";
        peugeot.color = "Black";

        peugeot.getInfo();
    }
}