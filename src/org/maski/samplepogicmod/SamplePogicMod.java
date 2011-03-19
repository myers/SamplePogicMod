package org.maski.samplepogicmod;

import org.maski.pogic.PogicMod;

public class SamplePogicMod extends PogicMod {
	public String getVersion() {
		//System.out.println("bad stuff");
		return "1";
	}
	
	public void onEnable() {
		this.getLoader().addEntity("BabyCreeper", ClientEntityBabyCreeper.class, ModelBabyCreeper.class, RenderBabyCreeper.class);
	}
}
