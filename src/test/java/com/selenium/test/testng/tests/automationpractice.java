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
    @Test
    public void GoToCategoryAll() {
        open("http://automationpractice.com/index.php");
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
        open("http://automationpractice.com/index.php");
        $("#block_top_menu > ul > li:nth-child(1) > a").click();
        $(By.className("cat-name")).shouldBe(visible).shouldHave(
                text("Women"));
    }

    @Test
    public void GoToCategoryDresses() {
        open("http://automationpractice.com/index.php");
        $("#block_top_menu > ul > li:nth-child(2) > a").click();
        $(By.className("cat-name")).shouldBe(visible).shouldHave(
                text("Dresses"));
    }

    @Test
    public void GoToCategoryTshirts() {
        open("http://automationpractice.com/index.php");
        $("#block_top_menu > ul > li:nth-child(3) > a").click();
        $(By.className("cat-name")).shouldBe(visible).shouldHave(
                text("T-shirts"));
    }

    @Before
    public void clearCache() {
        clearBrowserCache();
    }
}
