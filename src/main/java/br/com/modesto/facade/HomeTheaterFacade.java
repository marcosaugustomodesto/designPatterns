package br.com.modesto.facade;

import br.com.modesto.command.devices.CellingFan;
import br.com.modesto.command.devices.Hottube;
import br.com.modesto.command.devices.Light;
import br.com.modesto.command.devices.Stereo;
import br.com.modesto.command.devices.TV;

public class HomeTheaterFacade {
	private final CellingFan cellingFan;
	private final Hottube hottube;
	private final Light light;
	private final Stereo stereo;
	private final TV tv;

	public HomeTheaterFacade(CellingFan cellingFan, Hottube hottube, Light light, Stereo stereo, TV tv) {
		super();
		this.cellingFan = cellingFan;
		this.hottube = hottube;
		this.light = light;
		this.stereo = stereo;
		this.tv = tv;
	}

	public void watchAMovie() {
		this.cellingFan.NORMAL();
		this.hottube.on();
		this.light.off();
		this.stereo.on();
		this.tv.on();
	}
	
	public void endAMovie() {
		this.cellingFan.OFF();
		this.hottube.off();
		this.light.on();
		this.stereo.off();
		this.tv.off();		
	}
}
