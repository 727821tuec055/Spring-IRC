package com.example.project1.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project1.Model.CycleModel;
public interface CycleRepo extends JpaRepository<CycleModel, Integer> {
}
