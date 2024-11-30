package com.rimmelasghar.boilerplate.springboot.utils;

import java.util.Locale;


public final class ProjectConstants {



	public static final String DEFAULT_ENCODING = "UTF-8";

	public static final Locale ENGLISH_LOCALE = new Locale.Builder().setLanguage("en").setRegion("USA").build();

	private ProjectConstants() {

		throw new UnsupportedOperationException();
	}

}
