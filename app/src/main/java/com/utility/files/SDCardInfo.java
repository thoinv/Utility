package com.utility.files;

import androidx.annotation.NonNull;

import com.utility.UtilsLib;

public class SDCardInfo {

    private String path;
    private String state;
    private boolean isRemovable;
    private long totalSize;
    private long availableSize;
    private String name;

    SDCardInfo(){
    }

    public SDCardInfo(String path, String name, String state, boolean isRemovable) {
        this.path = path;
        this.state = state;
        this.isRemovable = isRemovable;
        this.totalSize = UtilsLib.getFsTotalSize(path);
        this.availableSize = UtilsLib.getFsAvailableSize(path);
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public String getState() {
        return state;
    }

    public boolean isRemovable() {
        return isRemovable;
    }

    public long getTotalSize() {
        return totalSize;
    }

    public long getAvailableSize() {
        return availableSize;
    }

    public String getName() {
        return name;
    }

    @NonNull
    @Override
    public String toString() {
        return "SDCardInfo {" +
                "path = " + path +
                ", state = " + state +
                ", isRemovable = " + isRemovable +
                ", totalSize = " + totalSize +
                ", availableSize = " + availableSize +
                ", name = " + name +
                '}';
    }
}