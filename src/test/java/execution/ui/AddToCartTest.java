package execution.ui;

import execution.BaseUiTest;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.ShopSteps;

import static consts.Product.TenutaSant;

public class AddToCartTest extends BaseUiTest {

    @Test
    @Description("Add product to cart and verify it appears in cart")
    public void addProductToCart() {

        ShopSteps.openHomePage();
        ShopSteps.acceptPopUp();
        ShopSteps.openProduct(TenutaSant);
        ShopSteps.addProductToCart();
        ShopSteps.openCart();

        Assert.assertTrue(ShopSteps.isCartNotEmpty(),
                "Cart is empty, product was not added");
    }
}