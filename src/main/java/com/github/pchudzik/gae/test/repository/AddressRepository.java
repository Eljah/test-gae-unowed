package com.github.pchudzik.gae.test.repository;

import com.github.pchudzik.gae.test.domain.Address;
import com.github.pchudzik.gae.test.domain.Student;
import com.google.appengine.api.datastore.Key;

import java.util.List;

/**
 * Created by eljah32 on 10/16/2017.
 */
public interface AddressRepository  extends CustomRepository<Address, Key> {
    List<Address> findTop1ByCountry(String country);
}
