package com.struts.action;

import java.util.Map;

import com.biz.dao.LoginZipDao;
import com.hibernate.entity.BlogUser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts.bean.BlogLogin;

/*
 * 登录注册处理方法，成功转移至首页，失败返回当前页。
 */

public class userAction extends ActionSupport {

	String message = "";//方法返回信息
	private LoginZipDao lzd; 
	private BlogUser bu;//用户数据库对应实体类
	public BlogUser getBu() {
		return bu;
	}

	public void setBu(BlogUser bu) {
		this.bu = bu;
	}

	public LoginZipDao getLzd() {
		return lzd;
	}

	public void setLzd(LoginZipDao lzd) {
		this.lzd = lzd;
	}

	
	private BlogLogin bl;//登录界面对应实体类对象
	
	public BlogLogin getBl() {
		return bl;
	}

	public void setBl(BlogLogin bl) {
		this.bl = bl;
	}

	
	//登录验证
	public String login(){
		
		ActionContext ac = ActionContext.getContext();
		Map session = ac.getSession();
		if(bl.username!=null&&bl.pass!=null){//参数不为空
			
				try {
					bu = lzd.findBlogUser(bl.username);
					if(bl.username.equals(bu.getUserNumber())&&bl.pass.equals(bu.getUserPassword())){
						
						session.put("user", bu);
						System.out.println(session.get("user"));
						return SUCCESS;
						
					}else{
						return ERROR;
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}else{
			message="kong";
			return message;
		}
		
		return null;
	}
	
	
	
}
