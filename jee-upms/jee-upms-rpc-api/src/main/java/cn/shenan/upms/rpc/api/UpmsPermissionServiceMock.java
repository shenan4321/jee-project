package cn.shenan.upms.rpc.api;

import cn.shenan.common.base.BaseServiceMock;
import cn.shenan.upms.dao.mapper.UpmsPermissionMapper;
import cn.shenan.upms.dao.model.UpmsPermission;
import cn.shenan.upms.dao.model.UpmsPermissionExample;

/**
* 降级实现UpmsPermissionService接口
* Created by shenan on 2017/11/9.
*/
public class UpmsPermissionServiceMock extends BaseServiceMock<UpmsPermissionMapper, UpmsPermission, UpmsPermissionExample> implements UpmsPermissionService {

}
