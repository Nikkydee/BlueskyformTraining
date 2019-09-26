package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class BlueSkyformSteps {
    //step1:Initialize webdriver

    WebDriver driver;

    //Instantiate chrome driver
    @Given("^I navigate to blueskycitadelform site$")
    public void i_navigate_to_blueskycitadelform_site() throws Throwable {

        //step2:set path

       // System.setProperty("webdriver.gecko.driver", "C:\\firefox\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");


       //step3: Instantiate web driver
         driver = new ChromeDriver();
        //driver = new FirefoxDriver();

         //step4: Navigate to URL
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://www.blueskycitadel.com/test-form-for-bluesky-automation-training/");
        driver.manage().window().maximize();
        //throw new PendingException();
    }

    //@When("^I enter first name$")
   // public void i_enter_first_name() throws Throwable {

        //driver.findElement(By.id("nf-field-26")).sendKeys("Nike");
        //throw new PendingException();
    //}
    @When("^I enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String firstname) throws Throwable {
        driver.findElement(By.id("nf-field-26")).sendKeys(firstname);
       // throw new PendingException();
    }

    @When("^I enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lastname) throws Throwable {
        driver.findElement(By.id("nf-field-27")).sendKeys("lastname");
        //throw new PendingException();
    }

   // @When("^I enter Last name$")
   // public void i_enter_Last_name() {
       // driver.findElement(By.id("nf-field-27")).sendKeys("Olapetan");
        //throw new PendingException();
   // }



    @When("^I enter email$")
    public void i_enter_email() throws Throwable {
        driver.findElement(By.cssSelector("#nf-field-28")).sendKeys("agboolaadenike88@gmail.com");
        //throw new PendingException();
    }


    @When("^I enter firstname \"([^\"]*)\" and lastname \"([^\"]*)\"$")
    public void iEnterFirstnameAndLastname(String firstname, String lastname) throws Throwable {
        driver.findElement(By.id("nf-field-26")).sendKeys(firstname);
        driver.findElement(By.id("nf-field-27")).sendKeys(lastname);
        //throw new PendingException();
    }

    @When("^I enter Email Confirmation$")
    public void i_enter_Email_Confirmation() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"nf-field-29\"]")).sendKeys("agboolaadenike88@gmail.com");
       // throw new PendingException();
    }
    @When("^I Enter Gender Identification$")
    public void i_Enter_Gender_Identification() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"nf-field-30\"]")).sendKeys("Female");
        //throw new PendingException();
    }

    @When("^I send Age (\\d+)-(\\d+)$")
    public void i_send_Age(int arg1, int arg2) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"nf-field-31-1\"]")).click();
        //throw new PendingException();
    }
    @When("^I check checkboxlist$")
    public void i_check_checkboxlist() throws Throwable {
        driver.findElement(By.id("nf-field-40-0")).click();
       // throw new PendingException();
    }
    @When("^I select multiselect$")
    public void i_select_multiselect() throws Throwable {
        new Select(driver.findElement(By.xpath("//*[@id=\"nf-field-41\"]"))).selectByValue("One");
        new Select(driver.findElement(By.xpath("//*[@id=\"nf-field-41\"]"))).selectByVisibleText("Two");
       // throw new PendingException();
    }
    @When("^I check radiolist$")
    public void i_check_radiolist() throws Throwable {
        driver.findElement(By.cssSelector("#nf-field-42-0")).click();
        //throw new PendingException();
    }
    @When("^I select in select dropdown list$")
    public void i_select_in_select_dropdown_list() throws Throwable {
       driver.findElement(By.cssSelector("#nf-field-43")).click();;
        //throw new PendingException();
    }
    @When("^I enter single line text$")
    public void i_enter_single_line_text() throws Throwable {
        driver.findElement(By.id("nf-field-45")).sendKeys("fbasevbnfaesbj,sdmmkcjvem,cnsd nvmnas");
       // throw new PendingException();
    }

    @When("^I enter paragraph text$")
    public void i_enter_paragraph_text() throws Throwable {
        driver.findElement(By.id("nf-field-44")).sendKeys("paragraphfbasevbnfajhkljhkesbj,sdmmkcjvem,cnsd nvmnas");
        //throw new PendingException();
    }

    @When("^I enter Address$")
    public void i_enter_Address() throws Throwable {
        driver.findElement(By.id("nf-field-46")).sendKeys("addressfbasevbnfaesbj,sdmmkcjvem,cnsd nvmnas");
        //throw new PendingException();
    }

    @When("^I enter Date$")
    public void i_enter_Date() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"nf-field-38-wrap\"]/div[2]/div/input[2]")).sendKeys("08/22/2019");
        //throw new PendingException();
    }

    @When("^I click on submit button$")
    public void i_click_on_submit_button() throws Throwable {
        driver.findElement(By.cssSelector("#nf-field-37")).click();
        driver.findElement(By.className("blog-icons")).click();
     //   throw new PendingException();
    }

    @Then("^the form is submitted$")
    public void the_form_is_submitted() throws Throwable {
        //String homeText = driver.findElement(By.xpath("//*[@id=\"nf-form-4-cont\"]/div/div[1]/p")).getText();
        //Assert.assertTrue(homeText.contains("Your form has been successfully submitted."));
        //System.out.println(homeText);

        //Another way to declare assert
        Assert.assertEquals(driver.findElement(By.cssSelector(""));
       // throw new PendingException();
    }

    @When(value = "^I enter firstname \"([^\"]*)\" and lastname \"([^\"]*)\" and email \"([^\"]*)\"and confirmemail \"([^\"]*)\" and gender \"([^\"]*)\"$")
    public void iEnterFirstnameAndLastnameAndEmailAndConfirmemailAndGender(String firstname, String lastname, String email, String confirmemail, String gender) throws Throwable {
        driver.findElement(By.id("nf-field-26")).sendKeys(firstname);
        driver.findElement(By.id("nf-field-27")).sendKeys(lastname);
        driver.findElement(By.cssSelector("#nf-field-28")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"nf-field-29\"]")).sendKeys(confirmemail);
        driver.findElement(By.xpath("//*[@id=\"nf-field-30\"]")).sendKeys(gender);


       // throw new PendingException();
    }
}
