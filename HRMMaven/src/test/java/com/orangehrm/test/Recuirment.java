package com.orangehrm.test;

import org.testng.annotations.Test;

import com.orangehrm.generic.Base;
import com.orangehrm.pom.Candidate;
import com.orangehrm.pom.Homeorangehrm;
import com.orangehrm.pom.Recruit;


public class Recuirment extends Base{

	@Test
	public void testcandidate()
	{
		Homeorangehrm h=new Homeorangehrm(driver);
		h.setrecuirment(driver);
		Recruit r=new Recruit(driver);
		r.setcandidate();
		Candidate c=new Candidate(driver);
		c.setadd();
		c.getFirst_name("hemanth");
		c.getMiddle_name("kumar");
		c.getLast_name("Narisetty");
		c.getEmail("nhemanth9052@gmail.com");
		c.getContact("9052384943");
		c.getJobvacancy();
		c.getSelectClass("Software Engineer");
		c.getFile();
		c.setDate();
		c.setMonth();
		c.setYear();
		c.setdayno();
		c.setSaveBTN();
	}
}
