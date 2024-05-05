package com.nagarro.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;


import java.util.List;

public class PageableCreator {

    public static <T> Page<T> createPageFromList(List<T> list, PageRequest pageRequest) {
        int start = (int) pageRequest.getOffset();
        int end = Math.min((start + pageRequest.getPageSize()), list.size());

        List<T> content = list.subList(start, end);

        return new PageImpl<>(content, pageRequest, list.size());
    }
}