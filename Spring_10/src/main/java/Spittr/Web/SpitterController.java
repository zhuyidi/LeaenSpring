package Spittr.Web;

import Spittr.Dao.SpitterRepository;
import Spittr.Model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.security.provider.ConfigFile;

import javax.validation.Valid;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by dela on 11/9/17.
 */

@Controller
@RequestMapping("/spitter")
public class SpitterController {
    private SpitterRepository spitterRepository;

    //使用自动装配注入SpitterRepository
    @Autowired
    public SpitterController(SpitterRepository spitterRepository){
        this.spitterRepository = spitterRepository;
    }

    public SpitterController(){

    }

    @RequestMapping(value = "/register", method = GET) //处理对"spitter/register"的GET请求
    public String showRegistrationForm(){
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = POST)
    public String processRegistration(@Valid Spitter spitter){
        spitterRepository.save(spitter);

        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value = "/{username}", method = GET)
    public String showSpitterProfile(@PathVariable String username, Model model){
        List<Spitter> spitter = spitterRepository.findByUsername(username);

        System.out.println(username);
        System.out.println(spitter.size());
        model.addAttribute("spitter", spitter);


        for(Spitter test : spitter){
            System.out.printf("***\n");
            System.out.println(test.getId());
        }

        return "profile";
    }

    @RequestMapping(value = "/id/{id}", method = GET)
    public String showSpitterProfile1(@PathVariable Long id, Model model){
        Spitter spitter = spitterRepository.findById(id);

        model.addAttribute("spitter1", spitter);


//        for(Spitter test : spitter){
//            System.out.printf("***\n");
//            System.out.println(test.getId());
//        }

        return "profile1";
    }
}
