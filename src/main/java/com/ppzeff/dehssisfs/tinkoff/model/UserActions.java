package com.ppzeff.dehssisfs.tinkoff.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class UserActions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long userId;
    Date dtQuery;
    String message;
}
