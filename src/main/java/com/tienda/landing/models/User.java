package com.tienda.landing.models;

import com.tienda.landing.models.enums.Rol;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contrasena")
    private String password;

    @Column(name = "nombreUsuario")
    private String nombreUsuario;

    @Enumerated(EnumType.STRING)
    @Column(name = "Roles")
    private Rol rol;

    @Column(name = "eliminado")
    private Boolean eliminado = false;



}
