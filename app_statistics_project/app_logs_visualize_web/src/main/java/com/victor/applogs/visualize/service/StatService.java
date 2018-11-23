package com.victor.applogs.visualize.service;

import com.victor.applogs.visualize.domain.StatBean;

import java.util.List;

/**
 * Service
 */
public interface StatService {

    List<StatBean> findThisWeekNewUsers(String appid);
}
