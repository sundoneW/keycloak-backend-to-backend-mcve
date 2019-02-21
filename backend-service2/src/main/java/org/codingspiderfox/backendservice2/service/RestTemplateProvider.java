package org.codingspiderfox.backendservice2.service;

import org.codingspiderfox.backendservice2.config.KeycloakClientCredentialsRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateProvider {

  @Autowired
  private KeycloakClientCredentialsRestTemplate keycloakClientCredentialsRestTemplate;

  public RestTemplate getDefaultRestTemplate() {

    return getSecureRestTemplate();
  }

  private RestTemplate getRestTemplate() {

    return new RestTemplate();
  }

  private RestTemplate getSecureRestTemplate() {

    return keycloakClientCredentialsRestTemplate;
  }

}
