package com.user.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.Exception.PaymentException;
import com.user.Model.Payment;
import com.user.Repo.PaymentRepo;
import com.user.Service.PaymentService;


@RestController
public class PaymentController {

	@Autowired
	PaymentService pService;
	
	@PostMapping("/makePayment")
	public Payment placePayment(@RequestBody Payment payment) throws PaymentException {
		
		return pService.makePayment(payment);
	}
	
	@DeleteMapping("/removePayment/{paymentID}")
	public Payment removePayment(@PathVariable Integer paymentID) throws PaymentException {
		
		
		return pService.deletePayment(paymentID);
	}
	
}
