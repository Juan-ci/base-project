package com.base.project.service;

import com.base.project.dto.response.MenuOnlineResponse;
import com.base.project.dto.response.ProductoMenuOnlineResponse;

import java.util.List;

public interface IMenuOnlineService {

    MenuOnlineResponse getMenuOnline(String nombreLocal);

    List<ProductoMenuOnlineResponse> getProductosMenuOnline(String nombreLocal);
}
