package de.cherry.facade;

public abstract class PayloadException extends RuntimeException{
    abstract Object get();
    abstract Class payloadClass();
}
