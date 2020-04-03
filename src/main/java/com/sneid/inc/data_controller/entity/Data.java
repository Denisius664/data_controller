package com.sneid.inc.data_controller.entity;

import javax.persistence.*;

@lombok.Data
@Entity
@Table(name = "data_v1")
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

}
