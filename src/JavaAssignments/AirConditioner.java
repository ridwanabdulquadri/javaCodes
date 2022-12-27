package JavaAssignments;

public class AirConditioner {

    private boolean isOn;
    private int temperature;

    public AirConditioner(){}

    public AirConditioner(int temperature){
        if(temperature >= 16 && temperature < 27) this.temperature = temperature;
    }

    public void setOn(int temperature) {
        isOn = temperature >= 16 && temperature <= 27;
    }


    public boolean isOn() {
        return isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
