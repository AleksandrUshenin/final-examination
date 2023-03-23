package Implements;

import Implements.Commands.CommandJump;
import Implements.Commands.CommandRun;
import Interfaces.IAnimal;
import Interfaces.IAnimalCommand;
import Interfaces.IAnimalRegistry;
import Interfaces.IAnimalsBilder;

import java.util.ArrayList;
import java.util.List;

public class AnimalRegisry implements IAnimalRegistry {
    private List<IAnimal> animalList;
    private IAnimalsBilder bilder;

    public AnimalRegisry() {
        animalList = new ArrayList<>();
        bilder = new AnimalBilder();
    }

    @Override
    public void addAnimal(String name, String type) {
        animalList.add(bilder.createAnimal(name, type));
    }

    @Override
    public int getCount() {
        return animalList.size();
    }

    @Override
    public List<IAnimal> getAnimals() {
        return animalList;
    }

    @Override
    public IAnimal getAnimal(int index) {
        return animalList.get(index);
    }

    @Override
    public boolean killAnimal(int index) {
        if (animalList.get(index) == null)
            return false;
        animalList.remove(index);
        return true;
    }

    @Override
    public boolean addAnimalCommand(int index, IAnimalCommand command) {
        if (animalList.get(index) == null)
            return false;
        bilder.addAnimalCommand(animalList.get(index), command);
        return true;
    }
}
