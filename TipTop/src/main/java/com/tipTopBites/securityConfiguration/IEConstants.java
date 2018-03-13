package com.tipTopBites.securityConfiguration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IEConstants {
	
	public final static String IE = "IE";
	
	public final static Map<String, String> mapOfIEPostCodes = new HashMap<String, String>() {
	{
		put("NW1", "WestSide");
		put("NE2", "TerryLand");
		put("SW3", "Rahoon");
		put("SW4", "SaltHill");
		put("EC5", "Ballybane");
		put("SE6", "Renmore");
			
	
	}
};

public final static List<String> listOfIEPostCode = new ArrayList<>(mapOfIEPostCodes.keySet());
public final static List<String> listOfIEPostNames = new ArrayList<>(mapOfIEPostCodes.values());

}

