package com.struts.action;

import java.util.List;
import java.util.Map;

import com.biz.dao.SayZipDao;
import com.hibernate.entity.BlogUser;
import com.hibernate.entity.Say;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SayAction extends ActionSupport {

	private SayZipDao szd;
	
	
	public SayZipDao getSzd() {
		return szd;
	}


	public void setSzd(SayZipDao szd) {
		this.szd = szd;
	}


	public String showSay(){

		ActionContext ac = ActionContext.getContext();
		Map session = ac.getSession();
		
		BlogUser bu = (BlogUser) session.get("user");
		try {
			List<Say> sayList = szd.findAllSayByUserId((int) bu.getUserId());
			if(sayList!=null){
				session.put("fsay", sayList);
				return SUCCESS;
			}else{
				return ERROR;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}
