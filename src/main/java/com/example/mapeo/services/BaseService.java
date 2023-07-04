package com.example.mapeo.services;

import com.example.mapeo.mappers.BaseRequestMapper;
import com.example.mapeo.mappers.BaseResponseMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class BaseService<E, ID, I, O> {

    protected abstract JpaRepository<E, ID> getRepository();

    protected abstract BaseRequestMapper<I, E> getInputMapper();

    protected abstract BaseResponseMapper<E, O> getOutputMapper();

    public List<O> list(){
        return this.getOutputMapper().entityListToDtoList(this.getRepository().findAll());
    }

    public O show(ID id) {
        Optional<E> o = this.getRepository().findById(id);
        return (O) o.map(obj -> this.getOutputMapper().entityToDto(obj)).orElse(null);
    }

    public O store(I input){
        return this.getOutputMapper().entityToDto(this.getRepository().save(this.getInputMapper().dtoToEntity(input)));
    }

    public void deleteById(ID id) {
        this.getRepository().deleteById(id);
    }
}
