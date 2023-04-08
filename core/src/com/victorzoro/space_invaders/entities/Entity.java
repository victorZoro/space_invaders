package com.victorzoro.space_invaders.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class Entity {

    protected TextureRegion region;
    protected Vector2 position, direction;
    public static final int SPRITE_SIZE = 50;
    public static final int PADDING = 10;
    private boolean alive = true;

    public Entity(TextureRegion region, Vector2 position, Vector2 direction) {
        this.region = region;
        this.position = position;
        this.direction = direction;
    }

    public abstract void update();
    
    public Vector2 getPosition() {
        return position;
    }

    public Rectangle getBounds() {
        return new Rectangle(position.x, position.y, SPRITE_SIZE - PADDING, SPRITE_SIZE - PADDING);
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void invertDirection() {
        direction.x *= -1;
    }

    public void render(SpriteBatch batch) {
        batch.draw(region, position.x, position.y, SPRITE_SIZE, SPRITE_SIZE);
    }

    
    public void setDirection(float x, float y) {
        direction.set(x, y);
        direction.scl(Gdx.graphics.getDeltaTime());
    }
}
