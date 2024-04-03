import javax.swing.JOptionPane;

public class TrueFalse {

    public static void main(String[] args){

        String stra,
                strb,
                strc;

        Float a,
                b,
                c;

        Boolean teste;

        stra = JOptionPane.showInputDialog("Informe o valor de a:");
        strb = JOptionPane.showInputDialog("Informe o valor de b:");
        strc = JOptionPane.showInputDialog("Informe o valor de c:");

        a = Float.parseFloat(stra);
        b = Float.parseFloat(strb);
        c = Float.parseFloat(strc);

        teste = a*a == (b * b + c * c);

        JOptionPane.showMessageDialog(null, teste);

    }
}
