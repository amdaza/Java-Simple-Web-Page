package com.upspain.simplewebpage.services;

import java.util.ArrayList;
import java.util.List;

import com.upspain.simplewebpage.model.OptionsType;

public class ExampleService {
	public List getAvailableBrands(OptionsType type) {

		List brands = new ArrayList();

		if (type.equals(OptionsType.A)) {
			brands.add("Adrianna Vineyard");
			brands.add(("J. P. Chenet"));

		} else if (type.equals(OptionsType.B)) {
			brands.add("Glenfiddich");
			brands.add("Johnnie Walker");

		} else if (type.equals(OptionsType.C)) {
			brands.add("Corona");

		} else {
			brands.add("No Brand Available");
		}
		return brands;
	}
}
