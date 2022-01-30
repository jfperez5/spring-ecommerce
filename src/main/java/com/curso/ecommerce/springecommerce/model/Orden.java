package com.curso.ecommerce.springecommerce.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orden")
public class Orden {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String numero; 
    private Date fechaCreacion;
    private Date fechaRecibida;
    private Double total;
    
    @ManyToOne
    private Usuario usuario;
    
    @OneToOne(mappedBy = "orden")
    private DetalleOrden detalle;

    public Orden() {
    
    }

    public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecibida, Double total, Usuario usuario,
            DetalleOrden detalle) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
        this.usuario = usuario;
        this.detalle = detalle;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaRecibida() {
        return fechaRecibida;
    }

    public void setFechaRecibida(Date fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public DetalleOrden getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleOrden detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Orden [detalle=" + detalle + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida=" + fechaRecibida
                + ", id=" + id + ", numero=" + numero + ", total=" + total + ", usuario=" + usuario + "]";
    }

      
    
}
