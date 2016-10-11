/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Bank {

    private String nameOfBank;
    private double balanceOfBank;
    private CreditAccount[] bankAccounts;
    private final double maximumLendProcent; // Максимальный процент от баланса банка, который он может одолжить клиенту.
    private final double minimumProcentInCredit; // Минимальный процент под который банк выдает кредит.
    private int countOfAccounts = 0;
    Random r = new Random();

    public Bank(String nameofBank, double balanceOfBank, double maximumLendProcent, double minimumProcentInCredit) {
        this.nameOfBank = nameofBank;
        this.balanceOfBank = balanceOfBank;
        this.maximumLendProcent = maximumLendProcent;
        this.minimumProcentInCredit = minimumProcentInCredit;
        bankAccounts = new CreditAccount[2];
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public double getBalanceOfBank() {
        return balanceOfBank;
    }

    public void setBalanceOfBank(double balanceOfBank) {
        this.balanceOfBank = balanceOfBank;
    }

    public CreditAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(CreditAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    /*
    Метод создает банковский аккаунт
     */
    public void createAccount(String name, double requestedMoneyInCredit, double requestedProcent) {
        if (moneySummIsValid(requestedMoneyInCredit) && creditProcentIsValid(requestedProcent)) {
            CreditAccount creditAccount = new CreditAccount(name, requestedMoneyInCredit, requestedProcent);
            checkArray(countOfAccounts++);
            bankAccounts[countOfAccounts - 1] = creditAccount;
        }
    }


    /*
    Метод проверяет в состоянии ли банк дать кредит на такое количество денег.
    Если да, то возвращается true. В противном случае выбрасывается ошибка.
     */
    public boolean moneySummIsValid(double requestedMoneyInCredit) {
        if (requestedMoneyInCredit <= balanceOfBank * maximumLendProcent) {
            return true;
        } else {
            throw new IllegalArgumentException("Слишком большая сумма кредита.");
        }
    }

    /*
    Метод проверяет есть ли в массиве свободное место.
    Если нет, то длина массив расширяется.
    Метод возвращает число равное индексу ячейки массива, 
    в которую в последствии добавиться элемент.
     */
    public void checkArray(int checkedNumber) {
        if (bankAccounts.length <= checkedNumber) {
            bankAccounts = Arrays.copyOf(bankAccounts, (3 * bankAccounts.length / 2) + 1);
        }
    }

    /*
    Метод проверяет может ли банк дать клиенту кредит под определенный процент.
    Если да, то метод возвращает true. В противном случае выбрасывается ошибка
     */
    public boolean creditProcentIsValid(double requestedProcent) {
        if (requestedProcent >= minimumProcentInCredit) {
            return true;
        } else {
            throw new IllegalArgumentException("Слишком малый процент под кредит."
                    + " Минимальный процент - " + minimumProcentInCredit);
        }
    }

    /*
    Метод генерирует уникальный номер для банковской карты
     */
    public int generateAccountNum() {
        int num;
        if (countOfAccounts == 0) {
            return r.nextInt(999999) + 1;
        } else {
            boolean isUnique = true;
            do {
                num = r.nextInt(999999) + 1;
                for (int i = 0; i < countOfAccounts; i++) {
                    if (num == Integer.parseInt(bankAccounts[i].getAccountNum())) {
                        isUnique = false;
                    }
                }
            } while (!isUnique);
        }
        return num;
    }

    public int getCountOfAccounts() {
        return countOfAccounts;
    }


    /*
    Класс, описывающий кредитный аккаунт. Являеться внутренним классом класс Bank,
    поскольку сам по себе аккаунт без Банка существовать не может.
     */
    class CreditAccount {

        private String accountNum;
        private String nameOfAccountUser;
        private boolean isActive; // Флаг блокировки/разблокировки счета
        private double procentOfCredit;
        private double moneyInCredit;
        private double moneyBack;
        private double balanceOnCard;

        private CreditAccount(String nameOfAccountUser, double moneyInCredit, double procentOfCredit) {
            this.accountNum = String.valueOf(generateAccountNum());
            this.nameOfAccountUser = nameOfAccountUser;
            this.isActive = true;
            this.procentOfCredit = procentOfCredit;
            this.moneyInCredit = moneyInCredit;
            this.balanceOnCard = moneyBack - moneyInCredit;
            System.out.println("Аккаунт успешно создан");
        }

        @Override
        public String toString() {
            return "Аккаунт номер: " + accountNum + ". Имя клиента: " + nameOfAccountUser + ";"
                    + " Сумма денег в кредит: " + moneyInCredit + "; Выдан под процент: " + procentOfCredit
                    + "; Возвращенно денег: " + moneyBack;
        }

        public String getAccountNum() {
            return accountNum;
        }

        public void setAccountNum(String accountNum) {
            this.accountNum = accountNum;
        }

        public String getNameOfAccountUser() {
            return nameOfAccountUser;
        }

        public void setNameOfAccountUser(String nameOfAccountUser) {
            this.nameOfAccountUser = nameOfAccountUser;
        }

        public boolean isIsActive() {
            return isActive;
        }

        public void setIsActive(boolean isActive) {
            this.isActive = isActive;
        }

        public double getProcentOfCredit() {
            return procentOfCredit;
        }

        public void setProcentOfCredit(double procentOfCredit) {
            this.procentOfCredit = procentOfCredit;
        }

        public double getMoneyBack() {
            return moneyBack;
        }

        public void setMoneyBack(double moneyBack) {
            this.moneyBack = moneyBack;
        }

        public double getMoneyInCredit() {
            return moneyInCredit;
        }

        public void setMoneyInCredit(double moneyInCredit) {
            this.moneyInCredit = moneyInCredit;
        }

        /*
        Метод выводит баланс карты.
         */
        public void showBalance() {
            System.out.println("Сумма кредита составляет: " + moneyInCredit);
            System.out.println("Вы отдали: " + moneyBack);
            System.out.println("Баланс данной карты составляет: " + balanceOnCard);
        }

        public void addMoney(double moneyToAdd) {
           this.balanceOnCard += moneyToAdd; 
         }

        public double getBalanceOnCard() {
            return balanceOnCard;
        }
    }

}
