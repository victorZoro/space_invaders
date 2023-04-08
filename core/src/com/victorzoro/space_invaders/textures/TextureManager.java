package com.victorzoro.space_invaders.textures;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class TextureManager {
        
    public static TextureAtlas atlas = new TextureAtlas("texture/spritesheet.txt");
    
    /** Player */
    public static TextureRegion PLAYER = new TextureRegion(atlas.findRegion("player_spaceship"));
    public static TextureRegion PLAYER_BULLET = new TextureRegion(atlas.findRegion("player_bullet"));
    
    /** Aliens */
    public static TextureRegion android_alien = new TextureRegion(atlas.findRegion("01android_alien"));
    public static TextureRegion squid_alien = new TextureRegion(atlas.findRegion("01squid_alien"));
    public static TextureRegion octopus_alien = new TextureRegion(atlas.findRegion("01octopus_alien"));
    public static TextureRegion skull_alien = new TextureRegion(atlas.findRegion("01skull_alien"));
    public static TextureRegion cricket_alien = new TextureRegion(atlas.findRegion("01cricket_alien"));
    public static TextureRegion alien_bullet = new TextureRegion(atlas.findRegion("01alien_bullet"));
    
    /** Alien Dying */
    public static TextureRegion alien_killed = new TextureRegion(atlas.findRegion("01alien_killed"));

    
}

