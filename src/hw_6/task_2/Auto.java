package hw_6.task_2;


public class Auto implements Car{
    private boolean engineRunning = false;
    private int gear = 0;



    @Override
    public boolean startEngine() {
        return false;
    }

    @Override
    public boolean stopEngine() {
        return false;
    }

    @Override
    public int switchTransmissionUp() {

        return 0;
    }

    @Override
    public int switchTransmissionDown() {
        return 0;
    }
}
