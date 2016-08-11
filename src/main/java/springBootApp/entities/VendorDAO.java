package springBootApp.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface VendorDAO extends CrudRepository<Vendor, Long> {

    List<Game> findByVendorId(long vendorId);
}
