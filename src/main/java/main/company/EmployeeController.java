package main.company;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

@Service
@AllArgsConstructor
@RestController
@Slf4j
public class EmployeeController {

    private final EmployeeManager employeeManager;

    @PostMapping(value = "/create-employee")
    public ResponseEntity createUser(@RequestBody @Valid Employee employee) {
        Employee savedEmployee = employeeManager.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.OK).body(savedEmployee);
    }
}
