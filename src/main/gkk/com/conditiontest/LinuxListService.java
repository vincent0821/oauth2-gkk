package com.conditiontest;

/**
 * Created by gongkuaikuai on 2017/4/12.
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
