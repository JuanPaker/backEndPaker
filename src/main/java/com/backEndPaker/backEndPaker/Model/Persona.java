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
    private String nombre;
    private String apellido;
    private String ocupacion;
    private String acerca_de;
    private String fecha_nac;
    private String nacionalidad;
    private String mail;
    private String sobre_mi;
    private String url_img_background;
    private String url_img_perfil;

}
