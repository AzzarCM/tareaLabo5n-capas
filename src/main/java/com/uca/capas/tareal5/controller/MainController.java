package com.uca.capas.tareal5.controller;

import com.uca.capas.tareal5.dao.EstudianteDAO;
import com.uca.capas.tareal5.domain.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private EstudianteDAO estudianteDAO;

    @RequestMapping("/inicio")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
    @RequestMapping(value = "/insertarEstudiante", method = RequestMethod.POST)
    public ModelAndView insert(@RequestParam(value = "nombre") String nombre, @RequestParam(value = "apellido") String apellido,
                               @RequestParam(value = "carne") String carne, @RequestParam(value = "carrera") String carrera){
        ModelAndView mav = new ModelAndView();
        Estudiante estudiante = new Estudiante(nombre,apellido,carne,carrera);
        try {
            estudianteDAO.insert(estudiante);
        }catch (Exception e){
            e.printStackTrace();
        }
        mav.addObject("estudiante", estudiante);
        mav.setViewName("index");
        return mav;
    }
    @RequestMapping("/lista")
    public ModelAndView lista(){
        ModelAndView mav = new ModelAndView();
        List<Estudiante> estudiantes = null;
        try {
            estudiantes = estudianteDAO.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        mav.addObject("estudiantes", estudiantes);
        mav.setViewName("lista");
        return mav;
    }
}
