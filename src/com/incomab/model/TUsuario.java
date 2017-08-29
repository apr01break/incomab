package com.incomab.model;
// Generated 29/08/2017 10:56:47 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TUsuario generated by hbm2java
 */
public class TUsuario  implements java.io.Serializable {


     private int idUser;
     private String userName;
     private String userPass;
     private String nombreUsuario;
     private String emailUsuario;
     private String telefonoUsuario;
     private String celularUsuario;
     private boolean rolControlUsuarios;
     private boolean rolConfigurar;
     private boolean rolLocales;
     private boolean rolGenerarComprobante;
     private boolean rolConsultarComprobante;
     private boolean rolGenerarResumenes;
     private boolean rolConsultarResumenes;
     private boolean rolGenerarBajas;
     private boolean rolConsultarBajas;
     private boolean rolCatalogos;
     private boolean rolConsultarCatalogos;
     private boolean rolEntidades;
     private boolean rolCertificadoDigital;
     private boolean rolCuentas;
     private boolean rolApiIntegracion;
     private Set TUsuariosLocals = new HashSet(0);

    public TUsuario() {
    }

	
    public TUsuario(int idUser, String userName, String userPass, String nombreUsuario, boolean rolControlUsuarios, boolean rolConfigurar, boolean rolLocales, boolean rolGenerarComprobante, boolean rolConsultarComprobante, boolean rolGenerarResumenes, boolean rolConsultarResumenes, boolean rolGenerarBajas, boolean rolConsultarBajas, boolean rolCatalogos, boolean rolConsultarCatalogos, boolean rolEntidades, boolean rolCertificadoDigital, boolean rolCuentas, boolean rolApiIntegracion) {
        this.idUser = idUser;
        this.userName = userName;
        this.userPass = userPass;
        this.nombreUsuario = nombreUsuario;
        this.rolControlUsuarios = rolControlUsuarios;
        this.rolConfigurar = rolConfigurar;
        this.rolLocales = rolLocales;
        this.rolGenerarComprobante = rolGenerarComprobante;
        this.rolConsultarComprobante = rolConsultarComprobante;
        this.rolGenerarResumenes = rolGenerarResumenes;
        this.rolConsultarResumenes = rolConsultarResumenes;
        this.rolGenerarBajas = rolGenerarBajas;
        this.rolConsultarBajas = rolConsultarBajas;
        this.rolCatalogos = rolCatalogos;
        this.rolConsultarCatalogos = rolConsultarCatalogos;
        this.rolEntidades = rolEntidades;
        this.rolCertificadoDigital = rolCertificadoDigital;
        this.rolCuentas = rolCuentas;
        this.rolApiIntegracion = rolApiIntegracion;
    }
    public TUsuario(int idUser, String userName, String userPass, String nombreUsuario, String emailUsuario, String telefonoUsuario, String celularUsuario, boolean rolControlUsuarios, boolean rolConfigurar, boolean rolLocales, boolean rolGenerarComprobante, boolean rolConsultarComprobante, boolean rolGenerarResumenes, boolean rolConsultarResumenes, boolean rolGenerarBajas, boolean rolConsultarBajas, boolean rolCatalogos, boolean rolConsultarCatalogos, boolean rolEntidades, boolean rolCertificadoDigital, boolean rolCuentas, boolean rolApiIntegracion, Set TUsuariosLocals) {
       this.idUser = idUser;
       this.userName = userName;
       this.userPass = userPass;
       this.nombreUsuario = nombreUsuario;
       this.emailUsuario = emailUsuario;
       this.telefonoUsuario = telefonoUsuario;
       this.celularUsuario = celularUsuario;
       this.rolControlUsuarios = rolControlUsuarios;
       this.rolConfigurar = rolConfigurar;
       this.rolLocales = rolLocales;
       this.rolGenerarComprobante = rolGenerarComprobante;
       this.rolConsultarComprobante = rolConsultarComprobante;
       this.rolGenerarResumenes = rolGenerarResumenes;
       this.rolConsultarResumenes = rolConsultarResumenes;
       this.rolGenerarBajas = rolGenerarBajas;
       this.rolConsultarBajas = rolConsultarBajas;
       this.rolCatalogos = rolCatalogos;
       this.rolConsultarCatalogos = rolConsultarCatalogos;
       this.rolEntidades = rolEntidades;
       this.rolCertificadoDigital = rolCertificadoDigital;
       this.rolCuentas = rolCuentas;
       this.rolApiIntegracion = rolApiIntegracion;
       this.TUsuariosLocals = TUsuariosLocals;
    }
   
