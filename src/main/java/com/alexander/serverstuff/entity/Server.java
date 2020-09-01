package com.alexander.serverstuff.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "servers")
public class Server {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "processor")
    private String processor;

    @Column(name = "ram")
    private String ram;

    @OneToOne(mappedBy = "server")
    private Locker locker;
}
