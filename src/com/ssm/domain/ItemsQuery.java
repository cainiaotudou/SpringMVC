package com.ssm.domain;

public class ItemsQuery {
    //商品信息
    private Items items;

    //为了系统可扩展性，对原始生成的po进行扩展
    private ItemsUp itemsUp ;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public ItemsUp getItemsUp() {
        return itemsUp;
    }

    public void setItemsUp(ItemsUp itemsUp) {
        this.itemsUp = itemsUp;
    }
}
