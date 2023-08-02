package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = { "*"  })
public class myController {
	
	@Autowired
	ProfileRepository profileRepo;
	
	
	@GetMapping("/getData")
	
    Response getData(){
		
		System.out.println("starting...");
 
		ResponseCode resCode = new ResponseCode(
				"220",
				"Success"				
				);
	 	
		 List<ProfileMode>  lstProfileMode = new ArrayList<ProfileMode>();
		
		 System.out.println("findAll");
		 lstProfileMode = profileRepo.findAll();
		 
		 Response reponse = new Response(resCode,  lstProfileMode);
		 System.out.println("end..."); 
		 return reponse;
		
	}

}
