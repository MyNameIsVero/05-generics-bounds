package ohm.softa.a05.model;

public abstract class Plant implements Comparable{

    public Plant(double height, String family, String name) {
        this.height = height;
        this.family = family;
        this.name = name;
    }

    private final double height;
    private final String family;
    private final String name;

    public  double getHeight() {return height; };
    public String getFamily() {return family; };
    public  String getName() {return name; };
    public abstract PlantColor getColor();

    public int compareTo(Object o ){
        Plant plant = (Plant) o;
        return Double.compare(this.getHeight(), plant.getHeight());

        // return (this.getHeight() > plant.getHeight()) ? 1 : (this.getHeight()== plant.getHeight())? 0 : -1;
    }

    public boolean equals(Object o){
        if(this == o ) return true;
        // if()
        //...
    }
}
