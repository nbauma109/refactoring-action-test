/*
 * AutoRefactor - Eclipse plugin to automatically refactor Java code bases.
 *
 * Copyright (C) 2017 Fabrice Tiercelin - initial API and implementation
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program under LICENSE-GNUGPL.  If not, see
 * <http://www.gnu.org/licenses/>.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution under LICENSE-ECLIPSE, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.autorefactor.refactoring.rules.samples_in;

import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Observer;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class HashMapRatherThanTreeMapSample {
    public void replaceTreeMapInstanceCreation() {
        // Keep this comment
        boolean isFooContained = new TreeMap<String, Observer>().containsKey("foo");
        // Keep this comment too
        int size = new TreeMap<>(new java.util.HashMap<>()).size();
    }

    public void replaceRawTreeMap() {
        // Keep this comment
        boolean isFooContained = new TreeMap().containsKey("foo");
        // Keep this comment too
        int size = new TreeMap(new java.util.HashMap<>()).size();
    }

    public void replaceFullyQualifiedTreeMap() {
        // Keep this comment
        boolean isFooContained = new java.util.TreeMap<Integer, Date>().containsKey("foo");
        // Keep this comment too
        int size = new java.util.TreeMap(new java.util.HashMap<>()).size();
    }

    public void replaceTreeMapVariableDeclaration() {
        // Keep this comment
        TreeMap<String, String> map = new TreeMap<>();
    }

    public void replaceMapVariableDeclaration() {
        // Keep this comment
        Map<String, String> map = new TreeMap<>();
    }

    public void replaceTreeMapVariableUse() {
        // Keep this comment
        TreeMap<String, String> map = new TreeMap<>();
        // Keep this comment too
        map.put("foo", "bar");
    }

    public void replaceMapVariableUse() {
        // Keep this comment
        Map<String, String> map = new TreeMap<>();
        // Keep this comment too
        map.put("foo", "bar");
    }

    public Date replaceTreeMapWithLoop(List<Date> dates) {
        // Keep this comment
        TreeMap<Long, Date> map = new TreeMap<>();
        for (Date date : dates) {
            map.put(date.getTime(), date);
        }

        return map.remove(789L);
    }

    public Date replaceMapWithLoop(List<Date> dates) {
        // Keep this comment
        Map<Long, Date> map = new TreeMap<>();
        for (Date date : dates) {
            map.put(date.getTime(), date);
        }

        return map.remove(789L);
    }

    public Observer replaceTreeMapWithModifier() {
        // Keep this comment
        final TreeMap<String, Observer> map = new TreeMap<>();
        return map.get("foo");
    }

    public Observer replaceMapWithModifier() {
        // Keep this comment
        final Map<String, Observer> map = new TreeMap<>();
        return map.get("foo");
    }

    public void replaceTreeMapWithParameter() {
        // Keep this comment
        TreeMap<Long, Long> map = new TreeMap<>(new java.util.HashMap<>());
        map.put(123L, 456L);
    }

    public void replaceMapWithParameter() {
        // Keep this comment
        Map<Long, Long> map = new TreeMap<>(new java.util.HashMap<>());
        map.put(123L, 456L);
    }

    public void doNotReplaceTreeMapWithComparator(Comparator<Long> comparator) {
        TreeMap<Long, Long> map = new TreeMap<>(comparator);
        map.put(123L, 456L);
    }

    public void doNotReplaceMapWithComparator(Comparator<Long> comparator) {
        Map<Long, Long> map = new TreeMap<>(comparator);
        map.put(123L, 456L);
    }

    public boolean replaceReassignedTreeMap() {
        // Keep this comment
        TreeMap<String, String> map1 = new TreeMap<>();
        map1.put("foo", "FOO");

        // Keep this comment too
        TreeMap<String, String> map2 = map1;
        map2.put("bar", "BAR");

        return map2.isEmpty();
    }

    public boolean replaceReassignedMap() {
        // Keep this comment
        Map<String, String> map1 = new TreeMap<>();
        map1.put("foo", "FOO");

        // Keep this comment too
        Map<String, String> map2 = map1;
        map2.put("bar", "BAR");

        return map2.isEmpty();
    }

    public void doNotReplaceTreeMapParameter(TreeMap<String, String> aMap) {
        TreeMap<String, String> map = aMap;
        map.put("foo", "bar");
    }

    public void doNotReplaceTreeMapPassedToAMethod() {
        String text = String.valueOf(new TreeMap<>());
    }

    public TreeMap<Integer, Date> doNotReplaceReturnedTreeMap() {
        return new TreeMap<>();
    }

    public void doNotReplaceReassignedVariable() {
        TreeMap<String, String> map = new TreeMap<>();
        map = new TreeMap<>();
    }

    public Map.Entry<String,Long> doNotReplaceCeilingEntry(String key) {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.ceilingEntry(key);
    }

    public String doNotReplaceCeilingKey(String key) {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.ceilingKey(key);
    }

    public Object doNotReplaceClone() {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.clone();
    }

    public Comparator<? super String> doNotReplaceComparator() {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.comparator();
    }

    public NavigableSet<String> doNotReplaceDescendingKeySet() {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.descendingKeySet();
    }

    public NavigableMap<String,Long> doNotReplaceDescendingMap() {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.descendingMap();
    }

    public Set<Map.Entry<String,Long>> doNotReplaceEntrySet() {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.entrySet();
    }

    public boolean doNotReplaceEquals(Object o) {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.equals(o);
    }

    public Map.Entry<String,Long> doNotReplaceFirstEntry() {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.firstEntry();
    }

    public String doNotReplaceFirstKey() {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.firstKey();
    }

    public Map.Entry<String,Long> doNotReplaceFloorEntry(String key) {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.floorEntry(key);
    }

    public String doNotReplaceFloorKey(String key) {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.floorKey(key);
    }

    public SortedMap<String,Long> doNotReplaceHeadMap(String toKey) {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.headMap(toKey);
    }

    public NavigableMap<String,Long> doNotReplaceHeadMap(String toKey, boolean inclusive) {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.headMap(toKey, inclusive);
    }

    public Map.Entry<String,Long> doNotReplaceHigherEntry(String key) {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.higherEntry(key);
    }

    public String doNotReplaceHigherKey(String key) {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.higherKey(key);
    }

    public String doNotReplaceLastKey() {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.lastKey();
    }

    public Map.Entry<String,Long> doNotReplaceLowerEntry(String key) {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.lowerEntry(key);
    }

    public String doNotReplaceLowerKey(String key) {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.lowerKey(key);
    }

    public NavigableSet<String> doNotReplaceNavigableKeySet() {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.navigableKeySet();
    }

    public Map.Entry<String,Long> doNotReplacePollFirstEntry() {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.pollFirstEntry();
    }

    public Map.Entry<String,Long> doNotReplacePollLastEntry() {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.pollLastEntry();
    }

    public NavigableMap<String,Long> doNotReplaceSubMap(String fromKey, boolean fromInclusive, String toKey,
            boolean toInclusive) {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.subMap(fromKey, fromInclusive, toKey, toInclusive);
    }

    public SortedMap<String,Long> doNotReplaceSubMap(String fromKey, String toKey) {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.subMap(fromKey, toKey);
    }

    public SortedMap<String,Long> doNotReplaceTailMap(String fromKey) {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.tailMap(fromKey);
    }

    public NavigableMap<String,Long> doNotReplaceTailMap(String fromKey, boolean inclusive) {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.tailMap(fromKey, inclusive);
    }

    public Collection<Long> doNotReplaceValues() {
        TreeMap<String, Long> map = new TreeMap<>();
        return map.values();
    }

    public void refactorWithTreeMapMethods(Map<Integer, String> anotherMap) throws InterruptedException {
        // Keep this comment
        TreeMap<Integer, String> map = new TreeMap<>();
        map.containsKey(123);
        map.containsValue("Lorem ipsum");
        map.get(123);
        map.isEmpty();
        map.put(123, "Lorem ipsum");
        map.putAll(anotherMap);
        map.remove(123);
        map.size();
        map.notify();
        map.notifyAll();
        map.wait();
        map.wait(1000);
        map.wait(1000, 1000);
    }

    public void refactorWithMapMethods(Map<Integer, String> anotherMap) throws InterruptedException {
        // Keep this comment
        Map<Integer, String> map = new TreeMap<>();
        map.containsKey(123);
        map.containsValue("Lorem ipsum");
        map.get(123);
        map.isEmpty();
        map.put(123, "Lorem ipsum");
        map.putAll(anotherMap);
        map.remove(123);
        map.size();
        map.notify();
        map.notifyAll();
        map.wait();
        map.wait(1000);
        map.wait(1000, 1000);
    }

    public void replaceTreeMapThroughRunnable() {
        // Keep this comment
        final TreeMap<String, String> map = new TreeMap<>();
        new Runnable() {

            @Override
            public void run() {
                map.put("foo", "bar");
            }
        };
    }

    public void replaceMapThroughRunnable() {
        // Keep this comment
        final Map<String, String> map = new TreeMap<>();
        new Runnable() {

            @Override
            public void run() {
                map.put("foo", "bar");
            }
        };
    }

    public void replaceTreeMapInsideRunnable() {
        // Keep this comment
        final TreeMap<String, String> map = new TreeMap<>();
        map.put("foo", "bar");
        new Runnable() {

            @Override
            public void run() {
                // Keep this comment too
                final TreeMap<String, String> localMap = new TreeMap<>();
                localMap.put("foo", "bar");
            }
        };
    }

    public void replaceMapInsideRunnable() {
        // Keep this comment
        final Map<String, String> map = new TreeMap<>();
        map.put("foo", "bar");
        new Runnable() {

            @Override
            public void run() {
                // Keep this comment too
                final Map<String, String> localMap = new TreeMap<>();
                localMap.put("foo", "bar");
            }
        };
    }
}
