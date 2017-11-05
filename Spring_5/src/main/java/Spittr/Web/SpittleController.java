package Spittr.Web;

import Spittr.data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


/**
 * Created by dela on 11/2/17.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;

    @Autowired  //注入SpittleRepository
    public SpittleController(SpittleRepository spittleRepository){
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    //将spittle添加到模型中
    public String spittles(Model model){
        model.addAttribute(spittleRepository
                .findSpittles(Long.MAX_VALUE, 20));

        //返回视图名
        return "spittles";
    }
}
