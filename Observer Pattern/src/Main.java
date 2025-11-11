public class Main {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        Observer display1 = new TemperatureDisplay("Display 1");
        Observer display2 = new TemperatureDisplay("Display 2");
        Observer fan = new Fan();

        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);
        weatherStation.addObserver(fan);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(35);
    }
}