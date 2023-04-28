package com.example.project1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.project1.Model.CycleModel;
import com.example.project1.Repository.CycleRepo;


@Service
public class CycleService {
	@Autowired
	public CycleRepo crepo;

	public CycleModel saveinfo(CycleModel cr) {
		// TODO Auto-generated method stub
		return crepo.save(cr);
	}

	public void deletedetails(int id) {
		// TODO Auto-generated method stub
		crepo.deleteById(id);
	}

	public java.util.Optional<CycleModel> getdetails(int id) {
	return crepo.findById(id);
	}

	public CycleModel updatedetails(CycleModel id) {
		// TODO Auto-generated method stub
		return crepo.saveAndFlush(id);
	}
    public List<CycleModel> sortDesc(String cname)
    {
    	return crepo.findAll(Sort.by(cname).ascending());
    }
    public List<CycleModel> sortDescs(String cname)
    {
    	return crepo.findAll(Sort.by(cname).descending());
    }

	public List<CycleModel> paginationAndSorting(int png, int pgs, String cname) {
		// TODO Auto-generated method stub
		Page<CycleModel>p=crepo.findAll(PageRequest.of(png,pgs,Sort.by(cname).descending()));
		return p.getContent();
	}

	public List<CycleModel> paginationData(int png, int pgs) {
		// TODO Auto-generated method stub
		Page<CycleModel>p=crepo.findAll(PageRequest.of(png,pgs));
		return p.getContent();
	}
 public String checklogin(String username,String password)
 {
	 CycleModel user=crepo.findByUsername(username);
			 if(user==null)
			 {
				 return "No User Found";
			 }
			 else
			 {
				 if(user.getPassword().equals(password))
				 {
					 return "Login Successfully";
				 }
				 else
				 {
					 return "Login Failed";
				 }
			 }
 }
	public CycleModel adduser(CycleModel cycle)
	{
		return crepo.save(cycle);
	}
	public List<CycleModel>getuser()
	{
		return crepo.findAll();
	}
}
