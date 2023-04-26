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
import com.example.project1.Model.CycleModel;
@RestController
public class CycleController {
	@Autowired
	public CycleService cser;
	
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
}
