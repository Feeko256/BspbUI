package elements;

import org.openqa.selenium.By;

public class Button extends Element{
    public Button(By locator) {
        super(locator);
    }

    public void ButtonClick(){
        getElement().click();
    }
}
