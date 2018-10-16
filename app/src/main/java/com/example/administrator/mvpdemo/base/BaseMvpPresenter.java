package com.example.administrator.mvpdemo.base;

import android.os.Bundle;

import java.lang.ref.WeakReference;

/**
 * Presenter生命周期包装、View的绑定和解除，P层实现的基类
 */
public class BaseMvpPresenter<V extends MvpView> implements MvpPresenter<V> {
    private WeakReference<V> viewRef;

    protected V getView() {
        return viewRef.get();
    }

    protected boolean isViewAttached() {
        return viewRef != null && viewRef.get() != null;
    }

    private void _attach(V view, Bundle savedInstanceState) {
        viewRef = new WeakReference<V>(view);
    }

    @Override
    public void onMvpAttachView(V view, Bundle savedInstanceState) {
        _attach(view, savedInstanceState);
    }

    @Override
    public void onMvpStart() {
    }

    @Override
    public void onMvpResume() {
    }

    @Override
    public void onMvpPause() {
    }

    @Override
    public void onMvpStop() {
    }

    @Override
    public void onMvpSaveInstanceState(Bundle savedInstanceState) {
    }

    private void _detach(boolean retainInstance) {
        if (viewRef != null) {
            viewRef.clear();
            viewRef = null;
        }
    }

    @Override
    public void onMvpDetachView(boolean retainInstance) {
        _detach(retainInstance);
    }

    @Override
    public void onMvpDestroy() {
    }
}
