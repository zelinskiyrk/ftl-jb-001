package com.company.tasks.task023;

import java.util.Stack;

public class MyStringBuilder {
    StringBuilder stringBuilder = new StringBuilder();
    Stack<UndoAction> actions = new Stack<>();

    MyStringBuilder append (String string) {
        stringBuilder.append(string);
        actions.add(new UndoAppendAction(stringBuilder,stringBuilder.length() - string.length(), stringBuilder.length()));
        return this;
    }

    MyStringBuilder delete (int start, int end) {
        String substr = stringBuilder.substring(start , end);
        stringBuilder.delete(start, end);
        actions.add(new UndoDeleteAction(stringBuilder, start, substr));
        return this;
    }

    MyStringBuilder undo() {
        actions.pop().undo();
        return this;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
