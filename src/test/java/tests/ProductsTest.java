package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class ProductsTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void productShouldBeAvailableCartTest() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.buyProduct("Sauce Labs Backpack");
        productsPage.buyProduct("Sauce Labs Bolt T-Shirt");
        productsPage.goToShoppingCard();
        productsPage.waitForProductsPage();
    }

    @Test
    public void productShouldBeAvailableInCart() {
        loginPage
                .open()
                .login("standard_user", "secret_sauce")
                .buyProduct("Sauce Labs Backpack")
                .buyProduct("Sauce Labs Bolt T-Shirt");
    }
}