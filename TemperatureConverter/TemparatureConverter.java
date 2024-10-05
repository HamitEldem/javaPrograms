public class TemparatureConverter {

    static double convertToCelsius(double fahrenheit) {
        return ( fahrenheit - 32 ) * 5 / 9;
    }

    static double convertToFahrenheit(double celsius) {
       return ( celsius - 32 ) * 5 / 9;
    }

    public static void main(String[] args) {
        int i;

        System.out.println("Fahrenheit Equivalent from 0 to 50 Celsius");
        System.out.println("Degrees in Celsius\t\tDegrees in Fahrenheit");
        System.out.println("----------------------------------------------------");

        for( i = 0; i <= 10; i++){
            System.out.println((i*5) + "\t\t\t\t\t\t\t\t" + convertToFahrenheit(i*5));
        }


        System.out.println("Celsius Equivalent from 0 to 50 Fahrenheit");
        System.out.println("Degrees in Fahrenheit\t\tDegrees in Celsius");
        System.out.println("----------------------------------------------------");

        for( i = 0; i <= 6; i++){
            System.out.println(32+(i*18) + "\t\t\t\t\t\t\t\t" + convertToCelsius(32 + i*18));
        }



    }
}
