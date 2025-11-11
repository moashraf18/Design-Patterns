import java.util.ArrayList;

public class YouTubeChannel implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer, String name) {
        observers.add(observer);
        System.out.println("New Subscribe by: " + name);
    }

    @Override
    public void unsubscribe(Observer observer, String name) {
        observers.remove(observer);
        System.out.println("New Unsubscribe by: " + name);
    }

    @Override
    public void notifyObservers(String videoTitle) {
        for (Observer observer : observers){
            observer.update(videoTitle);
        }
    }
}