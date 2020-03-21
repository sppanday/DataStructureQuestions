

package question3;


public class Truck {
    

private String make;
    private String model;
    private int noiseFactor;
    private boolean interstatePermit;
    private int parkingFine;

    Truck(String make, String model, int noiseFactor, boolean interstatePermit, int parkingFine) {
        this.make = make;
        this.model = model;
        this.noiseFactor = noiseFactor;
        this.interstatePermit = interstatePermit;
        this.parkingFine = parkingFine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNoiseFactor() {
        return noiseFactor;
    }

    public void setNoiseFactor(int noiseFactor) {
        this.noiseFactor = noiseFactor;
    }

    public boolean isInterstatePermit() {
        return interstatePermit;
    }

    public void setInterstatePermit(boolean interstatePermit) {
        this.interstatePermit = interstatePermit;
    }

    public int getParkingFine() {
        return parkingFine;
    }

    public void setParkingFine(int parkingFine) {
        this.parkingFine = parkingFine;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getMake(), getModel());
    }
}

