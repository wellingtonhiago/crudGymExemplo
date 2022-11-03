package com.java.crudGymExemplo;



// @Entity, @Document, @KeySpace, ou alguma outra anotação aqui.

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Treadmill {
    @Id
    private String code;
    private String model;

    public Treadmill(){

    }

    public Treadmill(String code, String model) {
        this.code = code;
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
