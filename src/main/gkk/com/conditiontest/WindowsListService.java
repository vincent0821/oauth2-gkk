package com.conditiontest;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
