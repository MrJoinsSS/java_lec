package hw_2.taskdz_1;

public class Taskdz_1 {
    public static void main(String[] args) {

        float km = 10;
        float sum = 0;
        for (int i = 0; i < 7; i++) {
            sum +=km;
           // System.out.println("Sum: " + sum);
            km += km * 0.1;
           // System.out.println("KM: " + km);


        }
        System.out.println("Put': " + sum);
    }
}
