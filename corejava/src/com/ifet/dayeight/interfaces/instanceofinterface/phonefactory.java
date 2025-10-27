package com.ifet.dayeight.interfaces.instanceofinterface;

public class phonefactory {
	public static Phone createPhone(String company) {
		if (company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if (company.equalsIgnoreCase("Jio"))
			return new jio();
		return null;
	}
}
