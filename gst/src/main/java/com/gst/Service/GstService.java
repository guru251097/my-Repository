package com.gst.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gst.Dao.GstDao;
import com.gst.Entity.Gst;

@Service
public class GstService {
	
	@Autowired
	GstDao gstdao;
	
	public String storeGst(List<Gst> g) {
		return gstdao.storeGst(g);
	}
	
	public int getTaxByHsn(int hsn) {
		return gstdao.getTaxByHsn(hsn);
	}

}
