package com.benicioandgabriel.suprajava.model.service;

import java.util.Collection;

public interface Crud<T> {

    public boolean create(T t);

    public boolean delete(T t);

    public T update(T t);

    public Collection<T> read();
}
