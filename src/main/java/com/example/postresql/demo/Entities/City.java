package com.example.postresql.demo.Entities;

import lombok.*;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int population;

}