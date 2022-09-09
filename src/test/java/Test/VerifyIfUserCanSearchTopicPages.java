package Test;

import org.testng.annotations.Test;

public class TopicsPageTest extends BaseClass {
    @Test(priority = 1)
    public void login() {
        pageFactory.getLoginPage().login();
    }
    @Test(priority = 2)
    public void topics() {
        pageFactory.getTopicsPage().topics();
    }
}
