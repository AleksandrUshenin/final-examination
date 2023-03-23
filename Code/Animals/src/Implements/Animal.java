package Implements;

import Interfaces.IAnimal;
import Interfaces.IAnimalCommand;

import java.util.List;

public class Animal implements IAnimal {
    private int id;
    private String name;
    private String type;
    List<IAnimalCommand> commandList;

    public Animal(int id, String name, String type, List<IAnimalCommand> commandList) throws Exception {
        this.id = id;
        this.name = name;
        this.type = type;
        this.commandList = commandList;
        if (name == "" || type == "" || commandList == null)
            throw new Exception("Не все поля заполнены");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public List<IAnimalCommand> getCommand() {
        return commandList;
    }

    @Override
    public boolean addCommand(IAnimalCommand command) {
        if (commandList.contains(command))
            return false;
        commandList.add(command);
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", commandList=" + commandList +
                '}';
    }
}
