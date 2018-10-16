package com.example.administrator.mvpdemo.base;

import android.os.Bundle;

/**
 * Created by ASUS on 2018/10/14.
 * 定义P层生命周期与V层同步
 */

public interface MvpPresenter<V extends MvpView> {
    void onMvpAttachView(V view, Bundle savedInstanceState);

    void onMvpStart();

    void onMvpResume();

    void onMvpPause();

    void onMvpStop();

    void onMvpSaveInstanceState(Bundle savedInstanceState);

    void onMvpDetachView(boolean retainInstance);

    void onMvpDestroy();

}
