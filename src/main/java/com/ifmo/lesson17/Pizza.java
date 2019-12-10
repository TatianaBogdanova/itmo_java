package com.ifmo.lesson17;

public class Pizza {
    private final String dough;
    private final String cheese;
    private int catchup;
    private int tomatos;
    private int peperony;
    private int meat;
    private int fish;

    public static class Builder {
        // Обязательные параметры
        private final String dough;
        private final String cheese;
        // Дополнительные параметры - инициализируются значениями по умолчанию

        private int catchup =0;
        private int tomatos =0;
        private int peperony =0;
        private int meat =0;
        private int fish =0;

        public Builder(String dough, String cheese) {
            this.dough = dough;
            this.cheese = cheese;
        }
        public Builder catchup(int val) {
            catchup = val;
            return this;
        }
        public Builder tomatos(int val) {
            tomatos = val;
            return this;
        }
        public Builder peperony(int val) {
            peperony = val;
            return this;
        }
        public Builder meat(int val) {
            meat = val;
            return this;
        }
        public Builder fish(int val) {
            fish = val;
            return this;
        }
        public Pizza build() {
            return new Pizza(this);
        }
    }
    public Pizza(Builder builder) {
        dough = builder.dough;
        cheese = builder.cheese;
        catchup = builder.catchup;
        tomatos = builder.tomatos;
        peperony = builder.peperony;
        meat = builder.meat;
        fish = builder.fish;
    }
}
