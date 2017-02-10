
package com.manosenelcodigo.controller;

import com.manosenelcodigo.modelos.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
    
    @RequestMapping(value="form.htm",method=RequestMethod.GET)
    public ModelAndView form()
    {
        return new ModelAndView("form","command",new Persona());
        //return new ModelAndView("form","command",new Persona(1,"Cristian","cri.gacitua.flores@gmail.com",22));

    }
    
    //model map permite el mapeo de modelos
    @RequestMapping(value="form.htm",method=RequestMethod.POST)
    public String form(Persona per, ModelMap modelo)
    {
        modelo.addAttribute("nombre",per.getNombre());
        modelo.addAttribute("correo",per.getCorreo());
        modelo.addAttribute("edad",per.getEdad());
        return "exito";
    }
           
}
