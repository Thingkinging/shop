package com.shop.dto;


import com.shop.entity.OrderItem;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderItemDto {

    private String itemNum;

    private int count;

    private int orderPrice;

    private String imgUrl;

    public OrderItemDto(OrderItem orderItem, String imgUrl) {
        this.itemNum = orderItem.getItem().getItemNum();
        this.count = orderItem.getCount();
        this.orderPrice = orderItem.getOrderPrice();
        this.imgUrl = imgUrl;
    }
}
