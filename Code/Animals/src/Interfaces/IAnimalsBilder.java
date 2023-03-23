package Interfaces;

public interface IAnimalsBilder {
    IAnimal createAnimal(String name, String type);
    void addAnimalCommand(IAnimal animal, IAnimalCommand command);
}
