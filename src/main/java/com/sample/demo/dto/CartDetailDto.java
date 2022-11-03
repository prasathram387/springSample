/*
 * Copyright (c) 2022, Ideas2it and/or its affiliates. All rights reserved.
 * IDEAS2IT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.sample.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <p>
 * Cart detail Dto class contains the cart detail dto data.
 * </p>
 *
 * @author Yuvaraj
 * @version 1.8
 **/
@Getter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CartDetailDto {

    private int id;

    private int quantity;

    private String status;

    private Date createdAt;

    private float price;

    private Date updatedAt;

    private ProductDto product;

    private CartDto cart;
}
