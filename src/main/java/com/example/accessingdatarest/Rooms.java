package com.example.accessingdatarest;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;
@Getter
@ToString
@Entity
public class Rooms {
    //seq, id, title, location, subtitle, price, grade, possiable_start_date, possiable_end_date, img1, img2, img3

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @Column(length=200)
    private String id;

    @Column(length=200)
    private String title;

    @Column(length=200)
    private String location;

    @Column(length=200)
    private String subtitle;

    @Column
    private int price;

    @Column(length=200)
    private String grade;

    @Column
    private Date possiable_start_date;

    @Column
    private Date possiable_end_date;
    @Column(length=200)
    private String img1;

    @Column(length=200)
    private String img2;

    @Column(length=200)
    private String img3;
}
