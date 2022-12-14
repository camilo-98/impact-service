/*
 * Jose Daniel Jiménez Medina - Cristian Camilo Niño Rincón
 *
 */
package com.tourism.api;

import com.tourism.model.BaseDTO;
import com.tourism.model.PageData;
import com.tourism.model.ErrorResponse;
import com.tourism.model.PersistentDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface TemplateAPI <T extends PersistentDTO, P extends PersistentDTO, ID extends Serializable> {

    ResponseEntity<T> get(@PathVariable ID id);
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<T> create(@RequestBody T dto);

    ResponseEntity<T> patch(@RequestBody P partial, @PathVariable ID id);

    ResponseEntity<T> update(@RequestBody T dto, @PathVariable ID id);

    ResponseEntity<PageData<T>> list (Pageable pageable);

    ResponseEntity<ErrorResponse> delete(@PathVariable ID id);

}
