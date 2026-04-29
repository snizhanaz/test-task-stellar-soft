package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

public class ProductPage {

    public void clickAddToCart() {
        SelenideElement btn = $(".t-store__prod-popup__btn");

        btn.shouldBe(visible)
                .shouldBe(enabled)
                .click();
    }
}
