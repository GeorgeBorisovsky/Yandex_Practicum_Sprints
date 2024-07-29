package sprint_4.theme_4.tasks;

public class Task {
    private final TaskPriority taskPriority;
     // добавьте переменную priority с приоритетом задачи
    private final String description;

    public Task(TaskPriority taskPriority, String description) {
        this.taskPriority = taskPriority;
        this.description = description;
    }

    // добавьте конструктор класса

             // добавьте метод get для приоритета
    public TaskPriority getTaskPriority() {

        return taskPriority;
    }

    public String getDescription() {
        return description;
    }
}
