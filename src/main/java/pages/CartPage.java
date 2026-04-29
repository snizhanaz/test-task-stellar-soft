package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage {

    private static final SelenideElement    cartWindow = $(".t706__cartwin");
    private static final ElementsCollection cartItems  = $$(".t706__product");

    public static boolean isCartNotEmpty() {
        cartWindow.shouldBe(visible);
        cartItems.shouldHave(sizeGreaterThan(0));
        return cartItems.size() > 0;
    }
}