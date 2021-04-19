package model;
/**
*This class allows the creation of an ingredient<br>
*@author DanielRamirez<br>
*@author AmilcarRodriguez<br>
*/

public class Ingredient {
	
	//Attributes
	private String name;//This attribute contains the name of the ingredient
	private boolean state;//This attribute contains the state of the ingredient
	
//**************************************************************************
	 /**
		*Ingredient class construct method<br>
		*<b>pre:</b><br>
		*<b>post:</b><br>
		
		
		*@param name Is a string with the ingredient name<br>
		*@param state Is a boolean with the ingredient state<br>
		*/
	public Ingredient(String name, boolean state) {
		this.name = name;
		this.state = state;
	}//End Ingredient constructor

//***********************************Setters & Getters**********************************

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}     
}//End of Ingredient class
