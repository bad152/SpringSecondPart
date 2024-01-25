package ru.appline.logic;



public class Compass {


    public static Object IntegerRange;

    public class IntegerRange {
        private int min;
        private int max;

        public IntegerRange(int min, int max) {
            this.min = min;
            this.max = max;
        }

        IntegerRange north = new IntegerRange(min, max);
        IntegerRange northEast = new IntegerRange(min, max);
        IntegerRange east = new IntegerRange(min, max);
        IntegerRange southEast = new IntegerRange(min, max);
        IntegerRange south = new IntegerRange(min, max);
        IntegerRange southWest = new IntegerRange(min, max);
        IntegerRange west = new IntegerRange(min, max);
        IntegerRange northWest = new IntegerRange(min, max);



        public void Compass(IntegerRange north, IntegerRange northEast, IntegerRange east, IntegerRange southEast, IntegerRange south, IntegerRange southWest, IntegerRange west, IntegerRange northWest) {
            this.north = north;
            this.northEast = northEast;
            this.east = east;
            this.southEast = southEast;
            this.south = south;
            this.southWest = southWest;
            this.west = west;
            this.northWest = northWest;
        }

        public IntegerRange getNorth() {
            return north;
        }

        public void setNorth(IntegerRange north) {
            this.north = north;
        }

        public IntegerRange getNorthEast() {
            return northEast;
        }

        public void setNorthEast(IntegerRange northEast) {
            this.northEast = northEast;
        }

        public IntegerRange getEast() {
            return east;
        }

        public void setEast(IntegerRange east) {
            this.east = east;
        }

        public IntegerRange getSouthEast() {
            return southEast;
        }

        public void setSouthEast(IntegerRange southEast) {
            this.southEast = southEast;
        }

        public IntegerRange getSouth() {
            return south;
        }

        public void setSouth(IntegerRange south) {
            this.south = south;
        }

        public IntegerRange getSouthWest() {
            return southWest;
        }

        public void setSouthWest(IntegerRange southWest) {
            this.southWest = southWest;
        }

        public IntegerRange getWest() {
            return west;
        }

        public void setWest(IntegerRange west) {
            this.west = west;
        }

        public IntegerRange getNorthWest() {
            return northWest;
        }

        public void setNorthWest(IntegerRange northWest) {
            this.northWest = northWest;
        }
    }
}