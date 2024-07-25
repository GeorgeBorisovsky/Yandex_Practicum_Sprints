package sprint_4.theme_1.bankAccount;

public class Practicum {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMoneyAmount(1000); // передайте в банкомат сумму на счету
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        bankAccount.withdrawAll(); // вызовите метод вывода средств
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {
    private long moneyAmount;

    // допишите код методов
    // используйте параметр newMoneyAmount для установки нового значения


    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int newMoneyAmount) {
        moneyAmount = newMoneyAmount;
    }

    public void withdrawAll() {
        System.out.println("Со счёта снято " + getMoneyAmount() + " р.");
        setMoneyAmount(0);

    }


}
