/*
 * Author: Lucas E. F. Coutinho
 * Description: Advanced Objected Oriented Programming Course.
 */

import java.util.Arrays;
public class Fruits {
    String fruitName;
    boolean seedInside;
    String size;
    String color;
    int units;
    public Fruits() {

    }

    public Fruits(String name, boolean seedInside, String size, String color, int units) {
        setFruitName(name);
        setSeedInside(seedInside);
        setSize(size);
        setColor(color);
        setUnits(units);
    }

    public void setFruitName(String fruitName) {
        if (fruitName == null || fruitName.isEmpty()) {
            throw new IllegalArgumentException("The size is invalid. Please choose between small, medium, and large.");
        } else {
            if (validateFruitName(fruitName)) {
                this.fruitName = fruitName;
            } else {
                throw new IllegalArgumentException("The name can only contain letters and not empty spaces.");
            }
        }
    }

    public static boolean validateFruitName(String name){
        return name.matches("^[a-zA-Z]+$");
    }
    public void setSeedInside(boolean seedInside) {
        this.seedInside = seedInside;
    }

    public void setSize(String size) {
        if (size == null || size.isEmpty()) {
            throw new IllegalArgumentException("The size can not be empty.");
        } else {
            if (validateSize(size)) {
                this.size = capitalizeStrings(size);
            } else {
                throw new IllegalArgumentException("The size is invalid. Please choose between small, medium, and large.");
            }
        }
    }


    public String capitalizeStrings(String strValue){
        return strValue.substring(0,1).toUpperCase() + strValue.substring(1).toLowerCase();
    }

    public boolean validateSize(String size){
        String[] validSizes = {"Small", "Medium", "Large"};
        boolean isValidSize = Arrays.asList(validSizes).contains(capitalizeStrings(size));
        return isValidSize;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("The color can not be empty.");
        } else {
            this.color = capitalizeStrings(color);
        }
    }

    public void setUnits(int units) {
        if ( units >= 0) {
            this.units = units;
        } else {
            throw new IllegalArgumentException("The total units of a fruit can not be negative.");
        }
    }

    public int getUnits() {
        return this.units;
    }

    public String getName() {
        return this.fruitName;
    }

    public void addUnits(int newUnits) {
        setUnits(this.units + newUnits);
    }

    public void printUnits() {
        System.out.printf("Units of %s: %d\n",this.fruitName, this.getUnits());
    }
    public void printProperties(Orange orange){
        System.out.printf("Fruit name: %s\nHas seed inside: %b\nSize: %s\nColor: %s\nCan make juice? %b\n\n\n\n", orange.fruitName,
                orange.seedInside, orange.size, orange.color, orange.canMakeJuice );

    }

    public void printProperties(Banana banana){
        System.out.printf("Fruit name: %s\nHas seed inside: %b\nSize: %s\nColor: %s\nCan make juice? %b\n\n\n\n", banana.fruitName,
                banana.seedInside, banana.size, banana.color, banana.canMakeCake );

    }


    public static void main (String[] args){
        Fruits newFruit =  new Fruits();
        Orange newOrange = new Orange("Orange",true, "Small", "Orange", true, 10);
        Banana newBanana = new Banana("Banana",true, "Medium", "Yellow", true, 25);
        newFruit.printProperties(newOrange);
        newFruit.printProperties(newBanana);
        newOrange.printUnits();
        newOrange.addUnits(10);
        newOrange.printUnits();
        newBanana.printUnits();
    }

}

class Orange extends Fruits {
    boolean canMakeJuice;

    public Orange() {

    }
    public Orange(String name, boolean seedInside, String size, String color, boolean canMakeJuice, int units) {
        super(name, seedInside, size, color, units);
        this.canMakeJuice = canMakeJuice;
    }
}

class Banana extends Fruits {
    boolean canMakeCake;

    public Banana() {

    }
    public Banana(String name, boolean seedInside, String size, String color, boolean canMakeCake, int units) {
        super(name, seedInside, size, color, units);
        this.canMakeCake = canMakeCake;
    }
}
