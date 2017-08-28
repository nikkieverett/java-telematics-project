public class VehicleInfo {
    private int vin;
    private double odometer;
    private double consumption;
    private double lastOilchangeReading;
    private double engineSize;

    public VehicleInfo(){

    }


    public int getVin() {
        return vin;
    }
    public void setVin(int vin) {
        this.vin = vin;
    }

    public double getOdometer() {
        return odometer;
    }
    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public double getConsumption() {
        return consumption;
    }
    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getLastOilchangeReading() {
        return lastOilchangeReading;
    }
    public void setLastOilchangeReading(double lastOilchangeReading) {
        this.lastOilchangeReading = lastOilchangeReading;
    }

    public double getEngineSize() {
        return engineSize;
    }
    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }



}
