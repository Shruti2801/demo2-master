package com.example.demo2.controller;

import com.example.demo2.model.Student;
import com.example.demo2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class StudentController {
    @Autowired
    private StudentRepository repository;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return repository.save(student);

    }

    @GetMapping()
    public List<Student> getAllStudent(){
        return repository.findAll();
    }



//    @ResponseBody
//    public List<Student> details(@RequestParam("id")Integer id,@RequestParam("name") String name,@RequestParam("logo") String logo
//            ,@RequestParam("product") List<String> product,@RequestParam("services") List<String> services){
////        return "ID" +id+"Name :"+name+"Product" +product +services +"Logo" +logo;
//
//        return repository.findByName(name);
//    }

//    @RequestMapping(value = "/makeAction")
//    public String makeLoan(@RequestParam("loan_id")int loan_id,
//                           @RequestParam("clientName")String clientName,
//                           @RequestParam("clientSurname")String clientSurname,
//                           @RequestParam("amount")double amount,
//                           @RequestParam("days")int days ) throws Exception {
//        return repository.makeAction(loan_id,clientName,clientSurname,amount,days);
//    }
}