package stores.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Shopdetail{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
    var name: String=""
    var address: String=""
    var pincode: Long=0
    var mobileno: Long=0
    var deliveryavailablepincodes: LongArray= longArrayOf(0)
    var ownername: String=""
}