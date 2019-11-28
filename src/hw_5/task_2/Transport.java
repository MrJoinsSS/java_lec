package hw_5.task_2;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Transport {
    int power;
    int speed;
    int weight;
    String model;

    public Transport(int power, int speed, int weight, String model) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class GroundTransport extends Transport{
    int quantityWheels;
    int fuelConsumption;

    public GroundTransport(int power, int speed, int weight, String model, int quantityWheels, int fuelConsumption) {
        super(power, speed, weight, model);
        this.quantityWheels = quantityWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public void setQuantityWheels(int quantityWheels) {
        this.quantityWheels = quantityWheels;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}

class AirTransport extends Transport{
    int span;
    int minimumTakeOffRunwayLength;

    public void setSpan(int span) {
        this.span = span;
    }

    public void setMinimumTakeOffRunwayLength(int minimumTakeOffRunwayLength) {
        this.minimumTakeOffRunwayLength = minimumTakeOffRunwayLength;
    }

    public AirTransport(int power, int speed, int weight, String model, int span, int minimumTakeOffRunwayLength) {
        super(power, speed, weight, model);
        this.span = span;
        this.minimumTakeOffRunwayLength = minimumTakeOffRunwayLength;
    }
}

class Passenger extends GroundTransport{
    String bodyType;
    int numberOfPassengers;
    double time;

    public void setTime(double time) {
        this.time = time;

    }

    public Passenger(int power, int speed, int weight, String model, int quantityWheels, int fuelConsumption, String bodyType, int numberOfPassengers) {
        super(power, speed, weight, model, quantityWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    void showInfo(){
        System.out.println("Мощность: " + power + " л.с.");
        System.out.println("Мощность: " + powerKv(power)+ " кВт");
        System.out.println("Скорость: " + speed + " км/ч");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Марка: " + model);
        System.out.println("Тип кузова: " + bodyType);
        System.out.println("Количество пассажиров: " + numberOfPassengers);
        System.out.println("Количество колес: " + quantityWheels);
        System.out.println("Расход топлива: " + fuelConsumption + " л/100 км");
        System.out.println(kmL(time));
        System.out.println();
    }

    double powerKv(int power){
        double constPowerKv = 0.74;
        double powerKv = power*constPowerKv;
        return powerKv;
    }

    private String kmL(double time){
        double distance = time * speed;
        double volume = (fuelConsumption*distance)/100;
        String out = "За время " + time + " ч, автомобиль " + model +
                " двигаясь с максимальной скоростью " + speed + " км/ч проедет " +
                distance + " км и израсходует " + volume + " литров топлива";
        return out;
    }

}

class Freight extends GroundTransport{
    int carryingCapacity;
    int weightFreight;

    public void setWeightFreight(int weightFreight) {
        this.weightFreight = weightFreight;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public Freight(int power, int speed, int weight, String model, int quantityWheels, int fuelConsumption, int carryingCapacity) {
        super(power, speed, weight, model, quantityWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    void showInfo(){
        System.out.println("Мощность: " + power + " л.с.");
        System.out.println("Мощность: " + powerKv(power)+ " кВт");
        System.out.println("Скорость: " + speed + " км/ч");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Марка: " + model);
        System.out.println("Грузоподъемность: " + carryingCapacity + " т");
        System.out.println("Количество колес: " + quantityWheels);
        System.out.println("Расход топлива: " + fuelConsumption + " л/100 км");

    }

    double powerKv(int power){
        double constPowerKv = 0.74;
        double powerKv = power*constPowerKv;
        return powerKv;
    }

    void weightFreight(int weightFreight){
        if (weightFreight<= carryingCapacity){
            System.out.println("Грузовик загружен");
            System.out.println();
        } else {
            System.out.println("Вам нужен грузовик побольше");
            System.out.println();
        }

    }


}

class Civil extends AirTransport{
    int numberOfPassengers;
    boolean availableBusinessClass;
    int peoples;

    public void setPeoples(int peoples) {
        this.peoples = peoples;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setAvailableBusinessClass(boolean availableBusinessClass) {
        this.availableBusinessClass = availableBusinessClass;
    }

    public Civil(int power, int speed, int weight, String model, int span, int minimumTakeOffRunwayLength, int numberOfPassengers, boolean availableBusinessClass) {
        super(power, speed, weight, model, span, minimumTakeOffRunwayLength);
        this.numberOfPassengers = numberOfPassengers;
        this.availableBusinessClass = availableBusinessClass;
    }

    void showInfo(){
        System.out.println("Мощность: " + power + " л.с.");
        System.out.println("Мощность: " + powerKv(power)+ " кВт");
        System.out.println("Скорость: " + speed + " км/ч");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Марка: " + model);
        System.out.println("Количество пассажиров: " + numberOfPassengers);
        System.out.println("Наличие бизнес класса: " + availableBusinessClass);
        System.out.println("Размах крыльев: " + span + " м");
        System.out.println("Минимальная длина взлетно-посадочной полосы для взлета: " + minimumTakeOffRunwayLength);
    }

    double powerKv(int power){
        double constPowerKv = 0.74;
        double powerKv = power*constPowerKv;
        return powerKv;
    }

    void peopleCapacity(int peoples){
        if (peoples <= numberOfPassengers){
            System.out.println("Самолет заполнен");
            System.out.println();
        } else {
            System.out.println("В самолете нет мест");
            System.out.println();
        }
    }
}

class Military extends AirTransport{
    boolean availabilityOfBailoutSystem;
    int numberOfMissilesOnBoard;

    public void setAvailabilityOfBailoutSystem(boolean availabilityOfBailoutSystem) {
        this.availabilityOfBailoutSystem = availabilityOfBailoutSystem;
    }

    public void setNumberOfMissilesOnBoard(int numberOfMissilesOnBoard) {
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;
    }

    public Military(int power, int speed, int weight, String model, int span, int minimumTakeOffRunwayLength, boolean availabilityOfBailoutSystem, int numberOfMissilesOnBoard) {
        super(power, speed, weight, model, span, minimumTakeOffRunwayLength);
        this.availabilityOfBailoutSystem = availabilityOfBailoutSystem;
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;
    }

    void showInfo(){
        System.out.println("Мощность: " + power + " л.с.");
        System.out.println("Мощность: " + powerKv(power)+ " кВт");
        System.out.println("Скорость: " + speed + " км/ч");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Марка: " + model);
        System.out.println("Наличие системы катапультирования: " + availabilityOfBailoutSystem);
        System.out.println("Количество ракет на борту: " + numberOfMissilesOnBoard);
        System.out.println("Размах крыльев: " + span + " м");
        System.out.println("Минимальная длина взлетно-посадочной полосы для взлета: " + minimumTakeOffRunwayLength);
    }

    double powerKv(int power){
        double constPowerKv = 0.74;
        double powerKv = power*constPowerKv;
        return powerKv;
    }

    void fire(){
        if (numberOfMissilesOnBoard != 0){
            System.out.println("Ракета пошла...");
            System.out.println();
        } else {
            System.out.println("Боеприпасы отсутввуют");
            System.out.println();
        }
    }

    void ejection(){
        if (availabilityOfBailoutSystem == true){
            System.out.println("Катапультирование прошло успешно");
            System.out.println();
        } else {
            System.out.println("У вас нет такой системы");
            System.out.println();
        }
    }
}
