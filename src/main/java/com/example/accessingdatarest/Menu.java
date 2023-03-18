package com.example.accessingdatarest;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Entity
public class Menu {
    //seq, name, id, icon

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @Column(length=200)
    private String name;

    @Column(length=200)
    private String id;
}
