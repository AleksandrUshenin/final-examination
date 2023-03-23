package Implements;

import Interfaces.IUserInterface;

import java.util.Scanner;

public class UserInterface implements IUserInterface {
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String read() {
        return scanner.nextLine();
    }
}
