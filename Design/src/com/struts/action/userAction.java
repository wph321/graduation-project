package com.struts.action;

import java.util.Map;

import com.biz.dao.LoginZipDao;
import com.hibernate.entity.BlogUser;
import com.hibernate.entity.UserMessage;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts.bean.BlogLogin;
import com.struts.bean.zhuceUser;

/*
 * 登录注册处理方法，成功转移至首页，失败返回当前页。
 */

public class userAction extends ActionSupport {

	String message = "";//方法返回信息
	private LoginZipDao lzd; 
	private BlogUser bu;//用户数据库对应实体类
	private zhuceUser zhuce;
	
	public zhuceUser getZhuce() {
		return zhuce;
	}

	public void setZhuce(zhuceUser zhuce) {
		this.zhuce = zhuce;
	}

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
	
	public String zhuce(){
		
		System.out.println(zhuce.userName);
		if(zhuce.userName!=null
				&&zhuce.userNumber!=null
				&&zhuce.userHead!=null
				&&zhuce.userAge!=null
				&&zhuce.userPass!=null
				&&zhuce.userPhone!=null
				&&zhuce.userSex!=null){
			System.out.println("aaaa");
			BlogUser bu1 = new BlogUser(); 
			bu1.setUserName(zhuce.getUserName());
			bu1.setUserHeadImg(zhuce.getUserHead());
			bu1.setUserNumber(zhuce.getUserNumber());
			bu1.setUserPassword(zhuce.getUserPass());
			bu1.setUserOption1(null);
			bu1.setUserOption2(null);
			UserMessage um = new UserMessage();
			um.setMAge(Integer.parseInt(zhuce.getUserAge()));
			um.setMPhone(zhuce.getUserPhone());
			um.setMSex(zhuce.getUserSex());
			try {
				lzd.addUser(bu1, um);
				return SUCCESS;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return ERROR;
			}
		}else{
		return ERROR;
		}
		}
	
}
