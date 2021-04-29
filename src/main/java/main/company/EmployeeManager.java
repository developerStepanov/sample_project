package main.company;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import main.company.events.EmployeeEvent;
import main.company.events.EmployeeEventType;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
@RequiredArgsConstructor
public class EmployeeManager {
    private final EmployeeRepository employeeRepository;
    private final ApplicationEventPublisher publisher;

    public Employee createEmployee(@Valid Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        publisher.publishEvent(new EmployeeEvent(this, EmployeeEventType.CREATE, savedEmployee));
        return savedEmployee;
    }
}
