package com.maven.epam_junit;

public class ModifyString {
		public String changeString(String str) {
				
				char firstChar = str.charAt(0);
				char secondChar = str.charAt(1);
				
				StringBuffer result = new StringBuffer();
				
				if(firstChar != 'A' && secondChar != 'A') 
					result.append(str);
				
				else if(firstChar == 'A') {
					if(secondChar != 'A')
						result.append(str.substring(1,str.length()));
					else
						result.append(str.substring(2,str.length()));
				}
					
				else {
					result.append(firstChar);
					for(int i=2;i<str.length();i++) 
						result.append(str.charAt(i));
				}
				
				return result.toString();
			}

}
