package cucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirefoxBrowser {
    
    private WebDriver driver;

    /**
     * Default constructor.
     * Initializes the web driver to be a Firefox driver.
     */
    public MyFirefoxBrowser(){
        driver = new FirefoxDriver();
    }

    /**
     * Redirects the web driver to the given URL string
     * @param url the destination URL string
     */
    public void visit(String url){
        driver.get(url);
    }

    /**
     * Sets the input values to each corresponding text field.
     * @param firstNum the first number to be set.
     * @param secondNum the second number to be set.
     */
    public void setInputs(String firstNum, String secondNum){
        // types both first and second numbers in text fields using their IDs.
        driver.findElement(By.id("number1")).sendKeys(firstNum);
        driver.findElement(By.id("number2")).sendKeys(secondNum);
        // click on calculate button.
        driver.findElement(By.id("calculate")).click();
    }

    /**
     * @return the actual result from the calculation.
     */
    public String getActualResultOutput(){
        // gets the inner HTML text in the element with id 'answer'.
        return driver.findElement(By.id("answer")).getAttribute("innerHTML");
    }
}
