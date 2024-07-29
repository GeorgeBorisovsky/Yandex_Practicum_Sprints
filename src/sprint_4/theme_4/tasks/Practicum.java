package sprint_4.theme_4.tasks;

import java.util.ArrayList;


public class Practicum {

    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task(TaskPriority.HIGH, "Оплатить интернет."));
        tasks.add(new Task(TaskPriority.LOW, "Сходить в парикмахерскую."));
        tasks.add(new Task(TaskPriority.MEDIUM, "Выбрать подарок подруге на ДР."));
        tasks.add(new Task(TaskPriority.MEDIUM, "Купить билеты в театр."));
        tasks.add(new Task(TaskPriority.HIGH, "Посетить вебинар по английскому языку."));
        tasks.add(new Task(TaskPriority.LOW, "Купить пылесос."));

        filterByPriority(tasks, TaskPriority.HIGH);


    }

    // цикл for для поиска задач
    public static void filterByPriority(ArrayList<Task> tasks, TaskPriority taskPriority) {
        System.out.println("Задачи с наивысшим приоритетом на сегодня:");
        for (Task task : tasks) {
            if (task.getTaskPriority() == taskPriority) {
                System.out.println(task.getDescription());
            }
        }
    }

}
