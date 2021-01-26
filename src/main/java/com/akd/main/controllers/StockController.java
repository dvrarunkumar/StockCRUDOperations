package com.akd.main.controllers;

import com.akd.main.model.Stock;
import com.akd.main.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;*/
import org.springframework.web.bind.annotation.*;

// import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/* Arun - The controller will hold all CRUD Operations */

@RestController
public class StockController {

    @Autowired
    StockRepository stockRepository;

    /*   public StockController(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    } */

    // @RequestMapping(value = "/stocks", method = RequestMethod.GET)
    // public DataTablesOutput<Stock> list(@Valid DataTablesInput input) {return stockRepository.findAll(input);}

    // http://localhost:8081/arun/stocks/
    @GetMapping("/stocks")
    public List<Stock> getStocks() {
        return stockRepository.findAll();
    }

    // http://localhost:8081/arun/stocks/101
    @GetMapping("/stocks/{stockId}")
    public Stock getProduct(@PathVariable("stockId") int stockId) {
        return stockRepository.findById(stockId).get();
    }

    // http://localhost:8081/arun/stocks/symbol/ICIBAN
    @GetMapping("/stocks/symbol/{stockSymbol}")
    public List<Stock> getStockByName(@PathVariable("stockSymbol") String stockSymbol) {
        return stockRepository.findByStockSymbol(stockSymbol);
    }

    /*
    You need to submit this delete request from Postman and not from browser
    when you access an URL in browser, browser always sends a GET request,
    whereas your Resource is expecting a DELETE request. Hence you are getting the error.
    You can use tools like Postman or you can write a small code in Javascript to send a DELETE
    request to the server*/
    // http://localhost:8081/arun/stocks/delete/id/100

    @DeleteMapping("/stocks/delete/id/{stockId}")
    public void delete(@PathVariable("stockId") int stockId) {
        stockRepository.deleteById(stockId);
    }

    @PutMapping("/stocks/update/id/{stockId}")
    public void updateStock(@PathVariable("stockId") int stockId) {
        Optional<Stock> stk = stockRepository.findById(stockId);
        if(stk.isPresent()) {
            Stock existingStock = stk.get();
            existingStock.setIndustry("General");
            stockRepository.save(existingStock);
        }
    }


/*    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public DataTablesPojo list() {
        DataTablesPojo d = new DataTablesPojo();
        List<Stock> stocks = (List<Stock>) stockRepository.findAll();
        d.setDraw(1);
        d.setRecordsFiltered(stocks.size());
        d.setRecordsTotal(stocks.size());
        d.setData(stocks);
        return d;
    };*/


}
