package sprint_5.theme_4.NewYearReminder;

// Дополните объявление класса Contact
public abstract class Contact {
    // Класс должен содержать одно полe - имя пользователя name
     String name;

    public Contact (String name) {
        this.name = name;
    }

    // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакте
    abstract void sendMessage();
    abstract void print();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                '}';
    }
}
