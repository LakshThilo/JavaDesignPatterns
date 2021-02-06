package lak.designPatterns.structural.adpterPattern.weatherWarnings.before;

public class Main {

    public static void main(String[] args) {

        WeatherWarnings weatherWarnings = new WeatherWarnings();

        NorthAmericanCity chicago = new NorthAmericanCity("Chicago", 104);
        weatherWarnings.postWarning(chicago);

        NorthAmericanCity phoenix = new NorthAmericanCity("Phoenix", 104);
        weatherWarnings.postWarning(phoenix);

        NorthAmericanCity portland = new NorthAmericanCity("Portland", 104);
        weatherWarnings.postWarning(portland);

        AsianCity bangkok = new AsianCity("Bangkok", 50);
        weatherWarnings.postWarning(bangkok);

        /* If I run this, I can see in the console that it prints out messages with either a warning or the temperature is okay.
        Currently, it says that the temperature in Bangkok is okay. But this one should give a warning. This is because it's
        checking the temperature in Fahrenheit instead of Celsius. 50 degrees Celsius is actually really hot, it's about 122 in
        Fahrenheit. So it should give us a weather warning. You will need to write an adapter class, which can be used to check
        the weather for cities in Asia that use Celsius. I'm estimating that this will take you about 30 minutes to do, so go
        ahead and give it a try.*/
    }


}
