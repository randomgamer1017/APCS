package com.stackoverflowtrio.orbit;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import Screens.MainMenuScreen;
import Screens.PlayScreen;
import Screens.SettingsScreen;

public class Orbit extends Game {
	//Virtual Screen size and Box2D Scale(Pixels Per Meter)
	public static final int V_WIDTH = 400;
	public static final int V_HEIGHT = 200;
	public static final float PPM = 100;

	//Box2D Collision Bits
	public static final short DEFAULT_BIT = 1;
	public static final short MARIO_BIT = 2;
	public static final short BRICK_BIT = 4;
	public static final short COIN_BIT = 8;
	public static final short DESTROYED_BIT = 16;
	public static final short OBJECT_BIT = 32;
	public static final short ENEMY_BIT = 64;
	public static final short ENEMY_HEAD_BIT = 128;
	public static final short ITEM_BIT = 256;
	public static final short MARIO_HEAD_BIT = 512;
	public static final short FIREBALL_BIT = 1024;
	
	public SpriteBatch batch;
	
	Texture img;
	private float musicVol = (float) 0.5;
	private PlayScreen playScreen;
	private MainMenuScreen menuScreen;
	private SettingsScreen settingsScreen;
	@Override
	public void create () {
		
		batch = new SpriteBatch();
		menuScreen = new MainMenuScreen(this);
		this.setScreen(menuScreen);
//		Music music = Gdx.audio.newMusic(Gdx.files.internal("data/AmbientSong.mp3"));
//		music.setVolume(musicVol);
//		music.setLooping(true);
//		music.play();
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
	public void changeScreen(int screen){
	switch(screen){
		case 0:
			if(menuScreen == null) menuScreen = new MainMenuScreen(this);
                        this.setScreen(menuScreen);
			break;
		case 1:
			if(playScreen == null) playScreen = new PlayScreen(this);
						this.setScreen(playScreen);
			break;
		case 2:
			if(settingsScreen == null) settingsScreen = new SettingsScreen(this);
			this.setScreen(settingsScreen);
			break;
		
	}
}

}
