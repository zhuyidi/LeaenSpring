package Spittr.Config;

/**
 * Created by dela on 10/26/17.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//最简单的Spring MVC配置就是一个带有@EnableWebMvc注解的类.
@Configuration
@EnableWebMvc   //启用Spring MVC
@ComponentScan("Spitter.Web")    //启用组件扫描. 组件扫描只会对这里设置的包及其子包其作用, 如果设置的包之外就不能被扫描到
public class WebConfig extends WebMvcConfigurerAdapter{

    //配置JSP视图解析器
    //在viewResolver方法的上一层会调用RequestToViewNameTranslator组件的getViewName()方法得到View的名字,
    //然后调用ViewResolver的resolverLocale()方法返回View对象.
    //现在这里就是配置ViewResolver视图解析器具体解析View名字的规则.
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);

        return resolver;
    }

    //配置对静态资源的处理
    //这里通过调用DefaultServletHandlerConfigurer的enable()方法, 要求DisatcherServlet将对静态资源的请求转发到Servlet容器中默认的Servlet上,
    //而不是DispatcherServlet本身来处理这类请求.
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
