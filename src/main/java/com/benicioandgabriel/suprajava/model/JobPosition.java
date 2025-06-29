package com.benicioandgabriel.suprajava.model;

import java.security.Permission;
import java.util.Set;
import java.util.UUID;

import com.benicioandgabriel.suprajava.model.service.Crud;

public class JobPosition implements Crud<Permission> {
    private final String id;
    private String name;
    private Set<Permission> permissions;

    public JobPosition(String name, Set<Permission> permissions) {
        this.id = UUID.randomUUID().toString();
        setName(name);
        setPermission(permissions);
    }

    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPermission(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermission() {
        return this.permissions;
    }

    // CRUD Permission
    @Override
    public boolean create(Permission permission) {
        if (permission != null) {
            return this.permissions.add(permission);
        } else
            throw new IllegalArgumentException("\n[ERROR: Permission cannot be null.]\n");
    }

    @Override
    public boolean delete(Permission permission) {
        if (permission == null) {
            throw new IllegalArgumentException("\n[ERROR: Permission must not to be null.]\n");
        }
        return this.permissions.removeIf(p -> p.equals(permission));
    }

    @Override
    public Permission update(Permission permission) {
        if (permission == null) {
            throw new IllegalArgumentException("\n[ERROR: Permission must not to be null.]\n");
        }
        if (!this.delete(permission)) {
            throw new IllegalArgumentException("\n[ERROR: Permission not found.]\n");
        }
        if (!this.create(permission)) {
            throw new IllegalArgumentException("\n[ERROR: Permission not updated.]\n");
        }
        for (Permission p : this.permissions) {
            if (p.equals(permission)) {
                return p;
            }
        }
        throw new IllegalArgumentException("\n[ERROR: Permission not updated.]\n");
    }

    @Override
    public Set<Permission> read() {
        return this.getPermission();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof JobPosition)) {
            return false;
        }

        JobPosition other = (JobPosition) o;

        boolean nameEquals = (this.name == null && other.name == null) ||
                (this.name != null && this.name.equals(other.name));

        return nameEquals;
    }

    @Override
    public final int hashCode() {
        int result = 17;
        if (name != null) {
            result = 31 * result + name.hashCode();
        }
        if (getPermission() != null) {
            result = 31 * result + permissions.hashCode();
        }
        return result;
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "id =" + this.getId() +
                ", name =" + this.getName() +
                ", permissions =" + this.getPermission().stream().toString() +
                '}';
    }
}
