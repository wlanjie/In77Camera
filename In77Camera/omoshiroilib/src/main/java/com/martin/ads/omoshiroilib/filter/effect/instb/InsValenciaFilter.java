package com.martin.ads.omoshiroilib.filter.effect.instb;

import android.content.Context;

import com.martin.ads.omoshiroilib.filter.base.MultipleTextureFilter;

/**
 * Created by Ads on 2017/4/7.
 */

public class InsValenciaFilter extends MultipleTextureFilter {
    public InsValenciaFilter(Context context) {
        super(context, "filter/fsh/instb/valencia.glsl");
        textureSize=2;
    }

    @Override
    public void init() {
        super.init();
        externalBitmapTextures[0].load(context, "filter/textures/inst/valenciamap.png");
        externalBitmapTextures[1].load(context, "filter/textures/inst/valenciagradientmap.png");
    }

    @Override
    public void onPreDrawElements() {
        super.onPreDrawElements();
        setUniform1f(glSimpleProgram.getProgramId(),"strength",1.0f);
    }
}
