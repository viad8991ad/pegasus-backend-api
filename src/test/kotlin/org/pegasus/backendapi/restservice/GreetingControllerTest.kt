package org.pegasus.backendapi.restservice

import org.pegasus.backendapi.ApplicationTest
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@ApplicationTest
class GreetingControllerTest(
    private val restTemplate: TestRestTemplate,
) {

    @Test
    fun greeting() {
        val response = restTemplate.getForEntity("/greeting?name=user", String::class.java)
        Assertions.assertThat(response.statusCode).isEqualTo(HttpStatus.OK)
        Assertions.assertThat(response.body).isEqualTo("Hello User!")
    }
}
