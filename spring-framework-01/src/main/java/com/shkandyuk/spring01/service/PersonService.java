package com.shkandyuk.spring01.service;

import com.shkandyuk.spring01.domain.Person;

public interface PersonService
{
    Person getByName(String name);
}
