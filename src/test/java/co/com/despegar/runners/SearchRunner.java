package co.com.despegar.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;




    @RunWith(Cucumber.class)
    @CucumberOptions(features = {
            "src/test/resources/features/searchHotel.feature"
    },
            strict = false, plugin = {"pretty",
            "json:target/cucumber_json_reports/searchHotel.json",
            "html:target/searchHotel-html"},
            glue = {"co.com.despegar.hooks",
                    "co.com.despegar.pages",
                    "co.com.despegar.utils",
                    "co.com.despegar.sites",
                    "co.com.despegar.steps"})


    public class SearchRunner {}


