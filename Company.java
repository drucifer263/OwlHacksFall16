/*
Simple Company Object for modular and additional functionality
Invest app
*/


import java.io.*;
import java.util.*;

public class Company
{
	private String companyName = "null";
	private double perShare = 0.0;

	public Company()
	{}

	public Company(String companyName, double perShare)
	{
		this.companyName = companyName;
		this.perShare = perShare;

	}

	public String getCompanyName()
	{
		return companyName;
	}

	public void setCompanyName(String companyName)
	{
				this.companyName = companyName;
	}

	public double getPerShare()
	{
			return perShare;
	}

	public void setPerShare(double perShare)
		{
			this.perShare = perShare;
	}


	public String toString()
	{
		return "Company Name: " + companyName + "\nShare: " + perShare;
	}
}