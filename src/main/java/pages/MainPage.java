package pages;

import com.codeborne.selenide.SelenideElement;
import consts.Product;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public void openPage() {
        open("https://worldwines.ua/");}

    public void clickAcceptPopUp(){
        $(".t658__btn.t658__btn_yes").shouldBe(visible).click();}

    public void clickOpenCart(){
        $(".t706__carticon-imgwrap").shouldBe(visible).click();}

    public static SelenideElement getProduct(Product product) {
        open("https://worldwines.ua/tproduct/" + product.getLink());
        return $("h1");}

    public static void addToCart(SelenideElement product) {
        product.$("a[href='#order'] td.js-store-prod-popup-buy-btn-txt")
                .shouldBe(visible, enabled).click();}
}
