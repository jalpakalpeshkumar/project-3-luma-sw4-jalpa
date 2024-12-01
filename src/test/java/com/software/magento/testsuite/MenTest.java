package com.software.magento.testsuite;

import com.software.magento.pages.Men;
import com.software.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    Men men= new Men();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){

        //Remove cookies
        clickOnElement(By.className("fc-button-label"));

        //Mouse Hover on the ‘Men’ Menu
        men.mouseHourOnMen();

        //Mouse Hover on the ‘Bottoms’
        men.mouseHourOnBottoms();

        //Click on the ‘Pants’
        men.clickOnPants();

        //Mouse Hover on product name Cronus Yoga Pant and click on size 32.
        men.mouseHourOnCronusYogaPant();
        men.clickSize32();

        //Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
        men.clickColourBlack();

        //Mouse Hover on the product name  ‘Cronus Yoga Pant’ and click on the ‘Add To Cart’ Button
        men.ProductChooseToCart();

        //Verify the text
        men.checkVerifyText();
       String expectedMessage = "You added Cronus Yoga Pant to your shopping cart";
       String actualMessage = men.checkVerifyText();
        Assert.assertEquals(actualMessage,expectedMessage,"You added Cronus Yoga Pant to your shopping cart not found");


        //Click on the ‘shopping cart’ Link into message
        men.clickOnShoppingCart();

        //Verify the text ‘Shopping Cart.’
        Assert.assertEquals("Shopping Cart",
                getTextFromElement(By.xpath("//span[@class='base']")));

        // Verify the product name ‘Cronus Yoga Pant’
        men.verifyTheProductNameCronusYogaPant();
        String expectedProduct = "Cronus Yoga Pant";
        String actualProduct = men.verifyTheProductNameCronusYogaPant();
        Assert.assertEquals(actualProduct,expectedProduct,"cronus yoga pants not display");


        //Verify the product size ‘32’
        men.verifyTheProductSize32();
        String expectedSize = "32";
        String actualSize = men.verifyTheProductSize32();
        Assert.assertEquals(actualSize,expectedSize,"32 not display");


        //Verify the product color ‘Black’
        men.verifyTheProductColour();
        String expectedColour ="Black";
        String actualColour = men.verifyTheProductColour();
        Assert.assertEquals(actualColour,expectedColour,"Black colour not display");

    }

}
