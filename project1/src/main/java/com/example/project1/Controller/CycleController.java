package com.example.project1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.Service.CycleService;

import io.swagger.v3.oas.annotations.tags.Tag;

import com.example.project1.Model.CycleModel;
import com.example.project1.Repository.CycleRepo;
@RestController
public class CycleController {
	@Autowired
	public CycleService cser;
	
	
	//post the details
	@Tag(name="Post",description="Posting the details")
	@PostMapping("/Cycling")
	public CycleModel addDetails(@RequestBody CycleModel cr)
	{
		return cser.saveinfo(cr);
	}
	//delete the details
	@Tag(name="Delete",description="Deleting the details")
	@DeleteMapping("/Cycling/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		cser.deletedetails(id);
		return "Deletion is Successful";
	}
	//get the details
	@Tag(name="Get",description="Getting the details")
	@GetMapping("/Cycling/{id}")
	public Optional<CycleModel> getdetails(@PathVariable ("id")int id)
	{
		return cser.getdetails(id);
	}
    
	//update the details
	@Tag(name="Update",description="Updating the details")
	@PutMapping("/update")
	
		public CycleModel updatedetails(@RequestBody CycleModel id)
		{
			return cser.updatedetails(id);
		}
	
	//sort by ascending order
	@Tag(name="Ascending Order",description="Sorting the given details in ascending order")
	@GetMapping("sortDesc/{cname}")
	public List<CycleModel>sortPerson(@PathVariable("cname") String cname)
	{
		return cser.sortDesc(cname);
	}
	
	//sort by descending order
	@Tag(name="Descending Order",description="Sorting the given details in Descending order")

	@GetMapping("sortDescs/{cname}")
	public List<CycleModel>sortPersons(@PathVariable("cname") String cname)
	{
		return cser.sortDescs(cname);
	}
	
	//pagination and sorting
	@Tag(name="pagination and sorting",description="Pagination and sorting of data")

	@GetMapping("/paginationsorting/{png}/{pgs}/{cname}")
	public List<CycleModel>paginationSorting(@PathVariable("png")int png,@PathVariable("pgs")int pgs,@PathVariable("cname")String cname)
	{
		return cser.paginationAndSorting(png,pgs,cname);
	}
	
	//pagination
	@Tag(name="Pagination",description="Pagination of data")

	@GetMapping("/pagination/{png}/{pgs}")
	public List<CycleModel> paginationData(@PathVariable("png")int png,@PathVariable("pgs")int pgs)
	{
		return cser.paginationData(png, pgs);
	}
	
	@Autowired
	public CycleRepo csr;
	
	@Tag(name="Get Data",description="Getting all the details")
	@GetMapping("/Cycles")

	public List<CycleModel> getD()
	{
		return csr.getAllData();
	}
	
	@Tag(name="Get Detail by name",description="Getting details by name ")
	@GetMapping("/byName/{id}")

	public List<CycleModel> getName(@PathVariable("id")int cid)
	{
		return csr.bycname(cid);
	}
	
	@Tag(name="Get Details",description="Getting details between two id")
	@GetMapping("/startend/{start}/{end}")

	public List<CycleModel> statendId(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return csr.startEnd(start,end);
	}
	
	@Tag(name="Delete by id",description="Deleting a specific data by id")
	@DeleteMapping("/deletebyid/{id}/{name}")

		public String deletePerson(@PathVariable("id")int id,@PathVariable("name") String name)
		{
			csr.deleteId(id,name);
			return "deleted";
		}
	
	@Tag(name="Updatequery",description="Updating the details by id and name")
	@PutMapping("/updatequery/{id}/{name}")

	public void updateByQuery(@PathVariable("id")int id,@PathVariable("name")String name)
	{
	csr.updateByQuery(id,name);	
	}
	

    // get by name using query
	
	@Tag(name="Getdetail by query",description="Getting details by name using query")
    @GetMapping("/jpqlget/{name}")
     public List<CycleModel>getdetailname(@PathVariable("name")String name)
     {
    	 return csr.getjpqlname(name);
    	 
     }
	
     //query for getting the details by name
	@Tag(name="Getdetail btw id by query",description="Getting the details by name using query")
     @GetMapping("/getbtw/{start}/{end}")
     public List<CycleModel>getbtw(@PathVariable("start")int start,@PathVariable("end")int end)
     {
    	 return csr.getbtw(start,end);
     }
	
     // 
	@Tag(name="Deletedetail by query",description="Deleting the details by id using query")
     @DeleteMapping("/deletejpql/{id}")
     public String deletejpqlid(@PathVariable("id")int id)
     {
    	 csr.deletejpqlid(id);
    	 return "Deleted Successfully using jpql query !";
    	 
     }
     
     //update the query
	@Tag(name="Updatedetail by query",description="Updating the Details using query")
     @PutMapping("/updatejpql/{a}/{b}")
     public void updatejpql(@PathVariable("a")String a,@PathVariable("b")int b)
     {
    	 csr.updatejpql(a,b);
     }
          
}
	
