package com.ppzeff.dehssisfs.fire.model;

import javax.persistence.*;

@Entity
@Table(name = "fire_ompartment")
public class CompartmentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne
    ExtinguisherModel extinguisher;

    public CompartmentModel() {
    }

    public CompartmentModel(String name, ExtinguisherModel extinguisher) {
        this.name = name;
        this.extinguisher = extinguisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtinguisherModel getExtinguisher() {
        return extinguisher;
    }

    public void setExtinguisher(ExtinguisherModel extinguisher) {
        this.extinguisher = extinguisher;
    }
}
