package com.example.jeboot.services;

import com.example.jeboot.dao.TCcoreIdentityMapper;
import com.example.jeboot.entity.TCcoreIdentity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TCcoreIdService {

    @Autowired
    private TCcoreIdentityMapper tCcoreIdentityMapper;


    public List<TCcoreIdentity> getTCcoreIdentityAll(){
        List<TCcoreIdentity> list=new ArrayList<>();
        for (int i=0;i<500;i++){
            TCcoreIdentity tCcoreIdentity=new TCcoreIdentity();

            list.add(tCcoreIdentity);
        }
        return list;
    }

    @Transactional
    public void batchInsert(){
        List<TCcoreIdentity> identityAll = getTCcoreIdentityAll();
        tCcoreIdentityMapper.batchInsert(identityAll);
    }
}
