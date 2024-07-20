package sprint_4.theme_1.WorkCalculator;



public class WorkCalculator {

    private int workingHours = 8;
    private String workerName;
    public double coefficient;

    public WorkCalculator(String newName) {
        workerName = newName;
    }

    public String getWorkerName() {
        return workerName;
    }

    int calculate(int workDays) {
        return workDays * workingHours;
    }

    double calculateWithCoefficient(int workDays) {
        return workDays * workingHours * coefficient;
    }
}