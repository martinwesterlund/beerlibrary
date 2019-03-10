package se.iths.marweste.beerlibrary;

public class BeerException extends RuntimeException {
    String s;

    public BeerException(String s) {
        this.s=s;
    }
}
