package de.cherry.internal;

import de.cherry.facade.ServiceException;

public class RequiredException extends ServiceException {
    private ServiceException serviceException;
    private Class requiredClass;

    public RequiredException(ServiceException serviceException, Class requiredClass) {
        this.serviceException = serviceException;
        this.requiredClass = requiredClass;
    }

    public ServiceException getPetitioner() {
        return serviceException;
    }

    public Class requiredClass() {
        return requiredClass;
    }
}
