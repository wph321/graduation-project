package com.struts.action;

import java.util.Map;

import com.biz.dao.LoginZipDao;
import com.hibernate.entity.BlogUser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts.bean.BlogLogin;

/*
 * ��¼ע�ᴦ�������ɹ�ת������ҳ��ʧ�ܷ��ص�ǰҳ��
 */

public class userAction extends ActionSupport {

	String message = "";//����������Ϣ
	private LoginZipDao lzd; 
	private BlogUser bu;//�û����ݿ��Ӧʵ����
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

	
	private BlogLogin bl;//��¼�����Ӧʵ�������
	
	public BlogLogin getBl() {
		return bl;
	}

	public void setBl(BlogLogin bl) {
		this.bl = bl;
	}

	
	//��¼��֤
	public String login(){
		
		ActionContext ac = ActionContext.getContext();
		Map session = ac.getSession();
		if(bl.username!=null&&bl.pass!=null){//������Ϊ��
			
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
