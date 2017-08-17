package com.SoundSystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dela on 8/12/17.
 */

//该类通过Java代码定义了spring的装配规则, 其使用了@ComponentScan注解, 这个注解能在Spring中启用组件扫描
//如果没有其他配置的话, @ComponentScan默认会扫描与配置类相同的包, 因为本类位于soundSystem包中, 所以Spring会扫描这个包以及这个包下所有的子包, 查找带有@Component注解的类
@Configuration
@ComponentScan
public class CDPlayerConfig {
}
