package sprint_5.theme_3.mobile;

public class MobilePhone extends Phone {

    public MobilePhone(String number) {
        super(number);
    }

    public void sendSms(String messageText, String targetNumber) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}
