package com.base.project.repository;

import com.base.project.entity.MenuOnline;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMenuOnlineRepository extends CrudRepository<MenuOnline, Long> {

    MenuOnline findMenuByNombreDelLocal(String nombreDelLocal);
}
