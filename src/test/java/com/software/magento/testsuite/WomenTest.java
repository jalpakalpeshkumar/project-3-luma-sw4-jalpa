package com.software.magento.testsuite;

import com.software.magento.pages.Women;
import com.software.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    Women women = new Women();


    @Test
    public void verifyTheSortByProductNameFilter(){

        //Remove cookies
        clickOnElement(By.className("fc-button-label"));

        //1.1Mouse Hover on the ‘Women’ Menu
        women.mouseHoverOnWomen();

        //1.2 Mouse Hover on the ‘Tops’
        women.mouseHoverOnTops();

        //1.3Click on the ‘Jackets’
        women.clickOnJacket();

        //1.4Select Sort By filter “Product Name”
        women.FilterProductName();


        //1.5Verify the product name displayed in alphabetical order
        //women.verifyTheProductName();
       // String expectedText =


    }
    @Test
    public void verifyTheSortByPriceFilter(){


        //Remove cookies
        clickOnElement(By.className("fc-button-label"));

        //2.1Mouse Hover on the ‘Women’ Menu
        women.mouseHoverOnWomen();

        //2.2Mouse Hover on the ‘Tops’
        women.mouseHoverOnTops();

        //2.3Click on the ‘Jackets’
        women.clickOnJacket();

        //2.4Select Sort By filter “Price”
        women.filterPrice();


    }
}
