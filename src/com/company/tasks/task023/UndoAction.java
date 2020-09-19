package com.company.tasks.task023;

interface UndoAction {
    void undo();
}

class UndoAppendAction implements UndoAction{
    StringBuilder stringBuilder;
    int start, end;

    public UndoAppendAction (StringBuilder stringBuilder, int start, int end) {
        this.stringBuilder = stringBuilder;
        this.start = start;
        this.end = end;
    }

    @Override
    public void undo() {
        stringBuilder.delete(start, end);
        return;
    }
}

class UndoDeleteAction implements UndoAction {
    StringBuilder stringBuilder;
    int start;
    String str;

    public UndoDeleteAction(StringBuilder stringBuilder, int start, String str) {
        this.stringBuilder = stringBuilder;
        this.start = start;
        this.str = str;
    }

    @Override
    public void undo() {
        stringBuilder.insert(start, str);
        return;
    }
}