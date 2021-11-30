package com.ppzeff.dehssisfs.fire.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "fire_stateofnodes")
public class StateOfNodesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "type")
    private String type;

    public StateOfNodesModel(String type) {
        this.type = type;
    }
}
