package com.shkandyuk.spring01.service;

import com.shkandyuk.spring01.dao.PersonDao;
import com.shkandyuk.spring01.domain.Person;

public class PersonSeviceImpl implements PersonService {
    private final PersonDao dao;

    public PersonSeviceImpl(PersonDao dao) { this.dao = dao; }
    @Override
    public Person getByName(String name) {
        return dao.findByName(name);
    }
}
