package lak.designPatterns.structural.adpterPattern.weatherWarnings.after;

public interface City {
    
    double getTemperature();
    String getName();
    String getTemperatureScale();
    boolean getHasWeatherWarning();
    void setHasWeatherWarning(boolean hasWeatherWarning);
}
