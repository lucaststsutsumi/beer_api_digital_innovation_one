package one.digitalinnovation.beerstock.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockLessThanZeroException extends Exception {
    public BeerStockLessThanZeroException(Long id) {
        super(String.format("Beers with %s ID to decrement informed make stock capacity less than 0", id));
    }
}
