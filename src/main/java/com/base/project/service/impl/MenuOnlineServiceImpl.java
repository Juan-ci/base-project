package com.base.project.service.impl;

import com.base.project.dto.response.MenuOnlineResponse;
import com.base.project.dto.response.ProductoMenuOnlineResponse;
import com.base.project.entity.MenuOnline;
import com.base.project.repository.IMenuOnlineRepository;
import com.base.project.service.IMenuOnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuOnlineServiceImpl implements IMenuOnlineService {

    private final IMenuOnlineRepository menuOnlineRepository;

    @Autowired
    public MenuOnlineServiceImpl(IMenuOnlineRepository menuOnlineRepository) {
        this.menuOnlineRepository = menuOnlineRepository;
    }

    @Override
    public MenuOnlineResponse getMenuOnline(String nombreLocal) {
        MenuOnline menuOnline = this.menuOnlineRepository.findMenuByNombreDelLocal(nombreLocal);

        if (menuOnline != null) {
            return this.entityToResponse(menuOnline);
        }
        return null;
    }

    @Override
    public List<ProductoMenuOnlineResponse> getProductosMenuOnline(String nombreLocal) {
        //TODO: DEFINIR SI PRODUCTO ES IGUAL EN MENUONLINE
        return null;
    }

    private MenuOnlineResponse entityToResponse(MenuOnline menuOnline) {
        return MenuOnlineResponse.builder()
                .idMenuOnline(menuOnline.getIdMenuOnline())
                .celularDelLocal(menuOnline.getCelularDelLocal())
                .nombreDelLocal(menuOnline.getNombreDelLocal())
                .emailDelLocal(menuOnline.getEmailDelLocal())
                .imgLogoLocal(menuOnline.getImgLogoLocal())
                .imgFrenteDelLocal(menuOnline.getImgFrenteDelLocal())
                .tipoDelLocal(menuOnline.getTipoDelLocal())
                .direccionDelLocal(menuOnline.getDireccionDelLocal())
                .build();
    }
}
