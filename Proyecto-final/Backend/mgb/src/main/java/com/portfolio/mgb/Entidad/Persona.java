
package com.portfolio.mgb.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Persona {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @NotNull
   @Size(min = 1, max= 50, message = "No cumple con el tamaño")
    private Long id;
   
   @NotNull
   @Size(min = 1, max= 50, message = "No cumple con el tamaño")
    private String nombre;
   
   @NotNull
   @Size(min = 1, max= 50, message = "No cumple con el tamaño")
    private String apellido;
   
   @NotNull
   @Size(min = 1, max= 50, message = "No cumple con el tamaño")
    private String img;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
   
}