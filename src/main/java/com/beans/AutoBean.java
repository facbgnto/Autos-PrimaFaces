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
    private List<Auto> autosFiltrados;
    private String filtroMarca;

    @PostConstruct
    public void init() {
        autos = autoEJB.getAutos();
    }

    public void filtrarPorMarca() {
        autosFiltrados = new ArrayList<Auto>();
        for (Auto auto : autos) {
            if (auto.getMarca().toLowerCase().contains(filtroMarca.toLowerCase())) {
                autosFiltrados.add(auto);
            }
        }
    }
}
