package com.ppzeff.dehssisfs.fire.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
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

//    @Column(name = "installation_location")
//    @ManyToOne
//    CompartmentModel compartment;

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


}
