package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void testWaitUntilVisible() {
        var example2page=homePage.clickDynamicLoading().clickExample2();
        example2page.clickStartButton();
        assertEquals(example2page.getAlertText(), "Hello World!", "Loaded text incorrect");
    }

    }
