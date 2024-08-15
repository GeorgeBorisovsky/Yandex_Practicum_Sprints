package sprint_5.theme_3.mobile;

// допишите реализацию класса Smartphone
public class Smartphone  extends MobilePhone {

    public Smartphone(String number) {
        super(number);
    }

    // объявите метод sendEmail()
       public void sendEmail(String messageText, String email) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

    void makeCall(String targetNumber, String appName) {

    }

}
