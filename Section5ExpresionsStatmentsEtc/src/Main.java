//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Exercises will be done in methods
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //exerciseOnePositiveNegativeZero(-3);
        exerciseTwoPrintConversion(2.0);
        MegaBytesConverter(0);
    }
//Exercise one (1)
    public static void exerciseOnePositiveNegativeZero ( int number){

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

    }

//Exercise two  (2)
    public static long exerciseTwoToMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour <0){
            return -1;
        }

        double miles = kilometersPerHour/1.60934;


        return Math.round(miles);

    }

    public static void exerciseTwoPrintConversion(double kilometersPerHour){

        long milesRounded = exerciseTwoToMilesPerHour(kilometersPerHour);

        long kilometersPerHourRounded = (long) kilometersPerHour;

        if(milesRounded >= 0) {
            System.out.println(kilometersPerHourRounded + " km/h == " + milesRounded + " mi/h");
        }
        else {
            System.out.println("Invalid value");
        }

    }

//Exercise three  (3)
    public static void MegaBytesConverter(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid value");
        }


        double megaAndKiloBytes = (double) kiloBytes/1024;
        int megaBytes = (int)Math.floor(megaAndKiloBytes);
        int kilobytesLeft = (int) ((megaAndKiloBytes - megaBytes) * 1024);

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kilobytesLeft + " KB");
    }

}