
package com.tienda_k.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    
    private String nombre;
    private String capital;
    private String poblacion;
    private String costas;

    public Estado() {
    }

    public Estado(String nombre, String capital, String poblacion, String costas) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }

    
    
}
