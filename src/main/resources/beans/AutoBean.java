package com.example.beans;

import com.example.ejb.Auto;
import com.example.ejb.AutoEJB;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.util.List;

@ManagedBean
public class AutoBean {
    @EJB
    private AutoEJB autoEJB;

    public List<Auto> getAutos() {
        return autoEJB.getAutos();
    }
}
