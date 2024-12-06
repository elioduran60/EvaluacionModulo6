package org.eduran.evaluacionmodulo6.services;

import org.eduran.evaluacionmodulo6.models.dao.IAlumnoDAO;
import org.eduran.evaluacionmodulo6.models.dto.AlumnoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AlumnoService implements IAlumnoService{

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    IAlumnoDAO alumnoDAO;

    @Override
    public List<AlumnoDTO> listarTodosLosAlumnos() {
        return alumnoDAO.findAll();
    }

    @Override
    public void agregar(AlumnoDTO alumnoIn) {

    }

    @Override
    public void eliminarAlumnoPorId(Integer id) {

    }

    @Override
    public void modificarAlumno(AlumnoDTO alumnoIn) {

    }
}
