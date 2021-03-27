package com.company;
import com.company.products.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Machine machine = new Machine();
        String commandString;
        Command command;
        while (true) {
            commandString = in.nextLine();
            try {
                command = new Command(commandString);
                break;
            } catch (MachineInputException exception) {
                System.out.println("Invalid command");
            }
        }
        ArrayList<Food> arr = machine.getProduct(command);
        for(int i=0;i<arr.size();i++)
            System.out.println(i+" : "+arr.get(i));
    }
}
