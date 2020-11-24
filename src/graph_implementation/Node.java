package graph_implementation;

import api.geo_location;
import api.node_data;

public class Node implements node_data {
    private final int key;
    private geo_location geoLocation;
    private double weight;
    private String info;
    private int tag;
    public static int count = 0;

    public Node() {
        key = count++;
        tag = 0;
    }

    public Node(int key, int tag, geo_location location, double weight, String info) {
        this.key = key;
        this.tag = tag;
        this.geoLocation = location;
        this.weight = weight;
        this.info = info;
    }

    @Override
    public int getKey() {
        return key;
    }

    @Override
    public geo_location getLocation() {
        return geoLocation;
    }

    @Override
    public void setLocation(geo_location p) {
        this.geoLocation = p;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double w) {
        this.weight = w;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public void setInfo(String s) {
        this.info = s;
    }

    @Override
    public int getTag() {
        return tag;
    }

    @Override
    public void setTag(int t) {
        this.tag = t;
    }
}
