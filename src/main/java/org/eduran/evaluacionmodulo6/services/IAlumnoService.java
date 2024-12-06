package org.eduran.evaluacionmodulo6.services;

import org.eduran.evaluacionmodulo6.models.dto.AlumnoDTO;

import java.util.List;

public interface IAlumnoService {

    public List<AlumnoDTO> listarTodosLosAlumnos();

    public void agregar(AlumnoDTO alumnoIn);

    public void eliminarAlumnoPorId(Integer id);

    public void modificarAlumno(AlumnoDTO alumnoIn);
}
