package com.microservice_user.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "permisos")
public class Permiso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    @Column
    private String descripcion;

    @ManyToMany(mappedBy = "permisos")
    private Set<Rol> roles;

}
