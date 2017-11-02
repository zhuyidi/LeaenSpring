package Spittr.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by dela on 11/2/17.
 */


//@Controller是一个基于@Component的构造性注解, 它的目的就是辅助实现组件扫描, 所以带有@Controller注解的类也会被自动扫描到
@Controller     //将HomeController声明为一个控制器
public class HomeController {
    @RequestMapping(value = "/", method = GET)  //处理对"/"的GET请求
    public String home(){
        return "home";  //视图名为home
    }
}
