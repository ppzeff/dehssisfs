package com.ppzeff.dehssisfs.fire.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "fire_extinguisher")
public class ExtinguisherModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "number")
    Integer number;

    @Column(name = "date_start")
    Date date;

    @Column(name = "installation_location")
    String compartment;

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

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<CheckStringModel> listCheckString;

    public void addcheckstring(CheckStringModel checkString) {
        //  checkString.setId(listCheckString.size() + 1);
        listCheckString.add(checkString);
    }
}
