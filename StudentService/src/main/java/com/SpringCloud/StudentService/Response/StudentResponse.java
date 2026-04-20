package com.SpringCloud.StudentService.Response;

import com.SpringCloud.StudentService.Entity.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class StudentResponse {
    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private AddressResponse addressResponse;

    public StudentResponse(StudentEntity student) {
        this.id = student.getId();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
        this.email = student.getEmail();
        this.addressResponse=getAddressResponse();
    }


}
