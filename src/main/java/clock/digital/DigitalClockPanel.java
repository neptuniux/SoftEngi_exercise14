package clock.digital;

import clock.ClockPanel;

import java.awt.*;


public class DigitalClockPanel extends ClockPanel {
    int hour;
    int minute;
    int second;

    private Color shcolor = Color.ORANGE;
    private Color mhcolor = Color.white;
    private Color bgcolor = Color.DARK_GRAY;
    private Color numberColor = new Color(100,100 ,100 );
    private Font font = new Font("TimesRoman", Font.PLAIN, 20);

    //number position
    private int[][] positions = new int[60][2];


    protected void paintComponent(Graphics g) {
        // Some geometric calculations.
        int width = getWidth();
        int height = getHeight();

        // Clear background.
        g.setColor(bgcolor);
        g.fillRect(0, 0, width, height);

        g.setFont(font.deriveFont(Font.BOLD));

        drawNumbers(g,width,height);
        drawMinute(g);
        drawHour(g);
        drawSecond(g);

    }


    private void colorPosition(Graphics g, int index, Color color){
        g.setColor(color);
        if (index<10){
            g.drawString(String.format("0%d",index),positions[index][0],positions[index][1]);
        }else{
            g.drawString(Integer.toString(index),positions[index][0],positions[index][1]);
        }
    }

