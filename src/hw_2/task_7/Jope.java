package hw_2.task_7;

import java.util.Arrays;

public class Jope {
    private char[] pipidron = new char[18];

    public Jope() {

        Arrays.fill(pipidron, ' ');
    }

    public void setPipidron(char[] pipidron) {
        this.pipidron = pipidron;

    }

    public char[] getPipidron() {
        return pipidron;
    }
}
