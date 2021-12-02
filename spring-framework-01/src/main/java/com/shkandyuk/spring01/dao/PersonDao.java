package com.shkandyuk.spring01.dao;

import com.shkandyuk.spring01.domain.Person;

public interface PersonDao
{
    Person findByName(String name);
}
