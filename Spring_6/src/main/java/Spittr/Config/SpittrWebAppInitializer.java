package Spittr.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by dela on 10/26/17.
 */

//通过AbstractAnnotationConfigDispatcherServletInitializer来配置DispatcherServlet是web.xml方式的替代方案.
public class SpittrWebAppInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {

    //将DispatcherServlet映射到/
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

    //当DispatcherServlet启动的时候, 就会创建应用上下文, 并加载配置文件或者配置类中所声明的Bean.
    //这里设置了WebConfig, 说明DiapatcherServlet创建的应用文的配置文件就是WebConfig.
    //DispatcherServlet创建的应用上下文主要是加载包含Web组件的Bean, 比如控制器/视图解析器/处理器映射等.
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }

    //在Spring中还有另外一个应用上下文, 这个应用上下文是由ContextLoaderListener(Servlet监听器)创建的.
    //ContextLoaderListener创建的应用上下文主要是加载包含你的应用中的其它Bean, 这些Bean通常是驱动应用后端的中间层和数据层组件(比如持久话层配置).
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class};
    }
}
