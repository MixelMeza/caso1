package com.example.syscaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.syscaso.entity.Rol;
@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{

}
