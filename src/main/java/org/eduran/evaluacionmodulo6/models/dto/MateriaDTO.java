package org.eduran.evaluacionmodulo6.models.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "materias")
@Data
public class MateriaDTO implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "alumnos_id")
    private Integer alumnos_id;

}
