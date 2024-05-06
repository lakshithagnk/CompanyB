package com.example.CompanyB.HumanResourceManagementModule.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "employeeAttendancedb")
@Data
@Getter
@Setter
public class EmployeeAttendanceModel {

    @Id
    private String id ;
    private double hoursWorked;
    private LocalDateTime checkInTime;
    private String shortLeave;
    private LocalDateTime checkOutTime;

    // Default constructor
    public EmployeeAttendanceModel() {
        // Default constructor with no arguments
    }
}
