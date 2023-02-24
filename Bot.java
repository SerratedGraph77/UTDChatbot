import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bot extends JFrame {

    private JTextArea ChatArea = new JTextArea();
    private JTextField ChatBox = new JTextField();

    public Bot()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setTitle("ChatBot");

        //For Bot Text Box
        frame.add(ChatArea);
        frame.add(ChatBox);

        ChatArea.setSize(500, 400);
        ChatArea.setLocation(2, 2);

        //For User Text Box
        ChatBox.setSize(540, 30);
        ChatBox.setLocation(2, 500);

        ChatBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO: Write code for instructions
                String gtext = ChatBox.getText().toLowerCase();
                ChatArea.append("YOU ->" + gtext + "\n");
                ChatBox.setText("");

                if(gtext.contains("hi")){
                    bot("Hello!");
                }
                else{
                    bot("I do not understand that question yet");
                }
            }
        });
    }

    private void bot(String input)
    {
        ChatArea.append("Bot ->" + input + "\n");
    }

    public static void main(String[] args) {
        new Bot();
    }
}