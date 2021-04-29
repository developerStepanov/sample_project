package main.company.events;

import lombok.Getter;
import lombok.Setter;
import main.company.Employee;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Getter
public class EmployeeEvent extends ApplicationEvent {
    private EmployeeEventType eventType;
    private Employee employee;

    public EmployeeEvent(Object source, EmployeeEventType eventType, Employee employee) {
        super(source);
        this.eventType = eventType;
        this.employee = employee;
    }
}
