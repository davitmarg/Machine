package com.company;

public class Command {
    private FoodType foodType;
    private int column;
    private int count;

    public Command() {

    }

    public Command(String commandString) throws MachineInputException {
        if (commandString.length() != 5)
            throw new MachineInputException();
        String[] arr = commandString.split(":", 3);
        if (arr[0].equals("A"))
            this.foodType = FoodType.DRINKS;
        else if (arr[0].equals("B"))
            this.foodType = FoodType.CHIPS;
        else if (arr[0].equals("C"))
            this.foodType = FoodType.CHOCOLATE;
        else
            throw new MachineInputException();

        try {
            this.column = Integer.parseInt(arr[1]);
            this.count = Integer.parseInt(arr[2]);
        } catch (NumberFormatException exception) {
            throw new MachineInputException();
        }

        if(this.column>3)
            throw new MachineInputException();
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public int getColumn() {
        return column;
    }

    public int getCount() {
        return count;
    }
}
