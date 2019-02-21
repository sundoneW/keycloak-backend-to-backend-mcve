/*
Source: https://stackoverflow.com/questions/46073485/keycloak-spring-security-client-credential-grant/46400975
By Eoin O'Meara (licensed under cc by-sa 3.0)
 */

package org.codingspiderfox.backendservice2.config;

import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;


public class KeycloakClientCredentialsRestTemplate extends OAuth2RestTemplate {

  public KeycloakClientCredentialsRestTemplate(OAuth2ProtectedResourceDetails resource,
                                               OAuth2ClientContext context) {
    super(resource, context);
  }

}
