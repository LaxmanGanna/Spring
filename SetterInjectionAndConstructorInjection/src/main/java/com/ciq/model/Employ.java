package com.ciq.model;

public class Employ {

	private int eid;
	private String name;
	private double salary;
//	public Employ() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	public Employ(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
//	/**
//	 * @return the eid
//	 */
//	public int getEid() {
//		return eid;
//	}
//	/**
//	 * @param eid the eid to set
//	 */
//	public void setEid(int eid) {
//		this.eid = eid;
//	}
//	/**
//	 * @return the name
//	 */
//	public String getName() {
//		return name;
//	}
//	/**
//	 * @param name the name to set
//	 */
//	public void setName(String name) {
//		this.name = name;
//	}
//	/**
//	 * @return the salary
//	 */
//	public double getSalary() {
//		return salary;
//	}
//	/**
//	 * @param salary the salary to set
//	 */
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
	@Override
	public String toString() {
		return "Employ [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
