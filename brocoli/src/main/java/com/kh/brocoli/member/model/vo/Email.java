package com.kh.brocoli.member.model.vo;

public class Email {
	private String subject;
    private String content;
    private String receiver;
	
    
    
    public Email(String subject, String content, String receiver) {
		super();
		this.subject = subject;
		this.content = content;
		this.receiver = receiver;
	}
	public Email() {
		super();
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	@Override
	public String toString() {
		return "Email [subject=" + subject + ", content=" + content + ", receiver=" + receiver + "]";
	}


}
