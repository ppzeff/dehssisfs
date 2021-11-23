package com.ppzeff.dehssisfs.fire.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "fire_extinguisher")
public class ExtinguisherModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "number")
    int number;

    @Column(name = "date_start")
    Date date;

    @Column(name = "installation_location")
    @ManyToOne
    CompartmentModel compartment;

    @Column(name = "type")
    String type;

    @Column(name = "manufacturer")
    String manufacturer;

    @Column(name = "factory_number")
    String factoryNumber;

    @Column(name = "date_of_manufacture")
    Date dateOfManufacture;

    @Column(name = "substance_brand")
    String substanceBrand;

    @Column(name = "check_string")
    @OneToMany
    List<CheckStringModel> listCheckString;

    public ExtinguisherModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CompartmentModel getCompartment() {
        return compartment;
    }

    public void setCompartment(CompartmentModel compartment) {
        this.compartment = compartment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getFactoryNumber() {
        return factoryNumber;
    }

    public void setFactoryNumber(String factoryNumber) {
        this.factoryNumber = factoryNumber;
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getSubstanceBrand() {
        return substanceBrand;
    }

    public void setSubstanceBrand(String substanceBrand) {
        this.substanceBrand = substanceBrand;
    }

    public List<CheckStringModel> getListCheckString() {
        return listCheckString;
    }

    public void setListCheckString(List<CheckStringModel> listCheckString) {
        this.listCheckString = listCheckString;
    }
}
