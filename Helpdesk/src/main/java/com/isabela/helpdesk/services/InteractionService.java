package com.isabela.helpdesk.services;

import com.isabela.helpdesk.models.Interaction;

public interface InteractionService {
	
	public Interaction create(Interaction interaction, Long ticketId);
	public Boolean delete(Long id, Long ticketId);
}
