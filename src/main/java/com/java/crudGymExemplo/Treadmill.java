package com.java.crudGymExemplo;

import javax.persistence.*;

// @Entity, @Document, @KeySpace, ou alguma outra anotação aqui.
@Entity
@Table(name = "Treadmill")
public class Treadmill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "code")
    private String code;

    @Column(name = "model")
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

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
