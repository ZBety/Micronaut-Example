package example.mongodb

import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.jpa.repository.criteria.Specification
import io.micronaut.data.repository.jpa.criteria.PredicateSpecification
import javax.persistence.criteria.Predicate


@MappedEntity
class Device {

    @Id
    var id: String? = null

    var macAddress: String? = null

    var name: String? = null

    var status: String? = null

    /*
        服务点位ID
     */
    var serviceId: String? = null

    var disabled: Boolean = false

    var createdTime: Long? = null

    override fun toString(): String {
        return "Device(id=$id, macAddress=$macAddress, name=$name, status=$status, serviceId=$serviceId, disabled=$disabled, createdTime=$createdTime)"
    }

}


data class DeviceQuery(var id: String, var name: String, var createdTime: Long) {

//    fun toSpecification() = PredicateSpecification<Device>.and { root, cb ->
//        val x = mutableListOf<Predicate>()
//
//        x += (cb.equal(root.get<String>("id"), this.id))
//        x += (cb.gt(root.get("createdTime"), this.createdTime))
//        println("success")
//        cb.and(*x.toTypedArray())
//
//    }
}
