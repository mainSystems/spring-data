package main.systems.springdata.repository;

import main.systems.springdata.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
    List<Products> findProductByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);
    List<Products> findProductByPriceLessThan(BigDecimal maxPrice);
    List<Products> findProductByPriceGreaterThan(BigDecimal minPrice);
    List<Products> findProductByName(String name);
}
