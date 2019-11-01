package hw_2.taskdz_3;

public class Taskdz_3 {
    public static void main(String[] args) {
        int sum = 1;
        int inc = 1;
        for (int i = 1; i <= 256; i++) {
            if (inc != 256) {
                inc *= 2;
                sum += inc;
            }
            else break;
           // System.out.println(inc);
        }
        System.out.println("Sum: " + sum);
    }
}
