package cn.shenan.upms.rpc.service.impl;

import cn.shenan.common.annotation.BaseService;
import cn.shenan.common.base.BaseServiceImpl;
import cn.shenan.upms.dao.mapper.UpmsSystemMapper;
import cn.shenan.upms.dao.model.UpmsSystem;
import cn.shenan.upms.dao.model.UpmsSystemExample;
import cn.shenan.upms.rpc.api.UpmsSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsSystemService实现
* Created by shenan on 2017/11/9.
*/
@Service
@Transactional
@BaseService
public class UpmsSystemServiceImpl extends BaseServiceImpl<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

    private static Logger _log = LoggerFactory.getLogger(UpmsSystemServiceImpl.class);

    @Autowired
    UpmsSystemMapper upmsSystemMapper;

}