    private void colorBigNumber(Graphics g, int bigPos,int number){
                switch (number){
                    case 0:
                        colorPosition(g,(bigPos-1)*15,mhcolor);
                        colorPosition(g,(bigPos-1)*15+1,mhcolor);
                        colorPosition(g,(bigPos-1)*15+2,mhcolor);
                        colorPosition(g,(bigPos-1)*15+3,mhcolor);
                        colorPosition(g,(bigPos-1)*15+4,mhcolor);
                        colorPosition(g,(bigPos-1)*15+5,mhcolor);
                        colorPosition(g,(bigPos-1)*15+9,mhcolor);
                        colorPosition(g,(bigPos-1)*15+10,mhcolor);
                        colorPosition(g,(bigPos-1)*15+11,mhcolor);
                        colorPosition(g,(bigPos-1)*15+12,mhcolor);
                        colorPosition(g,(bigPos-1)*15+13,mhcolor);
                        colorPosition(g,(bigPos-1)*15+14,mhcolor);
                        break;
                    case 1:
                        colorPosition(g,(bigPos-1)*15+1,mhcolor);
                        colorPosition(g,(bigPos-1)*15+5,mhcolor);
                        colorPosition(g,(bigPos-1)*15+6,mhcolor);
                        colorPosition(g,(bigPos-1)*15+7,mhcolor);
                        colorPosition(g,(bigPos-1)*15+8,mhcolor);
                        colorPosition(g,(bigPos-1)*15+9,mhcolor);
                        colorPosition(g,(bigPos-1)*15+4,mhcolor);
                        colorPosition(g,(bigPos-1)*15+14,mhcolor);
                        break;
                    case 2:
                        colorPosition(g,(bigPos-1)*15,mhcolor);
                        colorPosition(g,(bigPos-1)*15+2,mhcolor);
                        colorPosition(g,(bigPos-1)*15+3,mhcolor);
                        colorPosition(g,(bigPos-1)*15+4,mhcolor);
                        colorPosition(g,(bigPos-1)*15+5,mhcolor);
                        colorPosition(g,(bigPos-1)*15+7,mhcolor);
                        colorPosition(g,(bigPos-1)*15+9,mhcolor);
                        colorPosition(g,(bigPos-1)*15+10,mhcolor);
                        colorPosition(g,(bigPos-1)*15+11,mhcolor);
                        colorPosition(g,(bigPos-1)*15+12,mhcolor);
                        colorPosition(g,(bigPos-1)*15+14,mhcolor);
                        break;
                    case 3:
                        colorPosition(g,(bigPos-1)*15,mhcolor);
                        colorPosition(g,(bigPos-1)*15+2,mhcolor);
                        colorPosition(g,(bigPos-1)*15+4,mhcolor);
                        colorPosition(g,(bigPos-1)*15+5,mhcolor);
                        colorPosition(g,(bigPos-1)*15+7,mhcolor);
                        colorPosition(g,(bigPos-1)*15+9,mhcolor);
                        colorPosition(g,(bigPos-1)*15+10,mhcolor);
                        colorPosition(g,(bigPos-1)*15+11,mhcolor);
                        colorPosition(g,(bigPos-1)*15+12,mhcolor);
                        colorPosition(g,(bigPos-1)*15+13,mhcolor);
                        colorPosition(g,(bigPos-1)*15+14,mhcolor);
                        break;
                    case 4:
                        colorPosition(g,(bigPos-1)*15,mhcolor);
                        colorPosition(g,(bigPos-1)*15+1,mhcolor);
                        colorPosition(g,(bigPos-1)*15+2,mhcolor);
                        colorPosition(g,(bigPos-1)*15+7,mhcolor);
                        colorPosition(g,(bigPos-1)*15+10,mhcolor);
                        colorPosition(g,(bigPos-1)*15+11,mhcolor);
                        colorPosition(g,(bigPos-1)*15+12,mhcolor);
                        colorPosition(g,(bigPos-1)*15+13,mhcolor);
                        colorPosition(g,(bigPos-1)*15+14,mhcolor);
                        break;
                    case 5:
                        colorPosition(g,(bigPos-1)*15,mhcolor);
                        colorPosition(g,(bigPos-1)*15+1,mhcolor);
                        colorPosition(g,(bigPos-1)*15+2,mhcolor);
                        colorPosition(g,(bigPos-1)*15+4,mhcolor);
                        colorPosition(g,(bigPos-1)*15+5,mhcolor);
                        colorPosition(g,(bigPos-1)*15+7,mhcolor);
                        colorPosition(g,(bigPos-1)*15+9,mhcolor);
                        colorPosition(g,(bigPos-1)*15+10,mhcolor);
                        colorPosition(g,(bigPos-1)*15+12,mhcolor);
                        colorPosition(g,(bigPos-1)*15+13,mhcolor);
                        colorPosition(g,(bigPos-1)*15+14,mhcolor);
                        break;
                    case 6:
                        colorPosition(g,(bigPos-1)*15,mhcolor);
                        colorPosition(g,(bigPos-1)*15+1,mhcolor);
                        colorPosition(g,(bigPos-1)*15+2,mhcolor);
                        colorPosition(g,(bigPos-1)*15+3,mhcolor);
                        colorPosition(g,(bigPos-1)*15+4,mhcolor);
                        colorPosition(g,(bigPos-1)*15+5,mhcolor);
                        colorPosition(g,(bigPos-1)*15+7,mhcolor);
                        colorPosition(g,(bigPos-1)*15+9,mhcolor);
                        colorPosition(g,(bigPos-1)*15+10,mhcolor);
                        colorPosition(g,(bigPos-1)*15+12,mhcolor);
                        colorPosition(g,(bigPos-1)*15+13,mhcolor);
                        colorPosition(g,(bigPos-1)*15+14,mhcolor);
                        break;
                    case 7:
                        colorPosition(g,(bigPos-1)*15,mhcolor);
                        colorPosition(g,(bigPos-1)*15+5,mhcolor);
                        colorPosition(g,(bigPos-1)*15+7,mhcolor);
                        colorPosition(g,(bigPos-1)*15+8,mhcolor);
                        colorPosition(g,(bigPos-1)*15+9,mhcolor);
                        colorPosition(g,(bigPos-1)*15+10,mhcolor);
                        colorPosition(g,(bigPos-1)*15+11,mhcolor);
                        break;
                    case 8:
                        colorPosition(g,(bigPos-1)*15,mhcolor);
                        colorPosition(g,(bigPos-1)*15+1,mhcolor);
                        colorPosition(g,(bigPos-1)*15+2,mhcolor);
                        colorPosition(g,(bigPos-1)*15+3,mhcolor);
                        colorPosition(g,(bigPos-1)*15+4,mhcolor);
                        colorPosition(g,(bigPos-1)*15+5,mhcolor);
                        colorPosition(g,(bigPos-1)*15+7,mhcolor);
                        colorPosition(g,(bigPos-1)*15+9,mhcolor);
                        colorPosition(g,(bigPos-1)*15+10,mhcolor);
                        colorPosition(g,(bigPos-1)*15+11,mhcolor);
                        colorPosition(g,(bigPos-1)*15+12,mhcolor);
                        colorPosition(g,(bigPos-1)*15+13,mhcolor);
                        colorPosition(g,(bigPos-1)*15+14,mhcolor);
                        break;
                    case 9:
                        colorPosition(g,(bigPos-1)*15,mhcolor);
                        colorPosition(g,(bigPos-1)*15+1,mhcolor);
                        colorPosition(g,(bigPos-1)*15+2,mhcolor);
                        colorPosition(g,(bigPos-1)*15+4,mhcolor);
                        colorPosition(g,(bigPos-1)*15+5,mhcolor);
                        colorPosition(g,(bigPos-1)*15+7,mhcolor);
                        colorPosition(g,(bigPos-1)*15+9,mhcolor);
                        colorPosition(g,(bigPos-1)*15+10,mhcolor);
                        colorPosition(g,(bigPos-1)*15+11,mhcolor);
                        colorPosition(g,(bigPos-1)*15+12,mhcolor);
                        colorPosition(g,(bigPos-1)*15+13,mhcolor);
                        colorPosition(g,(bigPos-1)*15+14,mhcolor);
                        break;

                }

    }

