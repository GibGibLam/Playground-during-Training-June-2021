package com.fdmgroup.builder_design_pattern_self;

public class BuilderApp {
	public static void main(String[] args) {
		HouseBuilder iglooBuilder = new IglooHouseBuilder();
		Engineer engineer = new Engineer(iglooBuilder);

		engineer.constructHouse();

		House house = engineer.getHouse();

		System.out.println("Builder constructed");
	}

}
