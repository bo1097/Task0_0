/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank;

import com.mycompany.bank.Bank.CreditAccount;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class App {

    static Bank bank = new Bank("Приват", 10000000, 0.01, 2);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isfinish = false;
        while (!isfinish) {
            try {
                switch (primaryMenuOperator()) {
                    case 1:
                        createAccount();
                        break;
                    case 2:
                        enterAccount();
                }

            } catch (NumberFormatException e) {
                System.out.println("Попробуйте еще раз");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /*
    Метод предоставляет пользователю главное меню. Возвращает выбор пользователя
     */
    public static int primaryMenuOperator() {
        System.out.println("Главное меню:");
        System.out.println("1. Создать аккаунт");
        System.out.println("2. Зайти в свой аккаунт");
        System.out.println("3. Посмотреть все созданные акканты");
        int userChoice = Integer.parseInt(sc.next());
        if (userChoice <= 0 || userChoice > 3) {
            throw new IllegalArgumentException("Неверный пункт меню");
        }
        return userChoice;
    }

    /*
    Метод создает банковский счет
     */
    public static void createAccount() {
        System.out.println("Введите свое имя");
        String userName = sc.next();
        System.out.println("Требуемая сумма денег в кредит");
        int userMoney = Integer.parseInt(sc.next());
        System.out.println("Желаемый процент, под который выдается кредит");
        int userProcent = Integer.parseInt(sc.next());
        bank.createAccount(userName, userMoney, userProcent);
    }

    public static void manipulateAccount() {
        CreditAccount account =  enterAccount();
        System.out.println("Не выводится");
        switch (menuOnAccountOperator()) {
            case 1:
                account.showBalance();
                break;
            case 2: 
                

        }

    }

    public static CreditAccount enterAccount() {
        CreditAccount[] arrayOfUserAccounts = findAndReturnAccounts();
        System.out.println("Выберите свой аккаунт");
        for (int i = 0; i < arrayOfUserAccounts.length; i++) {
            System.out.println((i + 1) + "." + arrayOfUserAccounts[i]);
        }
        int userChoice = Integer.parseInt(sc.next());
        if (userChoice <= 0 || userChoice > arrayOfUserAccounts.length) {
            throw new IllegalArgumentException("Неверный выбор");
        }
        return arrayOfUserAccounts[userChoice - 1];
    }

    public static CreditAccount[] findAndReturnAccounts() {
        CreditAccount[] userAccounts = new CreditAccount[0];
        int countAccounts = 0;
        System.out.println("Пожалуйста введите свое имя");
        String name = sc.next();
        boolean nameIsValid = false;
        for (int i = 0; i < bank.getCountOfAccounts(); i++) {
            if (name.equalsIgnoreCase(bank.getBankAccounts()[i].getNameOfAccountUser())) {
                nameIsValid = true;
                userAccounts = Arrays.copyOf(userAccounts, userAccounts.length + 1);
                userAccounts[countAccounts++] = bank.getBankAccounts()[i];
            }
        }
        if (!nameIsValid) {
            throw new IllegalArgumentException("Такого имени в базе данных не существует");
        }
        return userAccounts;
    }

    public static int menuOnAccountOperator() {
        System.out.println("1. Посмотреть свой баланс");
        System.out.println("2. Внести деньги на карточку");
        int userChoice = Integer.parseInt(sc.next());
        if (userChoice <= 0 || userChoice > 2) {
            throw new IllegalArgumentException("Неверный пункт меню");
        }
        return userChoice;
    }

    public static void addMoneyToCard(CreditAccount account) {
        if(balanceIsPositive(account)){
            int moneyToAdd = Integer.parseInt(sc.next());
            account.addMoney(moneyToAdd);
        }
        if(!balanceIsPositive(account)){
            int moneyToRepay = Integer.parseInt(sc.next());
            account.setMoneyBack(moneyToRepay);
        }
    }

    public static boolean balanceIsPositive(CreditAccount account) {
        while (true) {
            if (account.getBalanceOnCard() < 0) {
                System.out.println("Баланс на вашей карте отрицательный."
                        + "Все деньги внесенные на карту пойдут на погашение кредита.");
                System.out.println("Сколько денег вы хотите внести, чтобы погасить кредит?");
                return false;
            }
            if (account.getBalanceOnCard() >= 0) {
                System.out.println("Сколько денег вы хотите внести? ");
                return true;
            }
        }
    }

}
