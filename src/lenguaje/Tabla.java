
package lenguaje;

import java.util.Stack;

public class Tabla {
    int [][]  tabla;
    
    Tabla(){
        tabla=new int[100][100];
        inicializaTabla1();
        inicializaTabla2();
        inicializaTabla3();
        
    }
    void inicializaTabla1(){
        int i=0;
        tabla[i][0]=81; tabla[i][12]=81; tabla[i][24]=81; tabla[i][36]=81; tabla[i][48]=81; tabla[i][60]=81; tabla[i][72]=81; tabla[i][84]=81;
        tabla[i][1]=81; tabla[i][13]=81; tabla[i][25]=81; tabla[i][37]=81; tabla[i][49]=81; tabla[i][61]=0; tabla[i][73]=81; tabla[i][85]=81;
        tabla[i][2]=1; tabla[i][14]=81; tabla[i][26]=81; tabla[i][38]=81; tabla[i][50]=81; tabla[i][62]=0; tabla[i][74]=81; tabla[i][86]=81;
        tabla[i][3]=81; tabla[i][15]=81; tabla[i][27]=81; tabla[i][39]=81; tabla[i][51]=81; tabla[i][63]=81; tabla[i][75]=81; tabla[i][87]=81;
        tabla[i][4]=81; tabla[i][16]=81; tabla[i][28]=81; tabla[i][40]=81; tabla[i][52]=81; tabla[i][64]=81; tabla[i][76]=81; tabla[i][88]=81;
        tabla[i][5]=81; tabla[i][17]=81; tabla[i][29]=81; tabla[i][41]=81; tabla[i][53]=81; tabla[i][65]=81; tabla[i][77]=81; tabla[i][89]=81;
        tabla[i][6]=81; tabla[i][18]=81; tabla[i][30]=81; tabla[i][42]=81; tabla[i][54]=81; tabla[i][66]=81; tabla[i][78]=81; tabla[i][90]=81;
        tabla[i][7]=81; tabla[i][19]=81; tabla[i][31]=81; tabla[i][43]=81; tabla[i][55]=81; tabla[i][67]=81; tabla[i][79]=81; tabla[i][91]=82;
        tabla[i][8]=81; tabla[i][20]=81; tabla[i][32]=81; tabla[i][44]=81; tabla[i][56]=81; tabla[i][68]=81; tabla[i][80]=81; tabla[i][92]=81;
        tabla[i][9]=81; tabla[i][21]=81; tabla[i][33]=81; tabla[i][45]=81; tabla[i][57]=81; tabla[i][69]=81; tabla[i][81]=81;
        tabla[i][10]=81; tabla[i][22]=81; tabla[i][34]=81; tabla[i][46]=81; tabla[i][58]=81; tabla[i][70]=81; tabla[i][82]=81;
        tabla[i][11]=81; tabla[i][23]=81; tabla[i][35]=81; tabla[i][47]=81; tabla[i][59]=81; tabla[i][71]=0; tabla[i][83]=81;
        
        i++; //1
        tabla[i][0]=81; tabla[i][12]=81; tabla[i][24]=81; tabla[i][36]=81; tabla[i][48]=81; tabla[i][60]=81; tabla[i][72]=81; tabla[i][84]=81;
        tabla[i][1]=81; tabla[i][13]=81; tabla[i][25]=81; tabla[i][37]=81; tabla[i][49]=81; tabla[i][61]=81; tabla[i][73]=81; tabla[i][85]=81;
        tabla[i][2]=81; tabla[i][14]=2; tabla[i][26]=81; tabla[i][38]=81; tabla[i][50]=81; tabla[i][62]=81; tabla[i][74]=81; tabla[i][86]=81;
        tabla[i][3]=81; tabla[i][15]=81; tabla[i][27]=81; tabla[i][39]=81; tabla[i][51]=81; tabla[i][63]=81; tabla[i][75]=81; tabla[i][87]=81;
        tabla[i][4]=81; tabla[i][16]=81; tabla[i][28]=81; tabla[i][40]=81; tabla[i][52]=81; tabla[i][64]=81; tabla[i][76]=81; tabla[i][88]=81;
        tabla[i][5]=81; tabla[i][17]=81; tabla[i][29]=81; tabla[i][41]=81; tabla[i][53]=81; tabla[i][65]=81; tabla[i][77]=81; tabla[i][89]=81;
        tabla[i][6]=81; tabla[i][18]=81; tabla[i][30]=81; tabla[i][42]=81; tabla[i][54]=81; tabla[i][66]=81; tabla[i][78]=81; tabla[i][90]=81;
        tabla[i][7]=81; tabla[i][19]=81; tabla[i][31]=81; tabla[i][43]=81; tabla[i][55]=81; tabla[i][67]=81; tabla[i][79]=81; tabla[i][91]=82;
        tabla[i][8]=81; tabla[i][20]=81; tabla[i][32]=81; tabla[i][44]=81; tabla[i][56]=81; tabla[i][68]=81; tabla[i][80]=81; tabla[i][92]=81;
        tabla[i][9]=81; tabla[i][21]=81; tabla[i][33]=81; tabla[i][45]=81; tabla[i][57]=81; tabla[i][69]=81; tabla[i][81]=81;
        tabla[i][10]=81; tabla[i][22]=81; tabla[i][34]=81; tabla[i][46]=81; tabla[i][58]=81; tabla[i][70]=81; tabla[i][82]=81;
        tabla[i][11]=81; tabla[i][23]=81; tabla[i][35]=81; tabla[i][47]=81; tabla[i][59]=81; tabla[i][71]=81; tabla[i][83]=81;
        
        i++; //2
        tabla[i][0]=81; tabla[i][12]=81; tabla[i][24]=81; tabla[i][36]=81; tabla[i][48]=81; tabla[i][60]=81; tabla[i][72]=81; tabla[i][84]=81;
        tabla[i][1]=81; tabla[i][13]=3; tabla[i][25]=81; tabla[i][37]=81; tabla[i][49]=81; tabla[i][61]=81; tabla[i][73]=81; tabla[i][85]=81;
        tabla[i][2]=81; tabla[i][14]=81; tabla[i][26]=81; tabla[i][38]=81; tabla[i][50]=81; tabla[i][62]=81; tabla[i][74]=81; tabla[i][86]=81;
        tabla[i][3]=81; tabla[i][15]=81; tabla[i][27]=81; tabla[i][39]=81; tabla[i][51]=81; tabla[i][63]=81; tabla[i][75]=81; tabla[i][87]=81;
        tabla[i][4]=81; tabla[i][16]=81; tabla[i][28]=81; tabla[i][40]=81; tabla[i][52]=81; tabla[i][64]=81; tabla[i][76]=81; tabla[i][88]=81;
        tabla[i][5]=81; tabla[i][17]=81; tabla[i][29]=81; tabla[i][41]=81; tabla[i][53]=81; tabla[i][65]=81; tabla[i][77]=81; tabla[i][89]=81;
        tabla[i][6]=81; tabla[i][18]=81; tabla[i][30]=81; tabla[i][42]=81; tabla[i][54]=81; tabla[i][66]=81; tabla[i][78]=81; tabla[i][90]=81;
        tabla[i][7]=81; tabla[i][19]=81; tabla[i][31]=81; tabla[i][43]=81; tabla[i][55]=81; tabla[i][67]=81; tabla[i][79]=81; tabla[i][91]=82;
        tabla[i][8]=81; tabla[i][20]=81; tabla[i][32]=81; tabla[i][44]=81; tabla[i][56]=81; tabla[i][68]=81; tabla[i][80]=81; tabla[i][92]=81;
        tabla[i][9]=81; tabla[i][21]=81; tabla[i][33]=81; tabla[i][45]=81; tabla[i][57]=81; tabla[i][69]=81; tabla[i][81]=81;
        tabla[i][10]=81; tabla[i][22]=81; tabla[i][34]=81; tabla[i][46]=81; tabla[i][58]=81; tabla[i][70]=81; tabla[i][82]=81;
        tabla[i][11]=81; tabla[i][23]=81; tabla[i][35]=81; tabla[i][47]=81; tabla[i][59]=81; tabla[i][71]=81; tabla[i][83]=81;
        
        i++; //3
        tabla[i][0]=81; tabla[i][12]=81; tabla[i][24]=81; tabla[i][36]=81; tabla[i][48]=81; tabla[i][60]=81; tabla[i][72]=81; tabla[i][84]=81;
        tabla[i][1]=81; tabla[i][13]=81; tabla[i][25]=81; tabla[i][37]=81; tabla[i][49]=81; tabla[i][61]=81; tabla[i][73]=81; tabla[i][85]=81;
        tabla[i][2]=81; tabla[i][14]=81; tabla[i][26]=81; tabla[i][38]=81; tabla[i][50]=81; tabla[i][62]=81; tabla[i][74]=81; tabla[i][86]=81;
        tabla[i][3]=81; tabla[i][15]=81; tabla[i][27]=81; tabla[i][39]=81; tabla[i][51]=81; tabla[i][63]=81; tabla[i][75]=81; tabla[i][87]=81;
        tabla[i][4]=81; tabla[i][16]=81; tabla[i][28]=81; tabla[i][40]=81; tabla[i][52]=81; tabla[i][64]=81; tabla[i][76]=81; tabla[i][88]=81;
        tabla[i][5]=81; tabla[i][17]=81; tabla[i][29]=81; tabla[i][41]=81; tabla[i][53]=81; tabla[i][65]=81; tabla[i][77]=81; tabla[i][89]=81;
        tabla[i][6]=81; tabla[i][18]=81; tabla[i][30]=81; tabla[i][42]=81; tabla[i][54]=81; tabla[i][66]=81; tabla[i][78]=81; tabla[i][90]=81;
        tabla[i][7]=81; tabla[i][19]=4; tabla[i][31]=81; tabla[i][43]=81; tabla[i][55]=81; tabla[i][67]=81; tabla[i][79]=81; tabla[i][91]=82;
        tabla[i][8]=81; tabla[i][20]=81; tabla[i][32]=81; tabla[i][44]=81; tabla[i][56]=81; tabla[i][68]=81; tabla[i][80]=81; tabla[i][92]=81;
        tabla[i][9]=81; tabla[i][21]=81; tabla[i][33]=81; tabla[i][45]=81; tabla[i][57]=81; tabla[i][69]=81; tabla[i][81]=81;
        tabla[i][10]=81; tabla[i][22]=81; tabla[i][34]=81; tabla[i][46]=81; tabla[i][58]=81; tabla[i][70]=81; tabla[i][82]=81;
        tabla[i][11]=81; tabla[i][23]=81; tabla[i][35]=81; tabla[i][47]=81; tabla[i][59]=81; tabla[i][71]=81; tabla[i][83]=81;
        
        i++; //4
        tabla[i][0]=81; tabla[i][12]=81; tabla[i][24]=81; tabla[i][36]=81; tabla[i][48]=81; tabla[i][60]=81; tabla[i][72]=81; tabla[i][84]=81;
        tabla[i][1]=81; tabla[i][13]=81; tabla[i][25]=81; tabla[i][37]=81; tabla[i][49]=81; tabla[i][61]=81; tabla[i][73]=81; tabla[i][85]=81;
        tabla[i][2]=81; tabla[i][14]=81; tabla[i][26]=81; tabla[i][38]=81; tabla[i][50]=81; tabla[i][62]=81; tabla[i][74]=81; tabla[i][86]=81;
        tabla[i][3]=81; tabla[i][15]=81; tabla[i][27]=81; tabla[i][39]=81; tabla[i][51]=81; tabla[i][63]=81; tabla[i][75]=81; tabla[i][87]=81;
        tabla[i][4]=5; tabla[i][16]=81; tabla[i][28]=81; tabla[i][40]=81; tabla[i][52]=81; tabla[i][64]=81; tabla[i][76]=81; tabla[i][88]=81;
        tabla[i][5]=81; tabla[i][17]=81; tabla[i][29]=81; tabla[i][41]=81; tabla[i][53]=81; tabla[i][65]=81; tabla[i][77]=81; tabla[i][89]=81;
        tabla[i][6]=81; tabla[i][18]=81; tabla[i][30]=81; tabla[i][42]=81; tabla[i][54]=81; tabla[i][66]=81; tabla[i][78]=81; tabla[i][90]=81;
        tabla[i][7]=81; tabla[i][19]=81; tabla[i][31]=81; tabla[i][43]=81; tabla[i][55]=81; tabla[i][67]=81; tabla[i][79]=81; tabla[i][91]=82;
        tabla[i][8]=81; tabla[i][20]=81; tabla[i][32]=81; tabla[i][44]=81; tabla[i][56]=81; tabla[i][68]=81; tabla[i][80]=81; tabla[i][92]=81;
        tabla[i][9]=81; tabla[i][21]=81; tabla[i][33]=81; tabla[i][45]=81; tabla[i][57]=81; tabla[i][69]=81; tabla[i][81]=81;
        tabla[i][10]=81; tabla[i][22]=81; tabla[i][34]=81; tabla[i][46]=81; tabla[i][58]=81; tabla[i][70]=81; tabla[i][82]=81;
        tabla[i][11]=81; tabla[i][23]=81; tabla[i][35]=81; tabla[i][47]=81; tabla[i][59]=81; tabla[i][71]=81; tabla[i][83]=81;
        
        i++; //5
        tabla[i][0]=81; tabla[i][12]=81; tabla[i][24]=81; tabla[i][36]=81; tabla[i][48]=81; tabla[i][60]=81; tabla[i][72]=81; tabla[i][84]=81;
        tabla[i][1]=81; tabla[i][13]=6; tabla[i][25]=81; tabla[i][37]=81; tabla[i][49]=81; tabla[i][61]=81; tabla[i][73]=81; tabla[i][85]=81;
        tabla[i][2]=81; tabla[i][14]=81; tabla[i][26]=81; tabla[i][38]=81; tabla[i][50]=81; tabla[i][62]=81; tabla[i][74]=81; tabla[i][86]=81;
        tabla[i][3]=81; tabla[i][15]=81; tabla[i][27]=81; tabla[i][39]=81; tabla[i][51]=81; tabla[i][63]=81; tabla[i][75]=81; tabla[i][87]=81;
        tabla[i][4]=81; tabla[i][16]=81; tabla[i][28]=81; tabla[i][40]=81; tabla[i][52]=81; tabla[i][64]=81; tabla[i][76]=81; tabla[i][88]=81;
        tabla[i][5]=81; tabla[i][17]=81; tabla[i][29]=81; tabla[i][41]=81; tabla[i][53]=81; tabla[i][65]=81; tabla[i][77]=81; tabla[i][89]=81;
        tabla[i][6]=81; tabla[i][18]=81; tabla[i][30]=81; tabla[i][42]=81; tabla[i][54]=81; tabla[i][66]=81; tabla[i][78]=81; tabla[i][90]=81;
        tabla[i][7]=81; tabla[i][19]=81; tabla[i][31]=81; tabla[i][43]=81; tabla[i][55]=81; tabla[i][67]=81; tabla[i][79]=81; tabla[i][91]=82;
        tabla[i][8]=81; tabla[i][20]=81; tabla[i][32]=81; tabla[i][44]=81; tabla[i][56]=81; tabla[i][68]=81; tabla[i][80]=81; tabla[i][92]=81;
        tabla[i][9]=81; tabla[i][21]=81; tabla[i][33]=81; tabla[i][45]=81; tabla[i][57]=81; tabla[i][69]=81; tabla[i][81]=81;
        tabla[i][10]=81; tabla[i][22]=81; tabla[i][34]=81; tabla[i][46]=81; tabla[i][58]=81; tabla[i][70]=81; tabla[i][82]=81;
        tabla[i][11]=81; tabla[i][23]=81; tabla[i][35]=81; tabla[i][47]=81; tabla[i][59]=81; tabla[i][71]=81; tabla[i][83]=81;
        
        i++; //6
        tabla[i][0]=81; tabla[i][12]=81; tabla[i][24]=81; tabla[i][36]=81; tabla[i][48]=81; tabla[i][60]=81; tabla[i][72]=81; tabla[i][84]=81;
        tabla[i][1]=81; tabla[i][13]=81; tabla[i][25]=81; tabla[i][37]=81; tabla[i][49]=81; tabla[i][61]=81; tabla[i][73]=81; tabla[i][85]=81;
        tabla[i][2]=81; tabla[i][14]=81; tabla[i][26]=81; tabla[i][38]=81; tabla[i][50]=81; tabla[i][62]=81; tabla[i][74]=81; tabla[i][86]=81;
        tabla[i][3]=81; tabla[i][15]=81; tabla[i][27]=81; tabla[i][39]=81; tabla[i][51]=81; tabla[i][63]=81; tabla[i][75]=81; tabla[i][87]=81;
        tabla[i][4]=81; tabla[i][16]=81; tabla[i][28]=81; tabla[i][40]=81; tabla[i][52]=81; tabla[i][64]=81; tabla[i][76]=81; tabla[i][88]=81;
        tabla[i][5]=81; tabla[i][17]=81; tabla[i][29]=81; tabla[i][41]=81; tabla[i][53]=81; tabla[i][65]=81; tabla[i][77]=81; tabla[i][89]=82;
        tabla[i][6]=81; tabla[i][18]=81; tabla[i][30]=81; tabla[i][42]=81; tabla[i][54]=81; tabla[i][66]=81; tabla[i][78]=81; tabla[i][90]=82;
        tabla[i][7]=81; tabla[i][19]=7; tabla[i][31]=81; tabla[i][43]=81; tabla[i][55]=81; tabla[i][67]=81; tabla[i][79]=81; tabla[i][91]=82;
        tabla[i][8]=81; tabla[i][20]=81; tabla[i][32]=81; tabla[i][44]=81; tabla[i][56]=81; tabla[i][68]=81; tabla[i][80]=81; tabla[i][92]=81;
        tabla[i][9]=81; tabla[i][21]=81; tabla[i][33]=81; tabla[i][45]=81; tabla[i][57]=81; tabla[i][69]=81; tabla[i][81]=81;
        tabla[i][10]=81; tabla[i][22]=81; tabla[i][34]=81; tabla[i][46]=81; tabla[i][58]=81; tabla[i][70]=81; tabla[i][82]=81;
        tabla[i][11]=81; tabla[i][23]=81; tabla[i][35]=81; tabla[i][47]=81; tabla[i][59]=81; tabla[i][71]=81; tabla[i][83]=81;
        
        i++; //7
        tabla[i][0]=81; tabla[i][12]=81; tabla[i][24]=81; tabla[i][36]=81; tabla[i][48]=81; tabla[i][60]=81; tabla[i][72]=81; tabla[i][84]=81;
        tabla[i][1]=81; tabla[i][13]=81; tabla[i][25]=81; tabla[i][37]=81; tabla[i][49]=81; tabla[i][61]=81; tabla[i][73]=81; tabla[i][85]=81;
        tabla[i][2]=81; tabla[i][14]=81; tabla[i][26]=81; tabla[i][38]=81; tabla[i][50]=81; tabla[i][62]=8; tabla[i][74]=81; tabla[i][86]=81;
        tabla[i][3]=81; tabla[i][15]=81; tabla[i][27]=81; tabla[i][39]=81; tabla[i][51]=81; tabla[i][63]=81; tabla[i][75]=81; tabla[i][87]=81;
        tabla[i][4]=81; tabla[i][16]=81; tabla[i][28]=81; tabla[i][40]=81; tabla[i][52]=81; tabla[i][64]=81; tabla[i][76]=81; tabla[i][88]=81;
        tabla[i][5]=81; tabla[i][17]=81; tabla[i][29]=81; tabla[i][41]=81; tabla[i][53]=81; tabla[i][65]=81; tabla[i][77]=81; tabla[i][89]=81;
        tabla[i][6]=81; tabla[i][18]=81; tabla[i][30]=81; tabla[i][42]=81; tabla[i][54]=81; tabla[i][66]=81; tabla[i][78]=81; tabla[i][90]=81;
        tabla[i][7]=81; tabla[i][19]=81; tabla[i][31]=81; tabla[i][43]=81; tabla[i][55]=81; tabla[i][67]=81; tabla[i][79]=81; tabla[i][91]=82;
        tabla[i][8]=81; tabla[i][20]=81; tabla[i][32]=81; tabla[i][44]=81; tabla[i][56]=81; tabla[i][68]=81; tabla[i][80]=81; tabla[i][92]=81;
        tabla[i][9]=81; tabla[i][21]=81; tabla[i][33]=81; tabla[i][45]=81; tabla[i][57]=81; tabla[i][69]=81; tabla[i][81]=81;
        tabla[i][10]=81; tabla[i][22]=81; tabla[i][34]=81; tabla[i][46]=81; tabla[i][58]=81; tabla[i][70]=81; tabla[i][82]=81;
        tabla[i][11]=81; tabla[i][23]=81; tabla[i][35]=81; tabla[i][47]=81; tabla[i][59]=81; tabla[i][71]=81; tabla[i][83]=81;
        
        i++; //8
        tabla[i][0]=9; tabla[i][12]=9; tabla[i][24]=9; tabla[i][36]=9; tabla[i][48]=9; tabla[i][60]=81; tabla[i][72]=81; tabla[i][84]=81;
        tabla[i][1]=9; tabla[i][13]=9; tabla[i][25]=9; tabla[i][37]=9; tabla[i][49]=9; tabla[i][61]=8; tabla[i][73]=81; tabla[i][85]=81;
        tabla[i][2]=9; tabla[i][14]=9; tabla[i][26]=9; tabla[i][38]=9; tabla[i][50]=9; tabla[i][62]=8; tabla[i][74]=81; tabla[i][86]=81;
        tabla[i][3]=9; tabla[i][15]=9; tabla[i][27]=9; tabla[i][39]=9; tabla[i][51]=9; tabla[i][63]=81; tabla[i][75]=81; tabla[i][87]=81;
        tabla[i][4]=9; tabla[i][16]=9; tabla[i][28]=9; tabla[i][40]=9; tabla[i][52]=81; tabla[i][64]=81; tabla[i][76]=81; tabla[i][88]=81;
        tabla[i][5]=81; tabla[i][17]=9; tabla[i][29]=9; tabla[i][41]=9; tabla[i][53]=81; tabla[i][65]=81; tabla[i][77]=81; tabla[i][89]=81;
        tabla[i][6]=9; tabla[i][18]=9; tabla[i][30]=9; tabla[i][42]=9; tabla[i][54]=81; tabla[i][66]=81; tabla[i][78]=81; tabla[i][90]=81;
        tabla[i][7]=9; tabla[i][19]=9; tabla[i][31]=9; tabla[i][43]=9; tabla[i][55]=81; tabla[i][67]=81; tabla[i][79]=81; tabla[i][91]=82;
        tabla[i][8]=9; tabla[i][20]=9; tabla[i][32]=9; tabla[i][44]=9; tabla[i][56]=81; tabla[i][68]=81; tabla[i][80]=81; tabla[i][92]=81;
        tabla[i][9]=9; tabla[i][21]=9; tabla[i][33]=9; tabla[i][45]=9; tabla[i][57]=81; tabla[i][69]=81; tabla[i][81]=81;
        tabla[i][10]=9; tabla[i][22]=9; tabla[i][34]=9; tabla[i][46]=9; tabla[i][58]=81; tabla[i][70]=81; tabla[i][82]=81;
        tabla[i][11]=9; tabla[i][23]=9; tabla[i][35]=9; tabla[i][47]=9; tabla[i][59]=81; tabla[i][71]=81; tabla[i][83]=81;
        
        i++; //9
        tabla[i][0]=9; tabla[i][12]=9; tabla[i][24]=9; tabla[i][36]=9; tabla[i][48]=9; tabla[i][60]=9; tabla[i][72]=81; tabla[i][84]=81;
        tabla[i][1]=9; tabla[i][13]=9; tabla[i][25]=9; tabla[i][37]=9; tabla[i][49]=9; tabla[i][61]=81; tabla[i][73]=81; tabla[i][85]=81;
        tabla[i][2]=9; tabla[i][14]=9; tabla[i][26]=9; tabla[i][38]=9; tabla[i][50]=9; tabla[i][62]=81; tabla[i][74]=81; tabla[i][86]=81;
        tabla[i][3]=9; tabla[i][15]=9; tabla[i][27]=9; tabla[i][39]=9; tabla[i][51]=9; tabla[i][63]=81; tabla[i][75]=81; tabla[i][87]=81;
        tabla[i][4]=9; tabla[i][16]=9; tabla[i][28]=9; tabla[i][40]=9; tabla[i][52]=9; tabla[i][64]=81; tabla[i][76]=81; tabla[i][88]=81;
        tabla[i][5]=9; tabla[i][17]=9; tabla[i][29]=9; tabla[i][41]=9; tabla[i][53]=9; tabla[i][65]=81; tabla[i][77]=81; tabla[i][89]=81;
        tabla[i][6]=9; tabla[i][18]=9; tabla[i][30]=9; tabla[i][42]=9; tabla[i][54]=9; tabla[i][66]=10; tabla[i][78]=81; tabla[i][90]=81;
        tabla[i][7]=9; tabla[i][19]=9; tabla[i][31]=9; tabla[i][43]=9; tabla[i][55]=9; tabla[i][67]=81; tabla[i][79]=81; tabla[i][91]=82;
        tabla[i][8]=9; tabla[i][20]=9; tabla[i][32]=9; tabla[i][44]=9; tabla[i][56]=9; tabla[i][68]=81; tabla[i][80]=81; tabla[i][92]=9;
        tabla[i][9]=9; tabla[i][21]=9; tabla[i][33]=9; tabla[i][45]=9; tabla[i][57]=9; tabla[i][69]=81; tabla[i][81]=81;
        tabla[i][10]=9; tabla[i][22]=9; tabla[i][34]=9; tabla[i][46]=9; tabla[i][58]=9; tabla[i][70]=81; tabla[i][82]=81;
        tabla[i][11]=9; tabla[i][23]=9; tabla[i][35]=9; tabla[i][47]=9; tabla[i][59]=9; tabla[i][71]=81; tabla[i][83]=81;
        
        i++; //10
        tabla[i][0]=81; tabla[i][12]=81; tabla[i][24]=81; tabla[i][36]=81; tabla[i][48]=81; tabla[i][60]=81; tabla[i][72]=81; tabla[i][84]=81;
        tabla[i][1]=81; tabla[i][13]=81; tabla[i][25]=81; tabla[i][37]=81; tabla[i][49]=81; tabla[i][61]=81; tabla[i][73]=81; tabla[i][85]=81;
        tabla[i][2]=81; tabla[i][14]=81; tabla[i][26]=81; tabla[i][38]=81; tabla[i][50]=81; tabla[i][62]=81; tabla[i][74]=81; tabla[i][86]=81;
        tabla[i][3]=81; tabla[i][15]=81; tabla[i][27]=81; tabla[i][39]=81; tabla[i][51]=81; tabla[i][63]=81; tabla[i][75]=81; tabla[i][87]=81;
        tabla[i][4]=81; tabla[i][16]=81; tabla[i][28]=81; tabla[i][40]=81; tabla[i][52]=81; tabla[i][64]=81; tabla[i][76]=81; tabla[i][88]=81;
        tabla[i][5]=81; tabla[i][17]=81; tabla[i][29]=81; tabla[i][41]=81; tabla[i][53]=81; tabla[i][65]=81; tabla[i][77]=81; tabla[i][89]=81;
        tabla[i][6]=81; tabla[i][18]=81; tabla[i][30]=81; tabla[i][42]=81; tabla[i][54]=81; tabla[i][66]=81; tabla[i][78]=81; tabla[i][90]=81;
        tabla[i][7]=81; tabla[i][19]=81; tabla[i][31]=81; tabla[i][43]=81; tabla[i][55]=81; tabla[i][67]=81; tabla[i][79]=81; tabla[i][91]=82;
        tabla[i][8]=81; tabla[i][20]=81; tabla[i][32]=81; tabla[i][44]=81; tabla[i][56]=81; tabla[i][68]=81; tabla[i][80]=81; tabla[i][92]=81;
        tabla[i][9]=81; tabla[i][21]=81; tabla[i][33]=81; tabla[i][45]=81; tabla[i][57]=81; tabla[i][69]=11; tabla[i][81]=81;
        tabla[i][10]=81; tabla[i][22]=81; tabla[i][34]=81; tabla[i][46]=81; tabla[i][58]=81; tabla[i][70]=81; tabla[i][82]=81;
        tabla[i][11]=81; tabla[i][23]=81; tabla[i][35]=81; tabla[i][47]=81; tabla[i][59]=81; tabla[i][71]=81; tabla[i][83]=81;
        
        i++; //11
        tabla[i][0]=60; tabla[i][12]=60; tabla[i][24]=60; tabla[i][36]=60; tabla[i][48]=60; tabla[i][60]=81; tabla[i][72]=81; tabla[i][84]=81;
        tabla[i][1]=60; tabla[i][13]=60; tabla[i][25]=60; tabla[i][37]=60; tabla[i][49]=60; tabla[i][61]=11; tabla[i][73]=81; tabla[i][85]=81;
        tabla[i][2]=60; tabla[i][14]=60; tabla[i][26]=60; tabla[i][38]=60; tabla[i][50]=60; tabla[i][62]=11; tabla[i][74]=81; tabla[i][86]=81;
        tabla[i][3]=60; tabla[i][15]=60; tabla[i][27]=60; tabla[i][39]=60; tabla[i][51]=60; tabla[i][63]=81; tabla[i][75]=49; tabla[i][87]=81;
        tabla[i][4]=60; tabla[i][16]=60; tabla[i][28]=60; tabla[i][40]=60; tabla[i][52]=81; tabla[i][64]=51; tabla[i][76]=81; tabla[i][88]=81;
        tabla[i][5]=60; tabla[i][17]=60; tabla[i][29]=60; tabla[i][41]=60; tabla[i][53]=81; tabla[i][65]=81; tabla[i][77]=81; tabla[i][89]=13;
        tabla[i][6]=15; tabla[i][18]=23; tabla[i][30]=60; tabla[i][42]=60; tabla[i][54]=81; tabla[i][66]=81; tabla[i][78]=81; tabla[i][90]=81;
        tabla[i][7]=60; tabla[i][19]=60; tabla[i][31]=60; tabla[i][43]=60; tabla[i][55]=81; tabla[i][67]=81; tabla[i][79]=12; tabla[i][91]=82;
        tabla[i][8]=34; tabla[i][20]=60; tabla[i][32]=60; tabla[i][44]=60; tabla[i][56]=81; tabla[i][68]=81; tabla[i][80]=81; tabla[i][92]=81;
        tabla[i][9]=60; tabla[i][21]=60; tabla[i][33]=60; tabla[i][45]=60; tabla[i][57]=81; tabla[i][69]=81; tabla[i][81]=81;
        tabla[i][10]=60; tabla[i][22]=60; tabla[i][34]=60; tabla[i][46]=60; tabla[i][58]=81; tabla[i][70]=81; tabla[i][82]=81;
        tabla[i][11]=60; tabla[i][23]=60; tabla[i][35]=60; tabla[i][47]=60; tabla[i][59]=81; tabla[i][71]=11; tabla[i][83]=81;
        
        i++; //12
        tabla[i][0]=81; tabla[i][12]=81; tabla[i][24]=81; tabla[i][36]=81; tabla[i][48]=81; tabla[i][60]=81; tabla[i][72]=81; tabla[i][84]=81;
        tabla[i][1]=81; tabla[i][13]=81; tabla[i][25]=81; tabla[i][37]=81; tabla[i][49]=81; tabla[i][61]=81; tabla[i][73]=81; tabla[i][85]=81;
        tabla[i][2]=81; tabla[i][14]=81; tabla[i][26]=81; tabla[i][38]=81; tabla[i][50]=81; tabla[i][62]=81; tabla[i][74]=81; tabla[i][86]=81;
        tabla[i][3]=81; tabla[i][15]=81; tabla[i][27]=81; tabla[i][39]=81; tabla[i][51]=81; tabla[i][63]=81; tabla[i][75]=81; tabla[i][87]=81;
        tabla[i][4]=81; tabla[i][16]=81; tabla[i][28]=81; tabla[i][40]=81; tabla[i][52]=81; tabla[i][64]=81; tabla[i][76]=81; tabla[i][88]=81;
        tabla[i][5]=81; tabla[i][17]=81; tabla[i][29]=81; tabla[i][41]=81; tabla[i][53]=81; tabla[i][65]=81; tabla[i][77]=81; tabla[i][89]=81;
        tabla[i][6]=81; tabla[i][18]=81; tabla[i][30]=81; tabla[i][42]=81; tabla[i][54]=81; tabla[i][66]=81; tabla[i][78]=81; tabla[i][90]=81;
        tabla[i][7]=81; tabla[i][19]=81; tabla[i][31]=81; tabla[i][43]=81; tabla[i][55]=81; tabla[i][67]=81; tabla[i][79]=81; tabla[i][91]=82;
        tabla[i][8]=81; tabla[i][20]=81; tabla[i][32]=81; tabla[i][44]=81; tabla[i][56]=81; tabla[i][68]=81; tabla[i][80]=81; tabla[i][92]=81;
        tabla[i][9]=81; tabla[i][21]=81; tabla[i][33]=81; tabla[i][45]=81; tabla[i][57]=81; tabla[i][69]=81; tabla[i][81]=81;
        tabla[i][10]=81; tabla[i][22]=81; tabla[i][34]=81; tabla[i][46]=81; tabla[i][58]=81; tabla[i][70]=81; tabla[i][82]=81;
        tabla[i][11]=81; tabla[i][23]=81; tabla[i][35]=81; tabla[i][47]=81; tabla[i][59]=81; tabla[i][71]=81; tabla[i][83]=81;
        
        i++; //13
        tabla[i][0]=81; tabla[i][12]=83; tabla[i][24]=83; tabla[i][36]=83; tabla[i][48]=83; tabla[i][60]=83; tabla[i][72]=83; tabla[i][84]=83;
        tabla[i][1]=81; tabla[i][13]=83; tabla[i][25]=83; tabla[i][37]=83; tabla[i][49]=83; tabla[i][61]=83; tabla[i][73]=83; tabla[i][85]=83;
        tabla[i][2]=81; tabla[i][14]=83; tabla[i][26]=83; tabla[i][38]=83; tabla[i][50]=83; tabla[i][62]=83; tabla[i][74]=83; tabla[i][86]=83;
        tabla[i][3]=81; tabla[i][15]=83; tabla[i][27]=83; tabla[i][39]=83; tabla[i][51]=83; tabla[i][63]=83; tabla[i][75]=83; tabla[i][87]=83;
        tabla[i][4]=81; tabla[i][16]=83; tabla[i][28]=83; tabla[i][40]=83; tabla[i][52]=83; tabla[i][64]=83; tabla[i][76]=83; tabla[i][88]=83;
        tabla[i][5]=81; tabla[i][17]=83; tabla[i][29]=83; tabla[i][41]=83; tabla[i][53]=83; tabla[i][65]=83; tabla[i][77]=83; tabla[i][89]=83;
        tabla[i][6]=81; tabla[i][18]=83; tabla[i][30]=83; tabla[i][42]=83; tabla[i][54]=83; tabla[i][66]=83; tabla[i][78]=83; tabla[i][90]=83;
        tabla[i][7]=81; tabla[i][19]=83; tabla[i][31]=83; tabla[i][43]=83; tabla[i][55]=83; tabla[i][67]=83; tabla[i][79]=14; tabla[i][91]=82;
        tabla[i][8]=81; tabla[i][20]=83; tabla[i][32]=83; tabla[i][44]=83; tabla[i][56]=83; tabla[i][68]=83; tabla[i][80]=83; tabla[i][92]=83;
        tabla[i][9]=81; tabla[i][21]=83; tabla[i][33]=83; tabla[i][45]=83; tabla[i][57]=83; tabla[i][69]=83; tabla[i][81]=83;
        tabla[i][10]=81; tabla[i][22]=83; tabla[i][34]=83; tabla[i][46]=83; tabla[i][58]=83; tabla[i][70]=83; tabla[i][82]=83;
        tabla[i][11]=81; tabla[i][23]=83; tabla[i][35]=83; tabla[i][47]=83; tabla[i][59]=83; tabla[i][71]=83; tabla[i][83]=83;
        
        i++; //14
        tabla[i][0]=14; tabla[i][12]=14; tabla[i][24]=14; tabla[i][36]=14; tabla[i][48]=14; tabla[i][60]=14; tabla[i][72]=14; tabla[i][84]=14;
        tabla[i][1]=14; tabla[i][13]=14; tabla[i][25]=14; tabla[i][37]=14; tabla[i][49]=14; tabla[i][61]=11; tabla[i][73]=14; tabla[i][85]=14;
        tabla[i][2]=14; tabla[i][14]=14; tabla[i][26]=14; tabla[i][38]=14; tabla[i][50]=14; tabla[i][62]=14; tabla[i][74]=14; tabla[i][86]=14;
        tabla[i][3]=14; tabla[i][15]=14; tabla[i][27]=14; tabla[i][39]=14; tabla[i][51]=14; tabla[i][63]=14; tabla[i][75]=14; tabla[i][87]=14;
        tabla[i][4]=14; tabla[i][16]=14; tabla[i][28]=14; tabla[i][40]=14; tabla[i][52]=14; tabla[i][64]=14; tabla[i][76]=14; tabla[i][88]=14;
        tabla[i][5]=14; tabla[i][17]=14; tabla[i][29]=14; tabla[i][41]=14; tabla[i][53]=14; tabla[i][65]=14; tabla[i][77]=14; tabla[i][89]=14;
        tabla[i][6]=14; tabla[i][18]=14; tabla[i][30]=14; tabla[i][42]=14; tabla[i][54]=14; tabla[i][66]=14; tabla[i][78]=14; tabla[i][90]=14;
        tabla[i][7]=14; tabla[i][19]=14; tabla[i][31]=14; tabla[i][43]=14; tabla[i][55]=14; tabla[i][67]=14; tabla[i][79]=14; tabla[i][91]=82;
        tabla[i][8]=14; tabla[i][20]=14; tabla[i][32]=14; tabla[i][44]=14; tabla[i][56]=14; tabla[i][68]=14; tabla[i][80]=14; tabla[i][92]=14;
        tabla[i][9]=14; tabla[i][21]=14; tabla[i][33]=14; tabla[i][45]=14; tabla[i][57]=14; tabla[i][69]=14; tabla[i][81]=14;
        tabla[i][10]=14; tabla[i][22]=14; tabla[i][34]=14; tabla[i][46]=14; tabla[i][58]=14; tabla[i][70]=14; tabla[i][82]=14;
        tabla[i][11]=14; tabla[i][23]=14; tabla[i][35]=14; tabla[i][47]=14; tabla[i][59]=14; tabla[i][71]=14; tabla[i][83]=14;
        
        i++; //15
        tabla[i][0]=60; tabla[i][12]=60; tabla[i][24]=60; tabla[i][36]=60; tabla[i][48]=60; tabla[i][60]=60; tabla[i][72]=84; tabla[i][84]=84;
        tabla[i][1]=60; tabla[i][13]=60; tabla[i][25]=60; tabla[i][37]=60; tabla[i][49]=60; tabla[i][61]=84; tabla[i][73]=84; tabla[i][85]=84;
        tabla[i][2]=60; tabla[i][14]=60; tabla[i][26]=60; tabla[i][38]=60; tabla[i][50]=60; tabla[i][62]=84; tabla[i][74]=84; tabla[i][86]=84;
        tabla[i][3]=60; tabla[i][15]=60; tabla[i][27]=60; tabla[i][39]=60; tabla[i][51]=60; tabla[i][63]=84; tabla[i][75]=84; tabla[i][87]=84;
        tabla[i][4]=16; tabla[i][16]=60; tabla[i][28]=60; tabla[i][40]=60; tabla[i][52]=60; tabla[i][64]=84; tabla[i][76]=84; tabla[i][88]=84;
        tabla[i][5]=60; tabla[i][17]=60; tabla[i][29]=60; tabla[i][41]=60; tabla[i][53]=60; tabla[i][65]=84; tabla[i][77]=84; tabla[i][89]=84;
        tabla[i][6]=60; tabla[i][18]=60; tabla[i][30]=60; tabla[i][42]=60; tabla[i][54]=60; tabla[i][66]=84; tabla[i][78]=84; tabla[i][90]=84;
        tabla[i][7]=60; tabla[i][19]=60; tabla[i][31]=60; tabla[i][43]=60; tabla[i][55]=60; tabla[i][67]=84; tabla[i][79]=84; tabla[i][91]=82;
        tabla[i][8]=60; tabla[i][20]=60; tabla[i][32]=60; tabla[i][44]=60; tabla[i][56]=60; tabla[i][68]=84; tabla[i][80]=84; tabla[i][92]=84;
        tabla[i][9]=60; tabla[i][21]=60; tabla[i][33]=60; tabla[i][45]=60; tabla[i][57]=60; tabla[i][69]=84; tabla[i][81]=84;
        tabla[i][10]=60; tabla[i][22]=60; tabla[i][34]=60; tabla[i][46]=60; tabla[i][58]=60; tabla[i][70]=84; tabla[i][82]=84;
        tabla[i][11]=60; tabla[i][23]=60; tabla[i][35]=60; tabla[i][47]=60; tabla[i][59]=60; tabla[i][71]=84; tabla[i][83]=84;
        
        i++; //16
        tabla[i][0]=60; tabla[i][12]=60; tabla[i][24]=60; tabla[i][36]=60; tabla[i][48]=60; tabla[i][60]=60; tabla[i][72]=84; tabla[i][84]=84;
        tabla[i][1]=60; tabla[i][13]=60; tabla[i][25]=60; tabla[i][37]=60; tabla[i][49]=60; tabla[i][61]=84; tabla[i][73]=84; tabla[i][85]=84;
        tabla[i][2]=60; tabla[i][14]=60; tabla[i][26]=60; tabla[i][38]=60; tabla[i][50]=60; tabla[i][62]=84; tabla[i][74]=84; tabla[i][86]=84;
        tabla[i][3]=60; tabla[i][15]=60; tabla[i][27]=60; tabla[i][39]=60; tabla[i][51]=60; tabla[i][63]=84; tabla[i][75]=84; tabla[i][87]=84;
        tabla[i][4]=60; tabla[i][16]=60; tabla[i][28]=60; tabla[i][40]=60; tabla[i][52]=60; tabla[i][64]=84; tabla[i][76]=84; tabla[i][88]=84;
        tabla[i][5]=60; tabla[i][17]=60; tabla[i][29]=60; tabla[i][41]=60; tabla[i][53]=60; tabla[i][65]=84; tabla[i][77]=84; tabla[i][89]=84;
        tabla[i][6]=60; tabla[i][18]=60; tabla[i][30]=60; tabla[i][42]=60; tabla[i][54]=60; tabla[i][66]=84; tabla[i][78]=84; tabla[i][90]=84;
        tabla[i][7]=60; tabla[i][19]=17; tabla[i][31]=60; tabla[i][43]=60; tabla[i][55]=60; tabla[i][67]=84; tabla[i][79]=84; tabla[i][91]=82;
        tabla[i][8]=60; tabla[i][20]=60; tabla[i][32]=60; tabla[i][44]=60; tabla[i][56]=60; tabla[i][68]=84; tabla[i][80]=84; tabla[i][92]=84;
        tabla[i][9]=60; tabla[i][21]=60; tabla[i][33]=60; tabla[i][45]=60; tabla[i][57]=60; tabla[i][69]=84; tabla[i][81]=84;
        tabla[i][10]=60; tabla[i][22]=60; tabla[i][34]=60; tabla[i][46]=60; tabla[i][58]=60; tabla[i][70]=84; tabla[i][82]=84;
        tabla[i][11]=60; tabla[i][23]=60; tabla[i][35]=60; tabla[i][47]=60; tabla[i][59]=60; tabla[i][71]=84; tabla[i][83]=84;
        
        i++; //17
        tabla[i][0]=60; tabla[i][12]=60; tabla[i][24]=60; tabla[i][36]=60; tabla[i][48]=60; tabla[i][60]=60; tabla[i][72]=84; tabla[i][84]=84;
        tabla[i][1]=60; tabla[i][13]=60; tabla[i][25]=60; tabla[i][37]=60; tabla[i][49]=60; tabla[i][61]=84; tabla[i][73]=84; tabla[i][85]=84;
        tabla[i][2]=60; tabla[i][14]=60; tabla[i][26]=60; tabla[i][38]=60; tabla[i][50]=60; tabla[i][62]=84; tabla[i][74]=84; tabla[i][86]=84;
        tabla[i][3]=60; tabla[i][15]=60; tabla[i][27]=60; tabla[i][39]=60; tabla[i][51]=60; tabla[i][63]=84; tabla[i][75]=84; tabla[i][87]=84;
        tabla[i][4]=60; tabla[i][16]=60; tabla[i][28]=60; tabla[i][40]=60; tabla[i][52]=60; tabla[i][64]=84; tabla[i][76]=84; tabla[i][88]=84;
        tabla[i][5]=60; tabla[i][17]=60; tabla[i][29]=60; tabla[i][41]=60; tabla[i][53]=60; tabla[i][65]=84; tabla[i][77]=84; tabla[i][89]=84;
        tabla[i][6]=60; tabla[i][18]=60; tabla[i][30]=60; tabla[i][42]=60; tabla[i][54]=60; tabla[i][66]=18; tabla[i][78]=84; tabla[i][90]=84;
        tabla[i][7]=60; tabla[i][19]=60; tabla[i][31]=60; tabla[i][43]=60; tabla[i][55]=60; tabla[i][67]=84; tabla[i][79]=84; tabla[i][91]=82;
        tabla[i][8]=60; tabla[i][20]=60; tabla[i][32]=60; tabla[i][44]=60; tabla[i][56]=60; tabla[i][68]=84; tabla[i][80]=84; tabla[i][92]=84;
        tabla[i][9]=60; tabla[i][21]=60; tabla[i][33]=60; tabla[i][45]=60; tabla[i][57]=60; tabla[i][69]=84; tabla[i][81]=84;
        tabla[i][10]=60; tabla[i][22]=60; tabla[i][34]=60; tabla[i][46]=60; tabla[i][58]=60; tabla[i][70]=84; tabla[i][82]=84;
        tabla[i][11]=60; tabla[i][23]=60; tabla[i][35]=60; tabla[i][47]=60; tabla[i][59]=60; tabla[i][71]=84; tabla[i][83]=84;
        
        i++; //18
        tabla[i][0]=84; tabla[i][12]=84; tabla[i][24]=84; tabla[i][36]=84; tabla[i][48]=84; tabla[i][60]=84; tabla[i][72]=84; tabla[i][84]=84;
        tabla[i][1]=84; tabla[i][13]=84; tabla[i][25]=84; tabla[i][37]=84; tabla[i][49]=84; tabla[i][61]=84; tabla[i][73]=84; tabla[i][85]=84;
        tabla[i][2]=84; tabla[i][14]=84; tabla[i][26]=84; tabla[i][38]=84; tabla[i][50]=84; tabla[i][62]=84; tabla[i][74]=84; tabla[i][86]=84;
        tabla[i][3]=84; tabla[i][15]=84; tabla[i][27]=84; tabla[i][39]=84; tabla[i][51]=84; tabla[i][63]=19; tabla[i][75]=84; tabla[i][87]=84;
        tabla[i][4]=84; tabla[i][16]=84; tabla[i][28]=84; tabla[i][40]=84; tabla[i][52]=84; tabla[i][64]=84; tabla[i][76]=84; tabla[i][88]=84;
        tabla[i][5]=84; tabla[i][17]=84; tabla[i][29]=84; tabla[i][41]=84; tabla[i][53]=84; tabla[i][65]=84; tabla[i][77]=84; tabla[i][89]=84;
        tabla[i][6]=84; tabla[i][18]=84; tabla[i][30]=84; tabla[i][42]=84; tabla[i][54]=84; tabla[i][66]=84; tabla[i][78]=84; tabla[i][90]=84;
        tabla[i][7]=84; tabla[i][19]=84; tabla[i][31]=84; tabla[i][43]=84; tabla[i][55]=84; tabla[i][67]=84; tabla[i][79]=84; tabla[i][91]=82;
        tabla[i][8]=84; tabla[i][20]=84; tabla[i][32]=84; tabla[i][44]=84; tabla[i][56]=84; tabla[i][68]=84; tabla[i][80]=84; tabla[i][92]=84;
        tabla[i][9]=84; tabla[i][21]=84; tabla[i][33]=84; tabla[i][45]=84; tabla[i][57]=84; tabla[i][69]=84; tabla[i][81]=84;
        tabla[i][10]=84; tabla[i][22]=84; tabla[i][34]=84; tabla[i][46]=84; tabla[i][58]=84; tabla[i][70]=84; tabla[i][82]=84;
        tabla[i][11]=84; tabla[i][23]=84; tabla[i][35]=84; tabla[i][47]=84; tabla[i][59]=84; tabla[i][71]=84; tabla[i][83]=84;
        
        i++; //19
        tabla[i][0]=84; tabla[i][12]=84; tabla[i][24]=84; tabla[i][36]=84; tabla[i][48]=84; tabla[i][60]=84; tabla[i][72]=84; tabla[i][84]=84;
        tabla[i][1]=84; tabla[i][13]=84; tabla[i][25]=84; tabla[i][37]=84; tabla[i][49]=84; tabla[i][61]=84; tabla[i][73]=84; tabla[i][85]=84;
        tabla[i][2]=84; tabla[i][14]=84; tabla[i][26]=84; tabla[i][38]=84; tabla[i][50]=84; tabla[i][62]=84; tabla[i][74]=84; tabla[i][86]=84;
        tabla[i][3]=84; tabla[i][15]=84; tabla[i][27]=84; tabla[i][39]=84; tabla[i][51]=84; tabla[i][63]=84; tabla[i][75]=84; tabla[i][87]=84;
        tabla[i][4]=84; tabla[i][16]=84; tabla[i][28]=84; tabla[i][40]=84; tabla[i][52]=84; tabla[i][64]=84; tabla[i][76]=84; tabla[i][88]=84;
        tabla[i][5]=84; tabla[i][17]=84; tabla[i][29]=84; tabla[i][41]=84; tabla[i][53]=84; tabla[i][65]=84; tabla[i][77]=84; tabla[i][89]=84;
        tabla[i][6]=84; tabla[i][18]=84; tabla[i][30]=84; tabla[i][42]=84; tabla[i][54]=84; tabla[i][66]=84; tabla[i][78]=84; tabla[i][90]=84;
        tabla[i][7]=84; tabla[i][19]=84; tabla[i][31]=84; tabla[i][43]=84; tabla[i][55]=84; tabla[i][67]=84; tabla[i][79]=20; tabla[i][91]=82;
        tabla[i][8]=84; tabla[i][20]=84; tabla[i][32]=84; tabla[i][44]=84; tabla[i][56]=84; tabla[i][68]=84; tabla[i][80]=84; tabla[i][92]=84;
        tabla[i][9]=84; tabla[i][21]=84; tabla[i][33]=84; tabla[i][45]=84; tabla[i][57]=84; tabla[i][69]=84; tabla[i][81]=84;
        tabla[i][10]=84; tabla[i][22]=84; tabla[i][34]=84; tabla[i][46]=84; tabla[i][58]=84; tabla[i][70]=84; tabla[i][82]=84;
        tabla[i][11]=84; tabla[i][23]=84; tabla[i][35]=84; tabla[i][47]=84; tabla[i][59]=84; tabla[i][71]=84; tabla[i][83]=84;
        
        i++; //20
        tabla[i][0]=21; tabla[i][12]=21; tabla[i][24]=21; tabla[i][36]=21; tabla[i][48]=21; tabla[i][60]=84; tabla[i][72]=84; tabla[i][84]=84;
        tabla[i][1]=21; tabla[i][13]=21; tabla[i][25]=21; tabla[i][37]=21; tabla[i][49]=21; tabla[i][61]=84; tabla[i][73]=84; tabla[i][85]=84;
        tabla[i][2]=21; tabla[i][14]=21; tabla[i][26]=21; tabla[i][38]=21; tabla[i][50]=21; tabla[i][62]=20; tabla[i][74]=84; tabla[i][86]=84;
        tabla[i][3]=21; tabla[i][15]=21; tabla[i][27]=21; tabla[i][39]=21; tabla[i][51]=21; tabla[i][63]=84; tabla[i][75]=84; tabla[i][87]=84;
        tabla[i][4]=21; tabla[i][16]=21; tabla[i][28]=21; tabla[i][40]=21; tabla[i][52]=84; tabla[i][64]=84; tabla[i][76]=84; tabla[i][88]=84;
        tabla[i][5]=21; tabla[i][17]=21; tabla[i][29]=21; tabla[i][41]=21; tabla[i][53]=84; tabla[i][65]=84; tabla[i][77]=84; tabla[i][89]=84;
        tabla[i][6]=21; tabla[i][18]=21; tabla[i][30]=21; tabla[i][42]=21; tabla[i][54]=84; tabla[i][66]=84; tabla[i][78]=84; tabla[i][90]=84;
        tabla[i][7]=21; tabla[i][19]=21; tabla[i][31]=21; tabla[i][43]=21; tabla[i][55]=84; tabla[i][67]=84; tabla[i][79]=84; tabla[i][91]=82;
        tabla[i][8]=21; tabla[i][20]=21; tabla[i][32]=21; tabla[i][44]=21; tabla[i][56]=84; tabla[i][68]=84; tabla[i][80]=84; tabla[i][92]=84;
        tabla[i][9]=21; tabla[i][21]=21; tabla[i][33]=21; tabla[i][45]=21; tabla[i][57]=84; tabla[i][69]=84; tabla[i][81]=84;
        tabla[i][10]=21; tabla[i][22]=21; tabla[i][34]=21; tabla[i][46]=21; tabla[i][58]=84; tabla[i][70]=84; tabla[i][82]=84;
        tabla[i][11]=21; tabla[i][23]=21; tabla[i][35]=21; tabla[i][47]=21; tabla[i][59]=84; tabla[i][71]=20; tabla[i][83]=84;
        
        i++; //21
        tabla[i][0]=21; tabla[i][12]=21; tabla[i][24]=21; tabla[i][36]=21; tabla[i][48]=21; tabla[i][60]=21; tabla[i][72]=84; tabla[i][84]=84;
        tabla[i][1]=21; tabla[i][13]=21; tabla[i][25]=21; tabla[i][37]=21; tabla[i][49]=21; tabla[i][61]=84; tabla[i][73]=84; tabla[i][85]=84;
        tabla[i][2]=21; tabla[i][14]=21; tabla[i][26]=21; tabla[i][38]=21; tabla[i][50]=21; tabla[i][62]=84; tabla[i][74]=84; tabla[i][86]=22;
        tabla[i][3]=21; tabla[i][15]=21; tabla[i][27]=21; tabla[i][39]=21; tabla[i][51]=21; tabla[i][63]=84; tabla[i][75]=84; tabla[i][87]=84;
        tabla[i][4]=21; tabla[i][16]=21; tabla[i][28]=21; tabla[i][40]=21; tabla[i][52]=21; tabla[i][64]=84; tabla[i][76]=84; tabla[i][88]=84;
        tabla[i][5]=21; tabla[i][17]=21; tabla[i][29]=21; tabla[i][41]=21; tabla[i][53]=21; tabla[i][65]=84; tabla[i][77]=84; tabla[i][89]=84;
        tabla[i][6]=21; tabla[i][18]=21; tabla[i][30]=21; tabla[i][42]=21; tabla[i][54]=21; tabla[i][66]=84; tabla[i][78]=84; tabla[i][90]=84;
        tabla[i][7]=21; tabla[i][19]=21; tabla[i][31]=21; tabla[i][43]=21; tabla[i][55]=21; tabla[i][67]=84; tabla[i][79]=84; tabla[i][91]=82;
        tabla[i][8]=21; tabla[i][20]=21; tabla[i][32]=21; tabla[i][44]=21; tabla[i][56]=21; tabla[i][68]=84; tabla[i][80]=84; tabla[i][92]=21;
        tabla[i][9]=21; tabla[i][21]=21; tabla[i][33]=21; tabla[i][45]=21; tabla[i][57]=21; tabla[i][69]=84; tabla[i][81]=84;
        tabla[i][10]=21; tabla[i][22]=21; tabla[i][34]=21; tabla[i][46]=21; tabla[i][58]=21; tabla[i][70]=84; tabla[i][82]=84;
        tabla[i][11]=21; tabla[i][23]=21; tabla[i][35]=21; tabla[i][47]=21; tabla[i][59]=21; tabla[i][71]=84; tabla[i][83]=84;
        
        i++; //22
        tabla[i][0]=84; tabla[i][12]=84; tabla[i][24]=84; tabla[i][36]=84; tabla[i][48]=84; tabla[i][60]=84; tabla[i][72]=84; tabla[i][84]=84;
        tabla[i][1]=84; tabla[i][13]=84; tabla[i][25]=84; tabla[i][37]=84; tabla[i][49]=84; tabla[i][61]=11; tabla[i][73]=84; tabla[i][85]=84;
        tabla[i][2]=84; tabla[i][14]=84; tabla[i][26]=84; tabla[i][38]=84; tabla[i][50]=84; tabla[i][62]=11; tabla[i][74]=84; tabla[i][86]=84;
        tabla[i][3]=84; tabla[i][15]=84; tabla[i][27]=84; tabla[i][39]=84; tabla[i][51]=84; tabla[i][63]=81; tabla[i][75]=84; tabla[i][87]=84;
        tabla[i][4]=84; tabla[i][16]=84; tabla[i][28]=84; tabla[i][40]=84; tabla[i][52]=84; tabla[i][64]=84; tabla[i][76]=84; tabla[i][88]=84;
        tabla[i][5]=84; tabla[i][17]=84; tabla[i][29]=84; tabla[i][41]=84; tabla[i][53]=84; tabla[i][65]=84; tabla[i][77]=84; tabla[i][89]=84;
        tabla[i][6]=84; tabla[i][18]=84; tabla[i][30]=84; tabla[i][42]=84; tabla[i][54]=84; tabla[i][66]=84; tabla[i][78]=84; tabla[i][90]=84;
        tabla[i][7]=84; tabla[i][19]=84; tabla[i][31]=84; tabla[i][43]=84; tabla[i][55]=84; tabla[i][67]=84; tabla[i][79]=84; tabla[i][91]=82;
        tabla[i][8]=84; tabla[i][20]=84; tabla[i][32]=84; tabla[i][44]=84; tabla[i][56]=84; tabla[i][68]=84; tabla[i][80]=84; tabla[i][92]=84;
        tabla[i][9]=84; tabla[i][21]=84; tabla[i][33]=84; tabla[i][45]=84; tabla[i][57]=84; tabla[i][69]=84; tabla[i][81]=84;
        tabla[i][10]=84; tabla[i][22]=84; tabla[i][34]=84; tabla[i][46]=84; tabla[i][58]=84; tabla[i][70]=84; tabla[i][82]=84;
        tabla[i][11]=84; tabla[i][23]=84; tabla[i][35]=84; tabla[i][47]=84; tabla[i][59]=84; tabla[i][71]=84; tabla[i][83]=84;
        
        i++; //23
        tabla[i][0]=60; tabla[i][12]=60; tabla[i][24]=60; tabla[i][36]=60; tabla[i][48]=60; tabla[i][60]=60; tabla[i][72]=85; tabla[i][84]=85;
        tabla[i][1]=60; tabla[i][13]=60; tabla[i][25]=60; tabla[i][37]=60; tabla[i][49]=60; tabla[i][61]=85; tabla[i][73]=85; tabla[i][85]=85;
        tabla[i][2]=60; tabla[i][14]=60; tabla[i][26]=60; tabla[i][38]=60; tabla[i][50]=60; tabla[i][62]=85; tabla[i][74]=85; tabla[i][86]=85;
        tabla[i][3]=60; tabla[i][15]=60; tabla[i][27]=60; tabla[i][39]=60; tabla[i][51]=60; tabla[i][63]=85; tabla[i][75]=85; tabla[i][87]=85;
        tabla[i][4]=60; tabla[i][16]=60; tabla[i][28]=60; tabla[i][40]=60; tabla[i][52]=60; tabla[i][64]=85; tabla[i][76]=85; tabla[i][88]=85;
        tabla[i][5]=60; tabla[i][17]=60; tabla[i][29]=60; tabla[i][41]=60; tabla[i][53]=60; tabla[i][65]=85; tabla[i][77]=85; tabla[i][89]=84;
        tabla[i][6]=60; tabla[i][18]=60; tabla[i][30]=60; tabla[i][42]=60; tabla[i][54]=60; tabla[i][66]=85; tabla[i][78]=85; tabla[i][90]=84;
        tabla[i][7]=24; tabla[i][19]=60; tabla[i][31]=60; tabla[i][43]=60; tabla[i][55]=60; tabla[i][67]=85; tabla[i][79]=85; tabla[i][91]=82;
        tabla[i][8]=60; tabla[i][20]=60; tabla[i][32]=60; tabla[i][44]=60; tabla[i][56]=60; tabla[i][68]=85; tabla[i][80]=85; tabla[i][92]=84;
        tabla[i][9]=60; tabla[i][21]=60; tabla[i][33]=60; tabla[i][45]=60; tabla[i][57]=60; tabla[i][69]=85; tabla[i][81]=85;
        tabla[i][10]=60; tabla[i][22]=60; tabla[i][34]=60; tabla[i][46]=60; tabla[i][58]=60; tabla[i][70]=85; tabla[i][82]=85;
        tabla[i][11]=60; tabla[i][23]=60; tabla[i][35]=60; tabla[i][47]=60; tabla[i][59]=60; tabla[i][71]=85; tabla[i][83]=85;
        
        i++; //24
        tabla[i][0]=60; tabla[i][12]=60; tabla[i][24]=60; tabla[i][36]=60; tabla[i][48]=60; tabla[i][60]=60; tabla[i][72]=85; tabla[i][84]=85;
        tabla[i][1]=60; tabla[i][13]=60; tabla[i][25]=60; tabla[i][37]=60; tabla[i][49]=60; tabla[i][61]=85; tabla[i][73]=85; tabla[i][85]=85;
        tabla[i][2]=60; tabla[i][14]=25; tabla[i][26]=60; tabla[i][38]=60; tabla[i][50]=60; tabla[i][62]=85; tabla[i][74]=85; tabla[i][86]=85;
        tabla[i][3]=60; tabla[i][15]=60; tabla[i][27]=60; tabla[i][39]=60; tabla[i][51]=60; tabla[i][63]=85; tabla[i][75]=85; tabla[i][87]=85;
        tabla[i][4]=60; tabla[i][16]=60; tabla[i][28]=60; tabla[i][40]=60; tabla[i][52]=60; tabla[i][64]=85; tabla[i][76]=85; tabla[i][88]=85;
        tabla[i][5]=60; tabla[i][17]=60; tabla[i][29]=60; tabla[i][41]=60; tabla[i][53]=60; tabla[i][65]=85; tabla[i][77]=85; tabla[i][89]=85;
        tabla[i][6]=60; tabla[i][18]=60; tabla[i][30]=60; tabla[i][42]=60; tabla[i][54]=60; tabla[i][66]=85; tabla[i][78]=85; tabla[i][90]=85;
        tabla[i][7]=60; tabla[i][19]=60; tabla[i][31]=60; tabla[i][43]=60; tabla[i][55]=60; tabla[i][67]=85; tabla[i][79]=85; tabla[i][91]=82;
        tabla[i][8]=60; tabla[i][20]=60; tabla[i][32]=60; tabla[i][44]=60; tabla[i][56]=60; tabla[i][68]=85; tabla[i][80]=85; tabla[i][92]=85;
        tabla[i][9]=60; tabla[i][21]=60; tabla[i][33]=60; tabla[i][45]=60; tabla[i][57]=60; tabla[i][69]=85; tabla[i][81]=85;
        tabla[i][10]=60; tabla[i][22]=60; tabla[i][34]=60; tabla[i][46]=60; tabla[i][58]=60; tabla[i][70]=85; tabla[i][82]=85;
        tabla[i][11]=60; tabla[i][23]=60; tabla[i][35]=60; tabla[i][47]=60; tabla[i][59]=60; tabla[i][71]=85; tabla[i][83]=85;
        
        i++; //25
        tabla[i][0]=60; tabla[i][12]=60; tabla[i][24]=60; tabla[i][36]=60; tabla[i][48]=60; tabla[i][60]=60; tabla[i][72]=85; tabla[i][84]=85;
        tabla[i][1]=60; tabla[i][13]=60; tabla[i][25]=60; tabla[i][37]=60; tabla[i][49]=60; tabla[i][61]=85; tabla[i][73]=85; tabla[i][85]=85;
        tabla[i][2]=60; tabla[i][14]=60; tabla[i][26]=60; tabla[i][38]=60; tabla[i][50]=60; tabla[i][62]=85; tabla[i][74]=85; tabla[i][86]=85;
        tabla[i][3]=60; tabla[i][15]=60; tabla[i][27]=60; tabla[i][39]=60; tabla[i][51]=60; tabla[i][63]=85; tabla[i][75]=85; tabla[i][87]=85;
        tabla[i][4]=60; tabla[i][16]=60; tabla[i][28]=60; tabla[i][40]=60; tabla[i][52]=60; tabla[i][64]=85; tabla[i][76]=85; tabla[i][88]=85;
        tabla[i][5]=60; tabla[i][17]=60; tabla[i][29]=60; tabla[i][41]=60; tabla[i][53]=60; tabla[i][65]=85; tabla[i][77]=85; tabla[i][89]=85;
        tabla[i][6]=60; tabla[i][18]=60; tabla[i][30]=60; tabla[i][42]=60; tabla[i][54]=60; tabla[i][66]=85; tabla[i][78]=85; tabla[i][90]=85;
        tabla[i][7]=60; tabla[i][19]=60; tabla[i][31]=60; tabla[i][43]=60; tabla[i][55]=60; tabla[i][67]=85; tabla[i][79]=85; tabla[i][91]=82;
        tabla[i][8]=60; tabla[i][20]=60; tabla[i][32]=60; tabla[i][44]=60; tabla[i][56]=60; tabla[i][68]=85; tabla[i][80]=85; tabla[i][92]=85;
        tabla[i][9]=60; tabla[i][21]=60; tabla[i][33]=60; tabla[i][45]=60; tabla[i][57]=60; tabla[i][69]=85; tabla[i][81]=85;
        tabla[i][10]=60; tabla[i][22]=26; tabla[i][34]=60; tabla[i][46]=60; tabla[i][58]=60; tabla[i][70]=85; tabla[i][82]=85;
        tabla[i][11]=60; tabla[i][23]=60; tabla[i][35]=60; tabla[i][47]=60; tabla[i][59]=60; tabla[i][71]=85; tabla[i][83]=85;
        
        i++; //26
        tabla[i][0]=60; tabla[i][12]=60; tabla[i][24]=60; tabla[i][36]=60; tabla[i][48]=60; tabla[i][60]=60; tabla[i][72]=85; tabla[i][84]=85;
        tabla[i][1]=60; tabla[i][13]=60; tabla[i][25]=60; tabla[i][37]=60; tabla[i][49]=60; tabla[i][61]=85; tabla[i][73]=85; tabla[i][85]=85;
        tabla[i][2]=60; tabla[i][14]=60; tabla[i][26]=60; tabla[i][38]=60; tabla[i][50]=60; tabla[i][62]=85; tabla[i][74]=85; tabla[i][86]=85;
        tabla[i][3]=60; tabla[i][15]=60; tabla[i][27]=60; tabla[i][39]=60; tabla[i][51]=60; tabla[i][63]=85; tabla[i][75]=85; tabla[i][87]=85;
        tabla[i][4]=60; tabla[i][16]=60; tabla[i][28]=60; tabla[i][40]=60; tabla[i][52]=60; tabla[i][64]=85; tabla[i][76]=85; tabla[i][88]=85;
        tabla[i][5]=60; tabla[i][17]=60; tabla[i][29]=60; tabla[i][41]=60; tabla[i][53]=60; tabla[i][65]=85; tabla[i][77]=85; tabla[i][89]=85;
        tabla[i][6]=60; tabla[i][18]=60; tabla[i][30]=60; tabla[i][42]=60; tabla[i][54]=60; tabla[i][66]=27; tabla[i][78]=85; tabla[i][90]=85;
        tabla[i][7]=60; tabla[i][19]=60; tabla[i][31]=60; tabla[i][43]=60; tabla[i][55]=60; tabla[i][67]=85; tabla[i][79]=85; tabla[i][91]=82;
        tabla[i][8]=60; tabla[i][20]=60; tabla[i][32]=60; tabla[i][44]=60; tabla[i][56]=60; tabla[i][68]=85; tabla[i][80]=85; tabla[i][92]=85;
        tabla[i][9]=60; tabla[i][21]=60; tabla[i][33]=60; tabla[i][45]=60; tabla[i][57]=60; tabla[i][69]=85; tabla[i][81]=85;
        tabla[i][10]=60; tabla[i][22]=60; tabla[i][34]=60; tabla[i][46]=60; tabla[i][58]=60; tabla[i][70]=85; tabla[i][82]=85;
        tabla[i][11]=60; tabla[i][23]=60; tabla[i][35]=60; tabla[i][47]=60; tabla[i][59]=60; tabla[i][71]=85; tabla[i][83]=85;
        
        i++; //27
        tabla[i][0]=85; tabla[i][12]=85; tabla[i][24]=85; tabla[i][36]=85; tabla[i][48]=85; tabla[i][60]=85; tabla[i][72]=85; tabla[i][84]=85;
        tabla[i][1]=85; tabla[i][13]=85; tabla[i][25]=85; tabla[i][37]=85; tabla[i][49]=85; tabla[i][61]=85; tabla[i][73]=85; tabla[i][85]=85;
        tabla[i][2]=85; tabla[i][14]=85; tabla[i][26]=85; tabla[i][38]=85; tabla[i][50]=85; tabla[i][62]=85; tabla[i][74]=85; tabla[i][86]=85;
        tabla[i][3]=85; tabla[i][15]=85; tabla[i][27]=85; tabla[i][39]=85; tabla[i][51]=85; tabla[i][63]=28; tabla[i][75]=85; tabla[i][87]=85;
        tabla[i][4]=85; tabla[i][16]=85; tabla[i][28]=85; tabla[i][40]=85; tabla[i][52]=85; tabla[i][64]=85; tabla[i][76]=85; tabla[i][88]=85;
        tabla[i][5]=85; tabla[i][17]=85; tabla[i][29]=85; tabla[i][41]=85; tabla[i][53]=85; tabla[i][65]=85; tabla[i][77]=85; tabla[i][89]=85;
        tabla[i][6]=85; tabla[i][18]=85; tabla[i][30]=85; tabla[i][42]=85; tabla[i][54]=85; tabla[i][66]=85; tabla[i][78]=85; tabla[i][90]=85;
        tabla[i][7]=85; tabla[i][19]=85; tabla[i][31]=85; tabla[i][43]=85; tabla[i][55]=85; tabla[i][67]=85; tabla[i][79]=85; tabla[i][91]=82;
        tabla[i][8]=85; tabla[i][20]=85; tabla[i][32]=85; tabla[i][44]=85; tabla[i][56]=85; tabla[i][68]=85; tabla[i][80]=85; tabla[i][92]=85;
        tabla[i][9]=85; tabla[i][21]=85; tabla[i][33]=85; tabla[i][45]=85; tabla[i][57]=85; tabla[i][69]=85; tabla[i][81]=85;
        tabla[i][10]=85; tabla[i][22]=85; tabla[i][34]=85; tabla[i][46]=85; tabla[i][58]=85; tabla[i][70]=85; tabla[i][82]=85;
        tabla[i][11]=85; tabla[i][23]=85; tabla[i][35]=85; tabla[i][47]=85; tabla[i][59]=85; tabla[i][71]=85; tabla[i][83]=85;
        
        i++; //28
        tabla[i][0]=85; tabla[i][12]=85; tabla[i][24]=85; tabla[i][36]=85; tabla[i][48]=85; tabla[i][60]=85; tabla[i][72]=85; tabla[i][84]=85;
        tabla[i][1]=85; tabla[i][13]=85; tabla[i][25]=85; tabla[i][37]=85; tabla[i][49]=85; tabla[i][61]=85; tabla[i][73]=85; tabla[i][85]=85;
        tabla[i][2]=85; tabla[i][14]=85; tabla[i][26]=85; tabla[i][38]=85; tabla[i][50]=85; tabla[i][62]=85; tabla[i][74]=85; tabla[i][86]=85;
        tabla[i][3]=85; tabla[i][15]=85; tabla[i][27]=85; tabla[i][39]=85; tabla[i][51]=85; tabla[i][63]=85; tabla[i][75]=85; tabla[i][87]=85;
        tabla[i][4]=85; tabla[i][16]=85; tabla[i][28]=85; tabla[i][40]=85; tabla[i][52]=85; tabla[i][64]=85; tabla[i][76]=85; tabla[i][88]=85;
        tabla[i][5]=85; tabla[i][17]=85; tabla[i][29]=85; tabla[i][41]=85; tabla[i][53]=85; tabla[i][65]=85; tabla[i][77]=85; tabla[i][89]=85;
        tabla[i][6]=85; tabla[i][18]=85; tabla[i][30]=85; tabla[i][42]=85; tabla[i][54]=85; tabla[i][66]=85; tabla[i][78]=85; tabla[i][90]=85;
        tabla[i][7]=85; tabla[i][19]=85; tabla[i][31]=85; tabla[i][43]=85; tabla[i][55]=85; tabla[i][67]=85; tabla[i][79]=29; tabla[i][91]=82;
        tabla[i][8]=85; tabla[i][20]=85; tabla[i][32]=85; tabla[i][44]=85; tabla[i][56]=85; tabla[i][68]=85; tabla[i][80]=85; tabla[i][92]=85;
        tabla[i][9]=85; tabla[i][21]=85; tabla[i][33]=85; tabla[i][45]=85; tabla[i][57]=85; tabla[i][69]=85; tabla[i][81]=85;
        tabla[i][10]=85; tabla[i][22]=85; tabla[i][34]=85; tabla[i][46]=85; tabla[i][58]=85; tabla[i][70]=85; tabla[i][82]=85;
        tabla[i][11]=85; tabla[i][23]=85; tabla[i][35]=85; tabla[i][47]=85; tabla[i][59]=85; tabla[i][71]=85; tabla[i][83]=85;
        
        i++; //29
        tabla[i][0]=32; tabla[i][12]=32; tabla[i][24]=32; tabla[i][36]=32; tabla[i][48]=32; tabla[i][60]=85; tabla[i][72]=85; tabla[i][84]=85;
        tabla[i][1]=32; tabla[i][13]=32; tabla[i][25]=32; tabla[i][37]=32; tabla[i][49]=32; tabla[i][61]=85; tabla[i][73]=85; tabla[i][85]=85;
        tabla[i][2]=32; tabla[i][14]=32; tabla[i][26]=32; tabla[i][38]=32; tabla[i][50]=32; tabla[i][62]=29; tabla[i][74]=85; tabla[i][86]=85;
        tabla[i][3]=32; tabla[i][15]=32; tabla[i][27]=32; tabla[i][39]=32; tabla[i][51]=32; tabla[i][63]=85; tabla[i][75]=85; tabla[i][87]=85;
        tabla[i][4]=32; tabla[i][16]=32; tabla[i][28]=32; tabla[i][40]=32; tabla[i][52]=85; tabla[i][64]=85; tabla[i][76]=85; tabla[i][88]=85;
        tabla[i][5]=32; tabla[i][17]=32; tabla[i][29]=32; tabla[i][41]=32; tabla[i][53]=85; tabla[i][65]=85; tabla[i][77]=85; tabla[i][89]=85;
        tabla[i][6]=32; tabla[i][18]=32; tabla[i][30]=32; tabla[i][42]=32; tabla[i][54]=85; tabla[i][66]=85; tabla[i][78]=30; tabla[i][90]=85;
        tabla[i][7]=32; tabla[i][19]=32; tabla[i][31]=32; tabla[i][43]=32; tabla[i][55]=85; tabla[i][67]=85; tabla[i][79]=85; tabla[i][91]=82;
        tabla[i][8]=32; tabla[i][20]=32; tabla[i][32]=32; tabla[i][44]=32; tabla[i][56]=85; tabla[i][68]=85; tabla[i][80]=85; tabla[i][92]=85;
        tabla[i][9]=32; tabla[i][21]=32; tabla[i][33]=32; tabla[i][45]=32; tabla[i][57]=85; tabla[i][69]=85; tabla[i][81]=85;
        tabla[i][10]=32; tabla[i][22]=32; tabla[i][34]=32; tabla[i][46]=32; tabla[i][58]=85; tabla[i][70]=85; tabla[i][82]=85;
        tabla[i][11]=32; tabla[i][23]=32; tabla[i][35]=32; tabla[i][47]=32; tabla[i][59]=85; tabla[i][71]=29; tabla[i][83]=85;
        
        i++; //30
        tabla[i][0]=30; tabla[i][12]=30; tabla[i][24]=30; tabla[i][36]=30; tabla[i][48]=30; tabla[i][60]=30; tabla[i][72]=30; tabla[i][84]=30;
        tabla[i][1]=30; tabla[i][13]=30; tabla[i][25]=30; tabla[i][37]=30; tabla[i][49]=30; tabla[i][61]=30; tabla[i][73]=30; tabla[i][85]=30;
        tabla[i][2]=30; tabla[i][14]=30; tabla[i][26]=30; tabla[i][38]=30; tabla[i][50]=30; tabla[i][62]=30; tabla[i][74]=30; tabla[i][86]=30;
        tabla[i][3]=30; tabla[i][15]=30; tabla[i][27]=30; tabla[i][39]=30; tabla[i][51]=30; tabla[i][63]=30; tabla[i][75]=30; tabla[i][87]=30;
        tabla[i][4]=30; tabla[i][16]=30; tabla[i][28]=30; tabla[i][40]=30; tabla[i][52]=30; tabla[i][64]=30; tabla[i][76]=30; tabla[i][88]=30;
        tabla[i][5]=30; tabla[i][17]=30; tabla[i][29]=30; tabla[i][41]=30; tabla[i][53]=30; tabla[i][65]=30; tabla[i][77]=30; tabla[i][89]=30;
        tabla[i][6]=30; tabla[i][18]=30; tabla[i][30]=30; tabla[i][42]=30; tabla[i][54]=30; tabla[i][66]=30; tabla[i][78]=31; tabla[i][90]=30;
        tabla[i][7]=30; tabla[i][19]=30; tabla[i][31]=30; tabla[i][43]=30; tabla[i][55]=30; tabla[i][67]=30; tabla[i][79]=30; tabla[i][91]=82;
        tabla[i][8]=30; tabla[i][20]=30; tabla[i][32]=30; tabla[i][44]=30; tabla[i][56]=30; tabla[i][68]=30; tabla[i][80]=30; tabla[i][92]=30;
        tabla[i][9]=30; tabla[i][21]=30; tabla[i][33]=30; tabla[i][45]=30; tabla[i][57]=30; tabla[i][69]=30; tabla[i][81]=30;
        tabla[i][10]=30; tabla[i][22]=30; tabla[i][34]=30; tabla[i][46]=30; tabla[i][58]=30; tabla[i][70]=30; tabla[i][82]=30;
        tabla[i][11]=30; tabla[i][23]=30; tabla[i][35]=30; tabla[i][47]=30; tabla[i][59]=30; tabla[i][71]=30; tabla[i][83]=30;
        
        i++; //31
        tabla[i][0]=85; tabla[i][12]=85; tabla[i][24]=85; tabla[i][36]=85; tabla[i][48]=85; tabla[i][60]=85; tabla[i][72]=85; tabla[i][84]=85;
        tabla[i][1]=85; tabla[i][13]=85; tabla[i][25]=85; tabla[i][37]=85; tabla[i][49]=85; tabla[i][61]=85; tabla[i][73]=29; tabla[i][85]=85;
        tabla[i][2]=85; tabla[i][14]=85; tabla[i][26]=85; tabla[i][38]=85; tabla[i][50]=85; tabla[i][62]=85; tabla[i][74]=85; tabla[i][86]=33;
        tabla[i][3]=85; tabla[i][15]=85; tabla[i][27]=85; tabla[i][39]=85; tabla[i][51]=85; tabla[i][63]=85; tabla[i][75]=85; tabla[i][87]=85;
        tabla[i][4]=85; tabla[i][16]=85; tabla[i][28]=85; tabla[i][40]=85; tabla[i][52]=85; tabla[i][64]=85; tabla[i][76]=85; tabla[i][88]=85;
        tabla[i][5]=85; tabla[i][17]=85; tabla[i][29]=85; tabla[i][41]=85; tabla[i][53]=85; tabla[i][65]=85; tabla[i][77]=33; tabla[i][89]=85;
        tabla[i][6]=85; tabla[i][18]=85; tabla[i][30]=85; tabla[i][42]=85; tabla[i][54]=85; tabla[i][66]=85; tabla[i][78]=85; tabla[i][90]=85;
        tabla[i][7]=85; tabla[i][19]=85; tabla[i][31]=85; tabla[i][43]=85; tabla[i][55]=85; tabla[i][67]=85; tabla[i][79]=85; tabla[i][91]=82;
        tabla[i][8]=85; tabla[i][20]=85; tabla[i][32]=85; tabla[i][44]=85; tabla[i][56]=85; tabla[i][68]=85; tabla[i][80]=85; tabla[i][92]=85;
        tabla[i][9]=85; tabla[i][21]=85; tabla[i][33]=85; tabla[i][45]=85; tabla[i][57]=85; tabla[i][69]=85; tabla[i][81]=85;
        tabla[i][10]=85; tabla[i][22]=85; tabla[i][34]=85; tabla[i][46]=85; tabla[i][58]=85; tabla[i][70]=85; tabla[i][82]=85;
        tabla[i][11]=85; tabla[i][23]=85; tabla[i][35]=85; tabla[i][47]=85; tabla[i][59]=85; tabla[i][71]=85; tabla[i][83]=85;
        
        i++; //32
        tabla[i][0]=32; tabla[i][12]=32; tabla[i][24]=32; tabla[i][36]=32; tabla[i][48]=32; tabla[i][60]=32; tabla[i][72]=85; tabla[i][84]=85;
        tabla[i][1]=32; tabla[i][13]=32; tabla[i][25]=32; tabla[i][37]=32; tabla[i][49]=32; tabla[i][61]=85; tabla[i][73]=29; tabla[i][85]=85;
        tabla[i][2]=32; tabla[i][14]=32; tabla[i][26]=32; tabla[i][38]=32; tabla[i][50]=32; tabla[i][62]=85; tabla[i][74]=85; tabla[i][86]=33;
        tabla[i][3]=32; tabla[i][15]=32; tabla[i][27]=32; tabla[i][39]=32; tabla[i][51]=32; tabla[i][63]=85; tabla[i][75]=85; tabla[i][87]=85;
        tabla[i][4]=32; tabla[i][16]=32; tabla[i][28]=32; tabla[i][40]=32; tabla[i][52]=32; tabla[i][64]=85; tabla[i][76]=85; tabla[i][88]=85;
        tabla[i][5]=32; tabla[i][17]=32; tabla[i][29]=32; tabla[i][41]=32; tabla[i][53]=32; tabla[i][65]=85; tabla[i][77]=33; tabla[i][89]=85;
        tabla[i][6]=32; tabla[i][18]=32; tabla[i][30]=32; tabla[i][42]=32; tabla[i][54]=32; tabla[i][66]=85; tabla[i][78]=85; tabla[i][90]=85;
        tabla[i][7]=32; tabla[i][19]=32; tabla[i][31]=32; tabla[i][43]=32; tabla[i][55]=32; tabla[i][67]=85; tabla[i][79]=85; tabla[i][91]=82;
        tabla[i][8]=32; tabla[i][20]=32; tabla[i][32]=32; tabla[i][44]=32; tabla[i][56]=32; tabla[i][68]=85; tabla[i][80]=85; tabla[i][92]=85;
        tabla[i][9]=32; tabla[i][21]=32; tabla[i][33]=32; tabla[i][45]=32; tabla[i][57]=32; tabla[i][69]=85; tabla[i][81]=85;
        tabla[i][10]=32; tabla[i][22]=32; tabla[i][34]=32; tabla[i][46]=32; tabla[i][58]=32; tabla[i][70]=85; tabla[i][82]=85;
        tabla[i][11]=32; tabla[i][23]=32; tabla[i][35]=32; tabla[i][47]=32; tabla[i][59]=32; tabla[i][71]=85; tabla[i][83]=85;
        
        i++; //33
        tabla[i][0]=85; tabla[i][12]=85; tabla[i][24]=85; tabla[i][36]=85; tabla[i][48]=85; tabla[i][60]=85; tabla[i][72]=85; tabla[i][84]=85;
        tabla[i][1]=85; tabla[i][13]=85; tabla[i][25]=85; tabla[i][37]=85; tabla[i][49]=85; tabla[i][61]=11; tabla[i][73]=85; tabla[i][85]=85;
        tabla[i][2]=85; tabla[i][14]=85; tabla[i][26]=85; tabla[i][38]=85; tabla[i][50]=85; tabla[i][62]=11; tabla[i][74]=85; tabla[i][86]=85;
        tabla[i][3]=85; tabla[i][15]=85; tabla[i][27]=85; tabla[i][39]=85; tabla[i][51]=85; tabla[i][63]=85; tabla[i][75]=85; tabla[i][87]=85;
        tabla[i][4]=85; tabla[i][16]=85; tabla[i][28]=85; tabla[i][40]=85; tabla[i][52]=85; tabla[i][64]=85; tabla[i][76]=85; tabla[i][88]=85;
        tabla[i][5]=85; tabla[i][17]=85; tabla[i][29]=85; tabla[i][41]=85; tabla[i][53]=85; tabla[i][65]=85; tabla[i][77]=85; tabla[i][89]=85;
        tabla[i][6]=85; tabla[i][18]=85; tabla[i][30]=85; tabla[i][42]=85; tabla[i][54]=85; tabla[i][66]=85; tabla[i][78]=85; tabla[i][90]=85;
        tabla[i][7]=85; tabla[i][19]=85; tabla[i][31]=85; tabla[i][43]=85; tabla[i][55]=85; tabla[i][67]=85; tabla[i][79]=85; tabla[i][91]=82;
        tabla[i][8]=85; tabla[i][20]=85; tabla[i][32]=85; tabla[i][44]=85; tabla[i][56]=85; tabla[i][68]=85; tabla[i][80]=85; tabla[i][92]=85;
        tabla[i][9]=85; tabla[i][21]=85; tabla[i][33]=85; tabla[i][45]=85; tabla[i][57]=85; tabla[i][69]=85; tabla[i][81]=85;
        tabla[i][10]=85; tabla[i][22]=85; tabla[i][34]=85; tabla[i][46]=85; tabla[i][58]=85; tabla[i][70]=85; tabla[i][82]=85;
        tabla[i][11]=85; tabla[i][23]=85; tabla[i][35]=85; tabla[i][47]=85; tabla[i][59]=85; tabla[i][71]=85; tabla[i][83]=85;
        
        i++; //34
        tabla[i][0]=60; tabla[i][12]=60; tabla[i][24]=60; tabla[i][36]=60; tabla[i][48]=60; tabla[i][60]=60; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=60; tabla[i][13]=60; tabla[i][25]=60; tabla[i][37]=60; tabla[i][49]=60; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=60; tabla[i][14]=60; tabla[i][26]=60; tabla[i][38]=60; tabla[i][50]=60; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=60; tabla[i][15]=60; tabla[i][27]=60; tabla[i][39]=60; tabla[i][51]=60; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=60; tabla[i][16]=60; tabla[i][28]=60; tabla[i][40]=60; tabla[i][52]=60; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=35; tabla[i][17]=60; tabla[i][29]=60; tabla[i][41]=60; tabla[i][53]=60; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=60; tabla[i][18]=60; tabla[i][30]=60; tabla[i][42]=60; tabla[i][54]=60; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=60; tabla[i][19]=60; tabla[i][31]=60; tabla[i][43]=60; tabla[i][55]=60; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=60; tabla[i][20]=60; tabla[i][32]=60; tabla[i][44]=60; tabla[i][56]=60; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=86;
        tabla[i][9]=60; tabla[i][21]=60; tabla[i][33]=60; tabla[i][45]=60; tabla[i][57]=60; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=60; tabla[i][22]=60; tabla[i][34]=60; tabla[i][46]=60; tabla[i][58]=60; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=60; tabla[i][23]=60; tabla[i][35]=60; tabla[i][47]=60; tabla[i][59]=60; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //35
        tabla[i][0]=86; tabla[i][12]=86; tabla[i][24]=86; tabla[i][36]=86; tabla[i][48]=86; tabla[i][60]=86; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=86; tabla[i][13]=86; tabla[i][25]=86; tabla[i][37]=86; tabla[i][49]=86; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=86; tabla[i][14]=86; tabla[i][26]=86; tabla[i][38]=86; tabla[i][50]=86; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=86; tabla[i][15]=86; tabla[i][27]=86; tabla[i][39]=86; tabla[i][51]=86; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=86; tabla[i][16]=86; tabla[i][28]=86; tabla[i][40]=86; tabla[i][52]=86; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=86; tabla[i][17]=86; tabla[i][29]=86; tabla[i][41]=86; tabla[i][53]=86; tabla[i][65]=36; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=86; tabla[i][18]=86; tabla[i][30]=86; tabla[i][42]=86; tabla[i][54]=86; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=86; tabla[i][19]=86; tabla[i][31]=86; tabla[i][43]=86; tabla[i][55]=86; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=86; tabla[i][20]=86; tabla[i][32]=86; tabla[i][44]=86; tabla[i][56]=86; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=86;
        tabla[i][9]=86; tabla[i][21]=86; tabla[i][33]=86; tabla[i][45]=86; tabla[i][57]=86; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=86; tabla[i][22]=86; tabla[i][34]=86; tabla[i][46]=86; tabla[i][58]=86; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=86; tabla[i][23]=86; tabla[i][35]=86; tabla[i][47]=86; tabla[i][59]=86; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //36
        tabla[i][0]=45; tabla[i][12]=45; tabla[i][24]=45; tabla[i][36]=45; tabla[i][48]=45; tabla[i][60]=37; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=45; tabla[i][13]=45; tabla[i][25]=45; tabla[i][37]=45; tabla[i][49]=45; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=45; tabla[i][14]=45; tabla[i][26]=45; tabla[i][38]=45; tabla[i][50]=45; tabla[i][62]=36; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=45; tabla[i][15]=45; tabla[i][27]=45; tabla[i][39]=45; tabla[i][51]=45; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=45; tabla[i][16]=45; tabla[i][28]=45; tabla[i][40]=45; tabla[i][52]=37; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=45; tabla[i][17]=45; tabla[i][29]=45; tabla[i][41]=45; tabla[i][53]=37; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=45; tabla[i][18]=45; tabla[i][30]=45; tabla[i][42]=45; tabla[i][54]=37; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=45; tabla[i][19]=45; tabla[i][31]=45; tabla[i][43]=45; tabla[i][55]=37; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=45; tabla[i][20]=45; tabla[i][32]=45; tabla[i][44]=45; tabla[i][56]=37; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=37;
        tabla[i][9]=45; tabla[i][21]=45; tabla[i][33]=45; tabla[i][45]=45; tabla[i][57]=37; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=45; tabla[i][22]=45; tabla[i][34]=45; tabla[i][46]=45; tabla[i][58]=37; tabla[i][70]=81; tabla[i][82]=81;
        tabla[i][11]=45; tabla[i][23]=45; tabla[i][35]=45; tabla[i][47]=45; tabla[i][59]=37; tabla[i][71]=81; tabla[i][83]=81;
        
        i++; //37
        tabla[i][0]=86; tabla[i][12]=86; tabla[i][24]=86; tabla[i][36]=86; tabla[i][48]=86; tabla[i][60]=37; tabla[i][72]=86; tabla[i][84]=38;
        tabla[i][1]=86; tabla[i][13]=86; tabla[i][25]=86; tabla[i][37]=86; tabla[i][49]=86; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=86; tabla[i][14]=86; tabla[i][26]=86; tabla[i][38]=86; tabla[i][50]=86; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=86; tabla[i][15]=86; tabla[i][27]=86; tabla[i][39]=86; tabla[i][51]=86; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=86; tabla[i][16]=86; tabla[i][28]=86; tabla[i][40]=86; tabla[i][52]=37; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=86; tabla[i][17]=86; tabla[i][29]=86; tabla[i][41]=86; tabla[i][53]=37; tabla[i][65]=36; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=86; tabla[i][18]=86; tabla[i][30]=86; tabla[i][42]=86; tabla[i][54]=37; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=86; tabla[i][19]=86; tabla[i][31]=86; tabla[i][43]=86; tabla[i][55]=37; tabla[i][67]=39; tabla[i][79]=40; tabla[i][91]=82;
        tabla[i][8]=86; tabla[i][20]=86; tabla[i][32]=86; tabla[i][44]=86; tabla[i][56]=37; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=37;
        tabla[i][9]=86; tabla[i][21]=86; tabla[i][33]=86; tabla[i][45]=86; tabla[i][57]=37; tabla[i][69]=40; tabla[i][81]=86;
        tabla[i][10]=86; tabla[i][22]=86; tabla[i][34]=86; tabla[i][46]=86; tabla[i][58]=37; tabla[i][70]=39; tabla[i][82]=86;
        tabla[i][11]=86; tabla[i][23]=86; tabla[i][35]=86; tabla[i][47]=86; tabla[i][59]=37; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //38
        tabla[i][0]=86; tabla[i][12]=86; tabla[i][24]=86; tabla[i][36]=86; tabla[i][48]=86; tabla[i][60]=37; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=86; tabla[i][13]=86; tabla[i][25]=86; tabla[i][37]=86; tabla[i][49]=86; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=86; tabla[i][14]=86; tabla[i][26]=86; tabla[i][38]=86; tabla[i][50]=86; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=86; tabla[i][15]=86; tabla[i][27]=86; tabla[i][39]=86; tabla[i][51]=86; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=86; tabla[i][16]=86; tabla[i][28]=86; tabla[i][40]=86; tabla[i][52]=37; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=86; tabla[i][17]=86; tabla[i][29]=86; tabla[i][41]=86; tabla[i][53]=37; tabla[i][65]=36; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=86; tabla[i][18]=86; tabla[i][30]=86; tabla[i][42]=86; tabla[i][54]=37; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=86; tabla[i][19]=86; tabla[i][31]=86; tabla[i][43]=86; tabla[i][55]=37; tabla[i][67]=39; tabla[i][79]=40; tabla[i][91]=82;
        tabla[i][8]=86; tabla[i][20]=86; tabla[i][32]=86; tabla[i][44]=86; tabla[i][56]=37; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=38;
        tabla[i][9]=86; tabla[i][21]=86; tabla[i][33]=86; tabla[i][45]=86; tabla[i][57]=37; tabla[i][69]=40; tabla[i][81]=86;
        tabla[i][10]=86; tabla[i][22]=86; tabla[i][34]=86; tabla[i][46]=86; tabla[i][58]=37; tabla[i][70]=39; tabla[i][82]=86;
        tabla[i][11]=86; tabla[i][23]=86; tabla[i][35]=86; tabla[i][47]=86; tabla[i][59]=37; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //39
        tabla[i][0]=86; tabla[i][12]=86; tabla[i][24]=86; tabla[i][36]=86; tabla[i][48]=86; tabla[i][60]=37; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=86; tabla[i][13]=86; tabla[i][25]=86; tabla[i][37]=86; tabla[i][49]=86; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=86; tabla[i][14]=86; tabla[i][26]=86; tabla[i][38]=86; tabla[i][50]=86; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=86; tabla[i][15]=86; tabla[i][27]=86; tabla[i][39]=86; tabla[i][51]=86; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=86; tabla[i][16]=86; tabla[i][28]=86; tabla[i][40]=86; tabla[i][52]=86; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=86; tabla[i][17]=86; tabla[i][29]=86; tabla[i][41]=86; tabla[i][53]=86; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=86; tabla[i][18]=86; tabla[i][30]=86; tabla[i][42]=86; tabla[i][54]=86; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=86; tabla[i][19]=86; tabla[i][31]=86; tabla[i][43]=86; tabla[i][55]=86; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=86; tabla[i][20]=86; tabla[i][32]=86; tabla[i][44]=86; tabla[i][56]=86; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=86;
        tabla[i][9]=86; tabla[i][21]=86; tabla[i][33]=86; tabla[i][45]=86; tabla[i][57]=86; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=86; tabla[i][22]=86; tabla[i][34]=86; tabla[i][46]=86; tabla[i][58]=86; tabla[i][70]=41; tabla[i][82]=86;
        tabla[i][11]=86; tabla[i][23]=86; tabla[i][35]=86; tabla[i][47]=86; tabla[i][59]=86; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //40
        tabla[i][0]=42; tabla[i][12]=42; tabla[i][24]=42; tabla[i][36]=42; tabla[i][48]=42; tabla[i][60]=43; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=42; tabla[i][13]=42; tabla[i][25]=42; tabla[i][37]=42; tabla[i][49]=42; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=42; tabla[i][14]=42; tabla[i][26]=42; tabla[i][38]=42; tabla[i][50]=42; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=42; tabla[i][15]=42; tabla[i][27]=42; tabla[i][39]=42; tabla[i][51]=42; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=42; tabla[i][16]=42; tabla[i][28]=42; tabla[i][40]=42; tabla[i][52]=43; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=42; tabla[i][17]=42; tabla[i][29]=42; tabla[i][41]=42; tabla[i][53]=43; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=42; tabla[i][18]=42; tabla[i][30]=42; tabla[i][42]=42; tabla[i][54]=43; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=42; tabla[i][19]=42; tabla[i][31]=42; tabla[i][43]=42; tabla[i][55]=43; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=42; tabla[i][20]=42; tabla[i][32]=42; tabla[i][44]=42; tabla[i][56]=43; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=43;
        tabla[i][9]=42; tabla[i][21]=42; tabla[i][33]=42; tabla[i][45]=42; tabla[i][57]=43; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=42; tabla[i][22]=42; tabla[i][34]=42; tabla[i][46]=42; tabla[i][58]=43; tabla[i][70]=41; tabla[i][82]=86;
        tabla[i][11]=42; tabla[i][23]=42; tabla[i][35]=42; tabla[i][47]=42; tabla[i][59]=43; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //41
        tabla[i][0]=42; tabla[i][12]=42; tabla[i][24]=42; tabla[i][36]=42; tabla[i][48]=42; tabla[i][60]=43; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=42; tabla[i][13]=42; tabla[i][25]=42; tabla[i][37]=42; tabla[i][49]=42; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=42; tabla[i][14]=42; tabla[i][26]=42; tabla[i][38]=42; tabla[i][50]=42; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=42; tabla[i][15]=42; tabla[i][27]=42; tabla[i][39]=42; tabla[i][51]=42; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=42; tabla[i][16]=42; tabla[i][28]=42; tabla[i][40]=42; tabla[i][52]=43; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=42; tabla[i][17]=42; tabla[i][29]=42; tabla[i][41]=42; tabla[i][53]=43; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=42; tabla[i][18]=42; tabla[i][30]=42; tabla[i][42]=42; tabla[i][54]=43; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=42; tabla[i][19]=42; tabla[i][31]=42; tabla[i][43]=42; tabla[i][55]=43; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=42; tabla[i][20]=42; tabla[i][32]=42; tabla[i][44]=42; tabla[i][56]=43; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=43;
        tabla[i][9]=42; tabla[i][21]=42; tabla[i][33]=42; tabla[i][45]=42; tabla[i][57]=43; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=42; tabla[i][22]=42; tabla[i][34]=42; tabla[i][46]=42; tabla[i][58]=43; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=42; tabla[i][23]=42; tabla[i][35]=42; tabla[i][47]=42; tabla[i][59]=43; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //42
        tabla[i][0]=42; tabla[i][12]=42; tabla[i][24]=42; tabla[i][36]=42; tabla[i][48]=42; tabla[i][60]=42; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=42; tabla[i][13]=42; tabla[i][25]=42; tabla[i][37]=42; tabla[i][49]=42; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=42; tabla[i][14]=42; tabla[i][26]=42; tabla[i][38]=42; tabla[i][50]=42; tabla[i][62]=42; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=42; tabla[i][15]=42; tabla[i][27]=42; tabla[i][39]=42; tabla[i][51]=42; tabla[i][63]=86; tabla[i][75]=46; tabla[i][87]=86;
        tabla[i][4]=42; tabla[i][16]=42; tabla[i][28]=42; tabla[i][40]=42; tabla[i][52]=42; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=42; tabla[i][17]=42; tabla[i][29]=42; tabla[i][41]=42; tabla[i][53]=42; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=42; tabla[i][18]=42; tabla[i][30]=42; tabla[i][42]=42; tabla[i][54]=42; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=36;
        tabla[i][7]=42; tabla[i][19]=42; tabla[i][31]=42; tabla[i][43]=42; tabla[i][55]=42; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=42; tabla[i][20]=42; tabla[i][32]=42; tabla[i][44]=42; tabla[i][56]=42; tabla[i][68]=86; tabla[i][80]=36; tabla[i][92]=42;
        tabla[i][9]=42; tabla[i][21]=42; tabla[i][33]=42; tabla[i][45]=42; tabla[i][57]=42; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=42; tabla[i][22]=42; tabla[i][34]=42; tabla[i][46]=42; tabla[i][58]=42; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=42; tabla[i][23]=42; tabla[i][35]=42; tabla[i][47]=42; tabla[i][59]=42; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //43
        tabla[i][0]=86; tabla[i][12]=86; tabla[i][24]=86; tabla[i][36]=86; tabla[i][48]=86; tabla[i][60]=43; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=86; tabla[i][13]=86; tabla[i][25]=86; tabla[i][37]=86; tabla[i][49]=86; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=44;
        tabla[i][2]=86; tabla[i][14]=86; tabla[i][26]=86; tabla[i][38]=86; tabla[i][50]=86; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=86; tabla[i][15]=86; tabla[i][27]=86; tabla[i][39]=86; tabla[i][51]=86; tabla[i][63]=86; tabla[i][75]=46; tabla[i][87]=86;
        tabla[i][4]=86; tabla[i][16]=86; tabla[i][28]=86; tabla[i][40]=86; tabla[i][52]=43; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=86; tabla[i][17]=86; tabla[i][29]=86; tabla[i][41]=86; tabla[i][53]=43; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=86; tabla[i][18]=86; tabla[i][30]=86; tabla[i][42]=86; tabla[i][54]=43; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=36;
        tabla[i][7]=86; tabla[i][19]=86; tabla[i][31]=86; tabla[i][43]=86; tabla[i][55]=43; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=86; tabla[i][20]=86; tabla[i][32]=86; tabla[i][44]=86; tabla[i][56]=43; tabla[i][68]=86; tabla[i][80]=36; tabla[i][92]=43;
        tabla[i][9]=86; tabla[i][21]=86; tabla[i][33]=86; tabla[i][45]=86; tabla[i][57]=43; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=86; tabla[i][22]=86; tabla[i][34]=86; tabla[i][46]=86; tabla[i][58]=43; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=86; tabla[i][23]=86; tabla[i][35]=86; tabla[i][47]=86; tabla[i][59]=43; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //44
        tabla[i][0]=86; tabla[i][12]=86; tabla[i][24]=86; tabla[i][36]=86; tabla[i][48]=86; tabla[i][60]=44; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=86; tabla[i][13]=86; tabla[i][25]=86; tabla[i][37]=86; tabla[i][49]=86; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=86; tabla[i][14]=86; tabla[i][26]=86; tabla[i][38]=86; tabla[i][50]=86; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=86; tabla[i][15]=86; tabla[i][27]=86; tabla[i][39]=86; tabla[i][51]=86; tabla[i][63]=86; tabla[i][75]=46; tabla[i][87]=86;
        tabla[i][4]=86; tabla[i][16]=86; tabla[i][28]=86; tabla[i][40]=86; tabla[i][52]=44; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=86; tabla[i][17]=86; tabla[i][29]=86; tabla[i][41]=86; tabla[i][53]=44; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=86; tabla[i][18]=86; tabla[i][30]=86; tabla[i][42]=86; tabla[i][54]=44; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=36;
        tabla[i][7]=86; tabla[i][19]=86; tabla[i][31]=86; tabla[i][43]=86; tabla[i][55]=44; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=86; tabla[i][20]=86; tabla[i][32]=86; tabla[i][44]=86; tabla[i][56]=44; tabla[i][68]=86; tabla[i][80]=36; tabla[i][92]=44;
        tabla[i][9]=86; tabla[i][21]=86; tabla[i][33]=86; tabla[i][45]=86; tabla[i][57]=44; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=86; tabla[i][22]=86; tabla[i][34]=86; tabla[i][46]=86; tabla[i][58]=44; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=86; tabla[i][23]=86; tabla[i][35]=86; tabla[i][47]=86; tabla[i][59]=44; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //45
        tabla[i][0]=45; tabla[i][12]=45; tabla[i][24]=45; tabla[i][36]=45; tabla[i][48]=45; tabla[i][60]=45; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=45; tabla[i][13]=45; tabla[i][25]=45; tabla[i][37]=45; tabla[i][49]=45; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=45; tabla[i][14]=45; tabla[i][26]=45; tabla[i][38]=45; tabla[i][50]=45; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=45; tabla[i][15]=45; tabla[i][27]=45; tabla[i][39]=45; tabla[i][51]=45; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=45; tabla[i][16]=45; tabla[i][28]=45; tabla[i][40]=45; tabla[i][52]=45; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=45; tabla[i][17]=45; tabla[i][29]=45; tabla[i][41]=45; tabla[i][53]=45; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=45; tabla[i][18]=45; tabla[i][30]=45; tabla[i][42]=45; tabla[i][54]=45; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=45; tabla[i][19]=45; tabla[i][31]=45; tabla[i][43]=45; tabla[i][55]=45; tabla[i][67]=39; tabla[i][79]=40; tabla[i][91]=82;
        tabla[i][8]=45; tabla[i][20]=45; tabla[i][32]=45; tabla[i][44]=45; tabla[i][56]=45; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=45;
        tabla[i][9]=45; tabla[i][21]=45; tabla[i][33]=45; tabla[i][45]=45; tabla[i][57]=45; tabla[i][69]=40; tabla[i][81]=86;
        tabla[i][10]=45; tabla[i][22]=45; tabla[i][34]=45; tabla[i][46]=45; tabla[i][58]=45; tabla[i][70]=39; tabla[i][82]=86;
        tabla[i][11]=45; tabla[i][23]=45; tabla[i][35]=45; tabla[i][47]=45; tabla[i][59]=45; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //46
        tabla[i][0]=86; tabla[i][12]=86; tabla[i][24]=86; tabla[i][36]=86; tabla[i][48]=86; tabla[i][60]=86; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=86; tabla[i][13]=86; tabla[i][25]=86; tabla[i][37]=86; tabla[i][49]=86; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=86; tabla[i][14]=86; tabla[i][26]=86; tabla[i][38]=86; tabla[i][50]=86; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=86; tabla[i][15]=86; tabla[i][27]=86; tabla[i][39]=86; tabla[i][51]=86; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=86; tabla[i][16]=86; tabla[i][28]=86; tabla[i][40]=86; tabla[i][52]=86; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=86; tabla[i][17]=86; tabla[i][29]=86; tabla[i][41]=86; tabla[i][53]=86; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=86; tabla[i][18]=86; tabla[i][30]=86; tabla[i][42]=86; tabla[i][54]=86; tabla[i][66]=47; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=86; tabla[i][19]=86; tabla[i][31]=86; tabla[i][43]=86; tabla[i][55]=86; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=86; tabla[i][20]=86; tabla[i][32]=86; tabla[i][44]=86; tabla[i][56]=86; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=86;
        tabla[i][9]=86; tabla[i][21]=86; tabla[i][33]=86; tabla[i][45]=86; tabla[i][57]=86; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=86; tabla[i][22]=86; tabla[i][34]=86; tabla[i][46]=86; tabla[i][58]=86; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=86; tabla[i][23]=86; tabla[i][35]=86; tabla[i][47]=86; tabla[i][59]=86; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //47
        tabla[i][0]=86; tabla[i][12]=86; tabla[i][24]=86; tabla[i][36]=86; tabla[i][48]=86; tabla[i][60]=86; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=86; tabla[i][13]=86; tabla[i][25]=86; tabla[i][37]=86; tabla[i][49]=86; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=86; tabla[i][14]=86; tabla[i][26]=86; tabla[i][38]=86; tabla[i][50]=86; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=86; tabla[i][15]=86; tabla[i][27]=86; tabla[i][39]=86; tabla[i][51]=86; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=86; tabla[i][16]=86; tabla[i][28]=86; tabla[i][40]=86; tabla[i][52]=86; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=86; tabla[i][17]=86; tabla[i][29]=86; tabla[i][41]=86; tabla[i][53]=86; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=86; tabla[i][18]=86; tabla[i][30]=86; tabla[i][42]=86; tabla[i][54]=86; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=86; tabla[i][19]=86; tabla[i][31]=86; tabla[i][43]=86; tabla[i][55]=86; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=86; tabla[i][20]=86; tabla[i][32]=86; tabla[i][44]=86; tabla[i][56]=86; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=86;
        tabla[i][9]=86; tabla[i][21]=86; tabla[i][33]=86; tabla[i][45]=86; tabla[i][57]=86; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=86; tabla[i][22]=86; tabla[i][34]=86; tabla[i][46]=86; tabla[i][58]=86; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=86; tabla[i][23]=86; tabla[i][35]=86; tabla[i][47]=86; tabla[i][59]=86; tabla[i][71]=86; tabla[i][83]=48;
        
        i++; //48
        tabla[i][0]=86; tabla[i][12]=86; tabla[i][24]=86; tabla[i][36]=86; tabla[i][48]=86; tabla[i][60]=86; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=86; tabla[i][13]=86; tabla[i][25]=86; tabla[i][37]=86; tabla[i][49]=86; tabla[i][61]=11; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=86; tabla[i][14]=86; tabla[i][26]=86; tabla[i][38]=86; tabla[i][50]=86; tabla[i][62]=11; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=86; tabla[i][15]=86; tabla[i][27]=86; tabla[i][39]=86; tabla[i][51]=86; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=86; tabla[i][16]=86; tabla[i][28]=86; tabla[i][40]=86; tabla[i][52]=86; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=86; tabla[i][17]=86; tabla[i][29]=86; tabla[i][41]=86; tabla[i][53]=86; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=86; tabla[i][18]=86; tabla[i][30]=86; tabla[i][42]=86; tabla[i][54]=86; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=86; tabla[i][19]=86; tabla[i][31]=86; tabla[i][43]=86; tabla[i][55]=86; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=86; tabla[i][20]=86; tabla[i][32]=86; tabla[i][44]=86; tabla[i][56]=86; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=86;
        tabla[i][9]=86; tabla[i][21]=86; tabla[i][33]=86; tabla[i][45]=86; tabla[i][57]=86; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=86; tabla[i][22]=86; tabla[i][34]=86; tabla[i][46]=86; tabla[i][58]=86; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=86; tabla[i][23]=86; tabla[i][35]=86; tabla[i][47]=86; tabla[i][59]=86; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //49
        tabla[i][0]=86; tabla[i][12]=86; tabla[i][24]=86; tabla[i][36]=86; tabla[i][48]=86; tabla[i][60]=86; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=86; tabla[i][13]=86; tabla[i][25]=86; tabla[i][37]=86; tabla[i][49]=86; tabla[i][61]=11; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=86; tabla[i][14]=86; tabla[i][26]=86; tabla[i][38]=86; tabla[i][50]=86; tabla[i][62]=11; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=86; tabla[i][15]=86; tabla[i][27]=86; tabla[i][39]=86; tabla[i][51]=86; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=86; tabla[i][16]=86; tabla[i][28]=86; tabla[i][40]=86; tabla[i][52]=86; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=86; tabla[i][17]=86; tabla[i][29]=86; tabla[i][41]=86; tabla[i][53]=86; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=86; tabla[i][18]=86; tabla[i][30]=86; tabla[i][42]=86; tabla[i][54]=86; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=86; tabla[i][19]=86; tabla[i][31]=86; tabla[i][43]=86; tabla[i][55]=86; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=86; tabla[i][20]=86; tabla[i][32]=86; tabla[i][44]=86; tabla[i][56]=86; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=86;
        tabla[i][9]=86; tabla[i][21]=86; tabla[i][33]=86; tabla[i][45]=86; tabla[i][57]=86; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=86; tabla[i][22]=86; tabla[i][34]=86; tabla[i][46]=86; tabla[i][58]=86; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=86; tabla[i][23]=86; tabla[i][35]=86; tabla[i][47]=86; tabla[i][59]=86; tabla[i][71]=11; tabla[i][83]=86;
    }
    void inicializaTabla2(){
        int i=50; //50
        tabla[i][0]=86; tabla[i][12]=86; tabla[i][24]=86; tabla[i][36]=86; tabla[i][48]=86; tabla[i][60]=86; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=86; tabla[i][13]=86; tabla[i][25]=86; tabla[i][37]=86; tabla[i][49]=86; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=86; tabla[i][14]=86; tabla[i][26]=86; tabla[i][38]=86; tabla[i][50]=86; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=86; tabla[i][15]=86; tabla[i][27]=86; tabla[i][39]=86; tabla[i][51]=86; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=86; tabla[i][16]=86; tabla[i][28]=86; tabla[i][40]=86; tabla[i][52]=86; tabla[i][64]=51; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=86; tabla[i][17]=86; tabla[i][29]=86; tabla[i][41]=86; tabla[i][53]=86; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=86; tabla[i][18]=86; tabla[i][30]=86; tabla[i][42]=86; tabla[i][54]=86; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=86; tabla[i][19]=86; tabla[i][31]=86; tabla[i][43]=86; tabla[i][55]=86; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=86; tabla[i][20]=86; tabla[i][32]=86; tabla[i][44]=86; tabla[i][56]=86; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=86;
        tabla[i][9]=86; tabla[i][21]=86; tabla[i][33]=86; tabla[i][45]=86; tabla[i][57]=86; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=86; tabla[i][22]=86; tabla[i][34]=86; tabla[i][46]=86; tabla[i][58]=86; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=86; tabla[i][23]=86; tabla[i][35]=86; tabla[i][47]=86; tabla[i][59]=86; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //51
        tabla[i][0]=60; tabla[i][12]=60; tabla[i][24]=60; tabla[i][36]=60; tabla[i][48]=60; tabla[i][60]=60; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=60; tabla[i][13]=60; tabla[i][25]=60; tabla[i][37]=60; tabla[i][49]=60; tabla[i][61]=49; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=60; tabla[i][14]=60; tabla[i][26]=60; tabla[i][38]=60; tabla[i][50]=60; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=60; tabla[i][15]=60; tabla[i][27]=60; tabla[i][39]=60; tabla[i][51]=60; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=52; tabla[i][16]=60; tabla[i][28]=60; tabla[i][40]=60; tabla[i][52]=60; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=60; tabla[i][17]=60; tabla[i][29]=60; tabla[i][41]=60; tabla[i][53]=60; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=60; tabla[i][18]=60; tabla[i][30]=60; tabla[i][42]=60; tabla[i][54]=60; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=60; tabla[i][19]=60; tabla[i][31]=60; tabla[i][43]=60; tabla[i][55]=60; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=60; tabla[i][20]=60; tabla[i][32]=60; tabla[i][44]=60; tabla[i][56]=60; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=86;
        tabla[i][9]=60; tabla[i][21]=60; tabla[i][33]=60; tabla[i][45]=60; tabla[i][57]=60; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=60; tabla[i][22]=60; tabla[i][34]=60; tabla[i][46]=60; tabla[i][58]=60; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=60; tabla[i][23]=60; tabla[i][35]=60; tabla[i][47]=60; tabla[i][59]=60; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //52
        tabla[i][0]=60; tabla[i][12]=60; tabla[i][24]=60; tabla[i][36]=60; tabla[i][48]=60; tabla[i][60]=60; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=60; tabla[i][13]=60; tabla[i][25]=60; tabla[i][37]=60; tabla[i][49]=60; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=60; tabla[i][14]=60; tabla[i][26]=60; tabla[i][38]=60; tabla[i][50]=60; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=60; tabla[i][15]=60; tabla[i][27]=60; tabla[i][39]=60; tabla[i][51]=60; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=60; tabla[i][16]=60; tabla[i][28]=60; tabla[i][40]=60; tabla[i][52]=60; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=60; tabla[i][17]=60; tabla[i][29]=60; tabla[i][41]=60; tabla[i][53]=60; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=60; tabla[i][18]=60; tabla[i][30]=60; tabla[i][42]=60; tabla[i][54]=60; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=60; tabla[i][19]=60; tabla[i][31]=60; tabla[i][43]=60; tabla[i][55]=60; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=60; tabla[i][20]=60; tabla[i][32]=60; tabla[i][44]=60; tabla[i][56]=60; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=86;
        tabla[i][9]=60; tabla[i][21]=60; tabla[i][33]=60; tabla[i][45]=60; tabla[i][57]=60; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=60; tabla[i][22]=60; tabla[i][34]=60; tabla[i][46]=60; tabla[i][58]=60; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=53; tabla[i][23]=60; tabla[i][35]=60; tabla[i][47]=60; tabla[i][59]=60; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //53
        tabla[i][0]=86; tabla[i][12]=86; tabla[i][24]=86; tabla[i][36]=86; tabla[i][48]=86; tabla[i][60]=86; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=86; tabla[i][13]=86; tabla[i][25]=86; tabla[i][37]=86; tabla[i][49]=86; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=86; tabla[i][14]=86; tabla[i][26]=86; tabla[i][38]=86; tabla[i][50]=86; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=86; tabla[i][15]=86; tabla[i][27]=86; tabla[i][39]=86; tabla[i][51]=86; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=86; tabla[i][16]=86; tabla[i][28]=86; tabla[i][40]=86; tabla[i][52]=86; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=86; tabla[i][17]=86; tabla[i][29]=86; tabla[i][41]=86; tabla[i][53]=86; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=86; tabla[i][18]=54; tabla[i][30]=86; tabla[i][42]=86; tabla[i][54]=86; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=86; tabla[i][19]=86; tabla[i][31]=86; tabla[i][43]=86; tabla[i][55]=86; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=86; tabla[i][20]=86; tabla[i][32]=86; tabla[i][44]=86; tabla[i][56]=86; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=86;
        tabla[i][9]=86; tabla[i][21]=86; tabla[i][33]=86; tabla[i][45]=86; tabla[i][57]=86; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=86; tabla[i][22]=86; tabla[i][34]=86; tabla[i][46]=86; tabla[i][58]=86; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=86; tabla[i][23]=86; tabla[i][35]=86; tabla[i][47]=86; tabla[i][59]=86; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //54
        tabla[i][0]=60; tabla[i][12]=60; tabla[i][24]=60; tabla[i][36]=60; tabla[i][48]=60; tabla[i][60]=60; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=60; tabla[i][13]=60; tabla[i][25]=60; tabla[i][37]=60; tabla[i][49]=60; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=60; tabla[i][14]=60; tabla[i][26]=60; tabla[i][38]=60; tabla[i][50]=60; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=60; tabla[i][15]=60; tabla[i][27]=60; tabla[i][39]=60; tabla[i][51]=60; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=55; tabla[i][16]=60; tabla[i][28]=60; tabla[i][40]=60; tabla[i][52]=60; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=60; tabla[i][17]=60; tabla[i][29]=60; tabla[i][41]=60; tabla[i][53]=60; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=60; tabla[i][18]=60; tabla[i][30]=60; tabla[i][42]=60; tabla[i][54]=60; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=60; tabla[i][19]=60; tabla[i][31]=60; tabla[i][43]=60; tabla[i][55]=60; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=60; tabla[i][20]=60; tabla[i][32]=60; tabla[i][44]=60; tabla[i][56]=60; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=86;
        tabla[i][9]=60; tabla[i][21]=60; tabla[i][33]=60; tabla[i][45]=60; tabla[i][57]=60; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=60; tabla[i][22]=60; tabla[i][34]=60; tabla[i][46]=60; tabla[i][58]=60; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=60; tabla[i][23]=60; tabla[i][35]=60; tabla[i][47]=60; tabla[i][59]=60; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //55
        tabla[i][0]=86; tabla[i][12]=86; tabla[i][24]=86; tabla[i][36]=86; tabla[i][48]=86; tabla[i][60]=86; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=86; tabla[i][13]=86; tabla[i][25]=86; tabla[i][37]=86; tabla[i][49]=86; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=86; tabla[i][14]=86; tabla[i][26]=86; tabla[i][38]=86; tabla[i][50]=86; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=86; tabla[i][15]=86; tabla[i][27]=86; tabla[i][39]=86; tabla[i][51]=86; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=86; tabla[i][16]=86; tabla[i][28]=86; tabla[i][40]=86; tabla[i][52]=86; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=86; tabla[i][17]=86; tabla[i][29]=86; tabla[i][41]=86; tabla[i][53]=86; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=86; tabla[i][18]=86; tabla[i][30]=86; tabla[i][42]=86; tabla[i][54]=86; tabla[i][66]=56; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=86; tabla[i][19]=86; tabla[i][31]=86; tabla[i][43]=86; tabla[i][55]=86; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=86; tabla[i][20]=86; tabla[i][32]=86; tabla[i][44]=86; tabla[i][56]=86; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=86;
        tabla[i][9]=86; tabla[i][21]=86; tabla[i][33]=86; tabla[i][45]=86; tabla[i][57]=86; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=86; tabla[i][22]=86; tabla[i][34]=86; tabla[i][46]=86; tabla[i][58]=86; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=86; tabla[i][23]=86; tabla[i][35]=86; tabla[i][47]=86; tabla[i][59]=86; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //56
        tabla[i][0]=86; tabla[i][12]=86; tabla[i][24]=86; tabla[i][36]=86; tabla[i][48]=86; tabla[i][60]=86; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=86; tabla[i][13]=86; tabla[i][25]=86; tabla[i][37]=86; tabla[i][49]=86; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=86; tabla[i][14]=86; tabla[i][26]=86; tabla[i][38]=86; tabla[i][50]=86; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=86; tabla[i][15]=86; tabla[i][27]=86; tabla[i][39]=86; tabla[i][51]=86; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=86; tabla[i][16]=86; tabla[i][28]=86; tabla[i][40]=86; tabla[i][52]=86; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=86; tabla[i][17]=86; tabla[i][29]=86; tabla[i][41]=86; tabla[i][53]=86; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=86; tabla[i][18]=86; tabla[i][30]=86; tabla[i][42]=86; tabla[i][54]=86; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=86; tabla[i][19]=86; tabla[i][31]=86; tabla[i][43]=86; tabla[i][55]=86; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=82;
        tabla[i][8]=86; tabla[i][20]=86; tabla[i][32]=86; tabla[i][44]=86; tabla[i][56]=86; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=86;
        tabla[i][9]=86; tabla[i][21]=86; tabla[i][33]=86; tabla[i][45]=86; tabla[i][57]=86; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=86; tabla[i][22]=86; tabla[i][34]=86; tabla[i][46]=86; tabla[i][58]=86; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=86; tabla[i][23]=86; tabla[i][35]=86; tabla[i][47]=86; tabla[i][59]=86; tabla[i][71]=86; tabla[i][83]=11;
        
        i++; //57
        tabla[i][0]=57; tabla[i][12]=57; tabla[i][24]=57; tabla[i][36]=57; tabla[i][48]=57; tabla[i][60]=57; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=57; tabla[i][13]=57; tabla[i][25]=57; tabla[i][37]=57; tabla[i][49]=57; tabla[i][61]=87; tabla[i][73]=87; tabla[i][85]=87;
        tabla[i][2]=57; tabla[i][14]=57; tabla[i][26]=57; tabla[i][38]=57; tabla[i][50]=57; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=57; tabla[i][15]=57; tabla[i][27]=57; tabla[i][39]=57; tabla[i][51]=57; tabla[i][63]=87; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=57; tabla[i][16]=57; tabla[i][28]=57; tabla[i][40]=57; tabla[i][52]=57; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=57; tabla[i][17]=57; tabla[i][29]=57; tabla[i][41]=57; tabla[i][53]=57; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=57; tabla[i][18]=57; tabla[i][30]=57; tabla[i][42]=57; tabla[i][54]=57; tabla[i][66]=87; tabla[i][78]=58; tabla[i][90]=87;
        tabla[i][7]=57; tabla[i][19]=57; tabla[i][31]=57; tabla[i][43]=57; tabla[i][55]=57; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=57; tabla[i][20]=57; tabla[i][32]=57; tabla[i][44]=57; tabla[i][56]=57; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=57;
        tabla[i][9]=57; tabla[i][21]=57; tabla[i][33]=57; tabla[i][45]=57; tabla[i][57]=57; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=57; tabla[i][22]=57; tabla[i][34]=57; tabla[i][46]=57; tabla[i][58]=57; tabla[i][70]=87; tabla[i][82]=87;
        tabla[i][11]=57; tabla[i][23]=57; tabla[i][35]=57; tabla[i][47]=57; tabla[i][59]=57; tabla[i][71]=87; tabla[i][83]=87;
        
        i++; //58
        tabla[i][0]=87; tabla[i][12]=87; tabla[i][24]=87; tabla[i][36]=87; tabla[i][48]=87; tabla[i][60]=87; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=87; tabla[i][13]=87; tabla[i][25]=87; tabla[i][37]=87; tabla[i][49]=87; tabla[i][61]=87; tabla[i][73]=87; tabla[i][85]=87;
        tabla[i][2]=87; tabla[i][14]=87; tabla[i][26]=87; tabla[i][38]=87; tabla[i][50]=87; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=87; tabla[i][15]=87; tabla[i][27]=87; tabla[i][39]=87; tabla[i][51]=87; tabla[i][63]=87; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=87; tabla[i][16]=87; tabla[i][28]=87; tabla[i][40]=87; tabla[i][52]=87; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=87; tabla[i][17]=87; tabla[i][29]=87; tabla[i][41]=87; tabla[i][53]=87; tabla[i][65]=87; tabla[i][77]=59; tabla[i][89]=87;
        tabla[i][6]=87; tabla[i][18]=87; tabla[i][30]=87; tabla[i][42]=87; tabla[i][54]=87; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=87; tabla[i][19]=87; tabla[i][31]=87; tabla[i][43]=87; tabla[i][55]=87; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=87; tabla[i][20]=87; tabla[i][32]=87; tabla[i][44]=87; tabla[i][56]=87; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=87;
        tabla[i][9]=87; tabla[i][21]=87; tabla[i][33]=87; tabla[i][45]=87; tabla[i][57]=87; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=87; tabla[i][22]=87; tabla[i][34]=87; tabla[i][46]=87; tabla[i][58]=87; tabla[i][70]=87; tabla[i][82]=87;
        tabla[i][11]=87; tabla[i][23]=87; tabla[i][35]=87; tabla[i][47]=87; tabla[i][59]=87; tabla[i][71]=87; tabla[i][83]=87;
        
        i++; //59
        tabla[i][0]=87; tabla[i][12]=87; tabla[i][24]=87; tabla[i][36]=87; tabla[i][48]=87; tabla[i][60]=87; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=87; tabla[i][13]=87; tabla[i][25]=87; tabla[i][37]=87; tabla[i][49]=87; tabla[i][61]=11; tabla[i][73]=87; tabla[i][85]=87;
        tabla[i][2]=87; tabla[i][14]=87; tabla[i][26]=87; tabla[i][38]=87; tabla[i][50]=87; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=87; tabla[i][15]=87; tabla[i][27]=87; tabla[i][39]=87; tabla[i][51]=87; tabla[i][63]=87; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=87; tabla[i][16]=87; tabla[i][28]=87; tabla[i][40]=87; tabla[i][52]=87; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=87; tabla[i][17]=87; tabla[i][29]=87; tabla[i][41]=87; tabla[i][53]=87; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=87; tabla[i][18]=87; tabla[i][30]=87; tabla[i][42]=87; tabla[i][54]=87; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=87; tabla[i][19]=87; tabla[i][31]=87; tabla[i][43]=87; tabla[i][55]=87; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=87; tabla[i][20]=87; tabla[i][32]=87; tabla[i][44]=87; tabla[i][56]=87; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=87;
        tabla[i][9]=87; tabla[i][21]=87; tabla[i][33]=87; tabla[i][45]=87; tabla[i][57]=87; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=87; tabla[i][22]=87; tabla[i][34]=87; tabla[i][46]=87; tabla[i][58]=87; tabla[i][70]=87; tabla[i][82]=87;
        tabla[i][11]=87; tabla[i][23]=87; tabla[i][35]=87; tabla[i][47]=87; tabla[i][59]=87; tabla[i][71]=87; tabla[i][83]=87;
        
        i++; //60
        tabla[i][0]=60; tabla[i][12]=60; tabla[i][24]=60; tabla[i][36]=60; tabla[i][48]=60; tabla[i][60]=60; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=60; tabla[i][13]=60; tabla[i][25]=60; tabla[i][37]=60; tabla[i][49]=60; tabla[i][61]=87; tabla[i][73]=87; tabla[i][85]=87;
        tabla[i][2]=60; tabla[i][14]=60; tabla[i][26]=60; tabla[i][38]=60; tabla[i][50]=60; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=60; tabla[i][15]=60; tabla[i][27]=60; tabla[i][39]=60; tabla[i][51]=60; tabla[i][63]=87; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=60; tabla[i][16]=60; tabla[i][28]=60; tabla[i][40]=60; tabla[i][52]=60; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=60; tabla[i][17]=60; tabla[i][29]=60; tabla[i][41]=60; tabla[i][53]=60; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=60; tabla[i][18]=60; tabla[i][30]=60; tabla[i][42]=60; tabla[i][54]=60; tabla[i][66]=61; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=60; tabla[i][19]=60; tabla[i][31]=60; tabla[i][43]=60; tabla[i][55]=60; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=60; tabla[i][20]=60; tabla[i][32]=60; tabla[i][44]=60; tabla[i][56]=60; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=87;
        tabla[i][9]=60; tabla[i][21]=60; tabla[i][33]=60; tabla[i][45]=60; tabla[i][57]=60; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=60; tabla[i][22]=60; tabla[i][34]=60; tabla[i][46]=60; tabla[i][58]=60; tabla[i][70]=87; tabla[i][82]=87;
        tabla[i][11]=60; tabla[i][23]=60; tabla[i][35]=60; tabla[i][47]=60; tabla[i][59]=60; tabla[i][71]=87; tabla[i][83]=87;
        
        i++; //61
        tabla[i][0]=87; tabla[i][12]=87; tabla[i][24]=87; tabla[i][36]=87; tabla[i][48]=87; tabla[i][60]=87; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=87; tabla[i][13]=87; tabla[i][25]=87; tabla[i][37]=87; tabla[i][49]=87; tabla[i][61]=87; tabla[i][73]=87; tabla[i][85]=87;
        tabla[i][2]=87; tabla[i][14]=87; tabla[i][26]=87; tabla[i][38]=87; tabla[i][50]=87; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=87; tabla[i][15]=87; tabla[i][27]=87; tabla[i][39]=87; tabla[i][51]=87; tabla[i][63]=87; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=87; tabla[i][16]=87; tabla[i][28]=87; tabla[i][40]=87; tabla[i][52]=87; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=87; tabla[i][17]=87; tabla[i][29]=87; tabla[i][41]=87; tabla[i][53]=87; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=87; tabla[i][18]=87; tabla[i][30]=87; tabla[i][42]=87; tabla[i][54]=87; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=87; tabla[i][19]=87; tabla[i][31]=87; tabla[i][43]=87; tabla[i][55]=87; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=87; tabla[i][20]=87; tabla[i][32]=87; tabla[i][44]=87; tabla[i][56]=87; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=87;
        tabla[i][9]=87; tabla[i][21]=87; tabla[i][33]=87; tabla[i][45]=87; tabla[i][57]=87; tabla[i][69]=62; tabla[i][81]=87;
        tabla[i][10]=87; tabla[i][22]=87; tabla[i][34]=87; tabla[i][46]=87; tabla[i][58]=87; tabla[i][70]=87; tabla[i][82]=87;
        tabla[i][11]=87; tabla[i][23]=87; tabla[i][35]=87; tabla[i][47]=87; tabla[i][59]=87; tabla[i][71]=87; tabla[i][83]=87;
        
        i++; //62
        tabla[i][0]=87; tabla[i][12]=87; tabla[i][24]=87; tabla[i][36]=87; tabla[i][48]=87; tabla[i][60]=87; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=87; tabla[i][13]=87; tabla[i][25]=87; tabla[i][37]=87; tabla[i][49]=87; tabla[i][61]=87; tabla[i][73]=87; tabla[i][85]=87;
        tabla[i][2]=87; tabla[i][14]=87; tabla[i][26]=87; tabla[i][38]=87; tabla[i][50]=87; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=87; tabla[i][15]=87; tabla[i][27]=87; tabla[i][39]=87; tabla[i][51]=87; tabla[i][63]=63; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=87; tabla[i][16]=87; tabla[i][28]=87; tabla[i][40]=87; tabla[i][52]=87; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=87; tabla[i][17]=87; tabla[i][29]=87; tabla[i][41]=87; tabla[i][53]=87; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=87; tabla[i][18]=87; tabla[i][30]=87; tabla[i][42]=87; tabla[i][54]=87; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=87; tabla[i][19]=87; tabla[i][31]=87; tabla[i][43]=87; tabla[i][55]=87; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=87; tabla[i][20]=87; tabla[i][32]=87; tabla[i][44]=87; tabla[i][56]=87; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=87;
        tabla[i][9]=87; tabla[i][21]=87; tabla[i][33]=87; tabla[i][45]=87; tabla[i][57]=87; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=87; tabla[i][22]=87; tabla[i][34]=87; tabla[i][46]=87; tabla[i][58]=87; tabla[i][70]=87; tabla[i][82]=87;
        tabla[i][11]=87; tabla[i][23]=87; tabla[i][35]=87; tabla[i][47]=87; tabla[i][59]=87; tabla[i][71]=87; tabla[i][83]=87;
        
        i++; //63
        tabla[i][0]=64; tabla[i][12]=64; tabla[i][24]=64; tabla[i][36]=64; tabla[i][48]=64; tabla[i][60]=65; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=64; tabla[i][13]=64; tabla[i][25]=64; tabla[i][37]=64; tabla[i][49]=64; tabla[i][61]=87; tabla[i][73]=87; tabla[i][85]=87;
        tabla[i][2]=64; tabla[i][14]=64; tabla[i][26]=64; tabla[i][38]=64; tabla[i][50]=64; tabla[i][62]=63; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=64; tabla[i][15]=64; tabla[i][27]=64; tabla[i][39]=64; tabla[i][51]=64; tabla[i][63]=87; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=64; tabla[i][16]=64; tabla[i][28]=64; tabla[i][40]=64; tabla[i][52]=65; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=64; tabla[i][17]=64; tabla[i][29]=64; tabla[i][41]=64; tabla[i][53]=65; tabla[i][65]=72; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=64; tabla[i][18]=64; tabla[i][30]=64; tabla[i][42]=64; tabla[i][54]=65; tabla[i][66]=87; tabla[i][78]=57; tabla[i][90]=87;
        tabla[i][7]=64; tabla[i][19]=64; tabla[i][31]=64; tabla[i][43]=64; tabla[i][55]=65; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=64; tabla[i][20]=64; tabla[i][32]=64; tabla[i][44]=64; tabla[i][56]=65; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=65;
        tabla[i][9]=64; tabla[i][21]=64; tabla[i][33]=64; tabla[i][45]=64; tabla[i][57]=65; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=64; tabla[i][22]=64; tabla[i][34]=64; tabla[i][46]=64; tabla[i][58]=65; tabla[i][70]=87; tabla[i][82]=87;
        tabla[i][11]=64; tabla[i][23]=64; tabla[i][35]=64; tabla[i][47]=64; tabla[i][59]=65; tabla[i][71]=63; tabla[i][83]=87;
        
        i++; //64
        tabla[i][0]=64; tabla[i][12]=64; tabla[i][24]=64; tabla[i][36]=64; tabla[i][48]=64; tabla[i][60]=64; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=64; tabla[i][13]=64; tabla[i][25]=64; tabla[i][37]=64; tabla[i][49]=64; tabla[i][61]=87; tabla[i][73]=67; tabla[i][85]=87;
        tabla[i][2]=64; tabla[i][14]=64; tabla[i][26]=64; tabla[i][38]=64; tabla[i][50]=64; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=71;
        tabla[i][3]=64; tabla[i][15]=64; tabla[i][27]=64; tabla[i][39]=64; tabla[i][51]=64; tabla[i][63]=67; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=64; tabla[i][16]=64; tabla[i][28]=64; tabla[i][40]=64; tabla[i][52]=64; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=64; tabla[i][17]=64; tabla[i][29]=64; tabla[i][41]=64; tabla[i][53]=64; tabla[i][65]=87; tabla[i][77]=71; tabla[i][89]=87;
        tabla[i][6]=64; tabla[i][18]=64; tabla[i][30]=64; tabla[i][42]=64; tabla[i][54]=64; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=64; tabla[i][19]=64; tabla[i][31]=64; tabla[i][43]=64; tabla[i][55]=64; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=64; tabla[i][20]=64; tabla[i][32]=64; tabla[i][44]=64; tabla[i][56]=64; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=64;
        tabla[i][9]=64; tabla[i][21]=64; tabla[i][33]=64; tabla[i][45]=64; tabla[i][57]=64; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=64; tabla[i][22]=64; tabla[i][34]=64; tabla[i][46]=64; tabla[i][58]=64; tabla[i][70]=87; tabla[i][82]=67;
        tabla[i][11]=64; tabla[i][23]=64; tabla[i][35]=64; tabla[i][47]=64; tabla[i][59]=64; tabla[i][71]=87; tabla[i][83]=67;
        
        i++; //65
        tabla[i][0]=87; tabla[i][12]=87; tabla[i][24]=87; tabla[i][36]=87; tabla[i][48]=87; tabla[i][60]=65; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=87; tabla[i][13]=87; tabla[i][25]=87; tabla[i][37]=87; tabla[i][49]=87; tabla[i][61]=87; tabla[i][73]=67; tabla[i][85]=66;
        tabla[i][2]=87; tabla[i][14]=87; tabla[i][26]=87; tabla[i][38]=87; tabla[i][50]=87; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=71;
        tabla[i][3]=87; tabla[i][15]=87; tabla[i][27]=87; tabla[i][39]=87; tabla[i][51]=87; tabla[i][63]=67; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=87; tabla[i][16]=87; tabla[i][28]=87; tabla[i][40]=87; tabla[i][52]=65; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=87; tabla[i][17]=87; tabla[i][29]=87; tabla[i][41]=87; tabla[i][53]=65; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=87; tabla[i][18]=87; tabla[i][30]=87; tabla[i][42]=87; tabla[i][54]=65; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=87; tabla[i][19]=87; tabla[i][31]=87; tabla[i][43]=87; tabla[i][55]=65; tabla[i][67]=87; tabla[i][79]=87; tabla[i][92]=65;
        tabla[i][8]=87; tabla[i][20]=87; tabla[i][32]=87; tabla[i][44]=87; tabla[i][56]=65; tabla[i][68]=87; tabla[i][80]=87;
        tabla[i][9]=87; tabla[i][21]=87; tabla[i][33]=87; tabla[i][45]=87; tabla[i][57]=65; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=87; tabla[i][22]=87; tabla[i][34]=87; tabla[i][46]=87; tabla[i][58]=65; tabla[i][70]=87; tabla[i][82]=67;
        tabla[i][11]=87; tabla[i][23]=87; tabla[i][35]=87; tabla[i][47]=87; tabla[i][59]=65; tabla[i][71]=87; tabla[i][83]=67;
        
        i++; //66
        tabla[i][0]=87; tabla[i][12]=87; tabla[i][24]=87; tabla[i][36]=87; tabla[i][48]=87; tabla[i][60]=66; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=87; tabla[i][13]=87; tabla[i][25]=87; tabla[i][37]=87; tabla[i][49]=87; tabla[i][61]=87; tabla[i][73]=67; tabla[i][85]=87;
        tabla[i][2]=87; tabla[i][14]=87; tabla[i][26]=87; tabla[i][38]=87; tabla[i][50]=87; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=71;
        tabla[i][3]=87; tabla[i][15]=87; tabla[i][27]=87; tabla[i][39]=87; tabla[i][51]=87; tabla[i][63]=67; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=87; tabla[i][16]=87; tabla[i][28]=87; tabla[i][40]=87; tabla[i][52]=66; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=87; tabla[i][17]=87; tabla[i][29]=87; tabla[i][41]=87; tabla[i][53]=66; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=87; tabla[i][18]=87; tabla[i][30]=87; tabla[i][42]=87; tabla[i][54]=66; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=87; tabla[i][19]=87; tabla[i][31]=87; tabla[i][43]=87; tabla[i][55]=66; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=87; tabla[i][20]=87; tabla[i][32]=87; tabla[i][44]=87; tabla[i][56]=66; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=66;
        tabla[i][9]=87; tabla[i][21]=87; tabla[i][33]=87; tabla[i][45]=87; tabla[i][57]=66; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=87; tabla[i][22]=87; tabla[i][34]=87; tabla[i][46]=87; tabla[i][58]=66; tabla[i][70]=87; tabla[i][82]=67;
        tabla[i][11]=87; tabla[i][23]=87; tabla[i][35]=87; tabla[i][47]=87; tabla[i][59]=66; tabla[i][71]=87; tabla[i][83]=67;
        
        i++; //67
        tabla[i][0]=68; tabla[i][12]=68; tabla[i][24]=68; tabla[i][36]=68; tabla[i][48]=68; tabla[i][60]=69; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=68; tabla[i][13]=68; tabla[i][25]=68; tabla[i][37]=68; tabla[i][49]=68; tabla[i][61]=87; tabla[i][73]=87; tabla[i][85]=87;
        tabla[i][2]=68; tabla[i][14]=68; tabla[i][26]=68; tabla[i][38]=68; tabla[i][50]=68; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=68; tabla[i][15]=68; tabla[i][27]=68; tabla[i][39]=68; tabla[i][51]=68; tabla[i][63]=87; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=68; tabla[i][16]=68; tabla[i][28]=68; tabla[i][40]=68; tabla[i][52]=69; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=68; tabla[i][17]=68; tabla[i][29]=68; tabla[i][41]=68; tabla[i][53]=69; tabla[i][65]=72; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=68; tabla[i][18]=68; tabla[i][30]=68; tabla[i][42]=68; tabla[i][54]=69; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=68; tabla[i][19]=68; tabla[i][31]=68; tabla[i][43]=68; tabla[i][55]=69; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=68; tabla[i][20]=68; tabla[i][32]=68; tabla[i][44]=68; tabla[i][56]=69; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=69;
        tabla[i][9]=68; tabla[i][21]=68; tabla[i][33]=68; tabla[i][45]=68; tabla[i][57]=69; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=68; tabla[i][22]=68; tabla[i][34]=68; tabla[i][46]=68; tabla[i][58]=69; tabla[i][70]=87; tabla[i][82]=87;
        tabla[i][11]=68; tabla[i][23]=68; tabla[i][35]=68; tabla[i][47]=68; tabla[i][59]=69; tabla[i][71]=87; tabla[i][83]=87;
        
        i++; //68
        tabla[i][0]=68; tabla[i][12]=68; tabla[i][24]=68; tabla[i][36]=68; tabla[i][48]=68; tabla[i][60]=68; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=68; tabla[i][13]=68; tabla[i][25]=68; tabla[i][37]=68; tabla[i][49]=68; tabla[i][61]=87; tabla[i][73]=67; tabla[i][85]=87;
        tabla[i][2]=68; tabla[i][14]=68; tabla[i][26]=68; tabla[i][38]=68; tabla[i][50]=68; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=71;
        tabla[i][3]=68; tabla[i][15]=68; tabla[i][27]=68; tabla[i][39]=68; tabla[i][51]=68; tabla[i][63]=67; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=68; tabla[i][16]=68; tabla[i][28]=68; tabla[i][40]=68; tabla[i][52]=68; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=68; tabla[i][17]=68; tabla[i][29]=68; tabla[i][41]=68; tabla[i][53]=68; tabla[i][65]=87; tabla[i][77]=71; tabla[i][89]=87;
        tabla[i][6]=68; tabla[i][18]=68; tabla[i][30]=68; tabla[i][42]=68; tabla[i][54]=68; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=68; tabla[i][19]=68; tabla[i][31]=68; tabla[i][43]=68; tabla[i][55]=68; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=68; tabla[i][20]=68; tabla[i][32]=68; tabla[i][44]=68; tabla[i][56]=68; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=68;
        tabla[i][9]=68; tabla[i][21]=68; tabla[i][33]=68; tabla[i][45]=68; tabla[i][57]=68; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=68; tabla[i][22]=68; tabla[i][34]=68; tabla[i][46]=68; tabla[i][58]=68; tabla[i][70]=87; tabla[i][82]=67;
        tabla[i][11]=68; tabla[i][23]=68; tabla[i][35]=68; tabla[i][47]=68; tabla[i][59]=68; tabla[i][71]=87; tabla[i][83]=67;
        
        i++; //69
        tabla[i][0]=87; tabla[i][12]=87; tabla[i][24]=87; tabla[i][36]=87; tabla[i][48]=87; tabla[i][60]=69; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=87; tabla[i][13]=87; tabla[i][25]=87; tabla[i][37]=87; tabla[i][49]=87; tabla[i][61]=87; tabla[i][73]=67; tabla[i][85]=70;
        tabla[i][2]=87; tabla[i][14]=87; tabla[i][26]=87; tabla[i][38]=87; tabla[i][50]=87; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=71;
        tabla[i][3]=87; tabla[i][15]=87; tabla[i][27]=87; tabla[i][39]=87; tabla[i][51]=87; tabla[i][63]=67; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=87; tabla[i][16]=87; tabla[i][28]=87; tabla[i][40]=87; tabla[i][52]=69; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=87; tabla[i][17]=87; tabla[i][29]=87; tabla[i][41]=87; tabla[i][53]=69; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=87; tabla[i][18]=87; tabla[i][30]=87; tabla[i][42]=87; tabla[i][54]=69; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=87; tabla[i][19]=87; tabla[i][31]=87; tabla[i][43]=87; tabla[i][55]=69; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=87; tabla[i][20]=87; tabla[i][32]=87; tabla[i][44]=87; tabla[i][56]=69; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=69;
        tabla[i][9]=87; tabla[i][21]=87; tabla[i][33]=87; tabla[i][45]=87; tabla[i][57]=69; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=87; tabla[i][22]=87; tabla[i][34]=87; tabla[i][46]=87; tabla[i][58]=69; tabla[i][70]=87; tabla[i][82]=67;
        tabla[i][11]=87; tabla[i][23]=87; tabla[i][35]=87; tabla[i][47]=87; tabla[i][59]=69; tabla[i][71]=87; tabla[i][83]=67;
    }
    void inicializaTabla3(){
        int i=70; //70
        tabla[i][0]=87; tabla[i][12]=87; tabla[i][24]=87; tabla[i][36]=87; tabla[i][48]=87; tabla[i][60]=70; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=87; tabla[i][13]=87; tabla[i][25]=87; tabla[i][37]=87; tabla[i][49]=87; tabla[i][61]=87; tabla[i][73]=67; tabla[i][85]=87;
        tabla[i][2]=87; tabla[i][14]=87; tabla[i][26]=87; tabla[i][38]=87; tabla[i][50]=87; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=71;
        tabla[i][3]=87; tabla[i][15]=87; tabla[i][27]=87; tabla[i][39]=87; tabla[i][51]=87; tabla[i][63]=67; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=87; tabla[i][16]=87; tabla[i][28]=87; tabla[i][40]=87; tabla[i][52]=70; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=87; tabla[i][17]=87; tabla[i][29]=87; tabla[i][41]=87; tabla[i][53]=70; tabla[i][65]=72; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=87; tabla[i][18]=87; tabla[i][30]=87; tabla[i][42]=87; tabla[i][54]=70; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=87; tabla[i][19]=87; tabla[i][31]=87; tabla[i][43]=87; tabla[i][55]=70; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=87; tabla[i][20]=87; tabla[i][32]=87; tabla[i][44]=87; tabla[i][56]=70; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=70;
        tabla[i][9]=87; tabla[i][21]=87; tabla[i][33]=87; tabla[i][45]=87; tabla[i][57]=70; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=87; tabla[i][22]=87; tabla[i][34]=87; tabla[i][46]=87; tabla[i][58]=70; tabla[i][70]=87; tabla[i][82]=67;
        tabla[i][11]=87; tabla[i][23]=87; tabla[i][35]=87; tabla[i][47]=87; tabla[i][59]=70; tabla[i][71]=87; tabla[i][83]=67;
        
        i++; //71
        tabla[i][0]=87; tabla[i][12]=87; tabla[i][24]=87; tabla[i][36]=87; tabla[i][48]=87; tabla[i][60]=87; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=87; tabla[i][13]=87; tabla[i][25]=87; tabla[i][37]=87; tabla[i][49]=87; tabla[i][61]=11; tabla[i][73]=87; tabla[i][85]=87;
        tabla[i][2]=87; tabla[i][14]=87; tabla[i][26]=87; tabla[i][38]=87; tabla[i][50]=87; tabla[i][62]=11; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=87; tabla[i][15]=87; tabla[i][27]=87; tabla[i][39]=87; tabla[i][51]=87; tabla[i][63]=87; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=87; tabla[i][16]=87; tabla[i][28]=87; tabla[i][40]=87; tabla[i][52]=87; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=87; tabla[i][17]=87; tabla[i][29]=87; tabla[i][41]=87; tabla[i][53]=87; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=87; tabla[i][18]=87; tabla[i][30]=87; tabla[i][42]=87; tabla[i][54]=87; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=87; tabla[i][19]=87; tabla[i][31]=87; tabla[i][43]=87; tabla[i][55]=87; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=87; tabla[i][20]=87; tabla[i][32]=87; tabla[i][44]=87; tabla[i][56]=87; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=87;
        tabla[i][9]=87; tabla[i][21]=87; tabla[i][33]=87; tabla[i][45]=87; tabla[i][57]=87; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=87; tabla[i][22]=87; tabla[i][34]=87; tabla[i][46]=87; tabla[i][58]=87; tabla[i][70]=87; tabla[i][82]=87;
        tabla[i][11]=87; tabla[i][23]=87; tabla[i][35]=87; tabla[i][47]=87; tabla[i][59]=87; tabla[i][71]=87; tabla[i][83]=87;
        
        i++; //72
        tabla[i][0]=73; tabla[i][12]=73; tabla[i][24]=73; tabla[i][36]=73; tabla[i][48]=73; tabla[i][60]=74; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=73; tabla[i][13]=73; tabla[i][25]=73; tabla[i][37]=73; tabla[i][49]=73; tabla[i][61]=87; tabla[i][73]=87; tabla[i][85]=87;
        tabla[i][2]=73; tabla[i][14]=73; tabla[i][26]=73; tabla[i][38]=73; tabla[i][50]=73; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=73; tabla[i][15]=73; tabla[i][27]=73; tabla[i][39]=73; tabla[i][51]=73; tabla[i][63]=87; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=73; tabla[i][16]=73; tabla[i][28]=73; tabla[i][40]=73; tabla[i][52]=74; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=73; tabla[i][17]=73; tabla[i][29]=73; tabla[i][41]=73; tabla[i][53]=74; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=73; tabla[i][18]=73; tabla[i][30]=73; tabla[i][42]=73; tabla[i][54]=74; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=73; tabla[i][19]=73; tabla[i][31]=73; tabla[i][43]=73; tabla[i][55]=74; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=73; tabla[i][20]=73; tabla[i][32]=73; tabla[i][44]=73; tabla[i][56]=74; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=74;
        tabla[i][9]=73; tabla[i][21]=73; tabla[i][33]=73; tabla[i][45]=73; tabla[i][57]=74; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=73; tabla[i][22]=73; tabla[i][34]=73; tabla[i][46]=73; tabla[i][58]=74; tabla[i][70]=87; tabla[i][82]=87;
        tabla[i][11]=73; tabla[i][23]=73; tabla[i][35]=73; tabla[i][47]=73; tabla[i][59]=74; tabla[i][71]=87; tabla[i][83]=87;
        
        i++; //73
        tabla[i][0]=73; tabla[i][12]=73; tabla[i][24]=73; tabla[i][36]=73; tabla[i][48]=73; tabla[i][60]=73; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=73; tabla[i][13]=73; tabla[i][25]=73; tabla[i][37]=73; tabla[i][49]=73; tabla[i][61]=87; tabla[i][73]=76; tabla[i][85]=87;
        tabla[i][2]=73; tabla[i][14]=73; tabla[i][26]=73; tabla[i][38]=73; tabla[i][50]=73; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=73; tabla[i][15]=73; tabla[i][27]=73; tabla[i][39]=73; tabla[i][51]=73; tabla[i][63]=76; tabla[i][75]=80; tabla[i][87]=87;
        tabla[i][4]=73; tabla[i][16]=73; tabla[i][28]=73; tabla[i][40]=73; tabla[i][52]=73; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=73; tabla[i][17]=73; tabla[i][29]=73; tabla[i][41]=73; tabla[i][53]=73; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=73; tabla[i][18]=73; tabla[i][30]=73; tabla[i][42]=73; tabla[i][54]=73; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=73; tabla[i][19]=73; tabla[i][31]=73; tabla[i][43]=73; tabla[i][55]=73; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=73; tabla[i][20]=73; tabla[i][32]=73; tabla[i][44]=73; tabla[i][56]=73; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=73;
        tabla[i][9]=73; tabla[i][21]=73; tabla[i][33]=73; tabla[i][45]=73; tabla[i][57]=73; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=73; tabla[i][22]=73; tabla[i][34]=73; tabla[i][46]=73; tabla[i][58]=73; tabla[i][70]=87; tabla[i][82]=76;
        tabla[i][11]=73; tabla[i][23]=73; tabla[i][35]=73; tabla[i][47]=73; tabla[i][59]=73; tabla[i][71]=87; tabla[i][83]=76;
        
        i++; //74
        tabla[i][0]=87; tabla[i][12]=87; tabla[i][24]=87; tabla[i][36]=87; tabla[i][48]=87; tabla[i][60]=74; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=87; tabla[i][13]=87; tabla[i][25]=87; tabla[i][37]=87; tabla[i][49]=87; tabla[i][61]=87; tabla[i][73]=76; tabla[i][85]=75;
        tabla[i][2]=87; tabla[i][14]=87; tabla[i][26]=87; tabla[i][38]=87; tabla[i][50]=87; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=87; tabla[i][15]=87; tabla[i][27]=87; tabla[i][39]=87; tabla[i][51]=87; tabla[i][63]=76; tabla[i][75]=80; tabla[i][87]=87;
        tabla[i][4]=87; tabla[i][16]=87; tabla[i][28]=87; tabla[i][40]=87; tabla[i][52]=74; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=87; tabla[i][17]=87; tabla[i][29]=87; tabla[i][41]=87; tabla[i][53]=74; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=87; tabla[i][18]=87; tabla[i][30]=87; tabla[i][42]=87; tabla[i][54]=74; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=87; tabla[i][19]=87; tabla[i][31]=87; tabla[i][43]=87; tabla[i][55]=74; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=87; tabla[i][20]=87; tabla[i][32]=87; tabla[i][44]=87; tabla[i][56]=74; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=74;
        tabla[i][9]=87; tabla[i][21]=87; tabla[i][33]=87; tabla[i][45]=87; tabla[i][57]=74; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=87; tabla[i][22]=87; tabla[i][34]=87; tabla[i][46]=87; tabla[i][58]=74; tabla[i][70]=87; tabla[i][82]=76;
        tabla[i][11]=87; tabla[i][23]=87; tabla[i][35]=87; tabla[i][47]=87; tabla[i][59]=74; tabla[i][71]=87; tabla[i][83]=76;
        
        i++; //75
        tabla[i][0]=87; tabla[i][12]=87; tabla[i][24]=87; tabla[i][36]=87; tabla[i][48]=87; tabla[i][60]=75; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=87; tabla[i][13]=87; tabla[i][25]=87; tabla[i][37]=87; tabla[i][49]=87; tabla[i][61]=87; tabla[i][73]=76; tabla[i][85]=80;
        tabla[i][2]=87; tabla[i][14]=87; tabla[i][26]=87; tabla[i][38]=87; tabla[i][50]=87; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=87; tabla[i][15]=87; tabla[i][27]=87; tabla[i][39]=87; tabla[i][51]=87; tabla[i][63]=76; tabla[i][75]=80; tabla[i][87]=87;
        tabla[i][4]=87; tabla[i][16]=87; tabla[i][28]=87; tabla[i][40]=87; tabla[i][52]=75; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=87; tabla[i][17]=87; tabla[i][29]=87; tabla[i][41]=87; tabla[i][53]=75; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=87; tabla[i][18]=87; tabla[i][30]=87; tabla[i][42]=87; tabla[i][54]=75; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=87; tabla[i][19]=87; tabla[i][31]=87; tabla[i][43]=87; tabla[i][55]=75; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=87; tabla[i][20]=87; tabla[i][32]=87; tabla[i][44]=87; tabla[i][56]=75; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=75;
        tabla[i][9]=87; tabla[i][21]=87; tabla[i][33]=87; tabla[i][45]=87; tabla[i][57]=75; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=87; tabla[i][22]=87; tabla[i][34]=87; tabla[i][46]=87; tabla[i][58]=75; tabla[i][70]=87; tabla[i][82]=76;
        tabla[i][11]=87; tabla[i][23]=87; tabla[i][35]=87; tabla[i][47]=87; tabla[i][59]=75; tabla[i][71]=87; tabla[i][83]=76;
        
        i++; //76
        tabla[i][0]=77; tabla[i][12]=77; tabla[i][24]=77; tabla[i][36]=77; tabla[i][48]=77; tabla[i][60]=78; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=77; tabla[i][13]=77; tabla[i][25]=77; tabla[i][37]=77; tabla[i][49]=77; tabla[i][61]=87; tabla[i][73]=87; tabla[i][85]=87;
        tabla[i][2]=77; tabla[i][14]=77; tabla[i][26]=77; tabla[i][38]=77; tabla[i][50]=77; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=77; tabla[i][15]=77; tabla[i][27]=77; tabla[i][39]=77; tabla[i][51]=77; tabla[i][63]=87; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=77; tabla[i][16]=77; tabla[i][28]=77; tabla[i][40]=77; tabla[i][52]=78; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=77; tabla[i][17]=77; tabla[i][29]=77; tabla[i][41]=77; tabla[i][53]=78; tabla[i][65]=72; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=77; tabla[i][18]=77; tabla[i][30]=77; tabla[i][42]=77; tabla[i][54]=78; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=77; tabla[i][19]=77; tabla[i][31]=77; tabla[i][43]=77; tabla[i][55]=78; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=77; tabla[i][20]=77; tabla[i][32]=77; tabla[i][44]=77; tabla[i][56]=78; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=78;
        tabla[i][9]=77; tabla[i][21]=77; tabla[i][33]=77; tabla[i][45]=77; tabla[i][57]=78; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=77; tabla[i][22]=77; tabla[i][34]=77; tabla[i][46]=77; tabla[i][58]=78; tabla[i][70]=87; tabla[i][82]=87;
        tabla[i][11]=77; tabla[i][23]=77; tabla[i][35]=77; tabla[i][47]=77; tabla[i][59]=78; tabla[i][71]=87; tabla[i][83]=87;
        
        i++; //77
        tabla[i][0]=77; tabla[i][12]=77; tabla[i][24]=77; tabla[i][36]=77; tabla[i][48]=77; tabla[i][60]=77; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=77; tabla[i][13]=77; tabla[i][25]=77; tabla[i][37]=77; tabla[i][49]=77; tabla[i][61]=87; tabla[i][73]=76; tabla[i][85]=87;
        tabla[i][2]=77; tabla[i][14]=77; tabla[i][26]=77; tabla[i][38]=77; tabla[i][50]=77; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=77; tabla[i][15]=77; tabla[i][27]=77; tabla[i][39]=77; tabla[i][51]=77; tabla[i][63]=76; tabla[i][75]=80; tabla[i][87]=87;
        tabla[i][4]=77; tabla[i][16]=77; tabla[i][28]=77; tabla[i][40]=77; tabla[i][52]=77; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=77; tabla[i][17]=77; tabla[i][29]=77; tabla[i][41]=77; tabla[i][53]=77; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=77; tabla[i][18]=77; tabla[i][30]=77; tabla[i][42]=77; tabla[i][54]=77; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=77; tabla[i][19]=77; tabla[i][31]=77; tabla[i][43]=77; tabla[i][55]=77; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=77; tabla[i][20]=77; tabla[i][32]=77; tabla[i][44]=77; tabla[i][56]=77; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=77;
        tabla[i][9]=77; tabla[i][21]=77; tabla[i][33]=77; tabla[i][45]=77; tabla[i][57]=77; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=77; tabla[i][22]=77; tabla[i][34]=77; tabla[i][46]=77; tabla[i][58]=77; tabla[i][70]=87; tabla[i][82]=76;
        tabla[i][11]=77; tabla[i][23]=77; tabla[i][35]=77; tabla[i][47]=77; tabla[i][59]=77; tabla[i][71]=87; tabla[i][83]=76;
        
        i++; //78
        tabla[i][0]=87; tabla[i][12]=87; tabla[i][24]=87; tabla[i][36]=87; tabla[i][48]=87; tabla[i][60]=78; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=87; tabla[i][13]=87; tabla[i][25]=87; tabla[i][37]=87; tabla[i][49]=87; tabla[i][61]=87; tabla[i][73]=76; tabla[i][85]=79;
        tabla[i][2]=87; tabla[i][14]=87; tabla[i][26]=87; tabla[i][38]=87; tabla[i][50]=87; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=87; tabla[i][15]=87; tabla[i][27]=87; tabla[i][39]=87; tabla[i][51]=87; tabla[i][63]=76; tabla[i][75]=80; tabla[i][87]=87;
        tabla[i][4]=87; tabla[i][16]=87; tabla[i][28]=87; tabla[i][40]=87; tabla[i][52]=78; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=87; tabla[i][17]=87; tabla[i][29]=87; tabla[i][41]=87; tabla[i][53]=78; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=87; tabla[i][18]=87; tabla[i][30]=87; tabla[i][42]=87; tabla[i][54]=78; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=87; tabla[i][19]=87; tabla[i][31]=87; tabla[i][43]=87; tabla[i][55]=78; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=87; tabla[i][20]=87; tabla[i][32]=87; tabla[i][44]=87; tabla[i][56]=78; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=78;
        tabla[i][9]=87; tabla[i][21]=87; tabla[i][33]=87; tabla[i][45]=87; tabla[i][57]=78; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=87; tabla[i][22]=87; tabla[i][34]=87; tabla[i][46]=87; tabla[i][58]=78; tabla[i][70]=87; tabla[i][82]=76;
        tabla[i][11]=87; tabla[i][23]=87; tabla[i][35]=87; tabla[i][47]=87; tabla[i][59]=78; tabla[i][71]=87; tabla[i][83]=76;
        
        i++; //79
        tabla[i][0]=87; tabla[i][12]=87; tabla[i][24]=87; tabla[i][36]=87; tabla[i][48]=87; tabla[i][60]=79; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=87; tabla[i][13]=87; tabla[i][25]=87; tabla[i][37]=87; tabla[i][49]=87; tabla[i][61]=87; tabla[i][73]=76; tabla[i][85]=87;
        tabla[i][2]=87; tabla[i][14]=87; tabla[i][26]=87; tabla[i][38]=87; tabla[i][50]=87; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=87; tabla[i][15]=87; tabla[i][27]=87; tabla[i][39]=87; tabla[i][51]=87; tabla[i][63]=76; tabla[i][75]=80; tabla[i][87]=87;
        tabla[i][4]=87; tabla[i][16]=87; tabla[i][28]=87; tabla[i][40]=87; tabla[i][52]=79; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=87; tabla[i][17]=87; tabla[i][29]=87; tabla[i][41]=87; tabla[i][53]=79; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=87; tabla[i][18]=87; tabla[i][30]=87; tabla[i][42]=87; tabla[i][54]=79; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=87; tabla[i][19]=87; tabla[i][31]=87; tabla[i][43]=87; tabla[i][55]=79; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=87; tabla[i][20]=87; tabla[i][32]=87; tabla[i][44]=87; tabla[i][56]=79; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=79;
        tabla[i][9]=87; tabla[i][21]=87; tabla[i][33]=87; tabla[i][45]=87; tabla[i][57]=79; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=87; tabla[i][22]=87; tabla[i][34]=87; tabla[i][46]=87; tabla[i][58]=79; tabla[i][70]=87; tabla[i][82]=76;
        tabla[i][11]=87; tabla[i][23]=87; tabla[i][35]=87; tabla[i][47]=87; tabla[i][59]=79; tabla[i][71]=87; tabla[i][83]=76;
        
        i++; //80
        tabla[i][0]=87; tabla[i][12]=87; tabla[i][24]=87; tabla[i][36]=87; tabla[i][48]=87; tabla[i][60]=87; tabla[i][72]=67; tabla[i][84]=87;
        tabla[i][1]=87; tabla[i][13]=87; tabla[i][25]=87; tabla[i][37]=87; tabla[i][49]=87; tabla[i][61]=87; tabla[i][73]=67; tabla[i][85]=87;
        tabla[i][2]=87; tabla[i][14]=87; tabla[i][26]=87; tabla[i][38]=87; tabla[i][50]=87; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=71;
        tabla[i][3]=87; tabla[i][15]=87; tabla[i][27]=87; tabla[i][39]=87; tabla[i][51]=87; tabla[i][63]=67; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=87; tabla[i][16]=87; tabla[i][28]=87; tabla[i][40]=87; tabla[i][52]=87; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=87; tabla[i][17]=87; tabla[i][29]=87; tabla[i][41]=87; tabla[i][53]=87; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=87; tabla[i][18]=87; tabla[i][30]=87; tabla[i][42]=87; tabla[i][54]=87; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=87; tabla[i][19]=87; tabla[i][31]=87; tabla[i][43]=87; tabla[i][55]=87; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=82;
        tabla[i][8]=87; tabla[i][20]=87; tabla[i][32]=87; tabla[i][44]=87; tabla[i][56]=87; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=87;
        tabla[i][9]=87; tabla[i][21]=87; tabla[i][33]=87; tabla[i][45]=87; tabla[i][57]=87; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=87; tabla[i][22]=87; tabla[i][34]=87; tabla[i][46]=87; tabla[i][58]=87; tabla[i][70]=87; tabla[i][82]=67;
        tabla[i][11]=87; tabla[i][23]=87; tabla[i][35]=87; tabla[i][47]=87; tabla[i][59]=87; tabla[i][71]=87; tabla[i][83]=87;
        
        i++; //81
        tabla[i][0]=81; tabla[i][12]=81; tabla[i][24]=81; tabla[i][36]=81; tabla[i][48]=81; tabla[i][60]=81; tabla[i][72]=81; tabla[i][84]=81;
        tabla[i][1]=81; tabla[i][13]=81; tabla[i][25]=81; tabla[i][37]=81; tabla[i][49]=81; tabla[i][61]=81; tabla[i][73]=81; tabla[i][85]=81;
        tabla[i][2]=81; tabla[i][14]=81; tabla[i][26]=81; tabla[i][38]=81; tabla[i][50]=81; tabla[i][62]=81; tabla[i][74]=81; tabla[i][86]=81;
        tabla[i][3]=81; tabla[i][15]=81; tabla[i][27]=81; tabla[i][39]=81; tabla[i][51]=81; tabla[i][63]=81; tabla[i][75]=81; tabla[i][87]=81;
        tabla[i][4]=81; tabla[i][16]=81; tabla[i][28]=81; tabla[i][40]=81; tabla[i][52]=81; tabla[i][64]=81; tabla[i][76]=81; tabla[i][88]=81;
        tabla[i][5]=81; tabla[i][17]=81; tabla[i][29]=81; tabla[i][41]=81; tabla[i][53]=81; tabla[i][65]=81; tabla[i][77]=81; tabla[i][89]=81;
        tabla[i][6]=81; tabla[i][18]=81; tabla[i][30]=81; tabla[i][42]=81; tabla[i][54]=81; tabla[i][66]=81; tabla[i][78]=81; tabla[i][90]=81;
        tabla[i][7]=81; tabla[i][19]=81; tabla[i][31]=81; tabla[i][43]=81; tabla[i][55]=81; tabla[i][67]=81; tabla[i][79]=81; tabla[i][91]=81;
        tabla[i][8]=81; tabla[i][20]=81; tabla[i][32]=81; tabla[i][44]=81; tabla[i][56]=81; tabla[i][68]=81; tabla[i][80]=81; tabla[i][92]=81;
        tabla[i][9]=81; tabla[i][21]=81; tabla[i][33]=81; tabla[i][45]=81; tabla[i][57]=81; tabla[i][69]=81; tabla[i][81]=81;
        tabla[i][10]=81; tabla[i][22]=81; tabla[i][34]=81; tabla[i][46]=81; tabla[i][58]=81; tabla[i][70]=81; tabla[i][82]=81;
        tabla[i][11]=81; tabla[i][23]=81; tabla[i][35]=81; tabla[i][47]=81; tabla[i][59]=81; tabla[i][71]=81; tabla[i][83]=81;
        
        i++; //82
        tabla[i][0]=82; tabla[i][12]=82; tabla[i][24]=82; tabla[i][36]=82; tabla[i][48]=82; tabla[i][60]=82; tabla[i][72]=82; tabla[i][84]=82;
        tabla[i][1]=82; tabla[i][13]=82; tabla[i][25]=82; tabla[i][37]=82; tabla[i][49]=82; tabla[i][61]=82; tabla[i][73]=82; tabla[i][85]=82;
        tabla[i][2]=82; tabla[i][14]=82; tabla[i][26]=82; tabla[i][38]=82; tabla[i][50]=82; tabla[i][62]=82; tabla[i][74]=82; tabla[i][86]=82;
        tabla[i][3]=82; tabla[i][15]=82; tabla[i][27]=82; tabla[i][39]=82; tabla[i][51]=82; tabla[i][63]=82; tabla[i][75]=82; tabla[i][87]=82;
        tabla[i][4]=82; tabla[i][16]=82; tabla[i][28]=82; tabla[i][40]=82; tabla[i][52]=82; tabla[i][64]=82; tabla[i][76]=82; tabla[i][88]=82;
        tabla[i][5]=82; tabla[i][17]=82; tabla[i][29]=82; tabla[i][41]=82; tabla[i][53]=82; tabla[i][65]=82; tabla[i][77]=82; tabla[i][89]=82;
        tabla[i][6]=82; tabla[i][18]=82; tabla[i][30]=82; tabla[i][42]=82; tabla[i][54]=82; tabla[i][66]=82; tabla[i][78]=82; tabla[i][90]=82;
        tabla[i][7]=82; tabla[i][19]=82; tabla[i][31]=82; tabla[i][43]=82; tabla[i][55]=82; tabla[i][67]=82; tabla[i][79]=82; tabla[i][91]=82;
        tabla[i][8]=82; tabla[i][20]=82; tabla[i][32]=82; tabla[i][44]=82; tabla[i][56]=82; tabla[i][68]=82; tabla[i][80]=82; tabla[i][92]=82;
        tabla[i][9]=82; tabla[i][21]=82; tabla[i][33]=82; tabla[i][45]=82; tabla[i][57]=82; tabla[i][69]=82; tabla[i][81]=82;
        tabla[i][10]=82; tabla[i][22]=82; tabla[i][34]=82; tabla[i][46]=82; tabla[i][58]=82; tabla[i][70]=82; tabla[i][82]=82;
        tabla[i][11]=82; tabla[i][23]=82; tabla[i][35]=82; tabla[i][47]=82; tabla[i][59]=82; tabla[i][71]=82; tabla[i][83]=82;
        
        i++; //83
        tabla[i][0]=83; tabla[i][12]=83; tabla[i][24]=83; tabla[i][36]=83; tabla[i][48]=83; tabla[i][60]=83; tabla[i][72]=83; tabla[i][84]=83;
        tabla[i][1]=83; tabla[i][13]=83; tabla[i][25]=83; tabla[i][37]=83; tabla[i][49]=83; tabla[i][61]=83; tabla[i][73]=83; tabla[i][85]=83;
        tabla[i][2]=83; tabla[i][14]=83; tabla[i][26]=83; tabla[i][38]=83; tabla[i][50]=83; tabla[i][62]=83; tabla[i][74]=83; tabla[i][86]=83;
        tabla[i][3]=83; tabla[i][15]=83; tabla[i][27]=83; tabla[i][39]=83; tabla[i][51]=83; tabla[i][63]=83; tabla[i][75]=83; tabla[i][87]=83;
        tabla[i][4]=83; tabla[i][16]=83; tabla[i][28]=83; tabla[i][40]=83; tabla[i][52]=83; tabla[i][64]=83; tabla[i][76]=83; tabla[i][88]=83;
        tabla[i][5]=83; tabla[i][17]=83; tabla[i][29]=83; tabla[i][41]=83; tabla[i][53]=83; tabla[i][65]=83; tabla[i][77]=83; tabla[i][89]=83;
        tabla[i][6]=83; tabla[i][18]=83; tabla[i][30]=83; tabla[i][42]=83; tabla[i][54]=83; tabla[i][66]=83; tabla[i][78]=83; tabla[i][90]=83;
        tabla[i][7]=83; tabla[i][19]=83; tabla[i][31]=83; tabla[i][43]=83; tabla[i][55]=83; tabla[i][67]=83; tabla[i][79]=83; tabla[i][91]=83;
        tabla[i][8]=83; tabla[i][20]=83; tabla[i][32]=83; tabla[i][44]=83; tabla[i][56]=83; tabla[i][68]=83; tabla[i][80]=83; tabla[i][92]=83;
        tabla[i][9]=83; tabla[i][21]=83; tabla[i][33]=83; tabla[i][45]=83; tabla[i][57]=83; tabla[i][69]=83; tabla[i][81]=83;
        tabla[i][10]=83; tabla[i][22]=83; tabla[i][34]=83; tabla[i][46]=83; tabla[i][58]=83; tabla[i][70]=83; tabla[i][82]=83;
        tabla[i][11]=83; tabla[i][23]=83; tabla[i][35]=83; tabla[i][47]=83; tabla[i][59]=83; tabla[i][71]=83; tabla[i][83]=83;
        
        i++; //84
        tabla[i][0]=84; tabla[i][12]=84; tabla[i][24]=84; tabla[i][36]=84; tabla[i][48]=84; tabla[i][60]=84; tabla[i][72]=84; tabla[i][84]=84;
        tabla[i][1]=84; tabla[i][13]=84; tabla[i][25]=84; tabla[i][37]=84; tabla[i][49]=84; tabla[i][61]=84; tabla[i][73]=84; tabla[i][85]=84;
        tabla[i][2]=84; tabla[i][14]=84; tabla[i][26]=84; tabla[i][38]=84; tabla[i][50]=84; tabla[i][62]=84; tabla[i][74]=84; tabla[i][86]=84;
        tabla[i][3]=84; tabla[i][15]=84; tabla[i][27]=84; tabla[i][39]=84; tabla[i][51]=84; tabla[i][63]=84; tabla[i][75]=84; tabla[i][87]=84;
        tabla[i][4]=84; tabla[i][16]=84; tabla[i][28]=84; tabla[i][40]=84; tabla[i][52]=84; tabla[i][64]=84; tabla[i][76]=84; tabla[i][88]=84;
        tabla[i][5]=84; tabla[i][17]=84; tabla[i][29]=84; tabla[i][41]=84; tabla[i][53]=84; tabla[i][65]=84; tabla[i][77]=84; tabla[i][89]=84;
        tabla[i][6]=84; tabla[i][18]=84; tabla[i][30]=84; tabla[i][42]=84; tabla[i][54]=84; tabla[i][66]=84; tabla[i][78]=84; tabla[i][90]=84;
        tabla[i][7]=84; tabla[i][19]=84; tabla[i][31]=84; tabla[i][43]=84; tabla[i][55]=84; tabla[i][67]=84; tabla[i][79]=84; tabla[i][91]=84;
        tabla[i][8]=84; tabla[i][20]=84; tabla[i][32]=84; tabla[i][44]=84; tabla[i][56]=84; tabla[i][68]=84; tabla[i][80]=84; tabla[i][92]=84;
        tabla[i][9]=84; tabla[i][21]=84; tabla[i][33]=84; tabla[i][45]=84; tabla[i][57]=84; tabla[i][69]=84; tabla[i][81]=84;
        tabla[i][10]=84; tabla[i][22]=84; tabla[i][34]=84; tabla[i][46]=84; tabla[i][58]=84; tabla[i][70]=84; tabla[i][82]=84;
        tabla[i][11]=84; tabla[i][23]=84; tabla[i][35]=84; tabla[i][47]=84; tabla[i][59]=84; tabla[i][71]=84; tabla[i][83]=84;
        
        i++; //85
        tabla[i][0]=85; tabla[i][12]=85; tabla[i][24]=85; tabla[i][36]=85; tabla[i][48]=85; tabla[i][60]=85; tabla[i][72]=85; tabla[i][84]=85;
        tabla[i][1]=85; tabla[i][13]=85; tabla[i][25]=85; tabla[i][37]=85; tabla[i][49]=85; tabla[i][61]=85; tabla[i][73]=85; tabla[i][85]=85;
        tabla[i][2]=85; tabla[i][14]=85; tabla[i][26]=85; tabla[i][38]=85; tabla[i][50]=85; tabla[i][62]=85; tabla[i][74]=85; tabla[i][86]=85;
        tabla[i][3]=85; tabla[i][15]=85; tabla[i][27]=85; tabla[i][39]=85; tabla[i][51]=85; tabla[i][63]=85; tabla[i][75]=85; tabla[i][87]=85;
        tabla[i][4]=85; tabla[i][16]=85; tabla[i][28]=85; tabla[i][40]=85; tabla[i][52]=85; tabla[i][64]=85; tabla[i][76]=85; tabla[i][88]=85;
        tabla[i][5]=85; tabla[i][17]=85; tabla[i][29]=85; tabla[i][41]=85; tabla[i][53]=85; tabla[i][65]=85; tabla[i][77]=85; tabla[i][89]=85;
        tabla[i][6]=85; tabla[i][18]=85; tabla[i][30]=85; tabla[i][42]=85; tabla[i][54]=85; tabla[i][66]=85; tabla[i][78]=85; tabla[i][90]=85;
        tabla[i][7]=85; tabla[i][19]=85; tabla[i][31]=85; tabla[i][43]=85; tabla[i][55]=85; tabla[i][67]=85; tabla[i][79]=85; tabla[i][91]=85;
        tabla[i][8]=85; tabla[i][20]=85; tabla[i][32]=85; tabla[i][44]=85; tabla[i][56]=85; tabla[i][68]=85; tabla[i][80]=85; tabla[i][92]=85;
        tabla[i][9]=85; tabla[i][21]=85; tabla[i][33]=85; tabla[i][45]=85; tabla[i][57]=85; tabla[i][69]=85; tabla[i][81]=85;
        tabla[i][10]=85; tabla[i][22]=85; tabla[i][34]=85; tabla[i][46]=85; tabla[i][58]=85; tabla[i][70]=85; tabla[i][82]=85;
        tabla[i][11]=85; tabla[i][23]=85; tabla[i][35]=85; tabla[i][47]=85; tabla[i][59]=85; tabla[i][71]=85; tabla[i][83]=85;
        
        i++; //86
        tabla[i][0]=86; tabla[i][12]=86; tabla[i][24]=86; tabla[i][36]=86; tabla[i][48]=86; tabla[i][60]=86; tabla[i][72]=86; tabla[i][84]=86;
        tabla[i][1]=86; tabla[i][13]=86; tabla[i][25]=86; tabla[i][37]=86; tabla[i][49]=86; tabla[i][61]=86; tabla[i][73]=86; tabla[i][85]=86;
        tabla[i][2]=86; tabla[i][14]=86; tabla[i][26]=86; tabla[i][38]=86; tabla[i][50]=86; tabla[i][62]=86; tabla[i][74]=86; tabla[i][86]=86;
        tabla[i][3]=86; tabla[i][15]=86; tabla[i][27]=86; tabla[i][39]=86; tabla[i][51]=86; tabla[i][63]=86; tabla[i][75]=86; tabla[i][87]=86;
        tabla[i][4]=86; tabla[i][16]=86; tabla[i][28]=86; tabla[i][40]=86; tabla[i][52]=86; tabla[i][64]=86; tabla[i][76]=86; tabla[i][88]=86;
        tabla[i][5]=86; tabla[i][17]=86; tabla[i][29]=86; tabla[i][41]=86; tabla[i][53]=86; tabla[i][65]=86; tabla[i][77]=86; tabla[i][89]=86;
        tabla[i][6]=86; tabla[i][18]=86; tabla[i][30]=86; tabla[i][42]=86; tabla[i][54]=86; tabla[i][66]=86; tabla[i][78]=86; tabla[i][90]=86;
        tabla[i][7]=86; tabla[i][19]=86; tabla[i][31]=86; tabla[i][43]=86; tabla[i][55]=86; tabla[i][67]=86; tabla[i][79]=86; tabla[i][91]=86;
        tabla[i][8]=86; tabla[i][20]=86; tabla[i][32]=86; tabla[i][44]=86; tabla[i][56]=86; tabla[i][68]=86; tabla[i][80]=86; tabla[i][92]=86;
        tabla[i][9]=86; tabla[i][21]=86; tabla[i][33]=86; tabla[i][45]=86; tabla[i][57]=86; tabla[i][69]=86; tabla[i][81]=86;
        tabla[i][10]=86; tabla[i][22]=86; tabla[i][34]=86; tabla[i][46]=86; tabla[i][58]=86; tabla[i][70]=86; tabla[i][82]=86;
        tabla[i][11]=86; tabla[i][23]=86; tabla[i][35]=86; tabla[i][47]=86; tabla[i][59]=86; tabla[i][71]=86; tabla[i][83]=86;
        
        i++; //87
        tabla[i][0]=87; tabla[i][12]=87; tabla[i][24]=87; tabla[i][36]=87; tabla[i][48]=87; tabla[i][60]=87; tabla[i][72]=87; tabla[i][84]=87;
        tabla[i][1]=87; tabla[i][13]=87; tabla[i][25]=87; tabla[i][37]=87; tabla[i][49]=87; tabla[i][61]=87; tabla[i][73]=87; tabla[i][85]=87;
        tabla[i][2]=87; tabla[i][14]=87; tabla[i][26]=87; tabla[i][38]=87; tabla[i][50]=87; tabla[i][62]=87; tabla[i][74]=87; tabla[i][86]=87;
        tabla[i][3]=87; tabla[i][15]=87; tabla[i][27]=87; tabla[i][39]=87; tabla[i][51]=87; tabla[i][63]=87; tabla[i][75]=87; tabla[i][87]=87;
        tabla[i][4]=87; tabla[i][16]=87; tabla[i][28]=87; tabla[i][40]=87; tabla[i][52]=87; tabla[i][64]=87; tabla[i][76]=87; tabla[i][88]=87;
        tabla[i][5]=87; tabla[i][17]=87; tabla[i][29]=87; tabla[i][41]=87; tabla[i][53]=87; tabla[i][65]=87; tabla[i][77]=87; tabla[i][89]=87;
        tabla[i][6]=87; tabla[i][18]=87; tabla[i][30]=87; tabla[i][42]=87; tabla[i][54]=87; tabla[i][66]=87; tabla[i][78]=87; tabla[i][90]=87;
        tabla[i][7]=87; tabla[i][19]=87; tabla[i][31]=87; tabla[i][43]=87; tabla[i][55]=87; tabla[i][67]=87; tabla[i][79]=87; tabla[i][91]=87;
        tabla[i][8]=87; tabla[i][20]=87; tabla[i][32]=87; tabla[i][44]=87; tabla[i][56]=87; tabla[i][68]=87; tabla[i][80]=87; tabla[i][92]=87;
        tabla[i][9]=87; tabla[i][21]=87; tabla[i][33]=87; tabla[i][45]=87; tabla[i][57]=87; tabla[i][69]=87; tabla[i][81]=87;
        tabla[i][10]=87; tabla[i][22]=87; tabla[i][34]=87; tabla[i][46]=87; tabla[i][58]=87; tabla[i][70]=87; tabla[i][82]=87;
        tabla[i][11]=87; tabla[i][23]=87; tabla[i][35]=87; tabla[i][47]=87; tabla[i][59]=87; tabla[i][71]=87; tabla[i][83]=87;
        
    }
    

