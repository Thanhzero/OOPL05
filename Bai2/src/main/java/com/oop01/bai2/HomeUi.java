/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop01.bai2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author TienThanh
 */
public class HomeUi {
    private JFrame mainFrame;
    private JPanel controlPanel;
    public JTextField tfId;
    public JTextField tfFullName;
    public JTextField tfEmail;
    public JTextField tfScores;
    public JButton btAddStudent;
    public JButton btSaveStudent;

    public HomeUi() {
        initUi();
    }
    private void initUi(){
        mainFrame = new JFrame("Student Manager");
        mainFrame.setLayout(new GridLayout(5, 2,1,1));
        mainFrame.setSize(500, 300);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        JLabel lbId = new JLabel("Mã sinh viên : ",JLabel.CENTER);
        JLabel lbFullName = new JLabel("Họ tên : ",JLabel.CENTER);
        JLabel lbEmail = new JLabel("Email : ",JLabel.CENTER);
        JLabel lbScores = new JLabel("Điểm trung bình : ",JLabel.CENTER);
        tfId = new JTextField(10);
        tfFullName = new JTextField(10);
        tfEmail = new JTextField(10);
        tfScores = new JTextField(10);
        btAddStudent = new JButton("Thêm Sinh viên");
        btAddStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student student = new Student(tfId.getText(),tfFullName.getText(),tfEmail.getText(),Float.parseFloat(tfScores.getText()));
                System.out.println(student.toString());
            }
        });
        btSaveStudent = new JButton("Lưu Sinh viên");
        btSaveStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student student = new Student(tfId.getText(),tfFullName.getText(),tfEmail.getText(),Float.parseFloat(tfScores.getText()));
                try {
                    FileOutputStream fileOut = new FileOutputStream("C:\\Users\\TienThanh\\Documents\\DevLearn\\OOPL05\\Bai2\\src\\sinhvien.dat");
                    ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
                    objectOut.writeObject(student);
                    objectOut.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                System.out.println("Success");
            }
        });
        controlPanel.add(btAddStudent);
        controlPanel.add(btSaveStudent);
        mainFrame.add(lbId);
        mainFrame.add(tfId);
        mainFrame.add(lbFullName);
        mainFrame.add(tfFullName);
        mainFrame.add(lbEmail);
        mainFrame.add(tfEmail);
        mainFrame.add(lbScores);
        mainFrame.add(tfScores);
        mainFrame.add(btAddStudent);
        mainFrame.add(btSaveStudent);
        mainFrame.setVisible(true);
    }
    
}


