package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleList;

public class PlantBed<T extends Plant> {
    private SimpleList<T> plants; //hier theoretisch Plant statt T aber im Filter methode nicht gut

    public void add(T plant) {
        plants.add(plant);
    }

    public SimpleList<T> getPlantsByColor(PlantColor color) {
        return plants.filter(plant -> plant.getColor().equals(color));
    }

    public int size() {
        return plants.size();
    }
    public SimpleList<T> getPlants(){
        return plants.map(p->p);
    }
}
