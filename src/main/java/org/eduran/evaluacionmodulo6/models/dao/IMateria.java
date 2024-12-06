package org.eduran.evaluacionmodulo6.models.dao;

import org.eduran.evaluacionmodulo6.models.dto.MateriaDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMateria extends JpaRepository<MateriaDTO, Integer>  {
}
