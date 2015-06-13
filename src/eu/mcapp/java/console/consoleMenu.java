package eu.mcapp.java.console;

import eu.mcapp.java.utils.core;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by waqar on 13/06/15.
 */
public class consoleMenu {

    private String name;
    private String description;
    public int items = 0;
    private ArrayList<consoleMenuItem> menuItems;


    /**
     * Constructor for console menu
     * Use setName and setDescription if you construct menu this way.
     */
    public consoleMenu() {
        menuItems = new ArrayList<consoleMenuItem>();

    }

    public consoleMenu(String n) {
        this.name = n;
        menuItems = new ArrayList<consoleMenuItem>();
    }

    public consoleMenu(String n, String d) {

        this.name = n;
        this.description = d;


        menuItems = new ArrayList<>();
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setDescription(String d) {
        this.description = d;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void addMenuItem(consoleMenuItem i) {
        this.menuItems.add(items, i);
        items += 1;
    }

    public void printMenu() {
        if (menuItems.size() == 0) {
            System.out.println("menu is empty");
        } else {

            String leftAlignFormat = "| %-6s | %-10s | %-41s ||%n";

            System.out.format("+---------------------+-------------------------------------------++%n");
            System.out.printf("| key    | Name       | Description                               ||%n");
            System.out.format("+---------------------+-------------------------------------------++%n");


            for (consoleMenuItem t : menuItems) {
                //consoleMenuItem t = menuItems.get(i);
                //System.out.println(""+i+"\t\t"+ menuItems.get(i).getName()+"\t\t"+t.getDescription());
                System.out.format(leftAlignFormat, "[" + t.getKey() + "]", t.getName(), t.getDescription());

            }

            System.out.format(leftAlignFormat, "[x]", "Go Back", "");
            System.out.format(leftAlignFormat, "[0]", "Exit", "");

            System.out.format("+--------+------------+-------------------------------------------++%n");


//            System.out.println("#\t\tName:\tDescription\t");
//            for(int i =0; i < menuItems.size(); i++)
//            {
//                consoleMenuItem t = menuItems.get(i);
//                System.out.println(""+i+"\t\t"+ menuItems.get(i).getName()+"\t\t"+t.getDescription());
//            }
        }


    }

    public void takeControl() {
        printMenu();
        System.out.print("Select Option: ");

        String optionSelected = "";


        while (!optionSelected.equals("x") || !optionSelected.equals("0")) {
            Scanner s = new Scanner(System.in);
            optionSelected = s.nextLine();

            for (consoleMenuItem i : menuItems) {
                if (optionSelected.equals(i.getKey())) {
                    core.reflect(i.getClassName(), i.getFunctionName());
                } else {
                }

            }


            if (optionSelected.equals("0")) {
                return;

            }


            if (optionSelected.equals("x"))
                System.exit(0);

            System.out.println("Wrong Option selected\n\n");

            printMenu();
            System.out.print("Select Option: ");


        }


    }
}


