package ohm.softa.a05.model;

public class Shrub extends Plant {

    private PlantColor myColor = PlantColor.GREEN;
    public Shrub(double height, String family, String name) {
        super(height, family, name);
    }

    @Override
    public PlantColor getColor() {
        return myColor;
    }
}
