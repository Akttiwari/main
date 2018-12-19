package stores.controller

import stores.model.Shopdetail
import stores.persistance.ShopRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/noOfStores")
class CustomerController(val repository: ShopRepository) {

    @GetMapping
    fun findAll() = repository.findAll()

    @PostMapping
    fun addCustomer(@RequestBody vendor: Shopdetail)
            = repository.save(vendor)

    @PutMapping("/{id}")
    fun updateCustomer(@PathVariable id: Long, @RequestBody vendor: Shopdetail) {
        assert(vendor.id == id)
        repository.save(vendor)
    }

    @DeleteMapping("/{id}")
    fun removeCustomer(@PathVariable id: Long)
            = repository.deleteById(id)

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long)
            = repository.findById(id)
    @GetMapping("/{pincode}")
    fun getByPincode(@PathVariable pincode: Long)
            = repository.findById(pincode)
}