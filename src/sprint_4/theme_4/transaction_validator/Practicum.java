package sprint_4.theme_4.transaction_validator;

import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransactionValidator transactionValidator = new TransactionValidator();

        System.out.println("Пожалуйста, введите сумму перевода в рублях.");
        // считайте сумму перевода при помощи scanner.nextDouble()
        double amount = scanner.nextDouble();
        boolean isValid = transactionValidator.sValidAmoun(amount); // добавьте вызов метод isValidAmount
        if (isValid) {
            System.out.println("Спасибо! Ваш перевод на сумму " + amount + " р. успешно выполнен.");
        }
    }
}