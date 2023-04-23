package ohm.softa.a05.model;

public class Flower extends Plant {

    private PlantColor myColor;

    public Flower(double height, String family, String name, PlantColor color) throws Exception {
        super(height, family, name);
        if(color == PlantColor.GREEN) throw new Exception();
        else this.myColor = color;
    }

    @Override
    public PlantColor getColor() {
        return myColor;
    }

}
