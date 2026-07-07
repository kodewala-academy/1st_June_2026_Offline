package com.kodewala.strings10;

public class QueryConstructor {

	public static String QUERY = "select * from employee";

	public String constructQuery(String empId, int salary) {
		StringBuilder finalQuery = new StringBuilder(QUERY);
		if (empId != null) {
			finalQuery.append(" where empId =" + empId);
		} else if (salary > 0) {
			finalQuery.append(" where salary > " + salary);
		}
		finalQuery.append(";");
		return finalQuery.toString();
	}

}
