package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DropdownTest extends BaseTests {

    @Test
    public void testSelectOptions(){
        var dropDownPage= homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
