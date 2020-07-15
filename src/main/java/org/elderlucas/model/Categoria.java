package org.elderlucas.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable{
   
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    private int codigoCategoria;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "estado")
    private boolean estado;

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.codigoCategoria;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (this.codigoCategoria != other.codigoCategoria) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categoria{" + "codigoCategoria=" + codigoCategoria + '}';
    }
    
    
    
}
