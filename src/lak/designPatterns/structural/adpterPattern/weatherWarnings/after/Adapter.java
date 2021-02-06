package lak.designPatterns.structural.adpterPattern.weatherWarnings.after;

public class Adapter implements City{

    City city;


    public Adapter(AsianCity city){
        this.city = city;
    }

    @Override
    public double getTemperature() {
        double temperature = city.getTemperature();
        return temperature * 1.8 + 32;
    }

    @Override
    public String getName() {
        return city.getName();
    }

    @Override
    public String getTemperatureScale() {
       return "Fahrenheit";
    }

    @Override
    public boolean getHasWeatherWarning() {
        return city.getHasWeatherWarning();
    }

    @Override
    public void setHasWeatherWarning(boolean hasWeatherWarning) {
        city.setHasWeatherWarning(hasWeatherWarning);
    }
}
