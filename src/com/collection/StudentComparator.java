package com.collection;

import java.util.Comparator;

public class StudentComparator {
	private int id ;
	private String name;
	private String add;
	private double per;
	private int age;
	public StudentComparator(int id, String name, String add, double per, int age) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.per = per;
		this.age = age;
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
	public String toString() {
		return "StudentComparator [id=" + id + ", name=" + name + ", add=" + add + ", per=" + per + ", age=" + age
				+ "]";
	}
	
}


class AgeSorting implements Comparator<StudentComparator>{

	@Override
	public int compare(StudentComparator o1, StudentComparator o2)
	{
		if(o1.getAge() == o2.getAge())
		{
			return 0;
		}
		else if(o1.getAge() > o2.getAge())
		{
			return 1;
				
		}
		else
		{
			return -1;
		}
		
	}

}
	
class NameSorting implements Comparator<StudentComparator>
{

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		return o1.getName().compareTo(o2.getName()); 
	}
	
}

class PerSorting implements Comparator<StudentComparator>
{

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		if(o1.getPer() == o2.getPer())
		{
			return 0;
		}
		else if(o1.getPer() > o2.getPer())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}