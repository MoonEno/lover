package kr.ih.lover.biz.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    
    /**
     * 생성자
     */
    public MainController() {
        // Default constructor
    }
 
    @RequestMapping(value="/main", method = RequestMethod.GET)
	public String main(Model model) {
	    return "main/main_view";
	}
    
    @RequestMapping(value="/main2", method = RequestMethod.GET)
    public String main2(Model model) {
	    return "layouts/main2_layout";
	}
}
