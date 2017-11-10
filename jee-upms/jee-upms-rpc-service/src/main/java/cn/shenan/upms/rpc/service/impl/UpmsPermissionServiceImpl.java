package cn.shenan.upms.rpc.service.impl;

import cn.shenan.common.annotation.BaseService;
import cn.shenan.common.base.BaseServiceImpl;
import cn.shenan.upms.dao.mapper.UpmsPermissionMapper;
import cn.shenan.upms.dao.model.UpmsPermission;
import cn.shenan.upms.dao.model.UpmsPermissionExample;
import cn.shenan.upms.rpc.api.UpmsPermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsPermissionService实现
* Created by shenan on 2017/11/9.
*/
@Service
@Transactional
@BaseService
public class UpmsPermissionServiceImpl extends BaseServiceImpl<UpmsPermissionMapper, UpmsPermission, UpmsPermissionExample> implements UpmsPermissionService {

    private static Logger _log = LoggerFactory.getLogger(UpmsPermissionServiceImpl.class);

    @Autowired
    UpmsPermissionMapper upmsPermissionMapper;

}