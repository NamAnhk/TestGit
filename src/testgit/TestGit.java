/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testgit;

/**
 *
 * @author ADMIN
 */
public class TestGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Skibidi");
        System.out.println("Chi done!!");
        System.out.println("huydz");
        system.out.println("Gkhanh");
        systen.out.println("nhtkdzai");
                system.out.println("noooooooooooooo");
        switch(Giang){
        leuleu;
        }
        for(int i = 0; i<11; i++){
    System.out.println(i+1);
          System.out.println("In ra cac so tu 1 den 10");
         System.out.println("In ra cac so tu 1 den 10");
            for(int i = 0; i<11;i++)
                {
                    System.out.println(i);            
                }

            
          System.out.println("In ra cac so chan tu 1 den 10");
            for(int i = 0; i<11;i++)
                {
                    if(i%2==0){
                    System.out.println(i);
                    }
        System.out.println(i);
            system.out.println("mai rap")
        }
            listClassroomItems();
    }
     private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {                                     
        try {
            int ma = Integer.parseInt(txtMa.getText());
            String ten = txtTen.getText();
            String hang = txtHang.getText();
            String trangthai;
            if (rdoCon.isSelected()) {
                trangthai = "Con";
            } else {
                trangthai = "Het";
            }
            int giaban = Integer.parseInt(txtGiaban.getText());
            MayTinh mt = new MayTinh(ma, ten, hang, trangthai, giaban);
            String kq = ql.add(mt);
            JOptionPane.showMessageDialog(this, kq);
            load(list);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "De dung kieu du lieu");
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
}
   private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {                                    
        int row = tblMT.getSelectedRow();
        String kq = ql.del(row);
        JOptionPane.showMessageDialog(this, kq);
        load(list);
    }    


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
        public static void listClassroomItems() {
        String[] items = {
            "Bảng trắng",
            "Bàn ghế học sinh",
            "Máy chiếu",
            "Máy lạnh",
            "Quạt trần",
            "Tủ đựng tài liệu",
            "Đồng hồ treo tường",
            "Bảng thông báo",
            "Đèn chiếu sáng"
            "Tivi"
        };

        System.out.println("Danh sách đồ dùng trong phòng học:");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
         public String them(NhanVien nhanVien)
    {
        dsnv.add(nhanVien);
        return "Them thanh cong!";
    }
    public String xoa(int vitri)
    {
        dsnv.remove(vitri);
        return "Xoa thanh cong!";
    }
    public String capnhat(int vitri, NhanVien nhanVien)
    
    {
        dsnv.set(vitri, nhanVien);
        return "Cap nhat thanh cong!";
    }
    public NhanVien tim(String ID)
    {
        for (NhanVien nhanVien : dsnv) {
            if (nhanVien.getID().equals(ID)) 
            {
            return nhanVien;
            }
        }

}    
        
        return null;
    systen.out.println("chi commit lan 2 22/11");
systen.out.println("chi commit lan 3 22/11");
systen.out.println("chi commit lan 4 22/11");
systen.out.println("chi commit lan 5 22/11");
systen.out.println("chi commit lan 1 28/11");
systen.out.println("chi commit lan 2 28/11");
systen.out.println("chi commit lan 3 28/11");
    }
