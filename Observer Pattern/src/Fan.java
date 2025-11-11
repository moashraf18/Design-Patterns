public class Fan implements Observer {
    @Override
    public void update(int temperature) {
        if (temperature >= 30) {
            System.out.println("Fan: It's hot. Turning fan ON!");
        } else {
            System.out.println("Fan: It's cool. Turning fan OFF!");
        }
    }
}