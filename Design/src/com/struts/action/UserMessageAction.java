package com.struts.action;

import java.util.Map;

import com.biz.dao.UserMessageZipDao;
import com.hibernate.entity.BlogUser;
import com.hibernate.entity.UserMessage;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts.bean.UpdateUser;

public class UserMessageAction extends ActionSupport {

	private UserMessageZipDao umzd;
	private UpdateUser updateuser;
	private UserMessage usermessage;
	private BlogUser bloguser;
	public UserMessage getUsermessage() {
		return usermessage;
	}

	public void setUsermessage(UserMessage usermessage) {
		this.usermessage = usermessage;
	}

	public UpdateUser getUpdateuser() {
		return updateuser;
	}

	public void setUpdateuser(UpdateUser updateuser) {
		this.updateuser = updateuser;
	}

	public UserMessageZipDao getUmzd() {
		return umzd;
	}

	public void setUmzd(UserMessageZipDao umzd) {
		this.umzd = umzd;
	}

	//显示用户信息
	public String showUserMessage(){
		ActionContext ac = ActionContext.getContext();
		Map session = ac.getSession();
		BlogUser bu = (BlogUser) session.get("user");
		Integer userid = (int) bu.getUserId();
		try {
			UserMessage um = umzd.findMessage(userid);
			if(um!=null){
				return SUCCESS;
			}else{
				return ERROR;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
	
	public String updateuserMessage(){
		if(updateuser!=null){
			ActionContext ac = ActionContext.getContext();
			Map session = ac.getSession();
			//获取登陆的 session
			bloguser = (BlogUser) session.get("user");
			//重设昵称和头像
			bloguser.setUserName(updateuser.username);
			bloguser.setUserHeadImg(updateuser.userhead);
			
			usermessage.setMPhone(updateuser.useriphone);
			usermessage.setMAge(Integer.parseInt(updateuser.userage));
			usermessage.setMSex(updateuser.usersex);
			
			try {
				umzd.updateBlogUser(bloguser);
				umzd.updateUserMessage(usermessage);                                                     
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		  
		return null;
		
	}
	
}