    public int getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPass() {
        return this.userPass;
    }
    
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getEmailUsuario() {
        return this.emailUsuario;
    }
    
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
    public String getTelefonoUsuario() {
        return this.telefonoUsuario;
    }
    
    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }
    public String getCelularUsuario() {
        return this.celularUsuario;
    }
    
    public void setCelularUsuario(String celularUsuario) {
        this.celularUsuario = celularUsuario;
    }
    public boolean isRolControlUsuarios() {
        return this.rolControlUsuarios;
    }
    
    public void setRolControlUsuarios(boolean rolControlUsuarios) {
        this.rolControlUsuarios = rolControlUsuarios;
    }
    public boolean isRolConfigurar() {
        return this.rolConfigurar;
    }
    
    public void setRolConfigurar(boolean rolConfigurar) {
        this.rolConfigurar = rolConfigurar;
    }
    public boolean isRolLocales() {
        return this.rolLocales;
    }
    
    public void setRolLocales(boolean rolLocales) {
        this.rolLocales = rolLocales;
    }
    public boolean isRolGenerarComprobante() {
        return this.rolGenerarComprobante;
    }
    
    public void setRolGenerarComprobante(boolean rolGenerarComprobante) {
        this.rolGenerarComprobante = rolGenerarComprobante;
    }
    public boolean isRolConsultarComprobante() {
        return this.rolConsultarComprobante;
    }
    
    public void setRolConsultarComprobante(boolean rolConsultarComprobante) {
        this.rolConsultarComprobante = rolConsultarComprobante;
    }
    public boolean isRolGenerarResumenes() {
        return this.rolGenerarResumenes;
    }
    
    public void setRolGenerarResumenes(boolean rolGenerarResumenes) {
        this.rolGenerarResumenes = rolGenerarResumenes;
    }
    public boolean isRolConsultarResumenes() {
        return this.rolConsultarResumenes;
    }
    
    public void setRolConsultarResumenes(boolean rolConsultarResumenes) {
        this.rolConsultarResumenes = rolConsultarResumenes;
    }
    public boolean isRolGenerarBajas() {
        return this.rolGenerarBajas;
    }
    
    public void setRolGenerarBajas(boolean rolGenerarBajas) {
        this.rolGenerarBajas = rolGenerarBajas;
    }
    public boolean isRolConsultarBajas() {
        return this.rolConsultarBajas;
    }
    
    public void setRolConsultarBajas(boolean rolConsultarBajas) {
        this.rolConsultarBajas = rolConsultarBajas;
    }
    public boolean isRolCatalogos() {
        return this.rolCatalogos;
    }
    
    public void setRolCatalogos(boolean rolCatalogos) {
        this.rolCatalogos = rolCatalogos;
    }
    public boolean isRolConsultarCatalogos() {
        return this.rolConsultarCatalogos;
    }
    
    public void setRolConsultarCatalogos(boolean rolConsultarCatalogos) {
        this.rolConsultarCatalogos = rolConsultarCatalogos;
    }
    public boolean isRolEntidades() {
        return this.rolEntidades;
    }
    
    public void setRolEntidades(boolean rolEntidades) {
        this.rolEntidades = rolEntidades;
    }
    public boolean isRolCertificadoDigital() {
        return this.rolCertificadoDigital;
    }
    
    public void setRolCertificadoDigital(boolean rolCertificadoDigital) {
        this.rolCertificadoDigital = rolCertificadoDigital;
    }
    public boolean isRolCuentas() {
        return this.rolCuentas;
    }
    
    public void setRolCuentas(boolean rolCuentas) {
        this.rolCuentas = rolCuentas;
    }
    public boolean isRolApiIntegracion() {
        return this.rolApiIntegracion;
    }
    
    public void setRolApiIntegracion(boolean rolApiIntegracion) {
        this.rolApiIntegracion = rolApiIntegracion;
    }
    public Set getTUsuariosLocals() {
        return this.TUsuariosLocals;
    }
    
    public void setTUsuariosLocals(Set TUsuariosLocals) {
        this.TUsuariosLocals = TUsuariosLocals;
    }




}


