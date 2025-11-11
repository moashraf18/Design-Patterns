public interface Subject {
    void subscribe(Observer observer, String name);
    void unsubscribe(Observer observer, String name);
    void notifyObservers(String videoTitle);
}