package com.wgx.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wgx
 * @since 2023/4/18 15:57
 */
public class ConcreteMediator extends Mediator {
    private Map<String, Colleague> colleagueMap;
    private Map<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    void getMessage(int stateChange, String name) {
        if (stateChange == 0) {
            ((Curtains) colleagueMap.get(interMap.get("Curtains"))).upCurtains();
            ((TV) colleagueMap.get(interMap.get("TV"))).startTV();
        }
    }

    @Override
    void sendMessage() {

    }

    @Override
    void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        }
    }
}
