package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class FrameTests extends BaseTests {
    @Test
    public void verifyFrameText() {
        var nestedFramesPage = homePage.clickFrames().clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM");
    }
}