package com.isaac.modelagem_evento.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

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

    @ManyToMany
    @JoinTable(name = "activity_participant",
            joinColumns = @JoinColumn(name = "activity_id"),
            inverseJoinColumns = @JoinColumn(name = "participant_id"))
    private Set<ParticipantEntity> participants = new HashSet<>();

}
