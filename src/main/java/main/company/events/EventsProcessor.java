package main.company.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EventsProcessor implements ApplicationListener<EmployeeEvent> {
    @Override
    public void onApplicationEvent(EmployeeEvent employeeEvent) {
        log.info(String.format("Event type: %s. Employee: %s.",employeeEvent.getEventType(),employeeEvent.getEmployee()));
    }
}
