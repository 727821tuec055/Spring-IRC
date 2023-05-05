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
    //Native Queries
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
     
	//JPQL Queries
	
	 // get by name using query 
	@Query("select c from CycleModel c where cname=?1")
	public List<CycleModel> getjpqlname(String name);
     
	// query for getting the details by name
	@Query("select c from CycleModel c where cid between ?1 and ?2")
	public List<CycleModel> getbtw(int start, int end);
     
	// delete by query using id
	@Modifying
	@Transactional
	@Query("delete from CycleModel where id=?1")
	public void deletejpqlid(int id);
	
	 //update the query
	@Modifying
	@Transactional
	@Query("update CycleModel set cnum=?1 where id=?2")

	public void updatejpql(String a, int b);
}

