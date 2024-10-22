
package com.Tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activos;
    
    public Categoria(){
    }
    
    public Categoria(String descripcion,String rutaImagen,boolean activos){
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activos = activos;
    }
}
