package com.incomab.model;
// Generated 29/08/2017 10:56:47 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TComprobante generated by hbm2java
 */
public class TComprobante  implements java.io.Serializable {


     private String codigoComprobante;
     private TEntidad TEntidad;
     private TPrincipal TPrincipal;
     private String tipoDocComprob;
     private String tipoOperaComprob;
     private String monedaComprob;
     private BigDecimal tipoCambioComprob;
     private Date fechaEmisionComprob;
     private Date fechaVencimientoComprob;
     private boolean enviadoSunatComprob;
     private boolean estadoPagoComprob;
     private String observacionComprob;
     private boolean estadoComprob;
     private BigDecimal descuentoComprob;
     private BigDecimal otrosCargosComprob;
     private int idUser;
     private TNotaDebito TNotaDebito;
     private TNotaCredito TNotaCredito;
     private TFactura TFactura;
     private TBoleta TBoleta;
     private Set TVentas = new HashSet(0);

    public TComprobante() {
    }

	
    public TComprobante(String codigoComprobante, TEntidad TEntidad, TPrincipal TPrincipal, String tipoDocComprob, String tipoOperaComprob, String monedaComprob, Date fechaEmisionComprob, Date fechaVencimientoComprob, boolean enviadoSunatComprob, boolean estadoPagoComprob, String observacionComprob, boolean estadoComprob, int idUser) {
        this.codigoComprobante = codigoComprobante;
        this.TEntidad = TEntidad;
        this.TPrincipal = TPrincipal;
        this.tipoDocComprob = tipoDocComprob;
        this.tipoOperaComprob = tipoOperaComprob;
        this.monedaComprob = monedaComprob;
        this.fechaEmisionComprob = fechaEmisionComprob;
        this.fechaVencimientoComprob = fechaVencimientoComprob;
        this.enviadoSunatComprob = enviadoSunatComprob;
        this.estadoPagoComprob = estadoPagoComprob;
        this.observacionComprob = observacionComprob;
        this.estadoComprob = estadoComprob;
        this.idUser = idUser;
    }
    public TComprobante(String codigoComprobante, TEntidad TEntidad, TPrincipal TPrincipal, String tipoDocComprob, String tipoOperaComprob, String monedaComprob, BigDecimal tipoCambioComprob, Date fechaEmisionComprob, Date fechaVencimientoComprob, boolean enviadoSunatComprob, boolean estadoPagoComprob, String observacionComprob, boolean estadoComprob, BigDecimal descuentoComprob, BigDecimal otrosCargosComprob, int idUser, TNotaDebito TNotaDebito, TNotaCredito TNotaCredito, TFactura TFactura, TBoleta TBoleta, Set TVentas) {
       this.codigoComprobante = codigoComprobante;
       this.TEntidad = TEntidad;
       this.TPrincipal = TPrincipal;
       this.tipoDocComprob = tipoDocComprob;
       this.tipoOperaComprob = tipoOperaComprob;
       this.monedaComprob = monedaComprob;
       this.tipoCambioComprob = tipoCambioComprob;
       this.fechaEmisionComprob = fechaEmisionComprob;
       this.fechaVencimientoComprob = fechaVencimientoComprob;
       this.enviadoSunatComprob = enviadoSunatComprob;
       this.estadoPagoComprob = estadoPagoComprob;
       this.observacionComprob = observacionComprob;
       this.estadoComprob = estadoComprob;
       this.descuentoComprob = descuentoComprob;
       this.otrosCargosComprob = otrosCargosComprob;
       this.idUser = idUser;
       this.TNotaDebito = TNotaDebito;
       this.TNotaCredito = TNotaCredito;
       this.TFactura = TFactura;
       this.TBoleta = TBoleta;
       this.TVentas = TVentas;
    }
   
    public String getCodigoComprobante() {
        return this.codigoComprobante;
    }
    
    public void setCodigoComprobante(String codigoComprobante) {
        this.codigoComprobante = codigoComprobante;
    }
    public TEntidad getTEntidad() {
        return this.TEntidad;
    }
    
