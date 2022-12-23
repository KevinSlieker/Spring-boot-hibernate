package com.example.springboothibernate.model;

import java.time.LocalDate;
import java.util.List;

public class TotalAgePeople {
    private LocalDate date = LocalDate.now();
    private List<PersonWithAge> list;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<PersonWithAge> getList() {
        return list;
    }

    public void setList(List<PersonWithAge> list) {
        this.list = list;
    }
}
