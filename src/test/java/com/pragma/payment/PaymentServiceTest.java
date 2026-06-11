package com.pragma.payment;

import com.pragma.payment.application.PaymentService;
import com.pragma.payment.domain.PaymentEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
class PaymentServiceTest {

    @Autowired
    private PaymentService paymentService;

    @Test
    void handlePaymentEvent() {
        PaymentEvent event = new PaymentEvent();
        event.setId("1");
        event.setType("payment");
        event.setStatus("pending");

        Mono<PaymentEvent> result = paymentService.handlePaymentEvent(event);

        StepVerifier.create(result)
               .expectNextMatches(e -> e.getId().equals("1"))
               .verifyComplete();
    }
}