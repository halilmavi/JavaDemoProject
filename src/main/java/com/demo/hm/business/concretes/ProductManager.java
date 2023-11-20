package com.demo.hm.business.concretes;

import com.demo.hm.business.abstracts.ProductService;
import com.demo.hm.dataAccess.abstracts.ProductDao;
import com.demo.hm.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
