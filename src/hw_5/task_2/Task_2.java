package hw_5.task_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Passenger passTransport = new Passenger(88, 160, 1480, "Audi 80", 4,
                10, "Седан", 5);
        passTransport.setTime(2.5);
        passTransport.showInfo();

        Freight freight = new Freight(88, 160, 3540, "GMC", 4,
                10, 1650);
        freight.showInfo();
        freight.weightFreight(105);

        Civil civil = new Civil(88, 160, 3540, "Boing", 4,
                1000, 127, true);
        civil.showInfo();
        civil.peopleCapacity(105);

        Military militaryTransport = new Military(888, 250, 20, "Mig", 15,
                1000, false, 5);
        militaryTransport.showInfo();
        militaryTransport.fire();
        militaryTransport.ejection();



    }
}
