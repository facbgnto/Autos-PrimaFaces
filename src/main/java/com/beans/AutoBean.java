package com.beans;

import com.ejb.Auto;
import com.ejb.AutoEJB;

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
