/*
 * AutoRefactor - Eclipse plugin to automatically refactor Java code bases.
 *
 * Copyright (C) 2016 Fabrice Tiercelin - initial API and implementation
 * Copyright (C) 2016 Jean-Noël Rouvignac - renamed test cases
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

public class ObsoleteSwitchSample {
    public int i2 = 0;

    public void replaceIfWithSwitchOnParameter(int i1) {
        int i = 0;
        // Keep this comment
        switch (i1) {
            case 0:
                // Keep this comment too
                i = 0;
                // Keep this comment also
                break;
            case 1:
                i = 10;
                break;
            case 2:
                i = 20;
                break;
            case 3:
                i = 25;
                i = 30;
                break;
            case 4:
                i = 40;
                break;
            case 5:
            case 6:
                i = 60;
                break;
            case 7:
            case 8:
                i = 80;
                break;
            case 9:
            case 10:
                i = 100;
                break;
            case 11:
            case 12:
            case 13:
                i = 130;
                break;
            case 14:
                if (i2 == 1) {
                    i = 140;
                }
                break;
            default:
                if (i2 == 2) {
                    i = 150;
                }
                break;
        }
    }

    public void replaceIfWithSwitchOnLocalVariable() {
        int i1 = 0;
        int i = 0;
        // Keep this comment
        switch (i1) {
            case 0:
                // Keep this comment too
                i = 0;
                // Keep this comment also
                break;
            case 1:
                i = 10;
                break;
            case 2:
                i = 20;
                break;
            case 3:
                i = 25;
                i = 30;
                break;
            case 5:
                break;
            case 4:
                i = 40;
                break;
            default:
                i = 50;
                break;
        }
    }

    public void replaceIfWithSwitchOnField() {
        int i = 0;
        // Keep this comment
        switch (i2) {
            case 0:
                // Keep this comment too
                i = 0;
                // Keep this comment also
                break;
            case 1:
                i = 10;
                break;
            case 2:
                i = 20;
                break;
            default:
                break;
        }
    }

    public void replaceWithSwitchOnField() {
        int i = 0;
        // Keep this comment
        switch (this.i2) {
            case 0:
                // Keep this comment too
                i = 0;
                // Keep this comment also
                break;
            case 1:
                i = 10;
                break;
            case 2:
                i = 20;
                break;
            default:
                break;
        }
    }

    public void replaceIfWithSwitchOnCharacter(char character) {
        int i = 0;
        // Keep this comment
        i = switch (character) {
            case 'a' -> /* Keep this comment too */ 0;
            case 'b' -> 10;
            case 'c' -> 20;
            case 'd' -> 30;
            default -> 40;
        };
    }

    public void replaceIfRemoveDuplicateConditions(char aCharacter) {
        int i = 0;
        i = switch (aCharacter) {
            case 'a' -> 0;
            case 'b' -> 10;
            case 'c' -> 40;
            case 'd' -> 50;
            default -> 60;
        };
    }

    public void replaceIfWithSeveralConditions(char myCharacter) {
        int i = 0;
        i = switch (myCharacter) {
            case 'a' -> 0;
            case 'z' -> 10;
            case 'd', 'b', 'c', 'f' -> 50;
            default -> 60;
        };
    }

    public void replaceIfKeepExistingControlFlowBreaks(byte i1) {
        byte j = 0;
        loop: for (byte i = 0; i < 10; i++) {
            switch (i1) {
                case 0:
                    j = 0;
                    return;
                case 1:
                    j = 10;
                    continue;
                case 2:
                    j = 20;
                    break loop;
                case 3:
                    j = 25;
                    j = 30;
                    break;
                case 4:
                    j = 40;
                    throw new RuntimeException();
                case 5:
                    j = 50;
                    if (i == 5) {
                        throw new RuntimeException();
                    } else {
                        return;
                    }
                case 6:
                    j = 60;
                    if (i == 5) {
                        throw new RuntimeException();
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public void doNotReplaceWithOuterLoopBreak(int i1) {
        int j = 0;
        for (int i = 0; i < 10; i++) {
            if (i1 == 0) {
                j = 0;
            } else if (i1 == 1) {
                j = 10;
            } else if (2 == i1) {
                j = 20;
            } else if (i1 == 3) {
                j = 25;
                j = 30;
            } else if (4 == i1) {
                j = 40;
            } else if (5 == i1) {
                j = 50;
                break;
            }
        }
    }

    public void replaceWithInnerLoopBreak(short i1) {
        short j = 0;
        switch (i1) {
            case 0:
                j = 0;
                break;
            case 1: {
                j = 10;
                short k = 0;
                do {
                    if (j == i1) {
                        break;
                    }
                    k++;
                } while (k < j);
                break;
            }
            case 2:
                j = 20;
                for (short l = 0; l < j; l++) {
                    if (j == i1) {
                        break;
                    }
                }
                break;
            case 3: {
                j = 25;
                j = 30;
                short m = 0;
                while (m < j) {
                    if (j == i1) {
                        break;
                    }
                    m++;
                }
                break;
            }
            case 4:
                j = 40;
                for (short o : new short[] { 1, 2, 3 }) {
                    if (o == i1) {
                        break;
                    }
                }
                break;
            case 5:
                j = 50;
                switch (j) {
                case 0:
                    j = 0;
                    break;
                case 1:
                    j = 10;
                    break;
                }
                break;
            default:
                break;
        }
    }

    public void replaceIfWhenNoVariableNameConflictExists(int i1) {
        int i = 0;
        switch (i1) {
            case 0: {
                int newVariable1 = 0;
                i = newVariable1;
                break;
            }
            case 1: {
                int newVariable2 = 10;
                i = newVariable2;
                break;
            }
            case 2: {
                char newVariable3 = 'a';
                i = newVariable3;
                break;
            }
            default:
                break;
        }
    }

    public void doNotReplaceWhenVariableNameConflicts(int i1) {
        int i = 0;
        switch (i1) {
            case 0: {
                int integer1 = 0;
                i = integer1;
                break;
            }
            case 1: {
                int integer1 = 10;
                i = integer1;
                break;
            }
            case 2: {
                int i2 = 20;
                i = i2;
                break;
            }
            default:
                break;
        }
    }

    public void replaceWhenOutOfScopeVariableNameConflicts(int i1) {
        int i = 0;
        switch (i1) {
            case 0:
                for (int l = 0; l < i; l++) {
                    int integer1 = 0;
                    i = integer1;
                }
                break;
            case 1: {
                int integer1 = 10;
                i = integer1;
                break;
            }
            case 2: {
                int i2 = 20;
                i = i2;
                break;
            }
            default:
                break;
        }
    }

    public void doNotReplaceWhenVariableTypesConflict(int i1) {
        int i = 0;
        switch (i1) {
            case 0: {
                int integer1 = 0;
                i = integer1;
                break;
            }
            case 2: {
                char integer1 = 'a';
                i = integer1;
                break;
            }
            case 3: {
                char c = 'a';
                i = c;
                break;
            }
            default:
                break;
        }
    }

    public void doNotReplaceIfWithoutElseIf(int i1) {
        int i = 0;
        if (i1 == 0) {
            i = 0;
        } else {
            i = 10;
        }
    }

    public void doNotReplaceIfWithoutElse(int i1) {
        int i = 0;
        if (i1 == 0) {
            i = 10;
        }
    }

    public void doNotReplaceWithSwitchOnPrimitiveWrapper(Integer i1) {
        int i = 0;
        if (i1 == 0) {
            i = 0;
        } else if (i1 == 10) {
            i = 10;
        } else if (i1 == 20) {
            i = 20;
        } else {
            i = 30;
        }
    }

    public void doNotRefactorLongVar(long l1) {
        int i = 0;
        if (l1 == 0) {
            i = 0;
        } else if (l1 == 1) {
            i = 10;
        } else if (l1 == 2) {
            i = 20;
        } else if (l1 == 3) {
            i = 30;
        }
    }

    public int replaceIfSuite(int i1) {
        // Keep this comment
        switch (i1) {
            case 0:
                // Keep this comment too
                return 0;
                // Keep this comment also
            case 1:
                return 10;
            case 2:
                return 20;
            case 3:
                return 30;
            case 4:
                return 40;
            case 5:
            case 6:
                return 60;
            case 7:
            case 8:
                return 80;
            case 9:
            case 10:
                return 100;
            case 11:
            case 12:
            case 13:
                return 130;
            case 14:
                if (i2 == 1) {
                    return 140;
                }
                return 145;
            default:
                break;
        }
        return 155;
    }

    public int replaceSuiteThatDoNotFallThrough(int i1) {
        if ((i1 == 0) && (i2 == 1)) {
            return 0;
        }
        // Keep this comment
        switch (i1) {
            case 1:
                // Keep this comment too
                return 10;
                // Keep this comment also
            case 2:
                return 20;
            case 3:
                return 30;
            case 4:
                return 40;
            case 5:
            case 6:
                return 60;
            case 7:
            case 8:
                return 80;
            case 9:
            case 10:
                return 100;
            case 11:
            case 12:
            case 13:
                return 130;
            case 14:
                if (i2 == 1) {
                    return 140;
                }
                return 145;
            default:
                break;
        }
        return 155;
    }

    public int replaceSuiteIgnoring(int i1) {
        if (i1 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 140;
        }
        // Keep this comment
        switch (i1) {
            case 1:
                // Keep this comment too
                return 10;
                // Keep this comment also
            case 2:
                return 20;
            case 3:
                return 30;
            case 4:
                return 40;
            case 5:
            case 6:
                return 60;
            case 7:
            case 8:
                return 80;
            case 9:
            case 10:
                return 100;
            case 11:
            case 12:
            case 13:
                return 130;
            case 14:
                if (i2 == 1) {
                    return 140;
                }
                return 145;
            default:
                break;
        }
        return 155;
    }

    public int replaceMeltCases(int i1) {
        // Keep this comment
        switch (i1) {
            case 0:
                // Keep this comment too
                return 0;
                // Keep this comment also
            case 1:
                return 10;
            case 2:
                return 20;
            case 3:
                return 30;
            case 4:
                return 40;
            case 5:
            case 6:
                return 60;
            case 7:
            case 8:
                return 80;
            case 9:
            case 10:
                return 100;
            case 11:
            case 12:
            case 13:
                return 130;
            case 14:
                if (i2 == 1) {
                    return 140;
                }
                return 145;
            default:
                break;
        }
        return 155;
    }

    public void mergeConsecutiveCases(int i1) {
        int i = 0;
        i = switch (i1) {
            case 0 -> 0;
            case 1 -> 0;
            default -> 1;
        };
    }

    public void mergeLongCases(int i1, boolean interrumpt) {
        int i = 0;
        i = switch (i1) {
            case 0 -> {
                System.out.println("Let's do lots of things!");
                System.out.println(interrumpt ? "And again!" : "And stop.");
                yield 0;
            }
            case 1 -> {
                System.out.println("Let's do lots of things!");
                System.out.println(!interrumpt ? "And stop." : "And again!");
                yield 0;
            }
            default -> 1;
        };
    }

    public void mergeCasesThatFallsThrough(int i1) {
        int i = 0;
        switch (i1) {
        case 0:
            i = 0;
            break;
        case 1:
            i = 1;
        default:
            i = 0;
            break;
        }
    }

    public void mergeCasesWithPreviousCaseThatFallsThrough(int i1) {
        int i = 0;
        switch (i1) {
        case 0:
            i = 1;
        case 1:
            i = 0;
            break;
        default:
            i = 0;
            break;
        }
    }

    public void mergeMultipleCases(int i1) {
        int i = 0;
        i = switch (i1) {
            case 0, 1 -> 0;
            case 2, 3 -> 0;
            case 4 -> 1;
            default -> 1;
        };
    }

    public void mergeCasesWithReturn(int i1) {
        int i = 0;
        switch (i1) {
        case 0:
            i = i + 1;
            return;
        case 1:
            ++i;
            return;
        default:
            i = 1;
        }
    }

    public void mergeCasesWithException(int i1) {
        RuntimeException e = new RuntimeException();
        int i = 0;
        switch (i1) {
        case 0:
            --i;
            throw e;
        case 1:
            i = i - 1;
            throw e;
        default:
            i = 1;
            throw e;
        }
    }

    public void mergeCasesWithContinue(int i1) {
        int i = 0;
        for (int j = 0; j < 10; j++) {
            switch (i1) {
            case 0:
                i = i - 1;
                continue;
            case 1:
                i--;
                continue;
            default:
                i = 1;
            }
        }
    }

    public void doNotMergeCasesWithoutBreaks(int i1) {
        int i = 0;
        switch (i1) {
        case 0:
            i = 0;
        case 1:
            i = 0;
        default:
            i = 1;
        }
    }

    public void doNotMergeCasesWithPrecedingFallthroughCases(int i1) {
        int i = 0;
        switch (i1) {
        case 0:
            i = 1;
        case 1:
            i = 0;
            break;
        case 2:
            i = 2;
        default:
            i = 0;
            break;
        }
    }

    public void mergeCasesWithVariableDeclaration(int i1) {
        switch (i1) {
        case 0:
                int i = 0;
                break;
        case 1:
            i = 0;
            break;
        default:
            i = 0;
            break;
        }
    }

    public void mergeCasesWithUnusedVariable(int i1) {
        int i = 0;
        switch (i1) {
        case 0:
            i++;
            break;
        case 1:
                int i2 = 0;
                break;
        case 2:
            i = i + 1;
            break;
        }
    }

    public void doNotMergeCasesWithVariableNameConflict(int i1) {
        switch (i1) {
        case 0:
            i2 = 0;
            break;
        case 1:
                int i2 = 0;
                break;
        default:
            i2 = 0;
            break;
        }
    }
}
