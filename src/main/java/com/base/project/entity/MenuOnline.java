package com.base.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MENU_ONLINE")
@Builder
@Data
public class MenuOnline {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_MENU_ONLINE")
    private Long idMenuOnline;

    @Column(name = "IMG_FRENTE_DEL_LOCAL")
    private String imgFrenteDelLocal;

    @Column(name = "IMG_LOGO_LOCAL")
    private String imgLogoLocal;

    @Column(name = "NOMBRE_DEL_LOCAL")
    private String nombreDelLocal;

    @Column(name = "TIPO_DEL_LOCAL")
    private String tipoDelLocal;

    @Column(name = "DIRECCION_DEL_LOCAL")
    private String direccionDelLocal;

    @Column(name = "EMAIL_DEL_LOCAL")
    private String emailDelLocal;

    @Column(name = "CELULAR_DEL_LOCAL")
    private String celularDelLocal;
}
