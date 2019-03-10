package teammates.storage.api;

import com.sun.tools.javac.util.List;
import teammates.storage.api.Event;

public final class MessageBus {
    private static MessageBus instance = new MessageBus();
    

    private MessageBus() {
        // prevent initialization
    }

    public static MessageBus inst() {
        return instance;
    }


    private List<Event> events = new List<Event>();


    public void sentToMessageHandler(Event event) {
        events.add(event);
    }
}
