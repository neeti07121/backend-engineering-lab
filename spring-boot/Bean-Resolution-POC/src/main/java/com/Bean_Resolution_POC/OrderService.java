package com.Bean_Resolution_POC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

	@Autowired
	@Qualifier("upi")
	private PaymentService paymentService;

	public void checkout() {
		System.out.println(paymentService.pay());
	}

}
