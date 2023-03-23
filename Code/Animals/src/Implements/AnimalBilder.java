package Implements;

import Implements.Commands.CommandJump;
import Implements.Commands.CommandRun;
import Interfaces.IAnimal;
import Interfaces.IAnimalCommand;
import Interfaces.IAnimalsBilder;

import java.util.ArrayList;
import java.util.List;

public class AnimalBilder implements IAnimalsBilder {
    private static int id;
    private List<IAnimalCommand> baseCommand;

    public AnimalBilder() {
        baseCommand = new ArrayList<>();
        baseCommand.add(new CommandJump());
        baseCommand.add(new CommandRun());
    }

    @Override
    public IAnimal createAnimal(String name, String type) {
        IAnimal animal = null;
        try {
            animal = new Animal(id++, name, type, baseCommand);
        }
        catch (Exception ex){}
        return animal;
    }

    @Override
    public void addAnimalCommand(IAnimal animal, IAnimalCommand command) {
        animal.addCommand(command);
    }
}
