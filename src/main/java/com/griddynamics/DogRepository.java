package com.griddynamics;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by korobochka on 4/6/16.
 */
@RepositoryRestResource(collectionResourceRel = "dog", path = "dog")
public interface DogRepository extends CrudRepository<Dog, Long> {
}