    public void setTEntidad(TEntidad TEntidad) {
        this.TEntidad = TEntidad;
    }
    public TPrincipal getTPrincipal() {
        return this.TPrincipal;
    }
    
    public void setTPrincipal(TPrincipal TPrincipal) {
        this.TPrincipal = TPrincipal;
    }
    public String getTipoDocComprob() {
        return this.tipoDocComprob;
    }
    
    public void setTipoDocComprob(String tipoDocComprob) {
        this.tipoDocComprob = tipoDocComprob;
    }
    public String getTipoOperaComprob() {
        return this.tipoOperaComprob;
    }
    
    public void setTipoOperaComprob(String tipoOperaComprob) {
        this.tipoOperaComprob = tipoOperaComprob;
    }
    public String getMonedaComprob() {
        return this.monedaComprob;
    }
    
    public void setMonedaComprob(String monedaComprob) {
        this.monedaComprob = monedaComprob;
    }
    public BigDecimal getTipoCambioComprob() {
        return this.tipoCambioComprob;
    }
    
    public void setTipoCambioComprob(BigDecimal tipoCambioComprob) {
        this.tipoCambioComprob = tipoCambioComprob;
    }
    public Date getFechaEmisionComprob() {
        return this.fechaEmisionComprob;
    }
    
    public void setFechaEmisionComprob(Date fechaEmisionComprob) {
        this.fechaEmisionComprob = fechaEmisionComprob;
    }
    public Date getFechaVencimientoComprob() {
        return this.fechaVencimientoComprob;
    }
    
    public void setFechaVencimientoComprob(Date fechaVencimientoComprob) {
        this.fechaVencimientoComprob = fechaVencimientoComprob;
    }
    public boolean isEnviadoSunatComprob() {
        return this.enviadoSunatComprob;
    }
    
    public void setEnviadoSunatComprob(boolean enviadoSunatComprob) {
        this.enviadoSunatComprob = enviadoSunatComprob;
    }
    public boolean isEstadoPagoComprob() {
        return this.estadoPagoComprob;
    }
    
    public void setEstadoPagoComprob(boolean estadoPagoComprob) {
        this.estadoPagoComprob = estadoPagoComprob;
    }
    public String getObservacionComprob() {
        return this.observacionComprob;
    }
    
    public void setObservacionComprob(String observacionComprob) {
        this.observacionComprob = observacionComprob;
    }
    public boolean isEstadoComprob() {
        return this.estadoComprob;
    }
    
    public void setEstadoComprob(boolean estadoComprob) {
        this.estadoComprob = estadoComprob;
    }
    public BigDecimal getDescuentoComprob() {
        return this.descuentoComprob;
    }
    
    public void setDescuentoComprob(BigDecimal descuentoComprob) {
        this.descuentoComprob = descuentoComprob;
    }
    public BigDecimal getOtrosCargosComprob() {
        return this.otrosCargosComprob;
    }
    
    public void setOtrosCargosComprob(BigDecimal otrosCargosComprob) {
        this.otrosCargosComprob = otrosCargosComprob;
    }
    public int getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public TNotaDebito getTNotaDebito() {
        return this.TNotaDebito;
    }
    
    public void setTNotaDebito(TNotaDebito TNotaDebito) {
        this.TNotaDebito = TNotaDebito;
    }
    public TNotaCredito getTNotaCredito() {
        return this.TNotaCredito;
    }
    
    public void setTNotaCredito(TNotaCredito TNotaCredito) {
        this.TNotaCredito = TNotaCredito;
    }
    public TFactura getTFactura() {
        return this.TFactura;
    }
    
    public void setTFactura(TFactura TFactura) {
        this.TFactura = TFactura;
    }
    public TBoleta getTBoleta() {
        return this.TBoleta;
    }
    
    public void setTBoleta(TBoleta TBoleta) {
        this.TBoleta = TBoleta;
    }
    public Set getTVentas() {
        return this.TVentas;
    }
    
    public void setTVentas(Set TVentas) {
        this.TVentas = TVentas;
    }




}

