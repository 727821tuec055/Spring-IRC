package com.example.JPA.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.JPA.Model.CarModel;
public interface CarRepo extends JpaRepository<CarModel ,Integer> {

}
