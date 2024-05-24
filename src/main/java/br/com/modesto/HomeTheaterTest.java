package br.com.modesto;

import br.com.modesto.command.devices.CellingFan;
import br.com.modesto.command.devices.Hottube;
import br.com.modesto.command.devices.Light;
import br.com.modesto.command.devices.Stereo;
import br.com.modesto.command.devices.TV;
import br.com.modesto.facade.HomeTheaterFacade;

public class HomeTheaterTest {
	public static void main(String[] args) {
		CellingFan cellingFan = new CellingFan("Living room");
		Hottube hottube = new Hottube("Bathroom");
		Light light = new Light("Living room");
		Stereo stereo = new Stereo("Living room");
		TV tv = new TV("Living Room");
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(cellingFan, hottube, light, stereo, tv);
		homeTheaterFacade.watchAMovie();
		homeTheaterFacade.endAMovie();
	}
}
