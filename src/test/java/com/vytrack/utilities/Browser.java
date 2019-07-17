package com.vytrack.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Browser {

    public static void wait(int secs) {
        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
        }
    }

    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }

    /**
     * Generates the String path to the screenshot taken.
     * Within the method, the screenshot is taken and is saved into FileUtils.
     * The String return will have a unique name destination of the screenshot itself.
     *
     * @param name Test name passed in as a String
     * @return unique String representation of the file's location / path to file
     */
    public static String getScreenshot(String name) {
        // name the screenshot with current date-time to avoid duplicate naming
        String time = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        // TakeScreenshot -> interface from selenium which takes screenshots
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();

        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);

        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots" + name + time + ".png";

        File finalDestination = new File(target);

        // save the screenshot to the path given
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException io) {
        }

        return target;
    }

}
