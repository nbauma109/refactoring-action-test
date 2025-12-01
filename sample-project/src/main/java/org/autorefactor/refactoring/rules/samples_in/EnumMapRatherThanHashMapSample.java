/*
 * AutoRefactor - Eclipse plugin to automatically refactor Java code bases.
 *
 * Copyright (C) 2017 Andrei Paikin - Initial API and implementation
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

import java.time.DayOfWeek;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnumMapRatherThanHashMapSample {
    enum Example {
        ONE, TWO, THREE
    }

    public Map<DayOfWeek, String> refactorVariableDeclarationStatement() {
        return new HashMap<>();
    }

    public Map<DayOfWeek, String> refactorVariableDeclarationStatementWithDiamond() {
        return new HashMap<>();
    }

    public Map<DayOfWeek, String> refactorReturnStatement() {
        // Keep this comment
        return new HashMap<>();
    }

    public Map<Example, List<String>> refactorReturnStatementWithParameterizedType() {
        // Keep this comment
        return new HashMap<>();
    }

    public Map<Example, String> refactorReturnStatementWithDiamondOperator() {
        // Keep this comment
        return new HashMap<>();
    }

    public Map<Example, String> refactorVariableDeclarationStatementWithParentheses() {
        return ((new HashMap<>()));
    }

    public Map<Example, long[]> refactorAssignment() {
        // Keep this comment
        Map<Example, long[]> map;
        return new HashMap<>();
    }

    public Map<Example, String> refactorConditionalAssignment(boolean isFeatureEbabled) {
        // Keep this comment
        Map<Example, String> map;
        return isFeatureEbabled ? new HashMap<>()
                : new HashMap<>();
    }

    public Map<Example, String> refactorConstrutorWithInt() {
        return new HashMap<>(1);
    }

    public Map<Example, String> refactorConstrutorWithIntAndFloat() {
        return new HashMap<>(1, 0.75F);
    }

    public Map<Example, String> doNotRefactorConstrutorWithMap(
            Map<Example, String> m) {
        return new HashMap<>(m);
    }

    public Map<Example, String> refactorConstrutorWithEnumMap(
            java.util.EnumMap<Example, String> m) {
        return new HashMap<>(m);
    }

    public void doNotRefactorMethodArgument() {
        Map<Example, String> map = Collections
                .synchronizedMap(new HashMap<Example, String>());
        System.out.println(map);
    }

    public Map<Example, String> doNotRefactor() {
        Map<Example, String> map = new java.util.EnumMap<>(Example.class);
        map.putAll(new java.util.EnumMap<>(Example.class));
        return map;
    }

    public Map<Example, String> doNotRefactorAnonymousClass() {
        return new HashMap<>() {
            @Override
            public String toString() {
                return super.toString();
            }
        };
    }

}