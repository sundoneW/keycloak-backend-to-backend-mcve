For stackoverflow

Reproduce:

1.) Run keycloak (docker-compose file in docker/ directory).

2.) Got to http://localhost:8080 in the browser. Login: admin/admin

3.) Create a new realm called "sampleapp".

4.) Import keycloak config (config/keycloak).

5.) Check backend-service1/main/resources/application.properties contains the correct public key from keycloak (obtain it from Realm Settings -> Keys -> Public Key).

6.) Run backend-service1.

7.) Check backend-service2/main/resources/application.properties contains the correct public key from keycloak and the correct client secret.

8.) Inside keycloak admin panel, go to clients -> backend-service2 -> Credentials Tab. Click Regenerate secret. Copy the secret and place it in backend-service2/main/resources/application.properties.

9.) Run backend-service2.
