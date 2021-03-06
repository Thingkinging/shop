package com.shop.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MainItemDto {

    private Long id;

    private String itemNum;

    private String itemDetail;

    private String imgUrl;

    private Integer price;

    @QueryProjection

    public MainItemDto(Long id, String itemNum, String itemDetail, String imgUrl, Integer price) {
        this.id = id;
        this.itemNum = itemNum;
        this.itemDetail = itemDetail;
        this.imgUrl = imgUrl;
        this.price = price;
    }
}
