package com.quatation.quote;

import com.quatation.quote.domain.Job;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JobApplicationTest {
    @LocalServerPort
    private Integer port;

    private String baseURL = "http://localhost";

    private static RestTemplate testRestTemplate = null;

    @BeforeAll
    static void init() {
        testRestTemplate = new RestTemplate();
        testRestTemplate.setErrorHandler(new DefaultResponseErrorHandler() {
            @Override
            public boolean hasError(HttpStatus statusCode) {
                return false;
            }
        });
    }

    @BeforeEach
    void setup(){
        baseURL = baseURL.concat(":").concat(port.toString()).concat("/jobs");
    }

    @Test
    void shouldReturnAListClients(){
        Job[] jobs = testRestTemplate.getForObject(baseURL, Job[].class);
        assertAll(
                () -> assertNotNull(jobs)
        );
    }

    @Test
    void shouldReturnAClient(){
        String url = baseURL.concat("/1");
        Job job = testRestTemplate.getForObject(url, Job.class);
        assertAll(
                () -> assertNotNull(job),
                () -> {
                    assert job != null;
                    assertEquals("Roofing", job.getJobTitle());
                    assertEquals("Placing titles or slates of your choicing on the roof", job.getDescription());
                    assertEquals(500.00, job.getJobPrice());
                    assertEquals(1, job.getID());
                }
        );
    }
}
