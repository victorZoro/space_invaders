package com.victorzoro.space_invaders.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;
import com.victorzoro.space_invaders.textures.TextureManager;

public class Player extends Entity {

    PlayerBullet bullet;

    public Player(Vector2 position, Vector2 direction) {
        super(TextureManager.PLAYER, position, direction);
        bullet = new PlayerBullet(new Vector2(this.position.x + 3, Gdx.graphics.getHeight() * 2), new Vector2(0,0));
    }

    private void input() {
        if(Gdx.input.isKeyPressed(Input.Keys.A) || Gdx.input.isKeyPressed(Input.Keys.LEFT)) { // left
            setDirection(-300, 0);
            if(position.x <= 0) {
                setDirection(0, 0);
            }
        } else if(Gdx.input.isKeyPressed(Input.Keys.D) || Gdx.input.isKeyPressed(Input.Keys.RIGHT)) { // right
            setDirection(300, 0);
            if(position.x >= Gdx.graphics.getWidth() - Entity.SPRITE_SIZE) {
                setDirection(0, 0);
            }
        } else {
            setDirection(0,0);
        }

        if((Gdx.input.isKeyPressed(Input.Keys.SPACE) || Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)) && bullet.getPosition().y > Gdx.graphics.getHeight()) {
            bullet.getPosition().x = this.position.x + 3;
            bullet.getPosition().y = this.position.y;
            bullet.setDirection(0, 300);
        }
    }

    public void resetBulletPosition() {
        bullet.getPosition().x = this.position.x;
        bullet.getPosition().y = Gdx.graphics.getHeight() * 2;
    }

    public Vector2 getPosition() {
        return position;
    }

    @Override
    public void update() {
        position.add(direction);
        bullet.update();
        input();
    }
    
}
