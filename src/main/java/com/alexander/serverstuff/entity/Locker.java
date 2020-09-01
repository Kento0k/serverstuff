package com.alexander.serverstuff.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "lockers")
public class Locker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "server_id", referencedColumnName = "id")
    private Server server;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "disk_id", referencedColumnName = "id")
    private Disk disk;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "power_supplier_id", referencedColumnName = "id")
    private PowerSupplier powerSupplier;

}
