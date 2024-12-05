/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testgit;

import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class TestGit {

    public static void main(String[] args) {
       public void greet() {
    System.out.println("Chào mừng bạn đến với chương trình!");
}
        public void sayHello() {
    System.out.println("Hello, world!");
}
        public void printDate() {
    System.out.println("Hôm nay là một ngày đẹp trời!");
}
        public void showWarning() {
    System.out.println("Cảnh báo: Hãy lưu dữ liệu trước khi thoát!");
}
        
        // In các thông điệp
        System.out.println("Skibidi");
        System.out.println("Chi done!!");
        System.out.println("huydz");
        System.out.println("Gkhanh");
        System.out.println("nhtkdzai");

        // Vòng lặp in số từ 1 đến 10
        System.out.println("In ra các số từ 1 đến 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Vòng lặp in các số chẵn từ 1 đến 10
        System.out.println("In ra các số chẵn từ 1 đến 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Gọi phương thức liệt kê đồ dùng trong phòng học
        listClassroomItems();
    }

    // Phương thức liệt kê danh sách đồ dùng trong phòng học
    public static void listClassroomItems() {
        String[] items = {
            "Bảng trắng",
            "Bàn ghế học sinh",
            "Máy chiếu",
            "Quạt trần",
            "Tủ đựng tài liệu",
            "Đồng hồ treo tường",
            "Đèn chiếu sáng",
        };

        System.out.println("Danh sách đồ dùng trong phòng học:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }

    // Các phương thức giao diện (UI)
    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {
        try {
            int ma = Integer.parseInt(txtMa.getText());
            String ten = txtTen.getText();
            String hang = txtHang.getText();
            String trangthai;
            if (rdoCon.isSelected()) {
                trangthai = "Còn";
            } else {
                trangthai = "Hết";
            }
            int giaban = Integer.parseInt(txtGiaban.getText());
            MayTinh mt = new MayTinh(ma, ten, hang, trangthai, giaban);
            String kq = ql.add(mt);
            JOptionPane.showMessageDialog(this, kq);
            load(list);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Để đúng kiểu dữ liệu");
        }
    }

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {
        int row = tblSP.getSelectedRow();
        danh_muc DM = rp.getListSP().get(row);

        txtMaSP.setText(DM.getMaSP());
        txtTenSP.setText(DM.getTenSP());
        if (DM.getTrangSP().equals("available")) {
            rdCon.setSelected(true);
        } else {
            rdHet.setSelected(true);
        }
        txtNgayTaoSP.setText(DM.getNgayTaoSP().toString());
        txtIdDM.setText(DM.getIdDM().toString());
    }

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {
        int row = tblMT.getSelectedRow();
        String kq = ql.del(row);
        JOptionPane.showMessageDialog(this, kq);
        load(list);
    }

    
    // Phương thức load dữ liệu danh sách sản phẩm
    void loadDataSP(ArrayList<danh_muc> list) {
        DefaultTableModel tableModel = (DefaultTableModel) tblSP.getModel();
        tableModel.setRowCount(0);
        for (danh_muc object : list) {
            tableModel.addRow(new Object[]{
                object.getMaSP(),
                object.getTenSP(),
                object.getTrangSP(),
                object.getNgayTaoSP(),
                object.getIdDM()
            });
        }
    }
    public void arrayOperations(int[] arr) {
    int sum = 0;
    int max = arr[0];

    for (int num : arr) {
        sum += num;
        if (num > max) {
            max = num;
        }
    }

    System.out.println("Tổng các phần tử trong mảng là: " + sum);
    System.out.println("Phần tử lớn nhất trong mảng là: " + max);
}
    public void checkPalindrome(String str) {
    String reversed = new StringBuilder(str).reverse().toString();
    System.out.println("Chuỗi đảo ngược là: " + reversed);

    if (str.equalsIgnoreCase(reversed)) {
        System.out.println(str + " là chuỗi palindrome.");
    } else {
        System.out.println(str + " không phải là chuỗi palindrome.");
    }
}
    
}
