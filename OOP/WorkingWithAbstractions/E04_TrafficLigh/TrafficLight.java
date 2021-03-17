package _01_workingWithAbstraction_E04_TrafficLights;

public class TrafficLight {

    private LightsColor color;

    public TrafficLight(LightsColor color) {
        this.color = color;
    }

    //red -> green -
    // green -> yellow
    // yellow -> red

    public LightsColor getColor() {
        return this.color;
    }

    public void LightUpdate() {
        switch (color) {
            case RED:
                this.color = LightsColor.GREEN;
                break;
            case GREEN:
                this.color = LightsColor.YELLOW;
                break;
            case YELLOW:
                this.color = LightsColor.RED;
                break;
        }
    }
}
