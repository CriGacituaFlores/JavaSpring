
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
    
    @RequestMapping("home.htm")
    public ModelAndView home()
    {
        //Instancia model and view
        ModelAndView mav = new ModelAndView();
        //Busca el jsp llamado 'home'
        mav.setViewName("home");
        return mav;
    }
    
    @RequestMapping("nosotros.htm")
    public ModelAndView nosotros()
    {
        //Instancia model and view
        ModelAndView mav = new ModelAndView();
        //Busca el jsp llamado 'nosotros'
        mav.setViewName("nosotros");
        return mav;
    }
}
