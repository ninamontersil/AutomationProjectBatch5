package io.loop.pages;

import io.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopPracticeDragDropPage {

    public LoopPracticeDragDropPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Big circle
    @FindBy(id = "droptarget")
    public WebElement bigCircle;

    // Small circle
    @FindBy(id = "draggable")
    public WebElement smallCircle;
}




