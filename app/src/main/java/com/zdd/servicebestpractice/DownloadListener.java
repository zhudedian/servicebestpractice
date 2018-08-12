package com.zdd.servicebestpractice;

/**
 * Created by zhudedian on 2018/8/12.
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
