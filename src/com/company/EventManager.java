package com.company;

import java.util.HashMap;
import java.util.Map;

public class EventManager {
    private final HashMap<EventListener, EventType> listeners = new HashMap<>();

    public void subscribe(EventListener listener, EventType eventType) {
        this.listeners.put(listener, eventType);
    }

    public void unsubscribe(EventListener listener) {
        this.listeners.remove(listener);
    }

    public void notifySubscribers(EventType eventType, String data){
        for (Map.Entry<EventListener, EventType> listener : listeners.entrySet()){
            if (listener.getValue() == eventType) {
                listener.getKey().update(data);
            }
        }
    }
}
