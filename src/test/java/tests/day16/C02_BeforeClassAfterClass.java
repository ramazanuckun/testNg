package tests.day16;

import org.testng.annotations.Test;
import utilitis.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {


        @Test
        public void amazonTesti() {
            driver.get("https://amazon.com");

        }

        @Test
        public void bestBuyTesti() {

            driver.get("https://bestbuy.com");

        }

        @Test
        public void teschproeducationTesti() {

            driver.get("https://techproeducation.com");

        }}