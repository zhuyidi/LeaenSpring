package Spittr.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dela on 11/2/17.
 */

@Controller
@RequestMapping(value = "/spitter/register")
public class Register {
    @RequestMapping
    public String getView(){
        return "register";
    }
}
