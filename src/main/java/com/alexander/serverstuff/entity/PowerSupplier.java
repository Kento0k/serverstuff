package com.alexander.serverstuff.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "power_suppliers")
public class PowerSupplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "power_output")
    private String powerOutput;

    @OneToOne(mappedBy = "powerSupplier")
    private Locker locker;
}
