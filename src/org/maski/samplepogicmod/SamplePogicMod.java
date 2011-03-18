package org.maski.samplepogicmod;

import java.io.File;

import org.maski.pogic.PogicMod;

public class SamplePogicMod extends PogicMod {
	public String getVersion() {
		//System.out.println("bad stuff");
		return "1";
	}
	
	public void onEnable() {
		this.getLoader().addEntity("Creeper2", EntityCreeper2.class, ModelCreeper2.class, RenderCreeper2.class);
	}
}
