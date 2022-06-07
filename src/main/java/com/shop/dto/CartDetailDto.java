package com.shop.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CartDetailDto {

    private Long cartItemId;

    private String itemNum;

    private int price;

    private int count;

    private String imgUrl;

    public CartDetailDto(Long cartItemId, String itemNum, int price, int count, String imgUrl) {
        this.cartItemId = cartItemId;
        this.itemNum = itemNum;
        this.price = price;
        this.count = count;
        this.imgUrl = imgUrl;
    }
}
