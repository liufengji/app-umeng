package com.victor.applogs.visualize.dao;

import com.victor.applogs.visualize.domain.StatBean;

import java.util.List;

/**
 * BaseDao接口
 */
public interface StatMapper<T> {

    /**
     * @param appid appid
     * @return
     */
    List<StatBean> findThisWeekNewUsers(String appid);
}
