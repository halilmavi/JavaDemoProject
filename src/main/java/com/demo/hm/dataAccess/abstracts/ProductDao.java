package com.demo.hm.dataAccess.abstracts;

import com.demo.hm.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {

}
