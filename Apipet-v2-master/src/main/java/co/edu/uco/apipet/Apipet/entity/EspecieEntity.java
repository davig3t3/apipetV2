package co.edu.uco.apipet.Apipet.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "especie")
public class EspecieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nombre_especie;
    private String descripcion;

    public EspecieEntity(final Long codigo, final String nombreEspecie, final String descripcion){
        this.codigo = codigo;
        this.nombre_especie = nombreEspecie;
        this.descripcion = descripcion;
    }

    public EspecieEntity(){

    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombreEspecie() {
        return nombre_especie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombre_especie = nombreEspecie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
