package org.step;

import org.base.BaseClasscucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClasscucumber   {
	@Before
	public void beforeeachscenario() {
		browserconfigchrome();
		openurl("https://adactinhotelapp.com/");
		maximizewindow();


	}
	@After
	public void aftereachscenario() {
		closebrowser();
	}


































}
