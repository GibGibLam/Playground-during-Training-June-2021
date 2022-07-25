package com.fdmgroup.builder_design_pattern_self;

public class House implements IHousePlan {

	private String basement;
	private String structure;
	private String roof;
	private String interior;

	@Override
	public void setBasement(String basement) {
		this.basement = basement;

	}

	@Override
	public void setStructure(String structure) {
		this.structure = structure;

	}

	@Override
	public void setRoof(String roof) {
		this.roof = roof;

	}

	@Override
	public void setInterior(String interior) {
		this.interior = interior;

	}

}
