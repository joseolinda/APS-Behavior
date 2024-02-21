// Classe Memento que armazena o estado anterior do Editor
class Snapshot {
    private Editor editor;
    private String text;
    private int curX, curY, selectionWidth;

    // Construtor do Memento
    public Snapshot(Editor editor, String text, int curX, int curY, int selectionWidth) {
        this.editor = editor;
        this.text = text;
        this.curX = curX;
        this.curY = curY;
        this.selectionWidth = selectionWidth;
    }

    // Método para restaurar o estado do Editor
    public void restore() {
        editor.setText(text);
        editor.setCursor(curX, curY);
        editor.setSelectionWidth(selectionWidth);
    }
}