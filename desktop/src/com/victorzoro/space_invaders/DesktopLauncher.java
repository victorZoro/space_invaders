package com.victorzoro.space_invaders;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.victorzoro.space_invaders.MainGame;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("Space Invaders by Zoro");
		config.useVsync(true);
		config.setWindowedMode(800, 600);
		config.setResizable(false);
		new Lwjgl3Application(new MainGame(), config);
	}
}
