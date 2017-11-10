package cn.shenan.upms.rpc.api;

import cn.shenan.common.base.BaseServiceMock;
import cn.shenan.upms.dao.mapper.UpmsOrganizationMapper;
import cn.shenan.upms.dao.model.UpmsOrganization;
import cn.shenan.upms.dao.model.UpmsOrganizationExample;

/**
* 降级实现UpmsOrganizationService接口
* Created by shenan on 2017/11/9.
*/
public class UpmsOrganizationServiceMock extends BaseServiceMock<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

}
