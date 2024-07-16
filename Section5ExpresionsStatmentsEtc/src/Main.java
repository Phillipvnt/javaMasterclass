//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Exercises will be done in methods
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //exerciseOnePositiveNegativeZero(-3);
        exerciseTwoPrintConversion(2.0);
    }

    public static void exerciseOnePositiveNegativeZero(int number){

        if(number > 0){
            System.out.println("positive");
        }
        else if(number < 0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }

        }

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
        else{
            System.out.println("Invalid value");
        }



    }

}