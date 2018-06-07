package de.cherry;

import de.cherry.internal.MyFunction;
import de.cherry.internal.RequiredException;
import de.cherry.facade.ServiceException;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandler {
    private List<ServiceException> serviceExceptions = new ArrayList<ServiceException>();

    public void register(ServiceException e) {
        serviceExceptions.add(e);
    }

    public void init(){
        for (ServiceException serviceException : serviceExceptions) {

        }
    }

    private void whileErrorService(ServiceException ex
            ,MyFunction<ServiceException> whileHandler
            ,MyFunction<ServiceException> catchHandler){
        whileError(ex
                , e->whileHandler.apply((ServiceException) e)
                , e->catchHandler.apply((RequiredException) e));
    }


    private void whileError(Exception ex
            ,MyFunction<Exception> whileHandler
            ,MyFunction<Exception> catchHandler) {
        while (true){
            try {
                whileHandler.apply(ex);
                return;
            } catch (Exception e){
                 /*if(e.getClass().isAssignableFrom(ex.getClass())){
                    catchHandler.apply(e);
                } else {
                    throw new UnexpectedException(e);
                }*/
                catchHandler.apply(e);
            }
        }
    }



}
