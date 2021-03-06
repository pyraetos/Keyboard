package net.pyraetos;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JLabel;

import net.pyraetos.util.Sounds;

public class Keyboard extends JFrame implements KeyListener{
	
	private JLabel l;
	private Set<Integer> keys;
	
	public static void main(String[] args){
		new Keyboard();
	}
	
	public Keyboard(){
		Sounds.fromPyraetosNet();
		//Sounds.fromURL("file:///C:/Users/Pyraetos/Documents/workspace/sounds");
		keys = new HashSet<Integer>();
		this.addKeyListener(this);
		l = new JLabel();
		l.setFont(new Font("Courier New", Font.PLAIN, 32));
		l("Ready");
		this.add(l);
		this.setBounds(200, 200, 200, 200);
		this.setVisible(true);
	}
	
	public void l(String s){
		l.setText(s);
	}
	
	@Override
	public void keyTyped(KeyEvent e){
		
	}

	@Override
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		if(!keys.contains(key)){
			keys.add(key);
			if(key == KeyEvent.VK_BACK_QUOTE || key == KeyEvent.VK_C){ Sounds.play("c.wav"); l("C"); return;}
			if(key == KeyEvent.VK_1){ Sounds.play("csharp.wav");  l("C#"); return;}
			if(key == KeyEvent.VK_2 || key == KeyEvent.VK_D){ Sounds.play("d.wav"); l("D"); return;}
			if(key == KeyEvent.VK_3){ Sounds.play("dsharp.wav");  l("D#"); return;}
			if(key == KeyEvent.VK_4 || key == KeyEvent.VK_E){ Sounds.play("e.wav");  l("E"); return;}
			if(key == KeyEvent.VK_5 || key == KeyEvent.VK_F){ Sounds.play("f.wav");  l("F"); return;}
			if(key == KeyEvent.VK_6){ Sounds.play("fsharp.wav");  l("F#"); return;}
			if(key == KeyEvent.VK_7 || key == KeyEvent.VK_G){ Sounds.play("g.wav");  l("G"); return;}
			if(key == KeyEvent.VK_8){ Sounds.play("gsharp.wav");  l("G#"); return;}
			if(key == KeyEvent.VK_9 || key == KeyEvent.VK_A){ Sounds.play("a.wav"); l("A");  return;}
			if(key == KeyEvent.VK_0){ Sounds.play("asharp.wav");  l("A#"); return;}
			if(key == KeyEvent.VK_MINUS || key == KeyEvent.VK_B){ Sounds.play("b.wav");  l("B"); return;}
			if(key == KeyEvent.VK_EQUALS){ Sounds.play("chigh.wav");  l("C"); return;}
		}
	}

	@Override
	public void keyReleased(KeyEvent e){
		keys.remove(e.getKeyCode());
	}
}