    private void drawNumbers(Graphics g,int width,int height){
        int s =0;
        int space=0;
        for (int j = 0; j < 12; j++) {
            for (int i = 0; i < 5; i++) {
                if (s>=15 && s<=29 && space==0){
                    space+=10;
                }else if (s>=30 && s<=44 && space==10){
                    space+=10;
                } else if(s>=45 && s<=59 && space==20){
                    space+=10;
                }
                positions[s][0]=width/2+25*j+space-170;
                positions[s][1]=height/2+20*i-40;
                s++;

            }
        }
        for (int i = 0; i < positions.length; i++) {
            colorPosition(g,i,numberColor);
        }
        g.setColor(mhcolor);
        g.drawLine((positions[25][0]+positions[35][0])/2-2,positions[25][1],(positions[25][0]+positions[35][0])/2-2,positions[29][1]-5);

    }

    private void drawSecond(Graphics g) {
        colorPosition(g,second,shcolor);
    }

    private void drawMinute(Graphics g) {
        if (minute<10){
            colorBigNumber(g,3,0);
            colorBigNumber(g,4,minute);
        }else if (minute<20){
            colorBigNumber(g,3,1);
            colorBigNumber(g,4,minute-10);
        } else if (minute<30){
            colorBigNumber(g,3,2);
            colorBigNumber(g,4,minute-20);
        }else if (minute<40){
            colorBigNumber(g,3,3);
            colorBigNumber(g,4,minute-30);
        }else if (minute<50){
            colorBigNumber(g,3,4);
            colorBigNumber(g,4,minute-40);
        }else if (minute<60){
            colorBigNumber(g,3,5);
            colorBigNumber(g,4,minute-50);
        }

    }

    private void drawHour(Graphics g) {
        if (hour<10){
            colorBigNumber(g,1,0);
            colorBigNumber(g,2,hour);
        }else if (hour<20){
            colorBigNumber(g,1,1);
            colorBigNumber(g,2,hour-10);
        } else if (hour<30){
            colorBigNumber(g,1,2);
            colorBigNumber(g,2,hour-20);
        }
    }




    @Override
    public void displayTime(int hour, int minute, int second) {
        this.hour=hour;
        this.minute = minute;
        this.second=second;
    }
}

