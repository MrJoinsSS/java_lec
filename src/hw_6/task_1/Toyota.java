package hw_6.task_1;

public class Toyota implements Car {
    private final String model = "Toyota";
    private String color;
    private String bodyType;

    public Toyota(String bodyType, String color) {
        this.color = color;
        this.bodyType = bodyType;
    }

    public void getModel(){
        System.out.println(model);
    }

    public void getBodyType(){
        System.out.println(bodyType);
    }

    public void getColor(){
        System.out.println(color);
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }
}
