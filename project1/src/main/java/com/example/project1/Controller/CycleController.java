package com.example.project1.Controller;

import java.util.List;
import java.util.Map;
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



import com.example.project1.Model.CycleModel;
import com.example.project1.Repository.CycleRepo;
@RestController
public class CycleController {
	@Autowired
	public CycleService cser;
	//login
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> logindata)
	{
		String username=logindata.get("username");
		String password=logindata.get("password");
		String result=cser.checklogin(username, password);
		return result;
		
	}
	
	//post the details
	
	@PostMapping("/Cycling")
	public CycleModel addDetails(@RequestBody CycleModel cr)
	{
		return cser.saveinfo(cr);
	}
	//delete the details
	
	@DeleteMapping("/Cycling/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		cser.deletedetails(id);
		return "Deletion is Successful";
	}
	//get the details
	
	@GetMapping("/Cycling/{id}")
	public Optional<CycleModel> getdetails(@PathVariable ("id")int id)
	{
		return cser.getdetails(id);
	}
    
	//update the details
	@PutMapping("/update")
	
		public CycleModel updatedetails(@RequestBody CycleModel id)
		{
			return cser.updatedetails(id);
		}
	//sort by ascending order
	@GetMapping("sortDesc/{cname}")
	public List<CycleModel>sortPerson(@PathVariable("cname") String cname)
	{
		return cser.sortDesc(cname);
	}
	//sort by descending order
	@GetMapping("sortDescs/{cname}")
	public List<CycleModel>sortPersons(@PathVariable("cname") String cname)
	{
		return cser.sortDescs(cname);
	}
	//pagination and sorting
	@GetMapping("/paginationsorting/{png}/{pgs}/{cname}")
	public List<CycleModel>paginationSorting(@PathVariable("png")int png,@PathVariable("pgs")int pgs,@PathVariable("cname")String cname)
	{
		return cser.paginationAndSorting(png,pgs,cname);
	}
	//pagination
	@GetMapping("/pagination/{png}/{pgs}")
	public List<CycleModel> paginationData(@PathVariable("png")int png,@PathVariable("pgs")int pgs)
	{
		return cser.paginationData(png, pgs);
	}
	@Autowired
	public CycleRepo csr;
	
	@GetMapping("/Cycles")
	public List<CycleModel> getD()
	{
		return csr.getAllData();
	}
	@GetMapping("/byName/{id}")
	public List<CycleModel> getName(@PathVariable("id")int cid)
	{
		return csr.bycname(cid);
	}
	@GetMapping("/startend/{start}/{end}")
	public List<CycleModel> statendId(@PathVariable("start")int start,@PathVariable("end")int end)
	{
		return csr.startEnd(start,end);
	}
	
	
}