    int linea =0;
    Stack pila = new Stack();
    
    int buscaCaracter(char c){
        if(c=='\0') c=' ';
        
        switch(c){
            case 'a': return 0; case 'k': return 10; case 'u': return 20;
            case 'b': return 1; case 'l': return 11; case 'v': return 21;
            case 'c': return 2; case 'm': return 12; case 'w': return 22;
            case 'd': return 3; case 'n': return 13; case 'x': return 23;
            case 'e': return 4; case 'o': return 14; case 'y': return 24;
            case 'f': return 5; case 'p': return 15; case 'z': return 25;
            case 'g': return 6; case 'q': return 16; 
            case 'h': return 7; case 'r': return 17; 
            case 'i': return 8; case 's': return 18; 
            case 'j': return 9; case 't': return 19; 
            
            case 'A': return 26; case 'K': return 36; case 'U': return 46;
            case 'B': return 27; case 'L': return 37; case 'V': return 47;
            case 'C': return 28; case 'M': return 38; case 'W': return 48;
            case 'D': return 29; case 'N': return 39; case 'X': return 49;
            case 'E': return 30; case 'O': return 40; case 'Y': return 50;
            case 'F': return 31; case 'P': return 41; case 'Z': return 51;
            case 'G': return 32; case 'Q': return 42; 
            case 'H': return 33; case 'R': return 43; 
            case 'I': return 34; case 'S': return 44; 
            case 'J': return 35; case 'T': return 45; 
            
            case '1': return 52; case '4': return 55; case '7': return 58;
            case '2': return 53; case '5': return 56; case '8': return 59;
            case '3': return 54; case '6': return 57; case '9': return 60;
            case '0': return 92;
            
            case '\n': return 61; case '\t': return 71; case '\\': return 81;
            case ' ': return 62; case '*': return 72; case '/': return 82;
            case '-': return 63; case '+': return 73; case '{': return 83;
            case '}': return 64; case '[': return 74; case ']': return 84;
            case '(': return 65; case ')': return 75; case '.': return 85;
            case ':': return 66; case ',': return 76; case ';': return 86;
            case '!': return 67; case '¡': return 77; case '¿': return 87;
            case '?': return 68; case '\"': return 78; case '\'': return 88;
            case '<': return 69; case '>': return 79; case '_': return 89;
            case '=': return 70; case '&': return 80; case '|': return 90;
            //case '\r': return 62; case '\0': return 62; 
            
            default: return 91;
            
        }
    }
    boolean aceptado=false;
    String proceso="";
    int contPila=0;
    
