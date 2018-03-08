package PatternObserver;

public interface Observable {
    void AddObserver(Observer o);
    void DeleteObserver(Observer o);
    void InformObserver();
}
