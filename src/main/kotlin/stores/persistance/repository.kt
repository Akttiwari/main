package stores.persistance

import stores.model.Shopdetail
import org.springframework.data.repository.CrudRepository
interface ShopRepository : CrudRepository<Shopdetail,Long>
