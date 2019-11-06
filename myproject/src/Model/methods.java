
package Model;

import KAROJOMA.MAIN;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class methods {
    
    public static int size = 0,Quantity = 0;
    public methods(){
    
    }
    public static String admin []  = {"janikz","admin123"};
    public static String[][] product1 = new String[99][99];
    public static String[][] product2 = new String[99][99];
    public static String[][] product3 = new String[99][99];
    public static String[][] product4 = new String[99][99];
    public static String[][] product5 = new String[99][99];
    public static String[][] product6 = new String[99][99];
    public static String[][] product7 = new String[99][99];
    public static String[][] product8 = new String[99][99];
    public static String[][] product9 = new String[99][99];
    public static String[][] product10 = new String[99][99];
    public static String[][] product11 = new String[99][99];
    public static String[][] product12 = new String[99][99];
    public static String[][] product13 = new String[99][99];
    public static String[][] product14 = new String[99][99];
    public static String[][] product15 = new String[99][99];
    public static String[][] product16 = new String[99][99];
    public static String[][] product17 = new String[99][99];
    public static String[][] product18 = new String[99][99];
    public static String[][] product19 = new String[99][99];
    public static String[][] product20 = new String[99][99];
    public static String[][] product21 = new String[99][99];
    public static String[][] product22 = new String[99][99];
    public static String[][] product23 = new String[99][99];
    public static String[][] product24 = new String[99][99];
    public static String[][] product25 = new String[99][99];
    public static String[][] product26 = new String[99][99];
    public static String[][] product27 = new String[99][99];
    public static String[][] product28 = new String[99][99];
    public static String[][] product29 = new String[99][99];
    public static String[][] product30 = new String[99][99];
    
     public static void Adding(String name , String date ,String supp, JTable table){
        DefaultTableModel model =(DefaultTableModel) table.getModel();
          
        if(MAIN.cmb.getSelectedIndex()==1){
                 int row = 0,nullrow = 0;
        
                 for(int i = 0;i<product1.length;i++){
                    if(product1[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product1.length - nullrow;
                product1 [row][0] =""+name;
                product1 [row][1] =""+size;
                product1 [row][2] =""+Quantity;    
                product1 [row][3] =""+date;
                product1 [row][4] =""+supp;
            
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
                
                
        }else if(MAIN.cmb.getSelectedIndex()==2){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product2.length;i++){
                    if(product2[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product1.length - nullrow;
                product2 [row][0] =""+name;
                product2 [row][1] =""+size;
                product2 [row][2] =""+Quantity;    
                product2 [row][3] =""+date;
                product2 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==3){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product3.length;i++){
                    if(product3[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product3.length - nullrow;
                product3 [row][0] =""+name;
                product3 [row][1] =""+size;
                product3 [row][2] =""+Quantity;    
                product3 [row][3] =""+date;
                product3 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==4){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product4.length;i++){
                    if(product4[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product4.length - nullrow;
                product4 [row][0] =""+name;
                product4 [row][1] =""+size;
                product4 [row][2] =""+Quantity;    
                product4 [row][3] =""+date;
                product4 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==5){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product5.length;i++){
                    if(product5[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product5.length - nullrow;
                product5 [row][0] =""+name;
                product5 [row][1] =""+size;
                product5 [row][2] =""+Quantity;    
                product5 [row][3] =""+date;
                product5 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==6){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product6.length;i++){
                    if(product6[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product6.length - nullrow;
                product6 [row][0] =""+name;
                product6 [row][1] =""+size;
                product6 [row][2] =""+Quantity;    
                product6 [row][3] =""+date;
                product6 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==7){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product7.length;i++){
                    if(product7[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product7.length - nullrow;
                product7 [row][0] =""+name;
                product7 [row][1] =""+size;
                product7 [row][2] =""+Quantity;    
                product7 [row][3] =""+date;
                product7 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==8){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product8.length;i++){
                    if(product8[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product8.length - nullrow;
                product8 [row][0] =""+name;
                product8 [row][1] =""+size;
                product8 [row][2] =""+Quantity;    
                product8 [row][3] =""+date;
                product8 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==9){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product9.length;i++){
                    if(product9[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product9.length - nullrow;
                product9 [row][0] =""+name;
                product9 [row][1] =""+size;
                product9 [row][2] =""+Quantity;    
                product9 [row][3] =""+date;
                product9 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==10){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product10.length;i++){
                    if(product10[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product10.length - nullrow;
                product10 [row][0] =""+name;
                product10 [row][1] =""+size;
                product10 [row][2] =""+Quantity;    
                product10 [row][3] =""+date;
                product10 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==11){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product11.length;i++){
                    if(product11[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product11.length - nullrow;
                product11 [row][0] =""+name;
                product11 [row][1] =""+size;
                product11 [row][2] =""+Quantity;    
                product11 [row][3] =""+date;
                product11 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==12){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product9.length;i++){
                    if(product12[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product12.length - nullrow;
                product12 [row][0] =""+name;
                product12 [row][1] =""+size;
                product12 [row][2] =""+Quantity;    
                product12 [row][3] =""+date;
                product12 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==13){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product13.length;i++){
                    if(product13[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product13.length - nullrow;
                product13 [row][0] =""+name;
                product13 [row][1] =""+size;
                product13 [row][2] =""+Quantity;    
                product13 [row][3] =""+date;
                product13 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==14){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product14.length;i++){
                    if(product14[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product14.length - nullrow;
                product14 [row][0] =""+name;
                product14 [row][1] =""+size;
                product14 [row][2] =""+Quantity;    
                product14 [row][3] =""+date;
                product14 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==15){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product15.length;i++){
                    if(product15[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product15.length - nullrow;
                product15 [row][0] =""+name;
                product15 [row][1] =""+size;
                product15 [row][2] =""+Quantity;    
                product15 [row][3] =""+date;
                product15 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==16){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product16.length;i++){
                    if(product16[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product16.length - nullrow;
                product16 [row][0] =""+name;
                product16 [row][1] =""+size;
                product16 [row][2] =""+Quantity;    
                product16 [row][3] =""+date;
                product16 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==17){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product17.length;i++){
                    if(product17[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product17.length - nullrow;
                product17 [row][0] =""+name;
                product17 [row][1] =""+size;
                product17 [row][2] =""+Quantity;    
                product17 [row][3] =""+date;
                product17 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==18){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product18.length;i++){
                    if(product18[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product18.length - nullrow;
                product18 [row][0] =""+name;
                product18 [row][1] =""+size;
                product18 [row][2] =""+Quantity;    
                product18 [row][3] =""+date;
                product18 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==19){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product19.length;i++){
                    if(product19[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product19.length - nullrow;
                product19 [row][0] =""+name;
                product19 [row][1] =""+size;
                product19 [row][2] =""+Quantity;    
                product19 [row][3] =""+date;
                product19 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==20){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product20.length;i++){
                    if(product20[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product20.length - nullrow;
                product20 [row][0] =""+name;
                product20 [row][1] =""+size;
                product20 [row][2] =""+Quantity;    
                product20 [row][3] =""+date;
                product20 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==21){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product21.length;i++){
                    if(product21[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product21.length - nullrow;
                product21 [row][0] =""+name;
                product21 [row][1] =""+size;
                product21 [row][2] =""+Quantity;    
                product21 [row][3] =""+date;
                product21 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==22){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product22.length;i++){
                    if(product22[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product22.length - nullrow;
                product22 [row][0] =""+name;
                product22 [row][1] =""+size;
                product22 [row][2] =""+Quantity;    
                product22 [row][3] =""+date;
                product22 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==23){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product23.length;i++){
                    if(product23[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product23.length - nullrow;
                product23 [row][0] =""+name;
                product23 [row][1] =""+size;
                product23 [row][2] =""+Quantity;    
                product23 [row][3] =""+date;
                product23 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==24){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product24.length;i++){
                    if(product24[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product24.length - nullrow;
                product24 [row][0] =""+name;
                product24 [row][1] =""+size;
                product24 [row][2] =""+Quantity;    
                product24 [row][3] =""+date;
                product24 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==25){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product25.length;i++){
                    if(product25[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product25.length - nullrow;
                product25 [row][0] =""+name;
                product25 [row][1] =""+size;
                product25 [row][2] =""+Quantity;    
                product25 [row][3] =""+date;
                product25 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==26){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product26.length;i++){
                    if(product26[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product26.length - nullrow;
                product26 [row][0] =""+name;
                product26 [row][1] =""+size;
                product26 [row][2] =""+Quantity;    
                product26 [row][3] =""+date;
                product26 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==27){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product27.length;i++){
                    if(product27[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product27.length - nullrow;
                product27 [row][0] =""+name;
                product27 [row][1] =""+size;
                product27 [row][2] =""+Quantity;    
                product27 [row][3] =""+date;
                product27 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==28){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product28.length;i++){
                    if(product28[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product28.length - nullrow;
                product28 [row][0] =""+name;
                product28 [row][1] =""+size;
                product28 [row][2] =""+Quantity;    
                product28 [row][3] =""+date;
                product28 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==29){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product29.length;i++){
                    if(product29[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product29.length - nullrow;
                product29 [row][0] =""+name;
                product29 [row][1] =""+size;
                product29 [row][2] =""+Quantity;    
                product29 [row][3] =""+date;
                product29 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }else if(MAIN.cmb.getSelectedIndex()==30){
                int row = 0,nullrow = 0;
        
                for(int i = 0;i<product30.length;i++){
                    if(product30[i][0]==null){
                    nullrow++;        
                    } 
                }        
        
                row = product30.length - nullrow;
                product30 [row][0] =""+name;
                product30 [row][1] =""+size;
                product30 [row][2] =""+Quantity;    
                product30 [row][3] =""+date;
                product30 [row][4] =""+supp;
                model.setValueAt(name,row,0);
                model.setValueAt(size,row,1);
                model.setValueAt(Quantity,row,2);
                model.setValueAt(date,row,3);
                model.setValueAt(supp,row,4);
        }
          JOptionPane.showMessageDialog(null,"Success");  
     }
    
    public static void table1(JTable table){
        try{
        if(MAIN.cmb.getSelectedIndex()==1){    
           for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product1[i][0], i, 0);
             table.setValueAt( product1[i][1], i , 1);
             table.setValueAt( product1[i][2], i , 2);
             table.setValueAt( product1[i][3], i , 3);
             table.setValueAt( product1[i][4], i , 4);
  
           }
           
        }else if(MAIN.cmb.getSelectedIndex()==2){
           for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product2[i][0], i, 0);
             table.setValueAt( product2[i][1], i , 1);
             table.setValueAt( product2[i][2], i , 2);
             table.setValueAt( product2[i][3], i , 3);
             table.setValueAt( product2[i][4], i , 4);
  
           } 
        }else if(MAIN.cmb.getSelectedIndex()==3){
           for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product3[i][0], i, 0);
             table.setValueAt( product3[i][1], i , 1);
             table.setValueAt( product3[i][2], i , 2);
             table.setValueAt( product3[i][3], i , 3);
             table.setValueAt( product3[i][4], i , 4);
  
           } 
            
        }else if(MAIN.cmb.getSelectedIndex()==4){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product4[i][0], i, 0);
             table.setValueAt( product4[i][1], i , 1);
             table.setValueAt( product4[i][2], i , 2);
             table.setValueAt( product4[i][3], i , 3);
             table.setValueAt( product4[i][4], i , 4);
  
           }   
        }
        else if(MAIN.cmb.getSelectedIndex()==5){
           for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product5[i][0], i, 0);
             table.setValueAt( product5[i][1], i , 1);
             table.setValueAt( product5[i][2], i , 2);
             table.setValueAt( product5[i][3], i , 3);
             table.setValueAt( product5[i][4], i , 4);
 
           } 
        }else if(MAIN.cmb.getSelectedIndex()==6){
           for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product6[i][0], i, 0);
             table.setValueAt( product6[i][1], i , 1);
             table.setValueAt( product6[i][2], i , 2);
             table.setValueAt( product6[i][3], i , 3);
             table.setValueAt( product6[i][4], i , 4);
  
           } 
            
        }else if(MAIN.cmb.getSelectedIndex()==7){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product7[i][0], i, 0);
             table.setValueAt( product7[i][1], i , 1);
             table.setValueAt( product7[i][2], i , 2);
             table.setValueAt( product7[i][3], i , 3);
             table.setValueAt( product7[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==8){
           for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product8[i][0], i, 0);
             table.setValueAt( product8[i][1], i , 1);
             table.setValueAt( product8[i][2], i , 2);
             table.setValueAt( product8[i][3], i , 3);
             table.setValueAt( product8[i][4], i , 4);
  
           } 
        }else if(MAIN.cmb.getSelectedIndex()==9){
           for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product9[i][0], i, 0);
             table.setValueAt( product9[i][1], i , 1);
             table.setValueAt( product9[i][2], i , 2);
             table.setValueAt( product9[i][3], i , 3);
             table.setValueAt( product9[i][4], i , 4);
  
           } 
            
        }else if(MAIN.cmb.getSelectedIndex()==10){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product10[i][0], i, 0);
             table.setValueAt( product10[i][1], i , 1);
             table.setValueAt( product10[i][2], i , 2);
             table.setValueAt( product10[i][3], i , 3);
             table.setValueAt( product10[i][4], i , 4);
  
           }   
        }
        else if(MAIN.cmb.getSelectedIndex()==11){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product11[i][0], i, 0);
             table.setValueAt( product11[i][1], i , 1);
             table.setValueAt( product11[i][2], i , 2);
             table.setValueAt( product11[i][3], i , 3);
             table.setValueAt( product11[i][4], i , 4);
  
           }   
        }
        else if(MAIN.cmb.getSelectedIndex()==12){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product12[i][0], i, 0);
             table.setValueAt( product12[i][1], i , 1);
             table.setValueAt( product12[i][2], i , 2);
             table.setValueAt( product12[i][3], i , 3);
             table.setValueAt( product12[i][4], i , 4);
  
           }   
        }
        else if(MAIN.cmb.getSelectedIndex()==13){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product13[i][0], i, 0);
             table.setValueAt( product13[i][1], i , 1);
             table.setValueAt( product13[i][2], i , 2);
             table.setValueAt( product13[i][3], i , 3);
             table.setValueAt( product13[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==14){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product14[i][0], i, 0);
             table.setValueAt( product14[i][1], i , 1);
             table.setValueAt( product14[i][2], i , 2);
             table.setValueAt( product14[i][3], i , 3);
             table.setValueAt( product14[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==15){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product15[i][0], i, 0);
             table.setValueAt( product15[i][1], i , 1);
             table.setValueAt( product15[i][2], i , 2);
             table.setValueAt( product15[i][3], i , 3);
             table.setValueAt( product15[i][4], i , 4);
 
           }   
        }else if(MAIN.cmb.getSelectedIndex()==16){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product16[i][0], i, 0);
             table.setValueAt( product16[i][1], i , 1);
             table.setValueAt( product16[i][2], i , 2);
             table.setValueAt( product16[i][3], i , 3);
             table.setValueAt( product16[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==17){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product17[i][0], i, 0);
             table.setValueAt( product17[i][1], i , 1);
             table.setValueAt( product17[i][2], i , 2);
             table.setValueAt( product17[i][3], i , 3);
             table.setValueAt( product17[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==18){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product18[i][0], i, 0);
             table.setValueAt( product18[i][1], i , 1);
             table.setValueAt( product18[i][2], i , 2);
             table.setValueAt( product18[i][3], i , 3);
             table.setValueAt( product18[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==19){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product19[i][0], i, 0);
             table.setValueAt( product19[i][1], i , 1);
             table.setValueAt( product19[i][2], i , 2);
             table.setValueAt( product19[i][3], i , 3);
             table.setValueAt( product19[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==20){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product20[i][0], i, 0);
             table.setValueAt( product20[i][1], i , 1);
             table.setValueAt( product20[i][2], i , 2);
             table.setValueAt( product20[i][3], i , 3);
             table.setValueAt( product20[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==21){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product21[i][0], i, 0);
             table.setValueAt( product21[i][1], i , 1);
             table.setValueAt( product21[i][2], i , 2);
             table.setValueAt( product21[i][3], i , 3);
             table.setValueAt( product21[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==22){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product22[i][0], i, 0);
             table.setValueAt( product22[i][1], i , 1);
             table.setValueAt( product22[i][2], i , 2);
             table.setValueAt( product22[i][3], i , 3);
             table.setValueAt( product22[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==23){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product23[i][0], i, 0);
             table.setValueAt( product23[i][1], i , 1);
             table.setValueAt( product23[i][2], i , 2);
             table.setValueAt( product23[i][3], i , 3);
             table.setValueAt( product23[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==24){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product24[i][0], i, 0);
             table.setValueAt( product24[i][1], i , 1);
             table.setValueAt( product24[i][2], i , 2);
             table.setValueAt( product24[i][3], i , 3);
             table.setValueAt( product24[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==25){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product25[i][0], i, 0);
             table.setValueAt( product25[i][1], i , 1);
             table.setValueAt( product25[i][2], i , 2);
             table.setValueAt( product25[i][3], i , 3);
             table.setValueAt( product25[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==26){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product26[i][0], i, 0);
             table.setValueAt( product26[i][1], i , 1);
             table.setValueAt( product26[i][2], i , 2);
             table.setValueAt( product26[i][3], i , 3);
             table.setValueAt( product26[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==27){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product27[i][0], i, 0);
             table.setValueAt( product27[i][1], i , 1);
             table.setValueAt( product27[i][2], i , 2);
             table.setValueAt( product27[i][3], i , 3);
             table.setValueAt( product27[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==28){
         for(int i = 0;i < product28.length; i ++){

             table.setValueAt( product28[i][0], i, 0);
             table.setValueAt( product28[i][1], i , 1);
             table.setValueAt( product28[i][2], i , 2);
             table.setValueAt( product28[i][3], i , 3);
             table.setValueAt( product28[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==29){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product29[i][0], i, 0);
             table.setValueAt( product29[i][1], i , 1);
             table.setValueAt( product29[i][2], i , 2);
             table.setValueAt( product29[i][3], i , 3);
             table.setValueAt( product29[i][4], i , 4);
  
           }   
        }else if(MAIN.cmb.getSelectedIndex()==30){
         for(int i = 0;i < product1.length; i ++){

             table.setValueAt( product30[i][0], i, 0);
             table.setValueAt( product30[i][1], i , 1);
             table.setValueAt( product30[i][2], i , 2);
             table.setValueAt( product30[i][3], i , 3);
             table.setValueAt( product30[i][4], i , 4);
  
           }   
        }else{
            JOptionPane.showMessageDialog(null,"Sorry Maam dili ko kabalo para ma automatic maka create ug new array T_T");
        }
        }catch(Exception e){}    
    }
   
}


