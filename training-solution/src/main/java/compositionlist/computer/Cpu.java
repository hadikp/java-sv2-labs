package compositionlist.computer;

public class Cpu {
    private String model;
    private double clockSignal; //GHz

    public Cpu(String model, double clockSignal) {
        this.model = model;
        this.clockSignal = clockSignal;
    }

    public String getModel() {
        return model;
    }

    public double getClockSignal() {
        return clockSignal;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setClockSignal(double clockSignal) {
        this.clockSignal = clockSignal;
    }

    @Override
    public String toString() {
        return "model: " + model +
                ", clockSignal: " + clockSignal + " GHz";
    }
}
