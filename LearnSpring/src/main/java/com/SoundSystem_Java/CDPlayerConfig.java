package com.SoundSystem_Java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dela on 8/12/17.
 */

//该类通过Java代码定义了spring的装配规则, 其使用了@ComponentScan注解, 这个注解能在Spring中启用组件扫描
//如果没有其他配置的话, @ComponentScan默认会扫描与配置类相同的包, 因为本类位于soundSystem包中, 所以Spring会扫描这个包以及这个包下所有的子包, 查找带有@Component注解的类
@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc jay(){
        return new Jay();
    }




//    @Bean
//    public CompactDisc xin(){
//        return new Xin();
//    }


//    @Bean
//    public CompactDisc randomCD(){
//        int choice = (int)Math.floor(Math.random() * 4);
//
//        if(choice == 0){
//            return new Jay();
//        }else{
//            return new Xin();
//        }
//    }

    //因为实例化一个CDPlayer时, CDPlayer需要构造参数CompactDisc, 所以在声明一个Bean的时候, 也需要一个CompactDisc的Bean

    //方案一: 在创建CDPlayer Bean的时候, 调用创建Jay Bean的方法. 也就是说, 将Jay Bean实例传进来.
    //但是, 需要注意的是:如果在这个JavaConfig中还有其它Bean需要用到Jay Bean的时候, 将与CDPlayer Bean共用一份Jay Bean实例.
//    @Bean
//    public CDPlayer cdPlayer(){
//        return new CDPlayer(jay());
//    }

    //方案二:

    @Bean
    public CDPlayer cdPlayer(Jay compactDisc){
        return new CDPlayer(compactDisc);
    }

}
