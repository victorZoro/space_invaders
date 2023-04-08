package com.victorzoro.space_invaders;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.victorzoro.space_invaders.screens.GameScreen;
import com.victorzoro.space_invaders.screens.ScreenManager;


public class MainGame extends ApplicationAdapter {
	SpriteBatch batch;

	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		ScreenManager.setScreen(new GameScreen());
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		if(!ScreenManager.isScreenNull()) {
			ScreenManager.getCurrentScreen().update();
			ScreenManager.getCurrentScreen().render(batch);
		}
	}

	@Override
	public void resize(int width, int height) {
		if(!ScreenManager.isScreenNull()) {
			ScreenManager.getCurrentScreen().resize(width, height);
		}
	}

	@Override
	public void pause() {
		if(!ScreenManager.isScreenNull()) {
			ScreenManager.getCurrentScreen().pause();
		}
	}

	@Override
	public void resume() {
		if(!ScreenManager.isScreenNull()) {
			ScreenManager.getCurrentScreen().resume();
		}
	}
	
	@Override
	public void dispose () {
		if(!ScreenManager.isScreenNull()) {
			ScreenManager.getCurrentScreen().dispose();
		}
		batch.dispose();
	}
}
