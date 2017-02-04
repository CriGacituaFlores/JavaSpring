
package com.manosenelcodigo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController 
{
    @RequestMapping("inicio.htm")
    public ModelAndView inicio()
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index/inicio");
        return mav;
    }
    
    @RequestMapping("presentacion.htm")
    public ModelAndView presentacion()
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index/presentacion");
        return mav;
    }
}
