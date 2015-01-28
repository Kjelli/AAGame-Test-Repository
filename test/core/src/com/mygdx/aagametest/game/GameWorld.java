package com.mygdx.aagametest.game;

import com.badlogic.gdx.Gdx;
import com.mygdx.aagametest.gameobjects.Bird;

public class GameWorld {
	Bird bird;
	
	public GameWorld(int midPointY){
		 bird = new Bird(33, midPointY - 5, 17, 12);
	}
	
	public void update(float delta) {
		Gdx.app.log("GameWorld", "update");
		bird.update(delta);
	}
	
	public Bird getBird() {
		return bird;
	}

}
