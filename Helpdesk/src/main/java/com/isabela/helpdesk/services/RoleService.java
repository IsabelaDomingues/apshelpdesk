package com.isabela.helpdesk.services;

import java.util.List;

import com.isabela.helpdesk.models.Role;

public interface RoleService {

	public List<Role> findAll();
	public Role create(Role role);
	public Boolean delete(Long id);
	public Role findByName(String name);
}
