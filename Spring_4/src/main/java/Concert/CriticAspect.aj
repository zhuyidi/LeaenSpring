package Concert;

/**
 * Created by dela on 10/23/17.
 */

//需要注意这是一个ASpectJ文件, 并不是普通的Java文件
public aspect CriticAspect {
    public CriticAspect(){ }

    //定义切点, 并且使得切点匹配perform()方法
    pointcut performamce() : execution(* perform(..));

    //定义通知类型, 并且匹配通知方法
    after() : performance() {
        System.out.println(criticismEngine.getCriticism());
    }

    //依赖注入
    //这里并不是评论员这个类本身来发表评论, 发表评论是由CriticismEngine这个接口的实现类提供的.
    //为了避免CriticAspect于CriticismEngine之间产生的不必要的耦合,
    //我们通过Setter依赖注入为CriticAspect设置CriticismEngine.
    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine){
        this.criticismEngine = criticismEngine;
    }
 }