    String evalua(String texto){
        int pCaracter=0, primerEstado=0, segundoEstado=0;
        proceso="Proceso\n\n\n";
        linea=1;
        texto = texto.replace("\r","");
        char caracter=texto.charAt(0);
        
        pila.removeAllElements();
        contPila=0;
        
        boolean error=false;
        int tipoError=0;
        char caracterError=' ';
        int lineaError=0;
        int pLinea=0;
        char caracterPila=' ';
        
        for(int i=1; i<=texto.length(); i++){
            
            
            pCaracter = buscaCaracter(caracter);
            
            segundoEstado = tabla[primerEstado][pCaracter];
            if(caracter=='{' || caracter=='(' || caracter=='}' || caracter==')')
                checaPila(caracter, linea);
            
            if(caracter=='{' || caracter=='('){
                //pila.push(caracter);
                contPila++;
                pLinea=linea;
                caracterPila=caracter;
                
            }
            if(caracter=='}' || caracter==')'){
                    //pila.pop();
                    contPila++;
                    pLinea=linea;
                    caracterPila=caracter;
            }
            
            if(segundoEstado==81 || segundoEstado==82 || segundoEstado==83 || segundoEstado==84 ||
                    segundoEstado==85 || segundoEstado==86 || segundoEstado==87){
                if(error == false){
                    error=true;
                    lineaError=linea;
                    tipoError=segundoEstado;
                    caracterError=caracter;
                    
                }
                    
                
            }
            if(caracter=='\n') linea++;
            
            acumulaProceso(primerEstado,  caracter,  segundoEstado);
            if(i!=texto.length()) caracter=texto.charAt(i);
            primerEstado=segundoEstado;
        }
        if(error) return impError(lineaError,tipoError,caracterError);
        
        
        if(contPila%2==0 && segundoEstado==12){
            aceptado=true;
            return "¡Programa aceptado correctamente!";
            
        }
        else{
           aceptado=false;
           return checaPila(caracterPila, pLinea);
        }
        
    
    }
    
