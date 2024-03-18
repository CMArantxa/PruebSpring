package com.ceica.PruebaSpring;

import jakarta.persistence.*;

    @Entity
    @Table(name="rol")
    public class Rol {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer idRol;
        private String description;

        public Rol() {
        }

        public Integer getIdRol() {
            return idRol;
        }

        public void setIdRol(Integer idRol) {
            this.idRol = idRol;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Rol{" +
                    "idRol=" + idRol +
                    ", description='" + description + '\'' +
                    '}';
        }
    }
