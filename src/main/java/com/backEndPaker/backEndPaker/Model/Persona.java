package com.backEndPaker.backEndPaker.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    //@NotNull
    //@Size(min = 1, max=50, message:"no cumple con el tamanio")
    private Long id;
    private String usuario;
    private String password;
    /*private String ocupacion;
    private String acercaDe;
    private String fechaNac;
    private String nacionalidad;
    private String mail;
    private String sobreMi;
    private String urlImgBackground;
    private String urlImgPerfil;*/

 
}
