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
}
