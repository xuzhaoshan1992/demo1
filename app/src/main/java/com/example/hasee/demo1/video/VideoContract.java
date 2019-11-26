package com.example.hasee.demo1.video;

import com.example.hasee.demo1.base.IBaseCallback;
import com.example.hasee.demo1.base.IBasePresenter;
import com.example.hasee.demo1.base.IBaseView;
import com.example.hasee.demo1.data.entity.HttpResult;
import com.example.hasee.demo1.data.entity.VideoData;

import java.util.Map;

/**
 * Created by Hasee on 2019/11/25.
 */

public interface VideoContract {
    interface IVideoView extends IBaseView<IVideoPresenter> {
            void onVideoNewsListSuccess(VideoData data);
            void onVideoNewsListFail(String msg);
    }
    interface IVideoPresenter extends IBasePresenter<IVideoView>{
        void getVideoNewsList(int start,long pointTime);
    }
    interface IVideoRepository{
        void getVideoNewsList(Map<String,String> params, IBaseCallback<HttpResult<VideoData>> callBack);
    }
}
