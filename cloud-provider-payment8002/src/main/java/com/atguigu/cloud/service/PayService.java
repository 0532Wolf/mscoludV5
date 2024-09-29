package com.atguigu.cloud.service;
import com.atguigu.cloud.entities.Pay;

import java.util.List;

/**
 * @auther zzyy
 * @create 2023-11-03 18:40
 */
public interface PayService
{
    public int add(Pay pay);
    public int delete(Integer id);
    public int update(Pay pay);

    public Pay   getById(Integer id);
    public List<Pay> getAll();
}
