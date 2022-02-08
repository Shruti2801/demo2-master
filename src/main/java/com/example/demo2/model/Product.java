package com.example.demo2.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String productname;


    @ManyToOne
    @JoinColumn(name = "id")
    Student ob;


    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Student getOb() {
        return ob;
    }

    public void setOb(Student ob) {
        this.ob = ob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
