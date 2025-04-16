package org.example.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

/*
    oauth2:
        providers:
            google:
                client-id : sample
                client-secret: <>
                redirect-uri: <>
            github:
                client-id : sample
                client-secret: <>
                redirect-uri: <>
*/

@Configuration
@ConfigurationProperties(prefix = "oauth2")
class OAuth2Config {
    val providers: MutableMap<String, OAuth2ProvidersValues> = mutableMapOf()
}


data class OAuth2ProvidersValues(
    val clientId: String,
    val clientSecret: String,
    val redirectUrl: String
)