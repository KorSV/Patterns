public interface Observed {
    void register(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
