package cn.shenan.upms.rpc.service.impl;

import cn.shenan.common.annotation.BaseService;
import cn.shenan.common.base.BaseServiceImpl;
import cn.shenan.upms.dao.mapper.UpmsLogMapper;
import cn.shenan.upms.dao.model.UpmsLog;
import cn.shenan.upms.dao.model.UpmsLogExample;
import cn.shenan.upms.rpc.api.UpmsLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsLogService实现
* Created by shenan on 2017/11/9.
*/
@Service
@Transactional
@BaseService
public class UpmsLogServiceImpl extends BaseServiceImpl<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

    private static Logger _log = LoggerFactory.getLogger(UpmsLogServiceImpl.class);

    @Autowired
    UpmsLogMapper upmsLogMapper;

}