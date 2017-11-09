package Test;

import Spittr.Model.Spitter;
import Spittr.Web.SpitterController;
import Spittr.data.SpitterRepository;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.atLeastOnce;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by dela on 11/9/17.
 */
public class SpitterControllerTest {
    @Test
    public void shouldShowRegistration() throws Exception {
        SpitterController controller = new SpitterController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/spitter/register"))
                .andExpect(view().name("registerForm"));
    }

    //测试处理表单的控制器方法
    @Test
    public void shouldProcessRegistration() throws Exception {
        //构建Repository
        SpitterRepository mockRepository = Mockito.mock(SpitterRepository.class);
        Spitter unsaved = new Spitter("Jay", "zhou", "JayZhou", "zhoujielun");
        Spitter saved = new Spitter(24L, "Jay", "zhou", "JayZhou", "zhoujielun");

        when(mockRepository.save(unsaved)).thenReturn(saved);
        SpitterController controller = new SpitterController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(post("/spitter/register")
                    .param("firstName", "Jay")
                    .param("lastName", "zhou")
                    .param("username", "JayZhou")
                    .param("password", "zhoujielun"))
                    .andExpect(redirectedUrl("/spitter/JayZhou"));

        //校验保存情况
        //一定要在Spitter()方法里面重定义hasCode()和equals()方法,
        //不然就只是靠hasCode来判断两个对象是否相同, 就会出现测试里和Controller里的Spitter对象不同的情况
        verify(mockRepository, atLeastOnce()).save(unsaved);
    }

}
