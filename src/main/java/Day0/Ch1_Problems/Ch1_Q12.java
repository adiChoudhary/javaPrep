package Day0.Ch1_Problems;

import java.util.Scanner;

class Time {
    double hours;
    double mins;
    double secs;

    public Time(double hours, double mins, double secs) {
        this.hours = hours;
        this.mins = mins;
        this.secs = secs;
    }

    public Time() {
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getMins() {
        return mins;
    }

    public void setMins(double mins) {
        this.mins = mins;
    }

    public double getSecs() {
        return secs;
    }

    public void setSecs(double secs) {
        this.secs = secs;
    }

    public double getTotalHours() {
        return hours + mins / 60 + secs / 3600;
    }

    public void setTime(double hours, double mins, double secs) {
        this.hours = hours;
        this.mins = mins;
        this.secs = secs;
    }
}

public class Ch1_Q12 {
    public static void main(String[] args) {
        double distanceCoveredInMiles;
        Time timeTaken = new Time();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance covered by athlete:");
        distanceCoveredInMiles = sc.nextDouble();
        System.out.print("Enter time taken by athlete:");
        timeTaken.setTime(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        double avgSpeedInMilesPerHour = distanceCoveredInMiles / timeTaken.getTotalHours();
        double avgSpeedInKilometersPerHour = (distanceCoveredInMiles / timeTaken.getTotalHours()) * 1.6;
        System.out.println("Average speed in miles/hour:" + avgSpeedInMilesPerHour);
        System.out.println("Average speed in km/hour:" + avgSpeedInKilometersPerHour);
    }
}
