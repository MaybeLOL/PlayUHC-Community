package com.gmail.val59000mc.playuhc.utils;

import java.util.Arrays;

public class CompareUtils {
	
	public static boolean equalsToAny(Object comparable, Object... compareList){
		return Arrays.asList(compareList).contains(comparable);
	}
}
