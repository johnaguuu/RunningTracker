import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        RunTracker tracker = new RunTracker();
        Run run = new Run(LocalDate.now(), 5.0, 1500, "Evening run");
        Run run2 = new Run(LocalDate.now(), 10, 3600, "Long run!");
        tracker.addRun(run);
        tracker.listRuns();

        boolean Running = true;

        while (Running) {
            System.out.print("""
                    \n
                    This is the menu. Here are the options:
                    
                    1. Add runs
                    2. View runs
                    3. Exit
                    
                    Please pick your option: \n
                     
                    """);


            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Exiting... ");
                Running = false;

            } else if (choice == 2) {
                System.out.println("\nThese are the runs currently listed: ");

                tracker.listRuns();

                System.out.println("\n");


            } else if (choice == 1) {

                System.out.println("\nTo add the run please provide 3 inputs, the distance, the time it took in seconds and any notes you might want to add. ");
                System.out.println("Distance Taken (Km): ");
                float distance = scanner.nextInt();
                System.out.println("Time Taken (seconds): ");
                int timeTaken = scanner.nextInt();
                System.out.println("Any notes? ");
                String notes = scanner.nextLine();



                Run addrun = new Run(LocalDate.now(), distance, timeTaken, notes);
                tracker.addRun(addrun);




            } else {
                System.out.println("You answer was unrecognized, please put the correct integer in accordance to the options presented: ");
            }

        }

        System.out.println("Hello John, good afternoon! Time to do some proper work okay." +
                "\nIt's gonna be super nice and cool");


        System.out.println("This is a println");


    }
}