package com.collection;



public class StudentComparabble implements Comparable<StudentComparabble> {

	private int id ;
	private String name;
	private String add;
	private double per;
	private int age;
	
	public StudentComparabble(int id, String name, String add, double per, int age) {
		this.id = id;
		this.name = name;
		this.add = add;
		this.per = per;
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentComparator [id=" + id + ", name=" + name + ", add=" + add + ", per=" + per + ", age=" + age
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(StudentComparabble o) 
	{
		if(age == o.age)
		{
			return 0;
		}
		else if( age > o.age)
		{
			return 1 ;
		}
		else
		{
			return -1;
			
		}
		
	}


}
