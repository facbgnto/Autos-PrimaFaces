package com.beans;

import com.ejb.Auto;
import com.ejb.AutoEJB;
import lombok.Data;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
@Data
public class AutoBean{
    @EJB
    private AutoEJB autoEJB;

    private List<Auto> autos;
    private List<Auto> filtros;



    @PostConstruct
    public void init() {
        autos = autoEJB.getAutos();
        filtros = new ArrayList<Auto>();
        System.out.println("Cantidad de autos212: " + autos.size());
        System.out.println("Cantidad de autos filtro: " + filtros.size());
    }


}
