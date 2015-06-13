package eu.mcapp.java.demo;

import eu.mcapp.java.console.consoleMenu;
import eu.mcapp.java.console.consoleMenuItem;

/**
 * Created by waqar on 13/06/15.
 */
public class consoleMenuDemo extends demoClass {

    public consoleMenuDemo() {

        System.out.println("\n\n You are in colsoleMenuDemo class \n");

        consoleMenu m = new consoleMenu("Demo", "an OOP approach to console menu");

        consoleMenuItem i = new consoleMenuItem("a", "Gui Demo", "Opens up a JFrame and asks for close corfirmation thing", "basic.guiDemo", "");

        consoleMenuItem j = new consoleMenuItem("b", "2n Item", "T to any thing", "basic.guiDemo", "guiDemo");
        consoleMenuItem k = new consoleMenuItem("c", "3rd Item", "Thisfrom any thing", "basic.guiDemo", "guiDemo");

        m.addMenuItem(i);
        m.addMenuItem(j);
        m.addMenuItem(k);

        System.out.println("Number of Items in Menu are "+m.items+"\n\n");
        //m.printMenu();
        m.takeControl();

    }


    public void demo() {
        System.out.println("A Class constructor is not a function");
    }
}
