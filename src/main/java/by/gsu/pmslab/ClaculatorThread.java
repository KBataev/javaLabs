package by.gsu.pmslab;

public class ClaculatorThread extends Thread {
    private int a;
    private double result=1;
    public ClaculatorThread(int a){
        this.a=a;
    }
    public double getResult() {
        boolean b = true;
        for (int P = 1; P <= a; P++) {
            if (b) result*=P;
            else b = true;

        }
        return result;
    }
}
