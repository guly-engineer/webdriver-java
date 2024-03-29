package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption() {
        String option = "Option 1";
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();

        assertEquals(selectedOptions.size(), 1);
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
