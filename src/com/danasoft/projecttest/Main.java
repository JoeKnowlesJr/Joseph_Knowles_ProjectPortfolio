package com.danasoft.projecttest;

import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    private static void pressEnterToContinue(boolean clr) {
        System.out.println("\r\n\tPress <ENTER> to continue...");
        scanner.nextLine();
        if (clr) clearScreen();
    }

    private static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ex) {
        }
    }

    private static String getStringInput(String msg, boolean nums) {
        System.out.println(msg);
        String input = scanner.nextLine();
        if (nums) {
            return input.replaceAll("[^\\d.]", "");
        }
        return input;
    }



    public static void main(String[] args) {
        Portfolio mPortfolio = new Portfolio();
        scanner = new Scanner(System.in);
        clearScreen();
        System.out.println("\r\n\r\n\t\t\t---------------\r\n\t\t\t|Project Class|\r\n\t\t\t---------------\r\n\r\n");
        pressEnterToContinue(true);

        Project project1 = new Project();
        mPortfolio.addProject(project1);
        Project project2 = new Project("Project2");
        mPortfolio.addProject(project2);
        Project project3 = new Project("Project3", "This is the third project");
        mPortfolio.addProject(project3);

        mPortfolio.displayProjects();

        String newName = getStringInput("\r\n\tEnter new name for project1", false);
        project1.setName(newName);
        mPortfolio.displayProjects();

        String newDesc = getStringInput("\r\n\tEnter new description for project2", false);
        project2.setDesciption(newDesc);
        mPortfolio.displayProjects();

        String newCost = getStringInput("\r\n\tEnter new initial cost for project3", true);
        project3.setInitialCost(Double.parseDouble(newCost));
        mPortfolio.displayProjects();

        System.out.printf("Total portfolio cost: $%.2f", mPortfolio.getTotalCost());
        System.out.println("");

        scanner.close();
    }
}
