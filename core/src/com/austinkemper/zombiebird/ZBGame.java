package com.austinkemper.zombiebird;

import com.austinkemper.zbhelpers.AssetLoader;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

/**
 * Created by austinkemper on 8/3/16.
 */
public class ZBGame extends Game {




    @Override
    public void create() {
        Gdx.app.log("ZBGame", "created");
        AssetLoader.load();
        setScreen(new GameScreen());
    }

    @Override
    public void dispose(){
        super.dispose();
        AssetLoader.dispose();
    }
}
