package com.mygdx.aagametest.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

public class GameScreen implements Screen {
	public GameWorld world;
	public GameRenderer renderer;

	public float runTime = 0f;

	public GameScreen() {
		float screenWidth = Gdx.graphics.getWidth();
		float screenHeight = Gdx.graphics.getHeight();
		float gameWidth = 136;
		float gameHeight = screenHeight / (screenWidth / gameWidth);
		int midPointY = (int) (gameHeight / 2);

		world = new GameWorld(midPointY);
		renderer = new GameRenderer(world, (int) gameHeight, midPointY);
		Gdx.app.log("GameScreen", "Attached");

		Gdx.input.setInputProcessor(new InputHandler(world.getBird()));
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Gdx.app.log("GameScreen", "Showing");

	}

	@Override
	public void render(float delta) {
		runTime += delta;
		world.update(delta);
		renderer.render(runTime);

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		Gdx.app.log("GameScreen", "Resizing");

	}

	@Override
	public void pause() {
		// TODO Auto-generated shushamabob
		Gdx.app.log("GameScreen", "Paused");
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		Gdx.app.log("GameScreen", "Resumed");

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		Gdx.app.log("GameScreen", "Hidden");

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		Gdx.app.log("GameScreen", "Disposing");

	}
}