    String checaPila(char caracter, int linea){
        
            return  "Error en el control de paréntesis o llaves(linea "+linea+")\nError en -->"+
                        caracter(caracter)+"\nPrograma no aceptado";
        
    }
    
    void acumulaProceso(int primerEstado, char caracter, int segundoEstado){
        proceso+="\nq"+primerEstado+" --> caracter: ("+caracter(caracter)+") --> q"+segundoEstado+"  ";
    }
    
    String impError(int lineaError,int tipoError, char caracterError){
       
                aceptado=false;
                
                return  error(tipoError)+"(linea "+lineaError+")\nError en -->"+
                        caracter(caracterError)+"\nPrograma no aceptado";
    }
            
            
            
            
    String caracter(char caracter){
        String cadenaCaracter="";
        if(caracter==' ')
            cadenaCaracter="<ESPACIO>";
        else if(caracter=='\t')
            cadenaCaracter="<TABULACION>";
            else if(caracter=='\n')
                cadenaCaracter="<SALTO DE LINEA>";
                else if(caracter=='\0')
                    cadenaCaracter="<VACÍO>";
                else
                    cadenaCaracter=caracter+"";
                    
        return cadenaCaracter;
                    
}

    
    String error(int pCaracter){
        String msgError="";
        switch(pCaracter){
            case 81:  msgError="Error en la definición del programa "; break;
            case 82:  msgError="Error caracter no identificado "; break;
            case 83:  msgError="Error sintaxis en comentario"; break;
            case 84:  msgError="Error de sintaxis en get"; break;
            case 85:  msgError="Error de sintaxis en show"; break;
            case 86:  msgError="Error de sintaxis en if"; break;
            case 87:  msgError="Error de sintaxis en asignación"; break;
            default: msgError="Error desconocido";
        }
        return msgError;
        
    }
    
}
    
    
    
    
    
    
    
    
    
    

