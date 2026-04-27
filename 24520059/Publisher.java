 import java.util.*;
class Publisher {
    ArrayList<Subscriber> subscribers = new ArrayList<>();
    void attach(Subscriber s)
    {
        subscribers.add(s);
    }
    void detach(Subscriber s)
    {
        subscribers.remove(s);
    }
    void notification(String message)
    {
        for(Subscriber s : subscribers)
            s.update(message);
    }
}
