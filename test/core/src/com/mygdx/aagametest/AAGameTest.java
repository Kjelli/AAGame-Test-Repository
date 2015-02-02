package com.mygdx.aagametest;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mygdx.aagametest.game.GameScreen;

public class AAGameTest extends Game {

	@Override
	public void create() {
		Gdx.app.log("Game", "created");
		
		/*
		 *  Entry point til programmet
		 */
		
        AssetLoader.load();
        
        setScreen(new GameScreen());
	}
	
	@Override
	public void dispose() {
		Gdx.app.log("Game", "disposing");
		super.dispose();
		AssetLoader.dispose();
	}
}
