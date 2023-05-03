package com.example.project1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project1.Model.QModel;

public interface QRepo extends JpaRepository<QModel, Integer>
{

}
