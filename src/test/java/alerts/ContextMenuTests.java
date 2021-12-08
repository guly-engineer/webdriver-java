package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testAcceptAlert() {
        var ContextMenuPage = homePage.clickContextMenu();
        ContextMenuPage.rightClickBox();
        String expectedText = "You selected a context menu";
        String alertText = ContextMenuPage.alert_getText();
        ContextMenuPage.alert_clickToAccept();
        assertEquals(alertText, expectedText);

    }
}
