package com.alexander.serverstuff.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "disks")
public class Disk {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "capacity")
    private String capacity;

    @OneToOne(mappedBy = "disk")
    private Locker locker;
}
