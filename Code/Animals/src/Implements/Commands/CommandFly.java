package Implements.Commands;

import Implements.UserInterface;
import Interfaces.IAnimalCommand;
import Interfaces.IUserInterface;

public class CommandFly implements IAnimalCommand {
    @Override
    public void doCommand() {
        IUserInterface ui = new UserInterface();
        ui.print(" Flies...");
    }
}
