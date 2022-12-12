package com.user.Service;

import com.user.Exception.PaymentException;
import com.user.Model.Payment;

public interface PaymentService {

	
	public Payment makePayment(Payment payment) throws PaymentException;
	
	public Payment deletePayment(Integer paymentId) throws PaymentException;
}
