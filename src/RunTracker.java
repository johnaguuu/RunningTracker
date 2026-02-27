import java.util.ArrayList;

public class RunTracker {
    // This class is in charge of saving the runs (?)
    // In charge of adding, showing and calculating the stats.


    //Field-------------------------------------------------------

    //Okay, so here we are basically creating a field called runslist which is an arrayList
    private ArrayList<Run> runslist;



    //Constructor--------------------------------------------------


    //We're creating an empty arraylist here, constructors run inside so that fields can be managed first
    public RunTracker() {
        runslist = new ArrayList<>();
    }



    //Helper method-----------------------------------------------


    // this ads an object Run called run into the list
    public void addRun(Run run) {
        runslist.add(run);

    }



    // its a basic check that if the list is empty then it prints a message otherwise it displays runs
    public void listRuns() {
        if (runslist.isEmpty()) {
            System.out.println("No runs found");
            return;
        }
        for (Run run : runslist) {
            System.out.println(run);
        }
    }
}
