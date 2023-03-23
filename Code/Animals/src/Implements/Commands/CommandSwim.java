package Implements.Commands;

import Implements.UserInterface;
import Interfaces.IAnimalCommand;
import Interfaces.IController;
import Interfaces.IUserInterface;

public class CommandSwim implements IAnimalCommand {
    @Override
    public void doCommand() {
        IUserInterface ui = new UserInterface();
        ui.print(" Swims");
    }
}
