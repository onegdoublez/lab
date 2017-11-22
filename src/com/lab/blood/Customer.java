package com.lab.blood;

import java.util.Arrays;

/**
 * Created by User on 022 22.11.17.
 */
public class Customer {
    private int idOfCitizen;
    private String name;
    private String[] tests;
    private int cashForPayment;
    private boolean isOurClient;
    private boolean isDiscount;

    public Customer(int idOfCitizen, String name, String[] tests, int cashForPayment, boolean isOurClient, boolean isDiscount) {
        this.idOfCitizen = idOfCitizen;
        this.name = name;
        this.tests = tests;
        this.cashForPayment = cashForPayment;
        this.isOurClient = isOurClient;
        this.isDiscount = isDiscount;
    }

    public Customer(int idOfCitizen, String name, String[] tests, int cashForPayment) {
        this.idOfCitizen = idOfCitizen;
        this.name = name;
        this.tests = tests;
        this.cashForPayment = cashForPayment;
    }

    public int getIdOfCitizen() {
        return idOfCitizen;
    }

    public void setIdOfCitizen(int idOfCitizen) {
        this.idOfCitizen = idOfCitizen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTests() {
        return tests;
    }

    public void setTests(String[] tests) {
        this.tests = tests;
    }

    public int getCashForPayment() {
        return cashForPayment;
    }

    public void setCashForPayment(int cashForPayment) {
        this.cashForPayment = cashForPayment;
    }

    public boolean isOurClient() {
        return isOurClient;
    }

    public void setOurClient(boolean ourClient) {
        isOurClient = ourClient;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    @Override
    public String toString() {
        return "Клиент: " +
                "ИИН Клиента->" + idOfCitizen +
                ", Имя->" + name + '\'' +
                ", Выдбрал анализы->" + Arrays.toString(tests) +
                ", Должен заплатить за это->" + cashForPayment +
                ", Наш постоянный клиент->" + isOurClient +
                ", Имеет Дисконт " + isDiscount +
                '}';
    }
}


