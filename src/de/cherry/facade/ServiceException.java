package de.cherry.facade;

import de.cherry.internal.MyFunction;

public abstract class ServiceException extends RuntimeException {

    public void init(MyFunction<ServiceException> previous){

    }

    public abstract void toit();
}
