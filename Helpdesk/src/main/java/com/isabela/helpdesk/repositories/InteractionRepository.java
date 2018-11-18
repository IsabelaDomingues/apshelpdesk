package com.isabela.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isabela.helpdesk.models.Interaction;

public interface InteractionRepository extends JpaRepository<Interaction, Long> {

}
