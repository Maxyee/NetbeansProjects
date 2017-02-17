/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

/**
 *
 * @author Mahtab
 * @id 141014027
 */
import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;
public class tictoctoe_2 extends JFrame implements ActionListener{
    JButton buttons[] ;
    int arr[],chk[] = {0} ;
    int count = 1 ;
    public tictoctoe_2()
    {
        setTitle("MY TIC TAC TOE") ;
        setVisible(true) ;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300) ;
        buttons = new JButton[9] ;
        arr = new int[9] ;
        chk = new int[9] ;
        setLayout(new GridLayout(3,3)) ;
        for(int i = 0 ; i < 9 ; i++)
        {
            buttons[i] = new JButton() ;
            buttons[i].addActionListener(this);
            add(buttons[i]) ;
        }
    }
    int flag = 0 ;
    public void actionPerformed(ActionEvent e)
    {
        Object p = e.getSource() ;
        for(int i = 0 ; i < 9 ; i++)
        {
            if(p == buttons[i] && arr[i] == 0)
            {
                if(count % 2 == 0)
                {
                    buttons[i].setText("O");
                    buttons[i].setBackground(Color.red) ;
                    count ++ ;
                    arr[i] = 1 ;
                    chk[i] = 2 ;
                }
                else
                {
                    buttons[i].setText("X");
                    buttons[i].setBackground(Color.YELLOW) ;
                    count ++ ;
                    arr[i] = 1 ;
                    chk[i] = 1 ;
                }
            }
            if(chk[0] == 1 && chk[1] == 1 && chk[2] == 1)
            {
                JOptionPane.showMessageDialog(null,"PLAYER 1 IS WINNER");
                flag = 1 ;
                break ;
            }
            if(chk[0] == 2 && chk[1] == 2 && chk[2] == 2)
            {
                JOptionPane.showMessageDialog(null,"PLAYER 2 IS WINNER");
                flag = 1 ;
                break ;
            }
            if(chk[2] == 1 && chk[5] == 1 && chk[8] == 1)
            {
                JOptionPane.showMessageDialog(null,"PLAYER 1 IS WINNER");
                flag = 1 ;
                break ;
            }
            if(chk[2] == 2 && chk[5] == 2 && chk[8] == 2)
            {
                JOptionPane.showMessageDialog(null,"PLAYER 2 IS WINNER");
                flag = 1 ;
                break ;
            }
            if(chk[0] == 1 && chk[3] == 1 && chk[6] == 1)
            {
                JOptionPane.showMessageDialog(null,"PLAYER 1 IS WINNER");
                flag = 1 ;
                break ;
            }
            if(chk[0] == 2 && chk[3] == 2 && chk[6] == 2)
            {
                JOptionPane.showMessageDialog(null,"PLAYER 2 IS WINNER");
                flag = 1 ;
                break ;
            }
            if(chk[6] == 1 && chk[7] == 1 && chk[8] == 1)
            {
                JOptionPane.showMessageDialog(null,"PLAYER 1 IS WINNER");
                flag = 1 ;
                break ;
            }
            if(chk[6] == 2 && chk[7] == 2 && chk[8] == 2)
            {
                JOptionPane.showMessageDialog(null,"PLAYER 2 IS WINNER");
                flag = 1 ;
                break ;
            }
            if(chk[1] == 1 && chk[4] == 1 && chk[7] == 1)
            {
                JOptionPane.showMessageDialog(null,"PLAYER 1 IS WINNER");
                flag = 1 ;
                break ;
            }
            if(chk[1] == 2 && chk[4] == 2 && chk[7] == 2)
            {
                JOptionPane.showMessageDialog(null,"PLAYER 2 IS WINNER");
                flag = 1 ;
                break ;
            }
            if(chk[0] == 1 && chk[4] == 1 && chk[8] == 1)
            {
                JOptionPane.showMessageDialog(null,"PLAYER 1 IS WINNER");
                flag = 1 ;
                break ;
            }
            if(chk[0] == 2 && chk[4] == 2 && chk[8] == 2)
            {
                JOptionPane.showMessageDialog(null,"PLAYER 2 IS WINNER");
                flag = 1 ;
                break ;
            }
            if(chk[2] == 1 && chk[4] == 1 && chk[6] == 1)
            {
                JOptionPane.showMessageDialog(null,"PLAYER 1 IS WINNER");
                flag = 1 ;
                break ;
            }
            if(chk[2] == 2 && chk[4] == 2 && chk[6] == 2)
            {
                JOptionPane.showMessageDialog(null,"PLAYER 2 IS WINNER");
                flag = 1 ;
                break ;
            }
            if(count == 10 && flag != 1)
            {
                JOptionPane.showMessageDialog(null,"MATCH TIE");
                break ;
            }
        }
    }
    public static void main(String args[])
    {
        tictoctoe_2 tic = new tictoctoe_2() ;
    }
}
