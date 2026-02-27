import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        RunTracker tracker = new RunTracker();
        Run run = new Run(LocalDate.now(), 5.0, 1500, "Evening run");
        Run run2 = new Run(LocalDate.now(), 10, 3600, "Long run!");
        tracker.addRun(run);
        tracker.listRuns();

        System.out.println(run);








    }
}