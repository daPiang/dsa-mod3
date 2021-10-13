import javax.swing.*;


class GUI extends JFrame{

    public static void guiBuilder() {

        //variables and shit
        JLabel label;
        label = new JLabel("Name:");

        JFrame frame;
        frame = new JFrame("label");

        JPanel labelPanel, buttonPanel, contentPanel;
        labelPanel = new JPanel();
        buttonPanel = new JPanel();
        contentPanel = new JPanel();

        JButton button1, button2;
        button1 = new JButton("OK");
        button2 = new JButton("Exit");

        //adding shit to other shit
        labelPanel.add(label);
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.PAGE_AXIS));

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));

        
        contentPanel.add(labelPanel);
        contentPanel.add(buttonPanel);

        frame.add(contentPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        
        guiBuilder();
        
    }
}