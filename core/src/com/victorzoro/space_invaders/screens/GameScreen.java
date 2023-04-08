package com.victorzoro.space_invaders.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.victorzoro.space_invaders.entities.EntityManager;

public class GameScreen extends Screen {

    private OrthographicCamera camera;
    private Viewport viewport;
    private EntityManager entityManager;

    @Override
    public void create() { 
        camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        viewport = new FitViewport(800, 600, camera);
        viewport.apply();
        entityManager = new EntityManager(10);
        System.out.println("Created!");
        System.out.println(Gdx.graphics.getWidth());
    }

    @Override
    public void update() {
        camera.update();
        entityManager.update();
    }

    @Override
    public void render(SpriteBatch batch) {
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        entityManager.render(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
        camera.setToOrtho(false, width, height);
        System.out.println("Screen resized!");
    }
    
    @Override
    public void pause() {
        System.out.println("Game paused!");
    }
    
    @Override
    public void resume() {
        System.out.println("Game resumed!");
    }
    
    @Override
    public void dispose() {
        System.out.println("Disposing...");
    }
    
}
