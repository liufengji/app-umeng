package com.victor.applogs.visualize.service;

import com.victor.applogs.visualize.dao.StatMapper;
import com.victor.applogs.visualize.domain.StatBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 统计服务
 */
@Service("statService")
public class StatServiceImpl implements StatService {

    @Autowired
    StatMapper statMapper;

    @Override
    public List<StatBean> findThisWeekNewUsers(String sdk34734) {
        return statMapper.findThisWeekNewUsers(sdk34734);
    }
}
