package by.gsu.pms;

public class BusinessTrip {
    public final int RATE;
    private String acc;
    private int transport;
    private int days;
    public BusinessTrip(int rate){
        super();
        RATE = rate;
    }
    public BusinessTrip(int RATE, String acc, int transport, int days) {
        super();
        this.RATE = RATE;
        this.acc = acc;
        this.transport = transport;
        this.days = days;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }


    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getRATE() {
        return RATE;
    }
    public int getTotal(){
        return RATE * days +transport;
    }
    public void show(){
        System.out.println ("rate = " + RATE + " \naccount = " + acc + "\ntransport = " + transport + "\ndays = " + days +"\ntotal = " + getTotal() );
    }

    @Override
    public String toString() {
        return this.RATE + ";" + this.acc + ';' + this.transport + ';' + this.days + ';' + getTotal();
    }
}
