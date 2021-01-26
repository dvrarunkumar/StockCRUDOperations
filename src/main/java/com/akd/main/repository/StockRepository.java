package com.akd.main.repository;

import com.akd.main.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

    /*	@Query(value="select * from Users u where u.last_name = :lastName",nativeQuery=true)
	List<UserEntity> findUserByLastName(@Param("lastName") String lastName); */

    @Query(value="select * from portfolio_stocks s where s.stock_symbol = :stockSymbol",nativeQuery=true)
    List<Stock> findByStockSymbol(@Param("stockSymbol") String stockSymbol);



}
