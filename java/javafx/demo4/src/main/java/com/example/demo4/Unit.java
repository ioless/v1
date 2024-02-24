package com.example.demo4;

import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Unit extends Pane {

    private String query;
    private int limit;
    private int offset;

    private String name;


    private int x;
    private int y;


    public Unit(Builder builder) {

        query = builder.query;
        limit = builder.limit;
        offset = builder.offset;
        name = builder.name;

        x = builder.x;
        y = builder.y;

        final Text text = new Text(x, y, this.name);
        this.getChildren().add(text);

    }

    public static Builder newBuilder() {

        return new Builder();
    }

    public static final class Builder {

        private String query;
        private int limit;
        private int offset;
        private String name;

        private int x;
        private int y;

        private Builder() {
        }

        public Builder withQuery(String val) {
            query = val;
            return this;
        }

        public Builder withLimit(int val) {
            limit = val;
            return this;
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }


        public Builder withCoords(int x, int y) {
            this.x = x;
            this.y = y;
            return this;
        }

        public Builder withOffset(int val) {
            offset = val;
            return this;
        }

        public Unit build() {
            return new Unit(this);
        }

    }

}
