package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;
import utils.Utils;


public class AutomationPracticeSteps {

    Woman woman = new Woman();
    Dresses dresses= new Dresses();
    TShirts tShirts= new TShirts();
    Cart cart=new Cart();
    HomePage homePage= new HomePage();

    @Given("open AutomationPractice page and add fist product from woman category to cart")
    public void openAutomationPracticePageAndAddFirstProductFromWomanCategoryToCart(){
        woman.getWomenItem();
    }
    @When("add second product to cart from dresses category")
    public void addSecondProductToCartFromDressesCategory(){
        dresses.getDressesItem();
    }
    @When("add third product to cart from Tshirt category")
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
    }/*
    @Then("log out")
    public void logOut(){
    }*/

}
