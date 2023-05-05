package com.example.project1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.project1.Model.QModel;

public interface QRepo extends JpaRepository<QModel, Integer>
{
@Query(value="select * from QModel",nativeQuery=true)
public List<QModel>getalldata();


}
