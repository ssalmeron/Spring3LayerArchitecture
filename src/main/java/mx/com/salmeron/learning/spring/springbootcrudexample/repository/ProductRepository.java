package mx.com.salmeron.learning.spring.springbootcrudexample.repository;

import mx.com.salmeron.learning.spring.springbootcrudexample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
