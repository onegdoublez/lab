package com.lab.blood;

/**
 * Created by User on 022 22.11.17.
 */
public class Cashier implements Employee {
    private String name;
    private double salary;
    private String dateOfReception;

    public Cashier(String name, double salary, String dateOfReception) {
        this.name = name;
        this.salary = salary;
        this.dateOfReception = dateOfReception;
    }

    public Cashier(double salary, String dateOfReception) {
        this.salary = salary;
        this.dateOfReception = dateOfReception;
    }

    public Cashier(String name, String dateOfReception) {
        this.name = name;
        this.dateOfReception = dateOfReception;
    }

    public Cashier(String dateOfReception) {
        this.dateOfReception = dateOfReception;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String comeToWork() {
        return ("I'm come to work at" + getDateOfReception());
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateOfReception() {
        return dateOfReception;
    }

    public void setDateOfReception(String dateOfReception) {
        this.dateOfReception = dateOfReception;
    }
}
