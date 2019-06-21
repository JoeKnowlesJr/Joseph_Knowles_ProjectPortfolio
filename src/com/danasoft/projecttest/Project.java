package com.danasoft.projecttest;

public class Project {
    private String name;
    private String description;
    private double initialCost;

    Project() {
        name = "New Project";
        description = "No description";
    }

    Project(String name) {
        this.name = name;
        description = "No description";
    }

    Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Project(String name, String description, double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    String getName() {
        return this.name;
    }
    void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    void setDesciption(String description) {
        this.description = description;
    }
    double getInitialCost() {
        return this.initialCost;
    }

    void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }

    private String elevatorPitch() {
        return String.format("%s ($%.2f): %s", name, initialCost, description);
    }

    @Override
    public String toString() {
        return elevatorPitch();
    }
}
