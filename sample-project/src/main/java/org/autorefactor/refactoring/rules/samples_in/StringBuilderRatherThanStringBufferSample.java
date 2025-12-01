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

import java.util.Date;
import java.util.List;

public class StringBuilderRatherThanStringBufferSample {
    private StringBuffer doNotReplaceField = new StringBuffer("foo");

    public void replaceStringBufferInstanceCreation() {
        // Keep this comment
        int capacity = new StringBuffer().capacity();
        int capacity2 = new StringBuffer("foo").capacity();
        String p4 = new java.lang.StringBuffer().append("bar").toString();
        String p5 = new StringBuffer().append(true).toString();
        String p6 = new StringBuffer().append('h').toString();
        String p8 = new StringBuffer().append(12.56).toString();
        String p9 = new StringBuffer().append(12L).toString();
        String p10 = new StringBuffer().append(new Object()).toString();
    }

    public void replaceStringBuffer() {
        // Keep this comment
        StringBuilder buffer = new StringBuilder();
        StringBuilder buffer1 = new StringBuilder("foo");
        StringBuilder buffer2 = new StringBuilder();
        buffer2.append("bar");

        StringBuilder buffer3 = new StringBuilder().append(true);
    }

    public String replaceStringBufferWithLoop(List<Date> dates) {
        // Keep this comment
        StringBuilder buffer = new StringBuilder();
        for (Date date : dates) {
            buffer.append(date.getTime()).append(";");
        }

        return buffer.toString();
    }

    public void replaceStringBufferWithModifier() {
        // Keep this comment
        final StringBuilder buffer = new StringBuilder();
        buffer.append("foo");
    }

    public void replaceStringBufferWithParameter() {
        // Keep this comment
        StringBuilder buffer = new StringBuilder("foo");
        buffer.append('h');
    }

    public String replaceReassignedStringBuffer() {
        // Keep this comment
        StringBuilder buffer1 = new StringBuilder();
        buffer1.append("foo");

        StringBuilder buffer2 = buffer1;
        buffer2.append("bar");

        return buffer2.toString();
    }

    public String replaceStringBufferWithSameName(boolean b) {
        if (b) {
            // Keep this comment
            StringBuilder buffer = new StringBuilder();
            buffer.append("foo");
        }

        return """
            foo""";
    }

    public void doNotReplaceObject() {
        Object buffer = new StringBuffer();
    }

    public void doNotReplaceStringBufferParameter(StringBuffer aBuffer) {
        StringBuffer buffer = aBuffer;
        buffer.append("foo");
    }

    public void doNotReplaceCastedStringBuffer() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("foo");
    }

    public void doNotReplaceStringBufferWithInstanceof() {
        StringBuilder buffer = new StringBuilder();
        if (buffer instanceof StringBuffer) {
            buffer.append("foo");
        }
    }

    public void doNotReplaceStringBufferPassedToAMethod() {
        String p3 = String.valueOf(new StringBuffer());
    }

    public StringBuffer doNotReplaceReturnedStringBuffer() {
        return new java.lang.StringBuffer();
    }

    public void doNotReplaceReassignedVariable() {
        StringBuilder buf = new StringBuilder();
        buf = new StringBuilder();

        StringBuilder buf2 = new StringBuilder().append("foo");
        buf2 = new StringBuilder();
    }

    public void doNotReplaceThreadSharedStringBuffer() {
        final StringBuilder buffer = new StringBuilder();
        new Runnable() {

            @Override
            public void run() {
                buffer.append("No conflict please");
            }
        };
    }
}
