package com.selenium.test.testng.tests;

import com.codeborne.selenide.CollectionCondition;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class automationpractice {
    final String SITE_URL = "http://automationpractice.com/index.php";

    @Test
    public void GoToCategoryAll() {
        open(SITE_URL);
        $("#block_top_menu > ul > li:nth-child(1) > a").click();
        $(By.className("cat-name")).shouldBe(visible).shouldHave(
                text("Women"));

        $("#block_top_menu > ul > li:nth-child(2) > a").click();
        $(By.className("cat-name")).shouldBe(visible).shouldHave(
                text("Dresses"));

        $("#block_top_menu > ul > li:nth-child(3) > a").click();
        $(By.className("cat-name")).shouldBe(visible).shouldHave(
                text("T-shirts"));
    }

    @Test
    public void GoToCategoryWomen() {
        open(SITE_URL);
        $("#block_top_menu > ul > li:nth-child(1) > a").click();
        $(By.className("cat-name")).shouldBe(visible).shouldHave(
                text("Women"));
    }

    @Test
    public void GoToCategoryDresses() {
        open(SITE_URL);
        $("#block_top_menu > ul > li:nth-child(2) > a").click();
        $(By.className("cat-name")).shouldBe(visible).shouldHave(
                text("Dresses"));
    }

    @Test
    public void GoToCategoryTshirts() {
        open(SITE_URL);
        $("#block_top_menu > ul > li:nth-child(3) > a").click();
        $(By.className("cat-name")).shouldBe(visible).shouldHave(
                text("T-shirts"));
    }

    @Before
    public void clearCache() {
        clearBrowserCache();
    }
}
