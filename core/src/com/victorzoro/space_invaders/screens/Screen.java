package com.victorzoro.space_invaders.screens;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Classe abstrata responsável por criar instâncias de tela.
 */
public abstract class Screen {
    //Possui os mesmos métodos que serão usados em MainGame.java
    public abstract void create();

    public abstract void update();

    public abstract void render(SpriteBatch batch);
    
    public abstract void resize(int width, int height);
    
    public abstract void dispose();

    public abstract void pause();

    public abstract void resume();
}
