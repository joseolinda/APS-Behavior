public class Client {
    public static void main(String[] args) {
        // Criação do objeto Editor
        Editor editor = new Editor();
        
        // Modificando o estado do editor
        editor.setText("Texto inicial");
        editor.setCursor(0, 0);
        editor.setSelectionWidth(10);
        
        // Exibição do estado inicial
        System.out.println("Estado inicial:");
        System.out.println("Texto: " + editor.getText());
        System.out.println("Cursor: (" + editor.getCursorX() + ", " + editor.getCursorY() + ")");
        System.out.println("Seleção: " + editor.getSelectionWidth());
        
        // Criação do objeto Command para gerenciar os estados
        Command command = new Command(editor);
        
        // Salvando o estado atual
        command.makeBackup();
        
        // Modificando o estado novamente
        editor.setText("Texto modificado");
        editor.setCursor(1, 1);
        editor.setSelectionWidth(5);
        
        // Exibição do estado modificado
        System.out.println("\nEstado modificado:");
        System.out.println("Texto: " + editor.getText());
        System.out.println("Cursor: (" + editor.getCursorX() + ", " + editor.getCursorY() + ")");
        System.out.println("Seleção: " + editor.getSelectionWidth());
        
        // Desfazendo a modificação
        // Solicitar ao usuário para desfazer
        System.out.println("\nDesfazer a modificação? (s/n)");
        String comando = System.console().readLine();

        if (comando.equals("s")) {
            command.undo();
        
            // Exibição do estado após desfazer
            System.out.println("\nEstado após desfazer:");
            System.out.println("Texto: " + editor.getText());
            System.out.println("Cursor: (" + editor.getCursorX() + ", " + editor.getCursorY() + ")");
            System.out.println("Seleção: " + editor.getSelectionWidth());
        }
    }
}
