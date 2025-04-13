package com.base.project.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MenuOnlineResponse {

    private Long idMenuOnline;

    private String imgFrenteDelLocal;

    private String imgLogoLocal;

    private String nombreDelLocal;

    private String tipoDelLocal;

    private String direccionDelLocal;

    private String emailDelLocal;

    private String celularDelLocal;
}
