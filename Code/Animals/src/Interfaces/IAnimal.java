package Interfaces;

import java.util.List;

public interface IAnimal {
    String getName();
    String getType();
    List<IAnimalCommand> getCommand();
    boolean addCommand(IAnimalCommand command);
}
