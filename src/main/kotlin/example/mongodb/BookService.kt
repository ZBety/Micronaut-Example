package example.mongodb

import io.micronaut.data.repository.jpa.criteria.PredicateSpecification
import io.micronaut.data.runtime.criteria.get
import io.micronaut.data.runtime.criteria.where
import jakarta.inject.Singleton

@Singleton
class BookService(private var bookRepository: BookRepository) {

    fun list(): MutableList<Device> {
        val where = where<Device> {
            and {
                root[Device::id] eq "17e7f061-29dc-493a-abb8-92ad477f9ae6"
            }
        }

        val specification = PredicateSpecification<Device> { root, cb ->
            cb.and(cb.equal(root[Device::id],"17e7f061-29dc-493a-abb8-92ad477f9ae6"))
        }

//        return bookRepository.findAll(where)

        return mutableListOf();
    }

}