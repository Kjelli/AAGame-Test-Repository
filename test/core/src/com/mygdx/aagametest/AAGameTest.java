package com.mygdx.aagametest;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mygdx.aagametest.game.GameScreen;

public class AAGameTest extends Game {

	@Override
	public void create() {
		Gdx.app.log("ZBGame", "created");
        AssetLoader.load();
        setScreen(new GameScreen());
	}
	
	@Override
	public void dispose() {
		Gdx.app.log("ZBGame", "disposing");
		super.dispose();
		AssetLoader.dispose();
	}
}
