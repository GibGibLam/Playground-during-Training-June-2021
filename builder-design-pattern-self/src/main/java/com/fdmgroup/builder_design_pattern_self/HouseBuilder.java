package com.fdmgroup.builder_design_pattern_self;

public interface HouseBuilder {
	
	public void buildBasement();
	  
    public void buildStructure();
  
    public void buildRoof();
  
    public void buildInterior();
  
    //Get
    public House getHouse();

}
