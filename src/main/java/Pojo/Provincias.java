package Pojo;
// Generated 19/06/2015 12:59:55 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Provincias generated by hbm2java
 */
public class Provincias  implements java.io.Serializable {


     private Integer idProvincia;
     private Paises paises;
     private String nombre;
     private Set<Localidades> localidadeses = new HashSet<Localidades>(0);

    public Provincias() {
    }

	
    public Provincias(Paises paises, String nombre) {
        this.paises = paises;
        this.nombre = nombre;
    }
    public Provincias(Paises paises, String nombre, Set<Localidades> localidadeses) {
       this.paises = paises;
       this.nombre = nombre;
       this.localidadeses = localidadeses;
    }
   
    public Integer getIdProvincia() {
        return this.idProvincia;
    }
    
    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }
    public Paises getPaises() {
        return this.paises;
    }
    
    public void setPaises(Paises paises) {
        this.paises = paises;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Localidades> getLocalidadeses() {
        return this.localidadeses;
    }
    
    public void setLocalidadeses(Set<Localidades> localidadeses) {
        this.localidadeses = localidadeses;
    }




}


