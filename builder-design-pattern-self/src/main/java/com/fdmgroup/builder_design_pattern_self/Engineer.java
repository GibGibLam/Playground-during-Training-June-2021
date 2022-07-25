package com.fdmgroup.builder_design_pattern_self;

public class Engineer {

	private HouseBuilder houseBuilder;
	  
	//Call the housebuilder interface.
    public Engineer(HouseBuilder houseBuilder)
    {
        this.houseBuilder = houseBuilder;
    }
  
    //Get
    public House getHouse()
    {
        return this.houseBuilder.getHouse();
    }
  
    //To build the house
    public void constructHouse()
    {
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
    }
}
