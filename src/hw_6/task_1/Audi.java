package hw_6.task_1;

public class Audi implements Car {

    private final String model = "Audi";
    private String color;
    private String bodyType;

    public Audi(String bodyType, String color) {
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
        return "Audi{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }

}
