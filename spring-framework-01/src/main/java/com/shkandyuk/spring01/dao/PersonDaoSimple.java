package com.shkandyuk.spring01.dao;

import com.shkandyuk.spring01.domain.Person;

public class PersonDaoSimple implements PersonDao {


    @Override
    public Person findByName(String name)
    {
        return new Person( name, 10 );
    }
}
