package com.yjymh.miraiwebhook.service;

import com.yjymh.miraiwebhook.entity.GroupToken;
import com.yjymh.miraiwebhook.mapper.GroupTokenMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupTokenServiceImpl implements GroupTokenService{

    @Autowired
    private GroupTokenMapper groupTokenMapper;

    @Override
    public GroupToken queryGroupById(long id) {
        return groupTokenMapper.queryGroupById(id);
    }

    @Override
    public GroupToken queryGroupByToken(String token) {
        return groupTokenMapper.queryGroupByToken(token);
    }

    @Override
    public int addGroup(GroupToken group) {
        return groupTokenMapper.addGroup(group);
    }

    @Override
    public int updateGroup(GroupToken group) {
        return groupTokenMapper.updateGroup(group);
    }

    @Override
    public int deleteGroup(Long id) {
        return groupTokenMapper.deleteGroup(id);
    }
}
