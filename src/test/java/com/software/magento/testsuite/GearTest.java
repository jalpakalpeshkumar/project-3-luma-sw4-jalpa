package com.software.magento.testsuite;

import com.software.magento.pages.Gear;
import com.software.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    Gear gear = new Gear();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){

        //Remove cookies
        clickOnElement(By.className("fc-button-label"));

        //Mouse Hover on the ‘Gear’ Menu
        gear.mouseHourOnGearMenu();

        //Click on the ‘Bags’
        gear.clickToBag();

        //Click on Product Name ‘Overnight Duffle’
        gear.clickOnProductNameOverNightDuffle();

        //Verify the text ‘Overnight Duffle’
        gear.verifyTheTextOvernightDuffle();
        String expectedText = "Overnight Duffle";
        String actualText = gear.verifyTheTextOvernightDuffle();
        Assert.assertEquals(actualText,expectedText,"Overnight Duffle not display");


        // Change the Qty 3
        gear.changeQty3();

        //Click on the ‘Add to Cart’ Button.
        gear.clickOnAddToCart();

        //Verify the text
        gear.verifyTheText();
        String expectedText1 = "You added Overnight Duffle to your shopping cart";
        String actualText1= gear.verifyTheText();
        Assert.assertEquals(actualText1,expectedText1,"You added Overnight Duffle to your shopping cart is not avelible");

        //Click on the ‘shopping cart’ Link into message
        gear.clickOnShoppingCart();

        //Verify the product name ‘Overnight Duffle’
        gear.verifyTheProductNameOvernightDuffle();
        String expectedName = "Overnight Duffle";
        String actualName = gear.verifyTheProductNameOvernightDuffle();
        Assert.assertEquals(actualName,expectedName,"Overnight Duffle is not there");

        //Verify the Qty is ‘3’
        gear.verifyTheQtyIs3();
        String expectedQty = "3";
        String actualQty = gear.verifyTheQtyIs3();
        Assert.assertEquals(actualQty,expectedQty,"3 is not showing");

        //Verify the product price ‘$135.00’
        gear.verifyTheProductPrice();
        String expectedPrice = "$135.00";
        String actualPrice = gear.verifyTheProductPrice();
        Assert.assertEquals(actualPrice,expectedPrice,"$135.00 is not correct");


        //Change the Qty to ‘5’
        gear.changeQty5();

        //Click on the ‘Update Shopping Cart’ button
        gear.clickOnUpdateShoppingCart();



    }
}
