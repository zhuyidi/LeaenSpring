package Spittr.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by dela on 11/2/17.
 */

//定义类级别的请求处理

//在这个新的HomeController中, 路径被转移到类级别的@RequestMapping上, 而HTTP方法依然映射在方法级别上.
//就HomeController而言, 只有home()一个控制器方法, 与类级别的@RequestMapping合并之后,
//这个方法的@RequestMapping表示home()将会处理"/"路径的GET请求.
//如果改为下面第二个@RequestMapping, 那么表明home()能映射到对"/"和"homepage"的GET请求.
@Controller
@RequestMapping("/home")
//@RequestMapping({"/", "/homepage"})
public class HomeController{
    @RequestMapping(method = GET)
    public String home(){
        return "home";
    }
}


//定义方法级别的请求处理

//@Controller是一个基于@Component的构造性注解, 它的目的就是辅助实现组件扫描, 所以带有@Controller注解的类也会被自动扫描到
//@Controller     //将HomeController声明为一个控制器
//public class HomeController {
//    @RequestMapping(value = "/", method = GET)  //处理对"/"的GET请求
//    public String home(){
//        return "home";  //视图名为home
//    }
//}