package com.lxchild.okimageloader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AbsListView;
import android.widget.GridView;

import com.lxchild.adapter.ImageViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private boolean mIsGridViewIdle = false;
    private void initView() {
        GridView girdView = (GridView) findViewById(R.id.mGridView);
        List<String> urlList = getImageUrl();
        final ImageViewAdapter ivAdapter = new ImageViewAdapter(this, urlList, mIsGridViewIdle);
        girdView.setAdapter(ivAdapter);
        girdView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                if (scrollState == AbsListView.OnScrollListener.SCROLL_STATE_IDLE) {
                    mIsGridViewIdle = true;
                    ivAdapter.notifyDataSetChanged();
                } else {
                    mIsGridViewIdle = false;
                }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

            }
        });

    }

    private List<String> getImageUrl() {
        List<String> list = new ArrayList<>();
        list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=1183223528,3058066243&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=3965306929,1867766385&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=48252272,1629415252&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=3552972128,3819830255&fm=21&gp=0.jpg");
        list.add("http://img5.imgtn.bdimg.com/it/u=183656797,1730936710&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=1414293996,3193615352&fm=21&gp=0.jpg");list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=1183223528,3058066243&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=3965306929,1867766385&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=48252272,1629415252&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=3552972128,3819830255&fm=21&gp=0.jpg");
        list.add("http://img5.imgtn.bdimg.com/it/u=183656797,1730936710&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=1414293996,3193615352&fm=21&gp=0.jpg");list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=1183223528,3058066243&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=3965306929,1867766385&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=48252272,1629415252&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=3552972128,3819830255&fm=21&gp=0.jpg");
        list.add("http://img5.imgtn.bdimg.com/it/u=183656797,1730936710&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=1414293996,3193615352&fm=21&gp=0.jpg");list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=1183223528,3058066243&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=3965306929,1867766385&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=48252272,1629415252&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=3552972128,3819830255&fm=21&gp=0.jpg");
        list.add("http://img5.imgtn.bdimg.com/it/u=183656797,1730936710&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=1414293996,3193615352&fm=21&gp=0.jpg");list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=1183223528,3058066243&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=3965306929,1867766385&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=48252272,1629415252&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=3552972128,3819830255&fm=21&gp=0.jpg");
        list.add("http://img5.imgtn.bdimg.com/it/u=183656797,1730936710&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=1414293996,3193615352&fm=21&gp=0.jpg");list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=1183223528,3058066243&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=3965306929,1867766385&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=48252272,1629415252&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=3552972128,3819830255&fm=21&gp=0.jpg");
        list.add("http://img5.imgtn.bdimg.com/it/u=183656797,1730936710&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=1414293996,3193615352&fm=21&gp=0.jpg");list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=1183223528,3058066243&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=3965306929,1867766385&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=48252272,1629415252&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=3552972128,3819830255&fm=21&gp=0.jpg");
        list.add("http://img5.imgtn.bdimg.com/it/u=183656797,1730936710&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=1414293996,3193615352&fm=21&gp=0.jpg");list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=1183223528,3058066243&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=3965306929,1867766385&fm=21&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=48252272,1629415252&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=128811874,840272376&fm=21&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=3552972128,3819830255&fm=21&gp=0.jpg");
        list.add("http://img5.imgtn.bdimg.com/it/u=183656797,1730936710&fm=21&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=1414293996,3193615352&fm=21&gp=0.jpg");
        return list;
    }
}
