package hw.task_2;

public class Task_2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;

        if(a + b > c){
            if(b + c > a){
                if(a + c > b){
                    System.out.println("This is triangle");
                }
            }
        } else {
            System.out.println("This isn't triangle");
        }


    }
}
