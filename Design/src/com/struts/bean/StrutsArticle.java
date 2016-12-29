package com.struts.bean;

public class StrutsArticle {

	public String title;
	
	public String context;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "articleComment [title=" + title + ", context=" + context + "]";
	}
	
}
