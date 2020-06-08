package com.fabioadriano.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.fabioadriano.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}

