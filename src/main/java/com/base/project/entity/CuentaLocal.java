package com.base.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class CuentaLocal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_CUENTA_LOCAL")
    private Long idCuentaLocal;

    @Column(name = "NOMBRE_LOCAL")
    private String nombreLocal;

    @Column(name = "PASSWORD")
    private  String password;

    @Column(name = "TIPO_LOCAL")
    private String tipoLocal;

    @Column(name = "DIRECCION_LOCAL")
    private String direccionLocal;

    @Column(name = "TELEFONO_LOCAL")
    private String telefonoLocal;

    @Column(name = "EMAIL_LOCAL")
    private String emailLocal;

    //MODIFICAR PARA GUARDAR LA IMAGEN
    private String imgLogoLocal;

    @Column(name = "IS_ENABLED")
    private boolean isEnabled;
}
