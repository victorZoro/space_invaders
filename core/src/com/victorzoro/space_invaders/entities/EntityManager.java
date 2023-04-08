package com.victorzoro.space_invaders.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.victorzoro.space_invaders.textures.TextureManager;
/**
 * Alien arrays are 11x5
 * 1 of each alien, counting 11 per row.
 * 5 columns
 */

public class EntityManager {
    
    private final int ALIEN_ROWS = 5, ALIEN_COLS = 11;
    private final Array<Entity> entities;

    private final Player player;

    public EntityManager(int amount) {
        player = new Player(new Vector2(Gdx.graphics.getWidth() / 2, 18), new Vector2(0, 0));
        entities = new Array<Entity>();

        for(int row = 1; row <= ALIEN_COLS; row++) {
            for(int col = 1 ; col <= ALIEN_ROWS; col++) { 
                entities.add(new Alien(TextureManager.android_alien,
                new Vector2((Gdx.graphics.getWidth() / 8  + (row * Entity.SPRITE_SIZE)), //x
                (Gdx.graphics.getHeight() - col * Entity.SPRITE_SIZE)) , //y
                new Vector2(1,0)));
            }
        }
    }

    public void update() {
        for(Entity entity : entities) {
            entity.update();
        }
        player.update();
        checkCollision();
        moveAliens();
    }

    public void checkCollision() {
        for(Entity entity : entities) {
            if(entity.getBounds().overlaps(player.bullet.getBounds())) {
                entity.setAlive(false);
                entities.removeValue(entity, false);
                player.resetBulletPosition();
            }
        }
    }

    public void moveAliens() {
        int i = 0;
        for(Entity entity : entities) {
            if(entities.get(i).getPosition().x <= 0 || entities.get(i).getPosition().x >= Gdx.graphics.getWidth() / 4 + Entity.SPRITE_SIZE) {
                entity.invertDirection();
                // entity.getPosition().y -= 10;
                if(!entities.get(i).isAlive()) {
                    i++;
                }
            }
        }
    }


    public void render(SpriteBatch batch) {
        player.bullet.render(batch);
        for(Entity entity : entities) {
            entity.render(batch);
        }
        player.render(batch);
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }
}
