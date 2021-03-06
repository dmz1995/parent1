package cn.itcast.service.Impl;

import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    public Items findById(int id) {
        Items item = itemsDao.findById(id);
        return item;
    }
}
