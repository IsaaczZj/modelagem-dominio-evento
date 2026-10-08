package com.isaac.modelagem_evento.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "activities")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActivityEntity {

    @Id
    private Integer id;

    private String nome;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Double price;
}
