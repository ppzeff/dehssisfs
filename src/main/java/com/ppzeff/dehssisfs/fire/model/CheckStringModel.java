package com.ppzeff.dehssisfs.fire.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "fire_check_string")
public class CheckStringModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date checkDate;
    private String condition;
    private Double mass;
    private Double pressure;
    private String condition2;
    private String mery;
    private String FIO;


}
