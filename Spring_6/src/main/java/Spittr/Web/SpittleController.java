package Spittr.Web;

import Spittr.data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by dela on 11/2/17.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;

    @Autowired  //注入SpittleRepository
    public SpittleController(SpittleRepository spittleRepository){
        this.spittleRepository = spittleRepository;
    }

    //第一种spittles()
//    @RequestMapping(method = RequestMethod.GET)
//    //将spittle添加到模型中
//    //Model实质上就是一个Map(也就是key-value对的集合), 它会传递给视图, 这样数据就能渲染到客户端了.
//    public String spittles(Model model){
//        model.addAttribute(spittleRepository
//                .findSpittles(Long.MAX_VALUE, 20));
//
//        System.out.println(spittleRepository);
//        System.out.println(model.asMap().get("spittleList"));
//
//        //返回视图名
//        return "spittles";
//    }


    //第二种Spittles()
    //当调用addAttribute时没有指定key的值, 那么key会根据值的对象类型推断确定.
    //在上面的spittles()方法中, 因为它是一个List<Spittle>, 因此, key将会推断为spittleList.

    //那么我们也可以显式声明Model(模型)的key值, 比如下面的Spittles()方法
    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model){
        model.addAttribute("spittleList",
                spittleRepository.findSpittles(Long.MAX_VALUE, 20));

        return "spittles";
    }

    //对应到Test里的shouldShowPageSpittles
    //为了使后面的SpittleControllerTest能发起带有参数的GET请求, 所以重载spittles()方法.
//    @RequestMapping(method = RequestMethod.GET)
//    public String spittle(@RequestParam("max") Long max,
//                          @RequestParam("count") int count, Model model){
//        model.addAttribute("spittleList", spittleRepository.findSpittles(max, count));
//
//        return "spittles";
//    }



    //第三种spittles()
    //如果你希望key是非String的值的话, 那么你可以用Map来代替Model(虽然在这里我们的key还是String类型的)
//    @RequestMapping(method = RequestMethod.GET)
//    public String spittles(Map model){
//        model.put("spittles", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
//
//        return "spittles";
//    }

    //还有下面省略版的spittes()方法. 该方法没有显式声明Model, 也没有显式声明返回的视图名, 它返回的是一个spittle列表.
    //当处理器方法像这样返回对象或者集合时, 这个值将会被放在Model(模型)中, 模型的key值将根据其返回类型推断出, 也就是spittleList.
    //而返回的视图名则是根据其请求路径推断出, 这个Controller的请求路径是"/spittles", 那么默认返回的视图名就是"spittles"(只是去掉斜杠).
//   @RequestMapping(method = RequestMethod.GET)
//    public List<Spittle> spittles(){
//        return spittleRepository.findSpittles(Long.MAX_VALUE, 20);
//   }


    //对应到Test里的testSpittle
    //这个方法针对"/spittles/12345"这样的请求.
    //spittle()方法的spittleId参数上添加了@PathVarriable("spittleId")注解,
    //这表明在请求路径中, 不管占位符部分的值是什么都会传递到处理器方法(spittle())中的spittleId参数中.
    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String Spittle(@PathVariable("spittleId") long spittleId, Model model){
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }
}
