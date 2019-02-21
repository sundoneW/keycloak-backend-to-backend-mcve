/*
Source: https://stackoverflow.com/questions/46073485/keycloak-spring-security-client-credential-grant/46400975
By Eoin O'Meara (licensed under cc by-sa 3.0)
 */

package org.codingspiderfox.backendservice2.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.common.AuthenticationScheme;
import org.springframework.stereotype.Service;

@Service
public class KeycloakClientCredentialsConfig {

  @Value("${keycloak.realm}")
  private String realm;

  @Value("${keycloak.auth-server-url}")
  private String authServerUrl;

  @Value("${keycloak.resource}")
  private String clientId;

  @Value("${keycloak.credentials.secret}")
  private String clientSecret;

  @Bean
  public KeycloakClientCredentialsRestTemplate createRestTemplate() {
    return new KeycloakClientCredentialsRestTemplate(getClientCredentialsResourceDetails(),
        new DefaultOAuth2ClientContext());
  }

  private ClientCredentialsResourceDetails getClientCredentialsResourceDetails() {
    String accessTokenUri = String.format("%s/realms/%s/protocol/openid-connect/token",
        authServerUrl, realm);
    List<String> scopes = new ArrayList<>(0); // TODO introduce scopes

    ClientCredentialsResourceDetails clientCredentialsResourceDetails =
        new ClientCredentialsResourceDetails();

    clientCredentialsResourceDetails.setAccessTokenUri(accessTokenUri);
    clientCredentialsResourceDetails.setAuthenticationScheme(AuthenticationScheme.header);
    clientCredentialsResourceDetails.setClientId(clientId);
    clientCredentialsResourceDetails.setClientSecret(clientSecret);
    clientCredentialsResourceDetails.setScope(scopes);

    return clientCredentialsResourceDetails;
  }

}
