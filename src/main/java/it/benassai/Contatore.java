package it.benassai;

public class Contatore extends Thread {

    private int threshold;

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < threshold; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            //Thread.sleep(10);
        }
    }

    public Contatore(int threshold) {
        this.threshold = threshold;
    }
}
