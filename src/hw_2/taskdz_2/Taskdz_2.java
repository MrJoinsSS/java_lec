package hw_2.taskdz_2;

public class Taskdz_2 {
    public static void main(String[] args) {

      int ameba = 1;
        for (int i = 1; i <= 24; i++) {
                if (i%3 == 0){
                    ameba *= 2;
                    System.out.println("Ameba " + i + " hours: "  + ameba);
                }
        }

    }
}
