package Pract_24;

import javax.swing.*;
import java.awt.*;

interface IDocument {
    void save();
    void open();
    String getType();
    void setContent(String content);
    String getContent();
}

class TextDocument implements IDocument {
    private String content;

    @Override
    public void save() {
        System.out.println("Сохранение текстового документа...");
    }

    @Override
    public void open() {
        System.out.println("Открытие текстового документа...");
    }

    @Override
    public String getType() {
        return "Текстовый документ";
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen();
}


class TextDocumentFactory implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        return new TextDocument();
    }
}

class Application {
    private IDocument document;
    private ICreateDocument documentFactory;

    private JFrame frame;
    private JTextArea textArea;
    private JMenuBar menuBar;

    public Application(ICreateDocument factory) {
        this.documentFactory = factory;
        initializeUI();
    }

    private void initializeUI() {
        frame = new JFrame("Текстовый редактор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        textArea = new JTextArea();
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        menuBar = new JMenuBar();
        createMenu();

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }

    private void createMenu() {
        JMenu fileMenu = new JMenu("File");

        JMenuItem newItem = new JMenuItem("New");
        newItem.addActionListener(e -> newDocument());
        fileMenu.add(newItem);

        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(e -> openDocument());
        fileMenu.add(openItem);

        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(e -> saveDocument());
        fileMenu.add(saveItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> exit());
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
    }

    public void newDocument() {
        document = documentFactory.createNew();
        textArea.setText("");
        System.out.println("Создан новый документ: " + document.getType());
    }

    public void openDocument() {
        document = documentFactory.createOpen();
        document.open();
        textArea.setText("Загружается текст документа...");
    }

    public void saveDocument() {
        if (document != null) {
            document.setContent(textArea.getText());
            document.save();
        } else {
            System.out.println("Документ не создан.");
        }
    }

    public void exit() {
        System.out.println("Выход из приложения...");
        frame.dispose();
    }
}

public class Main {
    public static void main(String[] args) {
        ICreateDocument factory = new TextDocumentFactory();
        new Application(factory);
    }
}


