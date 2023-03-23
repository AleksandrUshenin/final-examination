package Implements.Commands;

import Implements.UserInterface;
import Interfaces.IAnimalCommand;

public class CommandRun implements IAnimalCommand {
    @Override
    public void doCommand() {
        UserInterface ui = new UserInterface();
        ui.print("Running....");
    }
}
