package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStartButton();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect!");
    }
}
