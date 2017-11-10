package cn.shenan.upms.rpc.service.impl;

import cn.shenan.common.annotation.BaseService;
import cn.shenan.common.base.BaseServiceImpl;
import cn.shenan.upms.dao.mapper.UpmsUserRoleMapper;
import cn.shenan.upms.dao.model.UpmsUserRole;
import cn.shenan.upms.dao.model.UpmsUserRoleExample;
import cn.shenan.upms.rpc.api.UpmsUserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsUserRoleService实现
* Created by shenan on 2017/11/9.
*/
@Service
@Transactional
@BaseService
public class UpmsUserRoleServiceImpl extends BaseServiceImpl<UpmsUserRoleMapper, UpmsUserRole, UpmsUserRoleExample> implements UpmsUserRoleService {

    private static Logger _log = LoggerFactory.getLogger(UpmsUserRoleServiceImpl.class);

    @Autowired
    UpmsUserRoleMapper upmsUserRoleMapper;

}