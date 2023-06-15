package co.edu.uco.apipet.Apipet.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoCuidado")
public class TipoCuidadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nombre_tipo_cuidado;
    private String descripcion;

    public TipoCuidadoEntity(final Long codigo, final String nombreTipoCuidado, final String descripcion){
        this.codigo = codigo;
        this.nombre_tipo_cuidado = nombreTipoCuidado;
        this.descripcion = descripcion;
    }

    public TipoCuidadoEntity(){

    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombreTipoCuidado() {
        return nombre_tipo_cuidado;
    }

    public void setNombreTipoCuidado(String nombreTipoCuidado) {
        this.nombre_tipo_cuidado = nombreTipoCuidado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
