package com.example.project1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project1.Model.AModel;

public interface ARepo extends JpaRepository<AModel, Integer>
{

}
