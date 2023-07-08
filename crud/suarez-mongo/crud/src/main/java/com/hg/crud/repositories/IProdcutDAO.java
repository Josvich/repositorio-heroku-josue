package com.hg.crud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hg.crud.models.ProductDTO;
@Repository
public interface IProdcutDAO extends MongoRepository<ProductDTO,String>{

}
