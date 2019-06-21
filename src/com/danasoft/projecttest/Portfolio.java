package com.danasoft.projecttest;

import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;

    Portfolio() {
        projects = new ArrayList<>();
    }

    public Portfolio(ArrayList<Project> items) {
        projects = items;
    }

    public Project getProject(String projectName) {
        for (Project p : projects) {
            if (p.getName().equals(projectName))
                return p;
        }
        return null;
    }

    void addProject(Project p) {
        projects.add(p);
    }

    void displayProjects() {
        System.out.println("\r\n\tProjects\r\n");
        for (Project p : projects) {
            System.out.println("\t" + p);
        }
    }

    double getTotalCost() {
        double sum = 0.0;
        for (Project p : projects) {
            sum += p.getInitialCost();
        }
        return sum;
    }
}
