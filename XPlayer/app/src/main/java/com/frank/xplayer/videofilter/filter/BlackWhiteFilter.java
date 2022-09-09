package com.frank.xplayer.videofilter.filter;

import com.frank.xplayer.R;
import com.frank.xplayer.videofilter.base.BaseFilter;

public class BlackWhiteFilter extends BaseFilter {

    public BlackWhiteFilter() {
        super(R.raw.video_no_filter_vertex_shader, R.raw.video_blackwhite_filter_fragment_shader);
    }
}
