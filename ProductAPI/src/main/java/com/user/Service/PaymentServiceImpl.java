package com.user.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Exception.PaymentException;
import com.user.Model.Payment;
import com.user.Repo.PaymentRepo;


@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentRepo pRepo;

	@Override
	public Payment makePayment(Payment payment) throws PaymentException {
		// TODO Auto-generated method stub
		if(payment == null) {
			throw new PaymentException("Payment Failed...");
		}
		return pRepo.save(payment);
	}

	@Override
	public Payment deletePayment(Integer paymentId) throws PaymentException {
		// TODO Auto-generated method stub
		Payment payment = pRepo.findById(paymentId).orElseThrow(() -> new PaymentException("Payment Not available with ID : "+ paymentId));
		pRepo.deleteById(paymentId);
		return payment;
	}

}
