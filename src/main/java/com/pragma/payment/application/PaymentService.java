package com.pragma.payment.application;

import com.pragma.payment.domain.PaymentEvent;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PaymentService {

    public Mono<PaymentEvent> handlePaymentEvent(PaymentEvent event) {
        // Lógica de negocio para manejar el evento de pago
        return Mono.just(event);
    }
}