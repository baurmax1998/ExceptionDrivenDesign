package de.cherry.internal;

public class UnexpectedException extends RuntimeException{
    private Exception exeption;

    public UnexpectedException(Exception e) {

        exeption = e;
    }

    public Exception getExeption() {
        return exeption;
    }

    public void setExeption(Exception exeption) {
        this.exeption = exeption;
    }
}
