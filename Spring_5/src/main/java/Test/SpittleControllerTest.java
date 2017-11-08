package Test;

import Spittr.Spittle;
import Spittr.Web.SpittleController;
import Spittr.data.SpittleRepository;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

//import static org.mockito.Mockito.mock;

/**
 * Created by dela on 11/5/17.
 */


public class SpittleControllerTest {
    @Test
    public void shouldShowPageSpitles() throws Exception {
        List<Spittle> exspectedSpittles = createSpittleList(50);
        SpittleRepository mockRepository = Mockito.mock(SpittleRepository.class);
        when(mockRepository.findSpittles(238900, 50)) //预期的max和count参数
                .thenReturn(exspectedSpittles);

        SpittleController controller = new SpittleController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller)
                .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
                .build();

        //对spittles发起GET请求, 并传入参数
        mockMvc.perform(get("/spittles?max=238900&count=50"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"));
    //            .andExpect(model().attribute("spittleList", hasItems(exspectedSpittles.toArray())));
    }

    @Test
    public void shouldShowRecentSpittles() throws Exception {
        List<Spittle> expectedSpittles = createSpittleList(20);

        //Mock Repository
        SpittleRepository mockRepository = Mockito.mock(SpittleRepository.class);
        when(mockRepository.findSpittles(Long.MAX_VALUE, 20))
                .thenReturn(expectedSpittles);
        SpittleController controller = new SpittleController(mockRepository);

        //Mock Spring MVC
        MockMvc mockMvc = standaloneSetup(controller)
                .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
                .build();

        //对"spittles"发起GET请求
        //调用MockMvc.perform(RequestBuilder requestBuilder)发起一个HTTP请求, 然后将得到ResultAction.
        mockMvc.perform(get("/spittles")) //添加验证断言来判断执行请求后的结果是否是预期的
                .andExpect(view().name("spittles")) //view():得到视图验证器
                .andExpect(model().attributeExists("spittleList")); //得到相应的***ResultMatchers后, 接着再调用其相应的API得到ResultMatcher,
                //如ModelResultMatchers.attributeExists(final String ...names)判断Model属性是否存在
                //model():得到模型验证器
//                .andExpect(model().attribute("spittleList", IsCollectionContaining.hasItems(expectedSpittles.toArray())));
        //junit-4.12的org.junit.matchers.JUnitMatchers里的hasItems()已过期.
        //这里用的是IsCollectionContaining的hasItems().
    }

    public List<Spittle> createSpittleList(int count){
        List<Spittle> spittles = new ArrayList<Spittle>();
        for(int i = 0; i < count; i++){
            spittles.add(new Spittle("Spittle" + i, new Date()));
        }

        return spittles;
    }
}
