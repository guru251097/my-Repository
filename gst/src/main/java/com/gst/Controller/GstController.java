package com.gst.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gst.Entity.Gst;
import com.gst.Service.GstService;

@RestController
@RequestMapping(value="/gstController")
public class GstController {
	
	@Autowired 
	GstService gstservice;
	
	
	@PostMapping(value="/storeGst")
	public String storeGst(@RequestBody List<Gst> g) {
		return gstservice.storeGst(g);
	}
	
	@GetMapping(value="/getTaxByHsn/{hsn}")
	public int getTaxByHsn(@PathVariable int hsn) {
		return gstservice.getTaxByHsn(hsn);
		
	}
	
	
	

}