package com.example.mapeo.mappers;

import java.util.List;

public interface BaseResponseMapper<I, O> {

    O entityToDto(I user);

    List<O> entityListToDtoList(List<I> list);

}
