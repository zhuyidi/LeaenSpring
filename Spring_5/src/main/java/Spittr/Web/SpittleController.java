package Spittr.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


/**
 * Created by dela on 11/2/17.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    @RequestMapping(method = GET)
    public String getView(){
        return "spittles";
    }
}
