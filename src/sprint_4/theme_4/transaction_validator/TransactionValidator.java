package sprint_4.theme_4.transaction_validator;

public class TransactionValidator {
    // объявите константы
    public static final int MIN_AMOUNT = 1;
    public static final int MAX_AMOUNT = 5000;

    // объявите метод isValidAmount()
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
    boolean sValidAmoun(double amount) {
        if (amount < 1) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        } else if (amount > 5000) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }

        return true;
    }

}
