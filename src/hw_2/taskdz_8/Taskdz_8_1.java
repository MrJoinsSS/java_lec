package hw_2.taskdz_8;

public class Taskdz_8_1 {
    public static void main(String[] args) {

        int inc = 1;
        int dec = 4;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < inc; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < dec; k++) {
                System.out.print("*");
            }
            System.out.println();
            inc++;
            dec--;
        }
    }
}
