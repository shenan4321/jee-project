package cn.shenan.upms.rpc.api;

import cn.shenan.common.base.BaseServiceMock;
import cn.shenan.upms.dao.mapper.UpmsUserPermissionMapper;
import cn.shenan.upms.dao.model.UpmsUserPermission;
import cn.shenan.upms.dao.model.UpmsUserPermissionExample;

/**
* 降级实现UpmsUserPermissionService接口
* Created by shenan on 2017/11/9.
*/
public class UpmsUserPermissionServiceMock extends BaseServiceMock<UpmsUserPermissionMapper, UpmsUserPermission, UpmsUserPermissionExample> implements UpmsUserPermissionService {

}
