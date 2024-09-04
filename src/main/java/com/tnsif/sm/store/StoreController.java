package com.tnsif.sm.store;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins="http://localhost:3000")
public class StoreController {
	
	
	@Autowired
	private StoreService service;
	
	//Restful API methods for Retrieval operations
	@GetMapping("/Stores")
	public List<Store>list()
	{
		return service.listAll();
	}
	//Retrieve by ID
	@GetMapping("/Stores/{storeid}")
	public ResponseEntity<Store> get(@PathVariable Integer storeid)
	{
		try
		{
			Store store=service.get(storeid);
			return new ResponseEntity<Store>(store,HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<Store>(HttpStatus.NOT_FOUND);
		}
	}
	//Create Operation
	@PostMapping("/Stores")
	public void add(@RequestBody Store store)
	{
		service.save(store);
		
	}
	//update Operation
	@PutMapping("/Stores/{storeid}")
	public ResponseEntity<?>update(@RequestBody Store store,@PathVariable Integer storeid) 
	{
		try
		{
			Store existStore=service.get(storeid);
			service.save(store);
			return new ResponseEntity<Store>(store,HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<Store>(HttpStatus.NOT_FOUND);
		}
	  
	}
	//Delete Operation
	@DeleteMapping("/Stores/{storeid}")
	public void delete(@PathVariable Integer storeid)
	{
		service.delete(storeid);
	}
	
		

}
