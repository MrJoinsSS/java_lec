package hw_6.task_1;

public class CarMain {
    public static void main(String[] args) {
        Car[] cars = new Car[100];

        for (int i = 0; i < cars.length; i++) {
            String bodyType = generateBodyType();
            String color = generateColor();
            Car car = generateCar(bodyType, color);
            cars[i] = car;
            System.out.print(cars[i]);
            if (bodyType == "Сabriolet" || color == "White"){
                System.out.println(" Discount");
            } else System.out.println();
        }

    }

    private static String generateColor() {
        int colorIndex = (int) (Math.random() * 5 + 1);
        String color;
        switch (colorIndex) {
            case 1:
                color = "White";
                break;
            case 2:
                color = "Yellow";
                break;
            case 3:
                color = "Red";
                break;
            case 4:
                color = "Blue";
                break;
            case 5:
                color = "LightPurple";
                break;
            default:
                color = "Black";
        }
        return color;
    }

    private static String generateBodyType() {
        int bodyTypeIndex = (int) (Math.random() * 4 + 1);
        String bodyType;

        switch (bodyTypeIndex) {
            case 1:
                bodyType = "Сabriolet";
                break;
            case 2:
                bodyType = "Hatchback";
                break;
            case 3:
                bodyType = "Universal";
                break;
            case 4:
                bodyType = "Coupe";
                break;
            default:
                bodyType = "Sedan";
        }
        return bodyType;
    }

    private static Car generateCar(String bodyType, String color) {
        int carIndex = (int) (Math.random() * 3 + 1);
        Car car;
        switch (carIndex) {
            case 1:
                car = new Audi(bodyType, color);
                break;
            case 2:
                car = new Kia(bodyType, color);
                break;
            case 3:
                car = new Toyota(bodyType, color);
                break;
            default:
                car = new Audi(bodyType, color);
        }
        return car;
    }
}
