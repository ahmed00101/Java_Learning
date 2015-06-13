package eu.mcapp.java;

import eu.mcapp.java.console.consoleMenu;
import eu.mcapp.java.console.consoleMenuItem;
import eu.mcapp.java.utils.Crypt;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {


    public static String[][] menu = {
            {"0", "Exit", "System", "exit(0)"},
            {"1", "Basic Gui Demo", "basic.guiDemo", ""},
            {"2", "Demo Console Menu", "demo.consoleMenuDemo", null },


    };

    public static void main(String[] args){

        welcome();


        consoleMenu m = new consoleMenu("Main Menu","List of Demos you can run");
        consoleMenuItem a = new consoleMenuItem("a","Gui Demo 1","Opens JFrame", "basic.guiDemo",null);
        m.addMenuItem(a);
        m.takeControl();

    }

    public static void welcome() {
        System.out.println("Welcome to Big Java Tutorial \n");
    }





}
