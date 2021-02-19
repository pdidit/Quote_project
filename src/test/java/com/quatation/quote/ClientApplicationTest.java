package com.quatation.quote;

import com.quatation.quote.domain.Client;
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
public class ClientApplicationTest {
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
        baseURL = baseURL.concat(":").concat(port.toString()).concat("/clients");
    }

    @Test
    void shouldReturnAListClients(){
        Client[] clients = testRestTemplate.getForObject(baseURL, Client[].class);
        assertAll(
                () -> assertNotNull(clients)
        );
    }

    @Test
    void shouldReturnAClient(){
        String url = baseURL.concat("/1");
        Client client = testRestTemplate.getForObject(url, Client.class);
        assertAll(
                () -> assertNotNull(client),
                () -> {
                    assert client != null;
                    assertEquals(1, client.getID());
                    assertEquals("Padraic", client.getFirstName());
                    assertEquals("Meehan", client.getLastName());
                    assertEquals("H91YC2Y", client.getEircode());
                    assertNull(client.getFirstLineAddress());
                    assertNull(client.getSecondLineAddress());
                    assertNull(client.getThirdLineAddress());
                    assertEquals("0872741283", client.getPhoneNumber());
                    assertEquals("padraic.meehan@gmail.com", client.getEmail());
                }
        );
    }
}
