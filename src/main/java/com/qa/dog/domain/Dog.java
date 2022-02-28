package com.qa.dog.domain;

public class Dog {

	private Integer id;
	private String name;
	private String species;
	private Integer age;

	public Dog() {
		super();
	}

	public Dog(Integer id, String name, String species, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.species = species;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", species=" + species + ", age=" + age + "]";
	}

}
