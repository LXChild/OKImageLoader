package com.lxchild.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.lxchild.okimageloader.ImageLoader;
import com.lxchild.okimageloader.R;

import java.security.NoSuchAlgorithmException;
import java.util.List;


/**
 * Created by admin on 2016/1/7.
 */
public class ImageViewAdapter extends BaseAdapter {
    private Context mContext;
    private List<String> urlList;
    private LayoutInflater inflater;
    private ImageLoader imageLoader;
    private boolean isGridViewIdle;

    public ImageViewAdapter(Context context, List<String> list, boolean isGridViewIdle) {
        this.urlList = list;
        this.mContext = context;
        inflater = LayoutInflater.from(context);
        imageLoader = new ImageLoader(context);
        this.isGridViewIdle = isGridViewIdle;
    }

    @Override
    public int getCount() {
        return urlList.size();
    }

    @Override
    public Object getItem(int position) {
        return urlList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        UrlHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_gridview_image, null);
            holder = new UrlHolder();
            holder.iv = (ImageView) convertView.findViewById(R.id.mImageView);
            convertView.setTag(holder);
        } else {
            holder = (UrlHolder) convertView.getTag();
        }
        ImageView imageView = holder.iv;
        String urlString = (String) getItem(position);
        try {
            imageLoader.bindBitmap(urlString, imageView, 100, 100);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return convertView;
    }

    private class UrlHolder {
        ImageView iv;
    }
}

