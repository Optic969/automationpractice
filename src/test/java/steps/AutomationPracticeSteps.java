package steps;


import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageObjects.*;
import utils.Utils;


public class AutomationPracticeSteps extends Utils {

    Woman woman = new Woman(driver);
    Dresses dresses= new Dresses(driver);
    TShirts tShirts= new TShirts(driver);
    Cart cart=new Cart(driver);
    HomePage homePage= new HomePage(driver);

    @Given("open Automationpractice page and add fist product from woman category to cart")
    public void openAutomationpracticePageAndAddFirstProductFromWomanCategoryToCart(){
        woman.getWomenItem();
    }
    @When("add second product to cart from dresses category")
    public void addSecondProductToCartFromDressesCategory(){
        dresses.getDressesItem();
    }
    @When("add third product to cart from tshirt category")
    public void addThirdProductToCartFromTshirtCategory(){
        tShirts.getTShirtsItem();
    }
    @When("check cart and delete one of products")
    public void checkCartAndDeleteOneProduct(){
        cart.checkCartItems();
    }
    @When("search deleted products")
    public void searchDeletedProducts(){
        homePage.searchItem();
    }
    @When("click on checkbox")
    public void clickOnCheckbox(){
        homePage.clickCheckBox();
    }
    /*@Then("log out")
    public void logOut(){

    }*/

}
