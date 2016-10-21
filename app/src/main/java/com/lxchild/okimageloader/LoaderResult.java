package com.lxchild.okimageloader;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Created by LXChild on 20/10/2016.
 */

public class LoaderResult {
    public ImageView mImageView;
    public String mUri;
    public Bitmap mBitmap;

    public LoaderResult (ImageView imageView, String uri, Bitmap bitmap) {
        this.mImageView = imageView;
        this.mUri = uri;
        this.mBitmap = bitmap;
    }
}
