package com.netcracker.customtags;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyDate extends TagSupport {

	private static final long serialVersionUID = 1L;
	
	@Override
	public int doStartTag() throws JspException {
		JspWriter out=pageContext.getOut();
		LocalDateTime ldt=LocalDateTime.now();
		try {
			out.println(ldt.getDayOfMonth()+":"+ldt.getMonthValue()+":"+ldt.getYear()
			+"\t"+ldt.getHour()+":"+ldt.getMinute()+":"+ldt.getSecond());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EVAL_BODY_INCLUDE;
		
	}
	
	
	
	
	

}
