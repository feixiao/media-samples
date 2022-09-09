package com.frank.xplayer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.frank.xplayer.video.VideoPlayerActivity;
import com.frank.xplayer.videofilter.VideoFilterActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private MainAdapter mMainAdapter;
    private List<MainBean> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        initView();
    }

    private void findView() {
        mRecyclerView = findViewById(R.id.mRecyclerView);
    }

    private void initView() {
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mList = new ArrayList<>();
        mList.add(new MainBean("视频播放", VideoPlayerActivity.class));
        mList.add(new MainBean("视频播放滤镜", VideoFilterActivity.class));
        mMainAdapter = new MainAdapter(this, mList);
        mRecyclerView.setAdapter(mMainAdapter);
    }


}
