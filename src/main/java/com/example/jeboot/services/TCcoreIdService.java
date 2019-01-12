package com.example.jeboot.services;

import com.example.jeboot.base.Constant;
import com.example.jeboot.dao.TCcoreIdentityMapper;
import com.example.jeboot.entity.TCcoreIdentity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TCcoreIdService {

    @Autowired
    private TCcoreIdentityMapper tCcoreIdentityMapper;


    public List<TCcoreIdentity> getTCcoreIdentityAll(){
        String[] randomNumber = getRandomNumber();
        List<TCcoreIdentity> list=new ArrayList<>();
        TCcoreIdentity tCcoreIdentity=null;
        for (int i=0;i<2;i++){
            String str = getStr(randomNumber);
            tCcoreIdentity=new TCcoreIdentity();
            tCcoreIdentity.setObverseSidePicture(str);
            tCcoreIdentity.setName(getStr(randomNumber));
            list.add(tCcoreIdentity);
        }
        return list;
    }

    public static String[] getRandomNumber(){
        String art="自小学到高中一系列语文改革,意味着未来的语文教育将更加注重培养学生的传统文化素养";
        StringBuilder suf=new StringBuilder();
        for (int i=0;i<art.length();i++){
            char c = art.charAt(i);
            if (suf.length()>0){
                suf.append(",");
            }
            suf.append(c);
        }
        String[] split = suf.toString().split(",");
        return split;
    }

    public String getStr(String[] stringBuilders){
        int index=(int)(Math.random()*stringBuilders.length);
        String stringBuilder = stringBuilders[index];
        return stringBuilder;
    }

    @Transactional
    public void batchInsert(){
       List<TCcoreIdentity> identityAll = getTCcoreIdentityAll();
        tCcoreIdentityMapper.batchInsert(identityAll);
    }


}
