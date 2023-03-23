package Implements.Commands;

import Implements.UserInterface;
import Interfaces.IAnimalCommand;

public class CommandJump implements IAnimalCommand {
    @Override
    public void doCommand() {
        UserInterface ui = new UserInterface();
        ui.print("Jumping...");
    }
}
