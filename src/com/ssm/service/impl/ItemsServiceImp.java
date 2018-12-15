package com.ssm.service.impl;

import com.ssm.domain.Items;
import com.ssm.domain.ItemsQuery;
import com.ssm.domain.ItemsUp;
import com.ssm.mapper.ItemsMapper;
import com.ssm.mapper.ItemsMapperCustom;
import com.ssm.service.ItemsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ItemsServiceImp implements ItemsService {

    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    public List<ItemsUp> findItemsList(ItemsQuery itemsQuery) throws Exception {
        return itemsMapperCustom.findItemsList(itemsQuery);
    }

    @Autowired
    private ItemsMapper itemsMapper;

    public ItemsUp findItemsById(int id) throws Exception {
        Items items = itemsMapper.selectByPrimaryKey(id);
        ItemsUp itemsUp = new ItemsUp();
        BeanUtils.copyProperties(items,itemsUp);
        return itemsUp;
    }

    @Override
    public void updateItems(Integer id, ItemsUp itemsUp) throws Exception {
            //添加业务校验，通常在service接口对关键参数进行校验
            //校验id是否位空,抛出异常
        itemsUp.setId(id);
        itemsMapper.updateByPrimaryKeyWithBLOBs(itemsUp);
    }
}
