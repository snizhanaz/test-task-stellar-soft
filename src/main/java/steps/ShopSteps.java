package steps;

import com.codeborne.selenide.SelenideElement;
import consts.Product;
import io.qameta.allure.Step;
import pages.MainPage;
import pages.ProductPage;
import pages.CartPage;

public class ShopSteps {

    @Step("Open Home Page")
    public static void openHomePage() {
        new MainPage().openPage();}

    @Step("Accept pop-up")
    public static void acceptPopUp() {
        new MainPage().clickAcceptPopUp();}

    @Step("Add product to cart")
    public static void addProductToCart() {
        new ProductPage().clickAddToCart();}

    @Step("Open cart")
    public static void openCart() {
        new MainPage().clickOpenCart();}

    @Step("Check that cart is not empty")
    public static boolean isCartNotEmpty() {
        return CartPage.isCartNotEmpty();}

    @Step("Open product {product}")
    public static void openProduct(Product product) {
        new MainPage().getProduct(product);}
    
}

