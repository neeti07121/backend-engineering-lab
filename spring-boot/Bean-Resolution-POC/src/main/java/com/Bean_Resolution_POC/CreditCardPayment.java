package com.Bean_Resolution_POC;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("credit") // agr Qualifer inject nahi kiye toh class level pe @Qualifier use karna beasar hain.
public class CreditCardPayment implements PaymentService {
	@Override
	public String pay() {
		return "Paid using Credit Card";
	}
}
