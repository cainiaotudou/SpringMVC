package com.ssm.service;
import com.ssm.domain.ItemsQuery;
import com.ssm.domain.ItemsUp;

import java.util.List;

public interface ItemsService {
    public List<ItemsUp> findItemsList(ItemsQuery itemsQuery) throws Exception;

    public ItemsUp findItemsById(int id) throws Exception;

    public void updateItems(Integer id, ItemsUp itemsUp) throws  Exception;
}
