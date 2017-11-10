package cn.shenan.upms.rpc.service.impl;

import cn.shenan.common.annotation.BaseService;
import cn.shenan.common.base.BaseServiceImpl;
import cn.shenan.upms.dao.mapper.UpmsRoleMapper;
import cn.shenan.upms.dao.model.UpmsRole;
import cn.shenan.upms.dao.model.UpmsRoleExample;
import cn.shenan.upms.rpc.api.UpmsRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsRoleService实现
* Created by shenan on 2017/11/9.
*/
@Service
@Transactional
@BaseService
public class UpmsRoleServiceImpl extends BaseServiceImpl<UpmsRoleMapper, UpmsRole, UpmsRoleExample> implements UpmsRoleService {

    private static Logger _log = LoggerFactory.getLogger(UpmsRoleServiceImpl.class);

    @Autowired
    UpmsRoleMapper upmsRoleMapper;

}