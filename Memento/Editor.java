// Classe Editor que atua como originador
public class Editor {
    private String text;
    private int curX, curY, selectionWidth;

    // Métodos para definir o estado do Editor
    public void setText(String text) {
        this.text = text;
    }

    public void setCursor(int x, int y) {
        this.curX = x;
        this.curY = y;
    }

    public void setSelectionWidth(int width) {
        this.selectionWidth = width;
    }

    // Método para salvar o estado atual dentro de um Memento
    public Snapshot createSnapshot() {
        return new Snapshot(this, text, curX, curY, selectionWidth);
    }

    // Outros métodos de Editor...
    public String getText() {
        return text;
    }

    public int getCursorX() {
        return curX;
    }

    public int getCursorY() {
        return curY;
    }

    public int getSelectionWidth() {
        return selectionWidth;
    }

}