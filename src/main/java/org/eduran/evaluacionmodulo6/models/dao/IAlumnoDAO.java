package org.eduran.evaluacionmodulo6.models.dao;

import org.eduran.evaluacionmodulo6.models.dto.AlumnoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAlumnoDAO extends JpaRepository<AlumnoDTO, Integer> {
}
