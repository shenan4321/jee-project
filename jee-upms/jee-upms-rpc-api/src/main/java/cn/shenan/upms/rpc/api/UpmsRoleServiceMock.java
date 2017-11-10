package cn.shenan.upms.rpc.api;

import cn.shenan.common.base.BaseServiceMock;
import cn.shenan.upms.dao.mapper.UpmsRoleMapper;
import cn.shenan.upms.dao.model.UpmsRole;
import cn.shenan.upms.dao.model.UpmsRoleExample;

/**
* 降级实现UpmsRoleService接口
* Created by shenan on 2017/11/9.
*/
public class UpmsRoleServiceMock extends BaseServiceMock<UpmsRoleMapper, UpmsRole, UpmsRoleExample> implements UpmsRoleService {

}
