package com.rest.jpa.oracle.util;

public class QueryUtil {

	public String createQueryForRange(int fromSalary, int toSalary) {
		String str = "select d from Demo d where d.monthlySalry between '"+fromSalary+"' AND '"+toSalary+"'";
		return str;
	}
	
	public String createQueryForAll() {
		String str = "select d from Demo d";
		return str;
	}

	public String createQueryForId(int id) {
		String str = "select d from Demo d where d.id = :id";
		return str;
	}
}
