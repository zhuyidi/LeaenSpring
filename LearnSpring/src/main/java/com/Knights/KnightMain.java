package com.Knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dela on 8/15/17.
 */
public class KnightMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath*:knight.xml");
        //获取Knight Bean
        Knight knight = (Knight) context.getBean("knight");
        //使用knight
        knight.embarkOnQuest();
        context.close();
    }
}
