
package com.manosenelcodigo.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController 
{
     
    @RequestMapping("inicio.htm")
    public ModelAndView inicio( HttpServletRequest request )
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index/inicio");
        String id = request.getParameter("id");
        String id2 = request.getParameter("id2");
        mav.addObject("id", id);
        mav.addObject("id2", id2);
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
