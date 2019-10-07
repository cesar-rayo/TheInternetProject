package dropdown;

import org.testng.Assert;
import org.testng.annotations.Test;

import commons.BaseTest;
import pages.DropDownPage;

public class DropdownTests extends BaseTest{
	
	@Test
	public void testValidOption(){
		DropDownPage ddpage = homePage.clickDropDrown();
		String option = "Option 1";
		ddpage.selectFromDropdown(option);
		Assert.assertEquals(ddpage.getSelectedOptions().size(), 1, "Incorrect number of selected options");
		Assert.assertTrue(ddpage.getSelectedOptions().contains(option), "The selected option is not the right one");
		
	}
}
