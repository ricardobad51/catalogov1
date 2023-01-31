package com.belembr.catalogov1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.belembr.catalogov1.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
