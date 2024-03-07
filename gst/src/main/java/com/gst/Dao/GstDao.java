package com.gst.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gst.Entity.Gst;
import com.gst.Repository.GstRepository;

@Repository
public class GstDao {
	@Autowired
	GstRepository gstrepository;
	
	public String storeGst(List<Gst> g) {
		gstrepository.saveAll(g);
		return "success";
		
	}
	
	public int getTaxByHsn(int hsn) {
		return gstrepository.getTaxByHsn(hsn);
	}

}
