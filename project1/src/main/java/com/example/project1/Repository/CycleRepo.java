package com.example.project1.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.project1.Model.CycleModel;
public interface CycleRepo extends JpaRepository<CycleModel, Integer> 
{
    
    @Query(value="Select * from cycleshowroom",nativeQuery=true)
	public List<CycleModel> getAllData();
	
	@Query(value="Select * from cycleshowroom where cid=:id",nativeQuery=true)
	public List<CycleModel>bycname(@Param("id")int cid);

	@Query(value="Select * from cycleshowroom where cid between ?1 and ?2",nativeQuery=true)
	public List<CycleModel>startEnd(@Param("start")int start,@Param("end")int end);
}

