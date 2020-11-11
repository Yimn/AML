package com.yimnlu.AML.executor.marker;

import org.slf4j.Marker;

import java.util.Iterator;

public class PreLoadMarker implements Marker {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void add(Marker marker) {

    }

    @Override
    public boolean remove(Marker marker) {
        return false;
    }

    @Override
    public boolean hasChildren() {
        return false;
    }

    @Override
    public boolean hasReferences() {
        return false;
    }

    @Override
    public Iterator<Marker> iterator() {
        return null;
    }

    @Override
    public boolean contains(Marker marker) {
        return false;
    }

    @Override
    public boolean contains(String s) {
        return false;
    }
}
