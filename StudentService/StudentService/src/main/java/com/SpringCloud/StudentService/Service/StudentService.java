package com.SpringCloud.StudentService.Service;

import com.SpringCloud.StudentService.Entity.StudentEntity;
import com.SpringCloud.StudentService.FeignClientInterface.AddressFeignClient;
import com.SpringCloud.StudentService.Repository.StudentRepository;
import com.SpringCloud.StudentService.Request.StudentRequest;
import com.SpringCloud.StudentService.Response.AddressResponse;
import com.SpringCloud.StudentService.Response.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
        @Autowired
        StudentRepository studentRepository;

        @Autowired
        AddressFeignClient addressFeignClient;


        public StudentResponse createStudent(StudentRequest createStudentRequest) {

            StudentEntity student = new StudentEntity();
            student.setFirstName(createStudentRequest.getFirstName());
            student.setLastName(createStudentRequest.getLastName());
            student.setEmail(createStudentRequest.getEmail());


            student.setAddressId(createStudentRequest.getAddressId());
            student = studentRepository.save(student);

            StudentResponse studentResponse=new StudentResponse(student);
            studentResponse.setAddressResponse(addressFeignClient.getById(student.getAddressId()));
            return studentResponse;
        }

        public StudentResponse getById (long id) {
            StudentEntity student=studentRepository.findById(id).get();
            StudentResponse studentResponse=new StudentResponse(student);

            studentResponse.setAddressResponse(addressFeignClient.getById(student.getAddressId()));
            return  studentResponse;
        }


}

