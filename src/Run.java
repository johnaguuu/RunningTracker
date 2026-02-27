import java.time.LocalDate;


public class Run {

    // This is where I put the Fields
    private LocalDate date;
    private double distanceKm;
    private int timeSeconds;
    private String notes;

    //This is where I put the constructors, I use this to be able to use the fields
    public Run(LocalDate date, double distanceKm, int timeSeconds, String notes) {
        this.date = date;
        this.distanceKm = distanceKm;
        this.timeSeconds = timeSeconds;
        this.notes = notes;
    }

    //Here I will put the method I need to get the other thing, the pace. Because I don't have the pace but
    // I can calculate it using the totalSeconds per distanceKm.

    public String getPace() {
        double pace = (timeSeconds / 60.0) / distanceKm;

        int minutes = (int) pace;
        int seconds = (int) Math.round((pace - minutes) * 60);

        if (seconds == 60) {
            minutes++;
            seconds = 0;
        }

        return String.format("%d:%02d min/km", minutes, seconds);
    }

    public String getTime() {
        int hours = timeSeconds / 3600;
        int minutes = timeSeconds % 3600 / 60;
        int seconds = timeSeconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    @Override
    public String toString() {
        return date + " | Distance: " + distanceKm + " km | Time: " + getTime() + " | Pace: " + getPace();
    }




}
