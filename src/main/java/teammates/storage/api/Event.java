package teammates.storage.api;


public class Event {
    private String id;
    private Object toDo;


    public Event(String id, Object toDo) {
        this.id = id;
        this.toDo = toDo;
    }
}