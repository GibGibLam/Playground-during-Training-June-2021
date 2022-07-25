package com.fdmgroup.builder_design_pattern_self;

public class IglooHouseBuilder implements HouseBuilder {

	private House house;
	  
	//Create a new House
    public IglooHouseBuilder() 
    {
        this.house = new House();
    }
  
    public void buildBasement() 
    {
        house.setBasement("Ice Bars");
    }
  
    public void buildStructure() 
    {
        house.setStructure("Ice Blocks");
    }
  
    public void buildInterior() 
    {
        house.setInterior("Ice Carvings");
    }
  
    public void buildRoof() 
    {
        house.setRoof("Ice Dome");
    }
  
    //Get
    public House getHouse() 
    {
        return this.house;
    }
}
