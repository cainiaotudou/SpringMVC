package com.ssm.mapper;

import com.ssm.domain.ItemsQuery;
import com.ssm.domain.ItemsUp;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsMapperCustom {
    //商品查询列表
    public List<ItemsUp> findItemsList(ItemsQuery itemsQuery) throws Exception;
//    public List<ItemsUp> findItemsList() throws Exception;
}
