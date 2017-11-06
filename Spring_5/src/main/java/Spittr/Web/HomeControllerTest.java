package Spittr.Web;

import org.junit.*;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by dela on 11/2/17.
 */

public class HomeControllerTest {
//    @SpittleControllerTTest
//    public void testHomePage() {
//        HomeController controller = new HomeController();
//        //这里仅仅是测试home()方法里面会发生什么, 也就是测试home()的返回值是不是"home", 并没有真正对"/"发起GET请求从而调用home()方法.
//        assertEquals("home", controller.home());
//    }
//

    //改进后的testHomePage方法.
    //Spring现在包含了一种mock Spring MVC并针对控制器执行HTTP请求的机制, 这样在测试控制器的时候, 就不必在启动web容器和浏览器了
    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        //搭建MockMvc
        MockMvc mockMvc = standaloneSetup(controller).build();
        //对"/"执行GET请求, 预期得到home视图
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}
