package io.github.some_example_name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image1, image2;

    @Override
    public void create() {
        batch = new SpriteBatch();
        image1 = new Texture("chimchar.png");
        image2 = new Texture("piplup.png");
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(image1, 140, 210);
        batch.draw(image2, 540, 310);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image1.dispose();
        image2.dispose();
    }
}
