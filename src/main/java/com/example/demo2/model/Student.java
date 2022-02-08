package com.example.demo2.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
//    @Column(name = "id", nullable = false)
    private String companyname;
    private String companylogo;
    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="fk_id",referencedColumnName = "id")
    private List<Product> ob1;
//    private List<String> services;

    public Student(int id,String companyname,String companylogo) {
        this.id = id;
    }


//    public List<Product> getOb1() {
//        return ob1;
//    }
//
//    public void setOb1(List<Product> ob1) {
//        this.ob1 = ob1;
//    }

    public String getCompanylogo() {
        return companylogo;
    }
    public void setCompanylogo(String companylogo) {
        this.companylogo = companylogo;
    }

    public String getCompanyname() {
        return companyname;
    }
    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
