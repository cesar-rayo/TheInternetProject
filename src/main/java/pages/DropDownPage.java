package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
	private WebDriver driver;
	private By dropdown = By.id("dropdown");
	private List<String> selectedStrings = new ArrayList<String>();
	
	public DropDownPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void selectFromDropdown(String selectedText){
		findDropdownElement().selectByVisibleText(selectedText);
	}
	
	public List<String> getSelectedOptions(){
		List<WebElement> selectedElements =
				findDropdownElement().getAllSelectedOptions();
		
		for(WebElement e: selectedElements){
			selectedStrings.add(e.getText());
		}
		return selectedStrings;
	}
	
	private Select findDropdownElement(){
		return new Select(driver.findElement(dropdown));
	}
}
