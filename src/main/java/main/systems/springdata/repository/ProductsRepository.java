package main.systems.springdata.repository;

import main.systems.springdata.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
    List<Products> findProductByCostBetween(BigDecimal minCost, BigDecimal maxCost);
    List<Products> findProductByCostLessThan(BigDecimal maxCost);
    List<Products> findProductByCostGreaterThan(BigDecimal minCost);
    List<Products> findProductByTitle(String title);
}
