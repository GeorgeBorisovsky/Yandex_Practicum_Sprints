package sprint_5.theme_4.trainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Practicum {

    public static void main(String[] args) {
        AnswerHolder<Number> elephantAnswer = new AnswerHolder<>("Сколько весит слон в тоннах", 5);
        elephantAnswer.printSmart();

        HashMap<String, Number> bigRussianEncyclopedia = new HashMap<>();
        bigRussianEncyclopedia.put("Сколько часов в сутках", (double) 24);
        bigRussianEncyclopedia.put("Сколько весит слон в тоннах", 4.3);

        elephantAnswer.replaceAnswer(bigRussianEncyclopedia);
        elephantAnswer.printSmart();

        HardQuestion elephantVolumeQuestion = new HardQuestion("Как вычислить объём слона с помощью подручных средств?");
        elephantVolumeQuestion.printSmart();

        ArrayList<SmartPrintable> printables = new ArrayList<>();
        printables.add(elephantAnswer);
        printables.add(elephantVolumeQuestion);
        System.out.println("Всё, что можно распечатать: ");
        print(printables);

        ArrayList<AnswerHolder<Number>> answers = new ArrayList<>();
        answers.add(elephantAnswer);
        System.out.println("Лучшие ответы на вопросы: ");
        print(answers);
    }


    static void print(List<? extends SmartPrintable> values) {
        for (SmartPrintable value : values){
            value.printSmart();
        }
    }
}

interface SmartPrintable {
    void printSmart();
}


class AnswerHolder<T extends Number> implements SmartPrintable {
    String question;
    T answer;

    public AnswerHolder(String question, T answer) {
        this.answer = answer;
        this.question = question;
    }

    public void replaceAnswer(HashMap<String, T> bigRussianEncyclopedia) {
        //метод должен замещать значение answer значением, полученным из аргумента - хеш-таблицы, для данного вопроса
        answer = bigRussianEncyclopedia.get(question);
    }

    @Override
    public void printSmart() {
        System.out.println("Ответ на вопрос '" + question + "' равен " + answer.intValue());
    }
}


class HardQuestion implements SmartPrintable {
    String questionText;

public HardQuestion(String questionText) {
    this.questionText = questionText;
}

@Override
public void printSmart() {
    System.out.println("Текст очень сложного вопроса: " + questionText);
}
}

