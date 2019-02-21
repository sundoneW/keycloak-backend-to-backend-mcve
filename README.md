For stackoverflow

Reproduce:

1.) Run keycloak (docker-compose file in docker/ directory).

2.) Import keycloak config (config/keycloak).

3.) Check backend-service1/main/resources/application.properties contains the correct public key from keycloak.

4.) Run backend-service1.

5.) Check backend-service2/main/resources/application.properties contains the correct public key from keycloak and the correct client secret.

6.) Run backend-service2.
