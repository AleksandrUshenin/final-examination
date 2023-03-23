package Interfaces;

import java.util.List;

public interface IAnimalRegistry {
    void addAnimal(String name, String type);
    int getCount();
    List<IAnimal> getAnimals();
    IAnimal getAnimal(int index);
    boolean killAnimal(int index);
    boolean addAnimalCommand(int index, IAnimalCommand command);
}
