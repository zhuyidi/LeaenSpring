package WebXu;

import javax.servlet.annotation.WebServlet;

/**
 * Created by dela on 10/30/17.
 */
@WebServlet("/demo")
public class Demo {
    private String viewPage;

    public void setViewPage(String viewPage) {
        this.viewPage = viewPage;
    }

    public String getViewPage() {
        return viewPage;
    }
}
