package example.mongodb

import io.micronaut.data.mongodb.annotation.MongoRepository
import io.micronaut.data.repository.CrudRepository
import io.micronaut.data.repository.jpa.JpaSpecificationExecutor

@MongoRepository
interface BookRepository: CrudRepository<Device,String>, JpaSpecificationExecutor<Device> {

}