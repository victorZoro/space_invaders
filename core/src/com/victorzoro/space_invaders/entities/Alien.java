package com.victorzoro.space_invaders.entities;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class Alien extends Entity {


    public Alien(TextureRegion region, Vector2 position, Vector2 direction) {
        super(region, position, direction);
    }


    @Override
    public void update() {
        position.add(direction);
    }
    
}
