package com.Bean_Resolution_POC;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("upi")
public class UpiPayment implements PaymentService {

	@Override
	public String pay() {
		return "Paid Using UPI";
	}

}
