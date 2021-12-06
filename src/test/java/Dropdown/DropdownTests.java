package Dropdown;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        String option="Option 1";
        var dropDownPage=homePage.clickDropDown();
        dropDownPage.selectFromDropDown(option);
        var selectedOptions=dropDownPage.getSelectedOptions();

        assertEquals(selectedOptions.size(),1);
        assertTrue(selectedOptions.contains(option),"Option not selected");
    }
}
