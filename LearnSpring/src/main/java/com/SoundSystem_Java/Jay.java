package com.SoundSystem_Java;

/**
 * Created by dela on 8/12/17.
 */

//Component注解表明该类会作为组件类, 并告知Spring要为这个类创建bean.
//没有必要显式配置SgtPeppers bean, 因为该类使用了@Component注解, Spring会将事情处理妥当
//不过, 组件扫描默认是不启用的, 所以我们还需显式配置一下Spring, 从而命令它去寻找带有@Component注解的类, 并为其创建bean
//@Component
public class Jay implements CompactDisc {
    private String title = "专辑Jay";
    private String artist = "周杰伦";


    public void play() {
        System.out.print("正在播放" + artist + "的" + title);
    }
}
