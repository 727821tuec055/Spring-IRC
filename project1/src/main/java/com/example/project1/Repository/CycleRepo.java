package com.example.project1.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.project1.Model.CycleModel;

import jakarta.transaction.Transactional;
public interface CycleRepo extends JpaRepository<CycleModel, Integer> 
{
    
    @Query(value="Select * from cycleshowroom",nativeQuery=true)
	public List<CycleModel> getAllData();
	
	@Query(value="Select * from cycleshowroom where cid=:id",nativeQuery=true)
	public List<CycleModel>bycname(@Param("id")int cid);

	@Query(value="Select * from cycleshowroom where cid between ?1 and ?2",nativeQuery=true)
	public List<CycleModel>startEnd(@Param("start")int start,@Param("end")int end);
    
	@Modifying
	@Transactional
	@Query(value="delete from cycleshowroom where cid=?1 and cname=?2",nativeQuery=true)
	Integer deleteId(@Param("id")int cid,@Param("name")String cname);
     
	@Modifying
	@Transactional
	@Query(value="update cycleshowroom set cid=:id where cname=:name",nativeQuery=true)
	public void updateByQuery(@Param("id")int id,@Param("name") String name);
}

