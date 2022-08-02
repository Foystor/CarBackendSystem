package com.udacity.pricing;

import com.udacity.pricing.entity.Price;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PricingControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    // Check whether the application appropriately generates a price for a given vehicle ID
    @Test
    public void getPriceByVehicleId() {
        ResponseEntity<Price> response =
                restTemplate.getForEntity("http://localhost:" + port + "/prices/1", Price.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }
}
