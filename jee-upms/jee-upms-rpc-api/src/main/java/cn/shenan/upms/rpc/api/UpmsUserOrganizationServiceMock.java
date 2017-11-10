package cn.shenan.upms.rpc.api;

import cn.shenan.common.base.BaseServiceMock;
import cn.shenan.upms.dao.mapper.UpmsUserOrganizationMapper;
import cn.shenan.upms.dao.model.UpmsUserOrganization;
import cn.shenan.upms.dao.model.UpmsUserOrganizationExample;

/**
* 降级实现UpmsUserOrganizationService接口
* Created by shenan on 2017/11/9.
*/
public class UpmsUserOrganizationServiceMock extends BaseServiceMock<UpmsUserOrganizationMapper, UpmsUserOrganization, UpmsUserOrganizationExample> implements UpmsUserOrganizationService {

}
