import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// Hiba Raed Dado
// 202211860
public class BrickBreaker extends JFrame {
    public BrickBreaker(String title) throws HeadlessException{
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300,100);
        this.setSize(600,600);
        this.setResizable(false);

        Game brickBreaker = new Game();
        this.add(brickBreaker);

        this.setVisible(true);
    }
    public class Game extends JPanel implements ActionListener, KeyListener {
        private boolean gameStarted = false;
        private int score = 0;
        private int bricks = 40;
        private Timer timer;
        private int t = 8;
        private int playerX = 250; // مكان الشريط

        private int ballposX = 300;
        private int ballposY = 300;
        private int ballXdir = -2;
        private int ballYdir = -3;
        private MapGenerator map;

        public Game(){
            map = new MapGenerator(5,8);
            addKeyListener(this);
            setFocusable(true);
            setFocusTraversalKeysEnabled(false);
            timer = new Timer(t,this);
            timer.start();
        }

        public void paint(Graphics g){
            g.setColor(new Color(255,204,229));
            g.fillRect(1,1,585,600);
            map.draw((Graphics2D)g);

            g.setColor(new Color(51,0,25));
            g.fillRect(0,0,3,600);
            g.fillRect(0,0,600,3);
            g.fillRect(583,0,3,600);

            g.setColor(new Color(102,0,51));
            g.setFont(new Font("Times New Roman", Font.BOLD, 20));
            g.drawString("Score: " + score,30,550);

            g.setColor(new Color(51,0,25));
            g.fillRect(playerX, 530,100,8);

            g.setColor(Color.BLACK);
            g.fillOval(ballposX, ballposY,20,20);

            if(bricks <= 0){
                gameStarted = false;
                ballXdir = 0;
                ballYdir = 0;
                g.setColor(new Color(102,0,51));
                g.setFont(new Font("Times New Roman", Font.BOLD, 30));
                g.drawString("   You Won:) : " + score,150,300);

                g.setFont(new Font("Times New Roman", Font.BOLD, 20));
                g.drawString("Press ENTER to play again --> Score: " + score,150,350);
            }

            if(ballposY > 570){
                gameStarted = false;
                ballXdir = 0;
                ballYdir = 0;
                g.setColor(new Color(102,0,51));
                g.setFont(new Font("Times New Roman", Font.BOLD, 30));
                g.drawString("Game Over --> Score: " + score,140,300);

                g.setFont(new Font("Times New Roman", Font.BOLD, 20));
                g.drawString("Press ENTER to play again --> Score: " + score,150,350);
            }
            g.dispose();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            timer.start();
            if(gameStarted) {
                if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 530,100,8))){
                    ballYdir = -ballYdir;
                }

                A: for (int i = 0; i < map.map.length; i++) {
                    for(int j = 0; j < map.map[0].length; j++){
                        if(map.map[i][j] > 0){
                            int brickX = j * map.brickWidth + 20;
                            int brickY = i * map.brickHeight + 30;
                            int brickWidth = map.brickWidth;
                            int brickHeight = map.brickHeight;

                            Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                            Rectangle ballRect = new Rectangle(ballposX, ballposY, 20,20);
                            Rectangle brickRect = rect;

                            if(ballRect.intersects(brickRect)){
                                map.setBrickValue(0, i, j);
                                bricks--;
                                score += 10;

                                if(ballposX + 19 <= brickRect.x || ballposX + 1 >= brickRect.x + brickRect.width){
                                    ballXdir = -ballXdir;
                                } else{
                                    ballYdir = -ballYdir;
                                }
                                break A;
                            }
                        }
                    }
                }

                ballposX += ballXdir;
                ballposY += ballYdir;
                if(ballposX < 0){
                    ballXdir = -ballXdir;
                } else if (ballposX > 490) {
                    ballXdir = -ballXdir;
                } else if (ballposY < 0) {
                    ballYdir = -ballYdir;
                }
            }
            repaint();
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                if(playerX > 490){
                    playerX = 490;
                } else{
                    moveToRight();
                }
            } else if(e.getKeyCode() == KeyEvent.VK_LEFT){
                if(playerX < 10){
                    playerX = 10;
                } else{
                    moveToLeft();
                }
            }
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
                if(!gameStarted){
                    gameStarted = true;
                    ballposX = 300;
                    ballposY = 300;
                    ballXdir = -2;
                    ballYdir = -3;
                    playerX = 250;
                    score = 0;
                    bricks = 40;
                    map = new MapGenerator(5,8);
                    repaint();
                }
            }
        }

        public void moveToRight(){
            gameStarted = true;
            playerX += 28;
        }
        public void moveToLeft(){
            gameStarted = true;
            playerX -= 28;
        }
    }


    public class MapGenerator{
        public int map [] [];
        public int brickWidth;
        public int brickHeight;
        public MapGenerator(int row, int col) {
            map = new int[row][col];
            for(int i = 0; i < map.length; i++){
                for (int j = 0; j < map[0].length; j++) {
                    map[i][j] = 1;
                }
            }

            brickWidth = 550/col;
            brickHeight = 230/row;
        }
        public void draw(Graphics2D g){
            for(int i = 0; i < map.length; i++){
                for(int j = 0; j < map[0].length; j++){
                    if (map[i][j] > 0){
                        g.setColor(new Color(255,51,153));
                        g.fillRect(j * brickWidth + 20, i * brickHeight + 30, brickWidth, brickHeight);

                        g.setStroke(new BasicStroke(3));
                        g.setColor(new Color(255,204,229));
                        g.drawRect(j * brickWidth + 20, i * brickHeight + 30, brickWidth, brickHeight);

                    }
                }
            }
        }
        public void setBrickValue(int value, int row, int col){
            map[row][col] = value;
        }
    }

    public static void main(String[] args) {
        BrickBreaker b = new BrickBreaker("Breakout GAME");
    }
}

