package Implements;

import Implements.Commands.CommandFly;
import Implements.Commands.CommandSwim;
import Interfaces.IAnimalCommand;
import Interfaces.IAnimalRegistry;
import Interfaces.IController;
import Interfaces.IUserInterface;

import java.util.ArrayList;
import java.util.List;

public class Controller implements IController {
    private IUserInterface ui;
    private IAnimalRegistry ar;
    private List<IAnimalCommand> commandList;
    @Override
    public void run() {
        ui = new UserInterface();
        ar = new AnimalRegisry();
        commandList = new ArrayList<>();
        commandList.add(new CommandFly());
        commandList.add(new CommandSwim());
        boolean work = true;
        while (work){
            work = menu();
        }
    }
    private boolean menu(){
        pintMenu();
        switch (ui.read()){
            case "1":
                printAll();
                return true;
            case "2":
                add();
                return true;
            case "3":
                addCommand();
                return true;
            case "4":
                dell();
                return true;
            case "5":
                return false;
            default:
                return true;
        }
    }
    private void pintMenu(){
        ui.print("\n 1 -- Вывести список");
        ui.print(" 2 -- Добавить животное");
        ui.print(" 3 -- Добавить команду животному");
        ui.print(" 4 -- Удалить");
        ui.print(" 5 -- Выход");
    }
    private void add(){
        ui.print("\nВведите имя: ");
        var name = ui.read();
        ui.print("\nВведите вид: ");
        var type = ui.read();
        ar.addAnimal(name, type);
    }
    private void printAll(){
        ui.print("\n Список:\n");
        for ( var res : ar.getAnimals() ) {
            ui.print(res.toString());
        }
    }
    private void dell(){
        ui.print("\nВведите id: ");
        var res = ui.read();
        int ires = -1;
        try {
            ires = Integer.parseInt(res);
        }
        catch (Exception ex){
            return;
        }
        ar.killAnimal(ires);
    }
    private void addCommand(){
        ui.print(commandList.toString());
        ui.print("Введите номер: ");
        int ires = -1;
        var res = ui.read();
        ui.print("Введите id: ");
        int ires2 = -1;
        var res2 = ui.read();
        boolean bres = false;
        try {
            ires = Integer.parseInt(res);
            ires2 = Integer.parseInt(res2);
            bres = ar.addAnimalCommand(ires2, commandList.get(ires));
        }
        catch (Exception ex){
            ui.print("\n " + ex.getMessage());
            return;
        }
        if (!bres){
            ui.print("\n Ошибка!");
        }
    }
}
