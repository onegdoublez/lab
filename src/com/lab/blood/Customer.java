package com.lab.blood;

import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 022 22.11.17.
 */
public class Customer {
    private int idOfCitizen;
    private String name;
    private String[] analyzes;
    private int cashForPayment;
    private boolean isOurClient;
    private boolean isDiscount;

    public Customer(int idOfCitizen, String name, String[] analyzes, int cashForPayment, boolean isOurClient, boolean isDiscount) {
        this.idOfCitizen = idOfCitizen;
        this.name = name;
        this.analyzes = analyzes;
        this.cashForPayment = cashForPayment;
        this.isOurClient = isOurClient;
        this.isDiscount = isDiscount;
    }

    public Customer(int idOfCitizen, String name, String[] analyzes, int cashForPayment) {
        this.idOfCitizen = idOfCitizen;
        this.name = name;
        this.analyzes = analyzes;
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

    public String[] getAnalyzes() {
        return analyzes;
    }

    public void setAnalyzes(String[] analyzes) {
        this.analyzes = analyzes;
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
                ", Выдбрал анализы->" + Arrays.toString(analyzes) +
                ", Должен заплатить за это->" + cashForPayment +
                ", Наш постоянный клиент->" + isOurClient +
                ", Имеет Дисконт " + isDiscount +
                '}';
    }
}


