package guru.qa;

public class Fridge {
    boolean isClosed = true;
    boolean isOff;
    int initialTemperature;
    String[] food;

    public Fridge(int size, int initialTemperature) {
        this.food = new String[size];
        this.initialTemperature = initialTemperature;
    }

    void openFridge() {
        if (isClosed) {
            System.out.println("You open the fridge.");
            isClosed = false;
        } else {
            System.out.println("The fridge is already open.");
        }
    }

    void closeFridge() {
        if (!isClosed) {
            System.out.println("You closed the fridge.");
            isClosed = true;
        } else {
            System.out.println("The fridge is already closed.");
        }
    }

    void turnOnFridge() {
        if (isOff) {
            System.out.println("You turned on the fridge.");
            isOff = false;
        } else {
            System.out.println("The fridge is already on.");
        }
    }

    void switchOffFridge() {
        if (!isOff) {
            System.out.println("You switch off the fridge.");
            isOff = true;
        } else {
            System.out.println("The fridge is already off.");
        }
    }

    void changeTemperature(int newTemperature) {
        if (initialTemperature > newTemperature) {
            System.out.println("You lowered the temperature in the fridge from "+ initialTemperature + " to " + newTemperature + " degrees.");
            initialTemperature = newTemperature;
        } else if (initialTemperature == newTemperature) {
            System.out.println("Temperature in the fridge is the same: " + initialTemperature + " degrees.");
        } else {
            System.out.println("You raised the temperature in the fridge from "+ initialTemperature + " to " + newTemperature + " degrees.");
            initialTemperature = newTemperature;
        }
    }

    void lookInFridge() {
        System.out.println("Here is what you have in the fridge: ");
        for (int i = 0; i < food.length; i++) {
            System.out.println( (i + 1) + ". " + food[i]);
        }

    }

    void putInFridge(int positionOfFood, String product) {
        food[positionOfFood - 1] = product;
        this.lookInFridge();
    }

    void takeFromFridge(int positionOfFood) {
        if (food[positionOfFood - 1] == null) {
            System.out.println("It seems like this fridge shelf is empty.");
        } else {
            System.out.println("You took " + food[positionOfFood - 1] + " from the fridge.");
            food[positionOfFood - 1] = null;
        }
        this.lookInFridge();
    }
}
