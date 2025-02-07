import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame {
    JLabel label1, label2, label3, label4, label5;
    JTextField t1, t2;
    JRadioButton male, female;
    JComboBox<String> day, month, year;
    JTextArea ta1;
    JCheckBox terms;
    JButton submit;
    JLabel msg;
    JLabel nameLabel, mobileLabel, genderLabel, dobLabel, addressLabel;

    MyFrame() {
        setTitle("Registration Form");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        // Label1 - Name
        label1 = new JLabel("Name");
        label1.setBounds(20, 50, 100, 20);
        c.add(label1);
        t1 = new JTextField();
        t1.setBounds(130, 50, 150, 20);
        c.add(t1);

        // Label2 - Mobile
        label2 = new JLabel("Mobile");
        label2.setBounds(20, 100, 100, 20);
        c.add(label2);
        t2 = new JTextField();
        t2.setBounds(130, 100, 150, 20);
        c.add(t2);

        // Label3 - Gender
        label3 = new JLabel("Gender");
        label3.setBounds(20, 150, 100, 20);
        c.add(label3);
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(130, 150, 100, 20);
        female.setBounds(230, 150, 100, 20);
        male.setSelected(true);
        c.add(male);
        c.add(female);

        // Button Group for Gender
        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);

        // Label4 - DOB
        label4 = new JLabel("DOB");
        label4.setBounds(20, 200, 100, 20);
        c.add(label4);

        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.valueOf(i + 1);
        }

        String[] months = new String[12];
        for (int i = 0; i < 12; i++) {
            months[i] = String.valueOf(i + 1);
        }

        String[] years = new String[25];
        for (int i = 0; i < 25; i++) {
            years[i] = String.valueOf(2000 + i);
        }

        day = new JComboBox<>(days);
        month = new JComboBox<>(months);
        year = new JComboBox<>(years);

        day.setBounds(130, 200, 50, 20);
        month.setBounds(190, 200, 50, 20);
        year.setBounds(250, 200, 60, 20);

        c.add(day);
        c.add(month);
        c.add(year);

        // Label5 - Address
        label5 = new JLabel("Address");
        label5.setBounds(20, 250, 100, 20);
        c.add(label5);
        ta1 = new JTextArea();
        ta1.setBounds(130, 250, 200, 60);
        ta1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        c.add(ta1);

        // Checkbox for terms and conditions
        terms = new JCheckBox("Accept Terms and Conditions");
        terms.setBounds(130, 320, 250, 20);
        c.add(terms);

        // Submit Button
        submit = new JButton("Submit");
        submit.setBounds(130, 360, 100, 20);
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        c.add(submit);

        // Message Label
        msg = new JLabel("");
        msg.setBounds(130, 400, 200, 20);
        c.add(msg);

        // Labels to display submitted data
        nameLabel = new JLabel("");
        nameLabel.setBounds(400, 50, 250, 20);
        nameLabel.setForeground(Color.RED);
        c.add(nameLabel);

        mobileLabel = new JLabel("");
        mobileLabel.setBounds(400, 100, 250, 20);
        mobileLabel.setForeground(Color.RED);
        c.add(mobileLabel);

        genderLabel = new JLabel("");
        genderLabel.setBounds(400, 150, 250, 20);
        genderLabel.setForeground(Color.RED);
        c.add(genderLabel);

        dobLabel = new JLabel("");
        dobLabel.setBounds(400, 200, 250, 20);
        dobLabel.setForeground(Color.RED);
        c.add(dobLabel);

        addressLabel = new JLabel("");
        addressLabel.setBounds(400, 250, 250, 60);
        addressLabel.setForeground(Color.RED);
        c.add(addressLabel);

        // Add Action Listener to Submit Button
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (terms.isSelected()) {
                    msg.setText("Registration Successful!");
                    msg.setForeground(Color.GREEN);

                    // Display submitted data
                    nameLabel.setText("Name: " + t1.getText());
                    mobileLabel.setText("Mobile: " + t2.getText());
                    genderLabel.setText("Gender: " + (male.isSelected() ? "Male" : "Female"));
                    dobLabel.setText("DOB: " + day.getSelectedItem() + "/" + month.getSelectedItem() + "/" + year.getSelectedItem());
                    addressLabel.setText("<html>Address: " + ta1.getText().replace("\n", "<br>") + "</html>");
                } else {
                    msg.setText("Please accept the terms and conditions.");
                    msg.setForeground(Color.RED);
                }
            }
        });

        setVisible(true);
    }
}

public class RegistrationForm {
    public static void main(String[] args) {
        new MyFrame();
    }
}
