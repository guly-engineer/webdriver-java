package horizontalslider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void testSendKeysRight() {
        String expectedValue = "4";
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.sendKeysRightToSlider(expectedValue);
        assertEquals(expectedValue, horizontalSliderPage.getSliderValue());
    }
}
