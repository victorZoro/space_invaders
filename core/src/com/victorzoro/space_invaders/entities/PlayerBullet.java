package com.victorzoro.space_invaders.entities;


import com.badlogic.gdx.math.Vector2;
import com.victorzoro.space_invaders.textures.TextureManager;

public class PlayerBullet extends Entity {


    public PlayerBullet(Vector2 position, Vector2 direction) {
        super(TextureManager.PLAYER_BULLET, position, direction);
    }

    @Override
    public void update() {
        position.add(direction);
    }
    
}
