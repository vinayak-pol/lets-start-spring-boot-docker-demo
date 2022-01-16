package com.demo.LetsStart;

import java.util.Objects;

public class DTO {
    int id;
    int name;

    public DTO(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DTO dto = (DTO) o;
        return id == dto.id && name == dto.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "DTO{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
