package com.learnspring.springstudents.Models;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private int dateOfBirth;
    @NonNull
    private String email;
    private int age;
}
