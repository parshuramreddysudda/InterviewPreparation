#include<iostream.h>
#include<conio.h>
#include<stdlib.h>
#include<string.h>
#include<dos.h>
class Checkers
{
public:
virtual void menu();
virtual void game();
virtual void display_Board();
virtual void credits();
virtual void help_Menu();
virtual void initialising_Players();

virtual int convertion_Row(char );
virtual int convertion_Col(char );

virtual void move();
void swap();
void source_Design();
void destiny_Design();
virtual void swap(char &ele1,char &ele2);

void normal_Jump();
void jump_To_Row2();
void strightJump_To_Same_Row();
void doubleJump_To_Row4();
void technicalJump_To_Row6();

char tab[9][9],design[8][8];

int flag1,flag2,status,i,j,k,row,col,rrr,flag,valid;

 int rs,cs,rd,cd;
    char r_s,c_s,r_d,c_d;
char em_l,des2,coin2,levels,empty_location,p15,ch,a1,a2,a,b,c,d,e,f,g,h,l,m1,n,p,q,r,t,u,v,coin1,y,x,p1[20],p2[20],s111,s222,cdc,cdcd,w;
float A,B,C,D,E,F,G;
char my_player[30],opp_player[30],my_coin,opp_coin;
virtual  void initialise_Ascii()
{


A=1000;B=1020;C=1060;D=1110;E=1180;F=1260;G=1340;
	for(int i=0;i<8;i++)
		for(int j=0;j<8;j++)
			design[i][j]=' ';


  des2=14;
  x=72;
  p15=15;
  rrr=1;
  a=218;
  b=191;
  c=192;
  d=217;
  e=196;
  f=179;
  g=194;
  h=193;
  l=195;
  m1=180;
  n=197;
  p=201;
  q=187;
  r=200;
  t=188;
  u=205;
  v=186;
  w=178;
  cdc=176;
  cdcd=177;
  empty_location=0; //---------------------?!

  initialise_Coin_Of_Players();//initialises the board

}


//------------		choose levels	-------------
virtual void choose_Levels()
{

	cout<<"\n\n\n\t\t\tENTER U'R CHOICE OF PLAY";
	cout<<"\n\n\n\t\t\t[\t1\t]\t:\tLEVEL1 WITH 8 COINS";
	cout<<"\n\n\n\t\t\t[\t2\t]\t:\tLEVEL1 WITH 12 COINS";
	cin>>levels;
	  if(levels!='1' && levels !='2')
			choose_Levels();

}

 virtual int win(int coin_choosen)
 {
  if(levels=='1')
  {
  switch(coin_choosen){

  case 1:       if(tab[0][0]==coin1 && tab[0][2]==coin1 && tab[0][4]==coin1 && tab[0][6]==coin1 && tab[1][1]==coin1 && tab[1][3]==coin1 && tab[1][5]==coin1 && tab[1][7]==coin1)
		   return 1;
		  else
			return 0;

  case 2:
		 if(tab[6][0]==coin2 && tab[6][2]==coin2 && tab[6][4]==coin2 && tab[6][6]==coin2 && tab[7][1]==coin2 && tab[7][3]==coin2 && tab[7][5]==coin2 && tab[7][7]==coin2)
		   return 2;
		  else
			return 0;
	      }
 }
 else
 {

  switch(coin_choosen){

  case 1:       if(tab[0][0]==coin1 && tab[0][2]==coin1 && tab[0][4]==coin1 && tab[0][6]==coin1 && tab[1][1]==coin1 && tab[1][3]==coin1 && tab[1][5]==coin1 && tab[1][7]==coin1 && tab[2][0]==coin1 && tab[2][2]==coin1 && tab[2][4]==coin1 && tab[2][6]==coin1 )
		   return 1;
		  else
			return 0;

  case 2:
		 if(tab[5][1]==coin2 && tab[5][3]==coin2 && tab[5][5]==coin2 && tab[5][7]==coin2 && tab[6][0]==coin2 && tab[6][2]==coin2 && tab[6][4]==coin2 && tab[6][6]==coin2 && tab[7][1]==coin2 && tab[7][3]==coin2 && tab[7][5]==coin2 && tab[7][7]==coin2)
		   return 2;
		  else
			return 0;
	      }

 }
 }

virtual void initialise_Coin_Of_Players()
{
	  int xxx=1,count=1;

		//initialising player 1 coins

	 while(count++<=4)
	  {
		tab[7][xxx]=coin1;
		design[7][xxx]=' ';
		xxx=xxx+2;
	  }
      xxx=0;count=1;

	while(count++<=4)
	  {
		 tab[6][xxx]=coin1;
		design[6][xxx]=' ';
			xxx=xxx+2;
	  }

	xxx=1;count=1;

	if(levels=='1')
	{

	 while(count++<=4)
	  {
		 tab[5][xxx]=empty_location;
		 design[5][xxx]=' ';
			xxx=xxx+2;
	  }
	}
	xxx=1;count=1;

	if(levels=='2')
	{

	 while(count++<=4)
	  {
		 tab[5][xxx]=coin1;
		 design[5][xxx]=' ';
			xxx=xxx+2;
	  }
	}

      xxx=0;count=1;
	while(count++<=4)
	  {
		 tab[0][xxx]=coin2;
		 design[0][xxx]=' ';
			xxx=xxx+2;
	  }

      xxx=1;count=1;
	while(count++<=4)
	  {
		 tab[1][xxx]=coin2;
		 design[1][xxx]=' ';
			xxx=xxx+2;
	  }

	xxx=0;count=1;

	if(levels=='1')
	{

	 while(count++<=4)
	  {
		 tab[2][xxx]=empty_location;
		 design[2][xxx]=' ';
			xxx=xxx+2;
	  }
	}

	xxx=0;count=1;

	if(levels=='2')
	{

	 while(count++<=4)
	  {
		 tab[2][xxx]=coin2;
		 design[2][xxx]=' ';
			xxx=xxx+2;
	  }
	}
//initialising the empty look the between game

	xxx=0;count=1;
	while(count++<=4)
	  {
		 tab[4][xxx]=empty_location;
		 design[4][xxx]=' ';
			xxx=xxx+2;
	  }

	 xxx=1;count=1;
	 while(count++<=4)
	  {
		 tab[3][xxx]=empty_location;
		 design[3][xxx]=' ';
			xxx=xxx+2;
	  }
}


		     /*1 d  fuctions*/
//this fun is used to print the checker

virtual void valid_Check_Move()
{
			  if(row==rs && col==cs)
					em_l=1;
			 else if(row==rd && col==cd)
					em_l=2;
			  else
					em_l=empty_location;

cout<<empty_location;
cout<<em_l;
cout<<tab[row][col];
cout<<em_l;
cout<<empty_location;

}



//colored the altenative boxes--only 1line of box

virtual void invalid_Check_Move()
{   char w_=w;

	 rrr=0;
	for(i=0;i<2;i++)
	{
		 cout<<w;
	}

	 cout<<w_;//concepted for usage of chess:later updation

	for(i=0;i<2;i++)
	{
		 cout<<w;
	}


}
//prints the col s1s1"A"s1s1
void display_HGFEDCBA_For_Row()
{
	for(i=0;i<2;i++)
		cout<<empty_location;
		cout<<x;
	for(i=4;i<6;i++)
		cout<<empty_location;

}
//  empty_location fun
void spaces_Design()
{

	for(i=0;i<2;i++)
	  cout<<' ';
	 cout<<design[row][col];
	for(i=0;i<2;i++)
	  cout<<' ';

}
		     /*
void spaces_Design_alt()
{

	for(i=0;i<2;i++)
	  cout<<' ';
	 cout<<design[row][col];
	for(i=0;i<2;i++)
	  cout<<' ';

}
		       */
//  empty_location fun
void spaces_5()
{
	for(i=0;i<5;i++)
		cout<<empty_location;
}

//---------fun
void stline_Of_Size5()
{
	for(i=0;i<5;i++)
	cout<<e;
}

		//2 -d functions

//prints the first line of a Checkers

void first_Border_Checker()
{
      cout<<v;
	spaces_5();
	cout<<a;
	for(j=0;j<7;j++)
	{
		stline_Of_Size5();
		cout<<g;
	}
	      stline_Of_Size5();
	      cout<<b;
	      spaces_5();
	      cout<<v;
	      cout<<endl;
}
//prints the the 2nd line

void line2_Design()
{
		cout<<v;
		spaces_5();
		cout<<f;
		col=0;
		invalid_Check_Move();
		cout<<f;
	for(j=0;j<3;j++)
	{       col++;
		spaces_Design();
	      //spaces_5();
		cout<<f;
		col++;
		invalid_Check_Move();
		cout<<f;

	}
	      col++;
	      spaces_Design();
	      //	spaces_5();
		cout<<f;
		spaces_5();
		cout<<v;
	  cout<<endl;
}

//alt to above fun
void line2_Design_alt()
{
	       cout<<v;
		spaces_5();
		cout<<f;
	       col=0;
		spaces_Design();
	       //spaces_5();
		cout<<f;

		for(j=0;j<3;j++)
		{    	col++;
			invalid_Check_Move();
			cout<<f;
			col++;
			spaces_Design();
			//spaces_5();
			cout<<f;

		}
			col++;
			invalid_Check_Move();
			cout<<f;
			spaces_5();
			cout<<v;
			cout<<endl;
}


//---------------------------------:::::::::
//prints the total line of the cheker placement
virtual void total_First_Box()
{    		 cout<<v;

		display_HGFEDCBA_For_Row();
		cout<<f;
		col=0;
		for(j=0;j<4;j++)
		{

			invalid_Check_Move();
			cout<<f;
			col++;
			valid_Check_Move();
			cout<<f;
			col++;
		}
			spaces_5();
		      cout<<v;
		      cout<<endl;
		      x--;
}

//prints the checker placement but the first box is shaded

virtual void total_Second_Box()
{
		 cout<<v;
		display_HGFEDCBA_For_Row();
		cout<<f;
		      col=0;
		for(j=0;j<4;j++)
		{       valid_Check_Move();
			cout<<f;
			col++;
			invalid_Check_Move();
			cout<<f;
			col++;
		}
		spaces_5();
	      cout<<v;
	      cout<<endl;   x--;
}

//--middle of the game where actual game slides over here

virtual void total_Middle_Box3()
{
		 cout<<v;
		display_HGFEDCBA_For_Row();
		cout<<f;
		    col=0;
	for(j=0;j<4;j++)
	{
		invalid_Check_Move();
		cout<<f;
		col++;
		valid_Check_Move();
		cout<<f;
		col++;
	}
	spaces_5();
      cout<<v;
      cout<<endl;   x--;
}

//alt of the above function

virtual void total_Middle_Box4()
{
		 cout<<v;
		display_HGFEDCBA_For_Row();
		cout<<f;
		      col=0;
	for(j=0;j<4;j++)
	{
		valid_Check_Move();
		cout<<f;
		col++;
		invalid_Check_Move();
		cout<<f;
		col++;
	}
	spaces_5();
      cout<<v;
      cout<<endl;   x--;
}




//prints the first box of a Checkers col

virtual void total_Middle_Box7()
{
		 cout<<v;
		display_HGFEDCBA_For_Row();
		cout<<f;
		     col=0;
	for(j=0;j<4;j++)
	{
		invalid_Check_Move();
		cout<<f;
		col++;
		valid_Check_Move();
		cout<<f;
		col++;
	}
	spaces_5();
      cout<<v;
      cout<<endl;   x--;
}

    //alt to above fun

virtual void total_Middle_Box8()
{
		 cout<<v;
		display_HGFEDCBA_For_Row();
		cout<<f;
	      col=0;
	for(j=0;j<4;j++)
	{
		valid_Check_Move();
		cout<<f;
		col++;
		invalid_Check_Move();
		cout<<f;
		col++;
	}
	spaces_5();
      cout<<v;
      cout<<endl;   x--;
}

//prints the total box of the row of the checker line2 to the but 1 line

void player1_Line2_To_But1LineRows()
{   cout<<"\t";

	line2_Design();
    cout<<"\t";

		total_First_Box();
		cout<<"\t";

	line2_Design();
}

//alt to above
void player1_Line2_To_But1LineRows_alt()
{       cout<<"\t";

		line2_Design_alt();
		cout<<"\t";

	total_Second_Box();
	cout<<"\t";

	line2_Design_alt();
}



void empty_Line2_To_But1LineRows()
{   cout<<"\t";

	line2_Design();
    cout<<"\t";

		total_Middle_Box3();
		cout<<"\t";

	line2_Design();
}


void empty_Line2_To_But1LineRows_alt()
{   cout<<"\t";

	line2_Design_alt();
    cout<<"\t";

	total_Middle_Box4();
    cout<<"\t";

	line2_Design_alt();
}
//displays from 2nd to but 1 line  of checker placement:1st move box
void player2_Line2_To_But1LineRows()
{   cout<<"\t";

	line2_Design();
    cout<<"\t";


		total_Middle_Box7();
		cout<<"\t";

	line2_Design();
}
//displays from 2nd to but 1 line  of checker placement:1st design
void player2_Line2_To_But1LineRows_alt()
{   cout<<"\t";

	line2_Design_alt();
    cout<<"\t";

		total_Middle_Box8();
		cout<<"\t";

	line2_Design_alt();
}





//this function prints the last line of a box ::
void last_Line_Of_BoxRow()
{
 cout<<"\t";

     cout<<v;
	spaces_5();
	cout<<l;
	for(j=0;j<7;j++)
	{
		stline_Of_Size5();
		cout<<n;
	}
	stline_Of_Size5();
	cout<<m1;
	spaces_5();
	cout<<v;
	cout<<endl;
}

//this function prints the last border of a Checkers
void last_Border_Of_Checker()
{
	cout<<v;
	spaces_5();
	cout<<c;
	for(j=0;j<7;j++)
	{
		stline_Of_Size5();
		cout<<h;
	}
	stline_Of_Size5();
	cout<<d;
	spaces_5();
	cout<<v;
	cout<<endl;
}
//prints the first line=============== of the border Checkers
void last_Border_Line_Checker()
{
	cout<<u<<"[]"<<u;


       cout<<" A:0 ";


	for(i=10;i<59;i++)
	       cout<<u;

}
//displays the border line of checker
void first_Border_Line_Checker()
{

	for(i=10;i<59;i++)
       cout<<u;

	cout<<" H:7 ";
	cout<<u<<"[]"<<u;

}

//PRINTS THE FIRST LINE OF BOARD ||==================================||

void first_Line_Design()
{
	cout<<p;
	first_Border_Line_Checker();
	cout<<q;
	cout<<endl;
}
//PRINTS  	1	2	3	4	5	6	7	8
void display_12345678_Colno()
{
	 for(i=0;i<8;i++)
	cout<<empty_location;
		cout<<"0";
	for(i=0;i<5;i++)
	cout<<empty_location;
		cout<<"1";
	for(i=0;i<5;i++)
	cout<<empty_location;
		cout<<"2";
	 for(i=0;i<5;i++)
	cout<<empty_location;
		cout<<"3";
	 for(i=0;i<5;i++)
	cout<<empty_location;
		cout<<"4";
	 for(i=0;i<5;i++)
	cout<<empty_location;
		cout<<"5";
	 for(i=0;i<5;i++)
	cout<<empty_location;
		cout<<"6";
	 for(i=0;i<5;i++)
	cout<<empty_location;
		cout<<"7";
	for(i=0;i<8;i++)
	cout<<empty_location;

}

//prints 			player:1
virtual void print_Player1_In_Design()
{

a1=2*(12-str_len(p1))/2;
a2=(12-str_len(p1))%2;

	for(i=0;i<18;i++)
		cout<<empty_location;

	for(i=18;i<24;i++)
	{
		 cout<<p15;
	}

		for(i=0;i<a1;i++)
	{
	   cout<<empty_location;
	}



   if(str_len(p1)>0 || str_len(p1)<12)
	   cout<<p1;
   else
  {
		 i=8;
		p1[i+1]='.';//creates a dube to player 1
		p1[i+2]='.';
		p1[i+3]='.';
		p1[i+4]='\0';
  }
	for(i=a1+str_len(p1);i<a2;i++)
	{
	 cout<<empty_location;
	}



	for(i=32;i<36;i++)
	{
		cout<<empty_location;
	}
	for(i=36;i<42;i++)
	{
		 cout<<p15;
	}


	for(i=42;i<55;i++)
		cout<<empty_location;
}

//  prints			player:2
virtual void print_Player2_In_Design()
{

a1=2*(12-str_len(p2))/2;
a2=(12-str_len(p2))%2;
	for(i=0;i<18;i++)
		cout<<empty_location;
	for(i=18;i<24;i++)
	{
		 cout<<p15;
	}



		for(i=0;i<a1;i++)
	{
	   cout<<empty_location;
	}

   if(str_len(p2)>0 || str_len(p2)<12)
	   cout<<p2;
   else
  {
		 i=8;
		p2[i+1]='.';
		p2[i+2]='.';
		p2[i+3]='.';
		p2[i+4]='\0';
  }
	for(i=a1+str_len(p2);i<a2;i++)
	{
	 cout<<empty_location;
	}


	for(i=32;i<36;i++)
	{
		cout<<empty_location;
	}

	for(i=36;i<42;i++)
	{
		 cout<<p15;
	}

	for(i=42;i<55;i++)
	cout<<empty_location;
}



//prints 	 ||						||
void print_Empty_Design()
{
	cout<<"\t";
	cout<<v;

	for(i=0;i<59;i++)
	cout<<empty_location;

	cout<<v;
}
//PRINTS 0	1      2	3	4	5	6	7
void display_Design_Line_12345678()
{
	cout<<"\t";
	cout<<v;
	display_12345678_Colno();
	cout<<v;
}
//prints	|| 		player:1                        ||
void print_Line_Player1_In_Design()
{
	cout<<"\t";
	cout<<v;
	print_Player1_In_Design();
	cout<<v;
}


//prints	|| 		player:2                        ||
void print_Line_Player2_In_Design()
{
	cout<<"\t";
	cout<<v;
	print_Player2_In_Design();
	cout<<v;
}
/*
prints
		||                                              ||
		||                                              ||
		||			PLAYER:1                ||
		||                                              ||
		||						||



*/


void displays_Player1_On_top_of_Game()
{

//for(i=0;i<20;i++)
	print_Empty_Design();
	cout<<endl;

	print_Line_Player1_In_Design();
	cout<<endl;
	print_Empty_Design();
	cout<<endl;
}
/*
prints
		||                                              ||
		||                                              ||
		||			PLAYER:2                ||
		||                                              ||
		||						||



*/

void display_Player2_On_Bottom_Of_Game()
{

//for(i=0;i<20;i++)
      /*
	print_Empty_Design();
	cout<<endl;
	print_Empty_Design();
	cout<<endl;
       */
	display_Design_Line_12345678();
	cout<<endl;
	print_Empty_Design();
	cout<<endl;

	print_Line_Player2_In_Design();
	cout<<endl;
	print_Empty_Design();
	cout<<endl;

}
//PRINTS THE LAST LINE OF BOARD "=========================================="
void last_Line_Of_Design()
{
	 cout<<"\t";
	cout<<r;
	last_Border_Line_Checker();
	cout<<t;
	cout<<endl;
}




//this function checks whether the 2 strings are matched :return 1 or not :return 0

virtual int str_cmp(char abc[8],char pqr[8])
{
	for(int i=0;i<strlen(abc);i++)
	{
		 if(abc[i]==pqr[i])
		 {
			 return(1);
		 }
		 else
		 {
			 return(0);
		 }
	}

}

//calculates string length

virtual int str_len(char *player)
{
int count=0,i=0;
	while(player[i++]!='\0')
		count++;
return(count);

}
};

//close of class

void Checkers::display_Board()
{
clrscr();
	cout<<endl;
	cout<<"\t";
	first_Line_Design();
	displays_Player1_On_top_of_Game();
	 cout<<"\t";
	first_Border_Checker();
	 x=72;
		row=7;
		 player1_Line2_To_But1LineRows();
		 row--;
		last_Line_Of_BoxRow();

		 player1_Line2_To_But1LineRows_alt();

		row--;
		last_Line_Of_BoxRow();
	for(k=0;k<2;k++)
	{

		empty_Line2_To_But1LineRows();
		last_Line_Of_BoxRow();
		row--;
		empty_Line2_To_But1LineRows_alt();
	       last_Line_Of_BoxRow();
		row--;
	}




		player2_Line2_To_But1LineRows();
		 row--;
		last_Line_Of_BoxRow();
		player2_Line2_To_But1LineRows_alt();


		row--;
		cout<<"\t";
		last_Border_Of_Checker();
		 display_Player2_On_Bottom_Of_Game();
		 last_Line_Of_Design();
}



//checks the validation of players and alters if not valid(in case of duplicate's)

void Checkers::initialising_Players()
{

	char ch,coins1[10],coins2[10];
clrscr();
	cout<<"\n\n\n\n\nPLAYER:1->\t[\t\t]\b\b\b\b\b\b\b\b\b\b\b";
cin>>p1;
sound(780);   delay(500);   nosound();
	cout<<"\n\n\n\t\t"<<p1<<"\t:U'R SYMBOL IS\t:\t[\t]\b\b\b\b";
cin>>coins1;

coin1=coins1[0];
		clrscr();
cout<<"\n\n\n\n\nPLAYER2:2->\t[\t\t]\b\b\b\b\b\b\b\b\b\b\b";
cin>>p2;
sound(380);   delay(500);   nosound();
cout<<"\n\n\n\n"<<p2<<"\t:U'R SYMBOL IS\t:\t[\t]\b\b\b\b";
cin>>coins2;
coin2=coins2[0];

	if(str_cmp(p1,p2)==1)//checks whether the player are valid or not
	{             int j;

		for(int i=0;i<strlen(p1);i++)
		{
			  j=i;
		}
		p2[j+1]='2';//creates a dube to player 1
		p2[j+2]='\0';
			cout<<"\n\nPLAYER 2\t:\tIS DUPLICATED to:\t"<<p2;
			sound(580);   delay(500); nosound();

	}
	if(coin1==coin2)
	{
		coin2=coin2+1;
	cout<<"\n\n\n\n\t\t"<<p1<<"\tCHECKER is\t:\t[\t"<<coin1<<"\t]";

sound(780);   delay(500);   nosound();
	cout<<"\n\n\n\t\t"<<p2<<"\tCHECKER is\t:\t[\t"<<coin2<<"\t]";
 sound(1780);   delay(500); nosound();
	}


clrscr();
cout<<"\n\n\n\n\n\n\n\n\n\n\n\n";
cout<<p1<<"\tU'R SYMBOL IS\t:\t"<<coin1;

cout<<"\n\n\n\n\n\n\n\n\n\n\n\n";
cout<<p2<<"\tU'R SYMBOL IS\t:\t"<<coin2;


	initialise_Ascii();//		to view go to Line:39
sound(780);   delay(100); nosound();

clrscr();

}


 //-----------checking status-----------
	//-------normal_Jump move back or front -----------------
// count 4 accomplished scanned
 void Checkers::normal_Jump()
 {
	if(rd==(rs-1) || (rd==(rs+1)))
	 {
	   if(cd==(cs+1) || cd==(cs-1))
	   {  //the above two if cond give 4 sort of movements
	 // eq:rd,cd=rs-2,cs-2;
      //rs+
      //  +1 ->                                 D   D     // here any one of the case
      //   0 ->                                   S
      //  -1 ->                                 D   D     //is active at a time
      //
      //   
      //   |
      //  row, col->
	 //	                                ^ ^ ^
	 //	                                | | |
	 // cs+                                -1 0+1
		swap();
	   }
	 }
 }

 void Checkers::jump_To_Row2()
 { //a jump to 2nd row in different modes of operation
	//------------------jump step on a coin move front--------
 if(rd==rs-2)
 {//destiny is 2 rows behind
   if(cd==cs-2)
   {//destiny col is 2 col to the left of source
	if(tab[rs-1][cs-1]!=empty_location)
	{//jump validation ok direct jump over row ,col specified b'n source and destiny
	// eq:rd,cd=rs-2,cs-2;
      //rs+
      //   0 ->                                     S
      //  -1 ->                                   *
      //  -2 ->                                 D
      //
      //   
      //   |
      //  row, col->
	 //	                                ^ ^ ^
	 //	                                | | |
	 // cs+                                -2-1 0
		swap();
	}
	if(tab[rs-1][cs+1]!=empty_location && tab[rs-3][cs+1]!=empty_location && tab[rs-3][cs-1]!=empty_location && tab[rs-2][cs+2]==empty_location && tab[rs-4][cs]==empty_location)
	{//jig zac move in 1 way move to jump to a row,col addressed by destiny parameters
       // eq:rd,cd=rs-2,cs-2;
      //rs+
      //   0 ->                                 S
      //  -1 ->                               .    *     . ->indicates that
      //  -2 ->                             D       +        empty location
      //  -3 ->                               *   *
      //  -4 ->                                 +
      //
      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^ ^ ^
	 //	                            | | | | |
	 // cs+                            -2-1 0 1 2
	 swap(tab[rs][cs],tab[rs-2][cs+2]);
	 swap(tab[rs-2][cs+2],tab[rs-4][cs]);
	 swap(tab[rs-4][cs],tab[rd][cd]);

	}
	else if(tab[rs+1][cs-1]!=empty_location && tab[rs+1][cs-3]!=empty_location && tab[rs-1][cs-3]!=empty_location && tab[rs+2][cs-2]==empty_location && tab[rs][cs-4]==empty_location)
	{//jig zac move in  move to jump to a row,col addressed by destiny parameters
      // eq:rd,cd=rs-2,cs-2;
      //rs+
      //   2 ->                             +
      //   1 ->                           *   *
      //   0 ->                         +       S
      //  -1 ->                           *
      //  -2 ->                             D
      //
      //   
      //   |
      //  row, col->
	 //	                        ^ ^ ^ ^ ^
	 //	                        | | | | |
	 // cs+                        -4-3-2-1 0

	 swap(tab[rs][cs],tab[rs+2][cs-2]);
	 swap(tab[rs+2][cs-2],tab[rs][cs-4]);
	 swap(tab[rs][cs-4],tab[rd][cd]);
	}
   }
  else if(cd==cs+2)
  {//destiny col is 2 col right to source
   if(tab[rs-1][cs+1]!=empty_location)
   {//jump validation ok direct jump over row,col b'n source and destiny
	// eq:rd,cd=rs-2,cs+2;
      //rs+
      //   0 ->                                 S
      //  -1 ->                                   *
      //  -2 ->                                     D
      //
      //   
      //   |
      //  row, col->
	 //	                                ^ ^ ^
	 //	                                | | |
	 // cs+                                 0 1 2

	swap();


   }
   else	if(tab[rs-1][cs-1]!=empty_location && tab[rs-3][cs-1]!=empty_location && tab[rs-3][cs+1]!=empty_location && tab[rs-2][cs-2]==empty_location && tab[rs-4][cs]==empty_location)
   {//jig zac move in 1 way in order move to jump to a row,col addressed by destiny parameters
	// eq:rd,cd=rs-2,cs+2;
      //rs+
      //   0 ->                                 S
      //  -1 ->                               *         //+->empty location can't jump over it
      //  -2 ->                             +       D
      //  -3 ->                               *   *
      //  -4 ->                                 +
      //
      //   
      //   |
      //  row, col->
      //	                            ^ ^ ^ ^ ^
      //	                            | | | | |
      // cs+                               -2-1 0 1 2


	// 	+	->	indicate an empty location i.e a valid move  
	// 	*	->	indicate an obstracle to jump over it
	//	S	->	indicate source coin to move from
	//	D	->	indicate destiny coin to move to


	 swap(tab[rs][cs],tab[rs-2][cs-2]);
	 swap(tab[rs-2][cs-2],tab[rs-4][cs]);
	 swap(tab[rs-4][cs],tab[rd][cd]);
   }
   else if(tab[rs+1][cs+1]!=empty_location && tab[rs+1][cs+3]!=empty_location && tab[rs-1][cs+3]!=empty_location && tab[rs+2][cs+2]==empty_location && tab[rs][cs+4]==empty_location)
   {//jig zac move in other move to jump to a row,col addressed by destiny parameters
	 // eq:rd,cd=rs-2,cs+2;

	 //rs+
	 // 2 ->			     +
	 // 1 ->			   *   *
	 // 0 ->			 S       +
	 //-1 ->			       *
	 //-2 ->                             D
	 // 
	 // |
	 //row,col:->
	 //	                         ^ ^ ^ ^ ^
	 //	                         | | | | |
	 //   cs+	                 0 1 2 3 4

	// 	+	->	indicate an empty location i.e a valid move  
	// 	*	->	indicate an obstracle to jump over it
	//	S	->	indicate source coin to move from
	//	D	->	indicate destiny coin to move to

	 swap(tab[rs][cs],tab[rs+2][cs+2]);
	 swap(tab[rs+2][cs+2],tab[rs][cs+4]);
	 swap(tab[rs][cs+4],tab[rd][cd]);

   }


 }


  else if(cd==cs-6)
  {//move to the other left end of the below row

	if(tab[rs-1][cs-1]!=empty_location && tab[rs-1][cs-3]!=empty_location && tab[rs-1][cs-5]!=empty_location && tab[rs-2][cs-2]==empty_location && tab[rs][cs-4]==empty_location)
	{//a move displaying jumping first below then next above upto moving 6 col left
	 // eq:rd,cd=rs-2,cs-6;

	//rs+
	 // 0 ->			     +       S
	 //-1 ->			   *   *   *
	 //-2 ->			 D       +

	 // 
	 // |
	 //row,col:->
	 //	                         ^ ^ ^ ^ ^ ^ ^
	 //	                         | | | | | | |
	 //   cs+	                -6-5-4-3-2-1 0

	// 	+	->	indicate an empty location i.e a valid move  
	// 	*	->	indicate an obstracle to jump over it
	//	S	->	indicate source coin to move from
	//	D	->	indicate destiny coin to move to

	 swap(tab[rs][cs],tab[rs-2][cs-2]);
	 swap(tab[rs-2][cs-2],tab[rs][cs-4]);
	 swap(tab[rs][cs-4],tab[rd][cd]);
	}

       else if(tab[rs+1][cs-1]!=empty_location && tab[rs+1][cs-3]!=empty_location && tab[rs-1][cs-5] !=empty_location && tab[rs+2][cs-2]==empty_location && tab[rs][cs-4]==empty_location)
       {//a move displaying jumping first below then next above upto 6 col right
	 // eq:rd,cd=rs-2,cs-6;
       //rs+
	 //+2 -> 		                 +
	 //+1 ->		       	       *   *
	 //+0 ->			     +       S
	 //-1 ->		 	   *
	 //-2 ->			 D

	 // 
	 // |
	 //row, col:->
	 //	                         ^ ^ ^ ^ ^ ^ ^
	 //	                         | | | | | | |
	 // cs+		                -6-5-4-3-2-1 0
	 swap(tab[rs][cs],tab[rs+2][cs-2]);
	 swap(tab[rs+2][cs-2],tab[rs][cs-4]);
	 swap(tab[rs][cs-4],tab[rd][cd]);
	}


       else if(tab[rs-1][cs-1]!=empty_location && tab[rs-3][cs-3]!=empty_location && tab[rs-3][cs-5] !=empty_location && tab[rs-2][cs-2]==empty_location && tab[rs-4][cs-4]==empty_location)
       {//a move displaying jumping first below then next above upto 6 col right
	 // eq:rd,cd=rs-2,cs-6;
	 //rs+
	 // 0 ->			             S
	 //-1 ->			           *
	 //-2 ->			 D       +
	 //-3 ->	  		   *   *
	 //-4 -> 	        	     +
	 // 
	 // |
	 //row,col:->
	 //	                         ^ ^ ^ ^ ^ ^ ^
	 //	                         | | | | | | |
	 //    cs+                      -6-5-4-3-2-1 0
	 swap(tab[rs][cs],tab[rs-2][cs-2]);
	 swap(tab[rs-2][cs-2],tab[rs-4][cs-4]);
	 swap(tab[rs-4][cs-4],tab[rd][cd]);
	}

  }
  else if(cd==cs+6)
  {//move to the other right end of the below row

	if(tab[rs-1][cs+1]!=empty_location && tab[rs-1][cs+3]!=empty_location && tab[rs-1][cs+5]!=empty_location && tab[rs-2][cs+2]==empty_location && tab[rs][cs+4]==empty_location)
	{//a move displaying jumping first below then next above upto 6 col right

	 // eq:rd,cd=rs-2,cs+6;
	//rs+
	 // 0  ->		         S       +
	 //-1  ->		           *   *   *
	 //-2  ->			     +       D

	 // 
	 // |
	 //row,col:->
	 //	                         ^ ^ ^ ^ ^ ^ ^
	 //	                         | | | | | | |
	 //   cs+                        0 1 2 3 4 5 6

	 swap(tab[rs][cs],tab[rs-2][cs+2]);
	 swap(tab[rs-2][cs+2],tab[rs][cs+4]);
	 swap(tab[rs][cs+4],tab[rd][cd]);
	 }

       else if(tab[rs+1][cs+1]!=empty_location && tab[rs+1][cs+3]!=empty_location && tab[rs-1][cs+5] !=empty_location && tab[rs+2][cs+2]==empty_location && tab[rs][cs+4]==empty_location)
       {//a move displaying jumping first above then next below upto 6 col right
	// eq:rd,cd=rs-2,cs+6;
       //rs+
	 //+2 ->			     +
	 //+1 ->			   *   *
	 //+0 ->			 S       +
	 //-1 ->		        	   *
	 //-2 ->			             D

	 // 
	 // |
	 //row, col:->
	 //                   		 ^ ^ ^ ^ ^ ^ ^
	 //               		 | | | | | | |
	 //  cs+             	         0 1 2 3 4 5 6
	 swap(tab[rs][cs],tab[rs+2][cs+2]);
	 swap(tab[rs+2][cs+2],tab[rs][cs+4]);
	 swap(tab[rs][cs+4],tab[rd][cd]);
	}

       else if(tab[rs-1][cs+1]!=empty_location && tab[rs-3][cs+3]!=empty_location && tab[rs-3][cs+5] !=empty_location && tab[rs-2][cs+2]==empty_location && tab[rs-4][cs+4]==empty_location)
       {//a move displaying jumping first above then next below upto 6 col right

	 // eq:rd,cd=rs-2,cs+6;
       //rs+
	 // 0 ->			 S
	 //-1 ->               	    	   *
	 //-2 ->			     +       D
	 //-3 ->                      	       *   *
	 //-4 ->                       		 +
	 // 
	 // |
	 //row,col:->
	 //                  	 	 ^ ^ ^ ^ ^ ^ ^
	 //                		 | | | | | | |
	 //   cs+         	   	 0 1 2 3 4 5 6
	 swap(tab[rs][cs],tab[rs-2][cs+2]);
	 swap(tab[rs-2][cs+2],tab[rs-4][cs+4]);
	 swap(tab[rs-4][cs+4],tab[rd][cd]);
	 }

  }



 }

	//--------------jump step on a coin move back--------------------


 else if(rd==(rs+2))
 {//destiny is 2 rows ahead
   if(cd==cs-2)
    {//destiny col is 2 col to the left of source
	if(tab[rs+1][cs-1]!=empty_location)
	{//jump validation ok direct jump over row ,col specified b'n source and destiny
	// eq:rd,cd=rs+2,cs-2;
      //rs+
      //   2 ->                                 D
      //   1 ->                                   *
      //   0 ->                                     S
      //
      //   
      //   |
      //  row, col->
	 //	                                ^ ^ ^
	 //	                                | | |
	 // cs+                                -2-1 0

		swap();
	}
	if(tab[rs+1][cs+1]!=empty_location && tab[rs+3][cs+1]!=empty_location && tab[rs+3][cs-1]!=empty_location && tab[rs+2][cs+2]==empty_location && tab[rs+4][cs]==empty_location)
	{//jig zac move in 1 way move to jump to a row,col addressed by destiny parameters
      // eq:rd,cd=rs+2,cs-2;
      //rs+
      //   4 ->                                 +
      //   3 ->                               *   *
      //   2 ->                             D       +
      //   1 ->                                   *
      //   0 ->                                 S
      //
      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^ ^ ^
	 //	                            | | | | |
	 // cs+                            -2-1 0 1 2


	 swap(tab[rs][cs],tab[rs+2][cs+2]);
	 swap(tab[rs+2][cs+2],tab[rs+4][cs]);
	 swap(tab[rs+4][cs],tab[rd][cd]);
	}
	else if(tab[rs-1][cs-1]!=empty_location && tab[rs-1][cs-3]!=empty_location && tab[rs+1][cs-3]!=empty_location && tab[rs-2][cs-2]==empty_location && tab[rs][cs-4]==empty_location)
	{//jig zac move in other move to jump to a row,col addressed by destiny parameters
      // eq:rd,cd=rs+2,cs-2;
      //rs+
      //   2 ->                                 D
      //   1 ->                               *
      //   0 ->                             +       S
      //  -1 ->                               *   *
      //  -2 ->                                 +
      //
      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^ ^ ^
	 //	                            | | | | |
	 // cs+                            -4-3-2-1 0

	 swap(tab[rs][cs],tab[rs-2][cs-2]);
	 swap(tab[rs-2][cs-2],tab[rs][cs-4]);
	 swap(tab[rs][cs-4],tab[rd][cd]);
	}


   }
  else if(cd==cs+2)
  {//destiny col is 2 col right to source
	 if(tab[rs+1][cs+1]!=empty_location)
	 {//jump validation ok direct jump over row ,col specified b'n source and destiny
	// eq:rd,cd=rs+2,cs+2;
      //rs+
      //   2 ->                                     D
      //   1 ->                                   *
      //   0 ->                                 S
      //
      //   
      //   |
      //  row, col->
	 //	                                ^ ^ ^
	 //	                                | | |
	 // cs+                                 0 1 2


		swap();
	 }
	 if(tab[rs+1][cs-1]!=empty_location && tab[rs+3][cs-1]!=empty_location && tab[rs+3][cs+1]!=empty_location && tab[rs+2][cs-2]==empty_location && tab[rs+4][cs]==empty_location)
	 {//jig zac move in 1 way move to jump to a row,col addressed by destiny parameters
      // eq:rd,cd=rs+2,cs+2;
      //rs+
      //   4 ->                                 +
      //   3 ->                               *   *
      //   2 ->                             +       D
      //   1 ->                               *
      //   0 ->                                 S
      //
      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^ ^ ^
	 //	                            | | | | |
	 // cs+                            -2-1 0 1 2

	 swap(tab[rs][cs],tab[rs+2][cs-2]);
	 swap(tab[rs+2][cs-2],tab[rs+4][cs]);
	 swap(tab[rs+4][cs],tab[rd][cd]);
	 }


	else if(tab[rs-1][cs+1]!=empty_location && tab[rs-1][cs+3]!=empty_location && tab[rs+1][cs+3]!=empty_location && tab[rs-2][cs+2]==empty_location && tab[rs][cs+4]==empty_location)
	{//jig zac move in other move to jump to a row,col addressed by destiny parameters
      // eq:rd,cd=rs+2,cs+2;
      //rs+
      //   2 ->                                 D
      //   1 ->                                   *
      //   0 ->                             S       +
      //  -1 ->                               *   *
      //  -2 ->                                 +
      //
      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^ ^ ^
	 //	                            | | | | |
	 // cs+                             0 1 2 3 4

	 swap(tab[rs][cs],tab[rs-2][cs+2]);
	 swap(tab[rs-2][cs+2],tab[rs][cs+4]);
	 swap(tab[rs][cs+4],tab[rd][cd]);
	}

  }
  else if(cd==cs-6)
  {//move to the other left end of the above row
	if(tab[rs+1][cs-1]!=empty_location && tab[rs+1][cs-3]!=empty_location && tab[rs+1][cs-5]!=empty_location && tab[rs+2][cs-2]==empty_location && tab[rs][cs-4]==empty_location)
	{//a move displaying jumping first above then next below upto 6 col right
	 // eq:rd,cd=rs+2,cs-6;
       // rs+
	 // 2 ->			 D       +
	 // 1 ->			   *   *   *
	 // 0 ->			     +       S

	 // 
	 // |
	 //row,col:->
	 //	                         ^ ^ ^ ^ ^ ^ ^
	 //	                         | | | | | | |
	 //    cs+                      -6-5-4-3-2-1 0
	 swap(tab[rs][cs],tab[rs+2][cs-2]);
	 swap(tab[rs+2][cs-2],tab[rs][cs-4]);
	 swap(tab[rs][cs-4],tab[rd][cd]);
	}
       else if(tab[rs-1][cs-1]!=empty_location && tab[rs-1][cs-3]!=empty_location && tab[rs+1][cs-5] !=empty_location && tab[rs-2][cs-2]==empty_location && tab[rs][cs-4]==empty_location)
       {//a move displaying jumping first below then next above upto 6 col left
	 // eq:rd,cd=rs+2,cs-6;

	 //+2 -> 		         D
	 //+1 ->		       	   *
	 //+0 ->			     +       S
	 //-1 ->		 	       *   *
	 //-2 ->                                 +
	 // 
	 // |
	 //row
	 //	                         ^ ^ ^ ^ ^ ^ ^
	 //	                         | | | | | | |
	 //	 col:->                 -6-5-4-3-2-1 0
	 swap(tab[rs][cs],tab[rs-2][cs-2]);
	 swap(tab[rs-2][cs-2],tab[rs][cs-4]);
	 swap(tab[rs][cs-4],tab[rd][cd]);
	}
      else if(tab[rs+1][cs-1]!=empty_location && tab[rs+3][cs-3]!=empty_location && tab[rs+3][cs-5] !=empty_location && tab[rs+2][cs+2]==empty_location && tab[rs+4][cs+4]==empty_location)
       {//a move displaying jumping first below then next above upto 6 col right
	 // eq:rd,cd=rs+2,cs-6;
       // rs+
	 // 4 ->			     +
	 // 3 ->			   *   *
	 // 2 ->			 D       +
	 // 1 ->                                   *
	 // 0 ->                                     S
	 // 
	 // |
	 //row,col->

	 //	                         ^ ^ ^ ^ ^ ^ ^
	 //	                         | | | | | | |
	 //	 cs+                    -6-5-4-3-2-1 0
	 swap(tab[rs][cs],tab[rs+2][cs+2]);
	 swap(tab[rs+2][cs+2],tab[rs][cs+4]);
	 swap(tab[rs][cs+4],tab[rd][cd]);


	 }

  }
  else if(cd==cs+6)
  {//move to the other right end of the above row
	if(tab[rs+1][cs+1]!=empty_location && tab[rs+1][cs+3]!=empty_location && tab[rs+1][cs+5]!=empty_location && tab[rs+2][cs+2]==empty_location && tab[rs][cs+4]==empty_location)
	{//a move displaying jumping first above then next below upto 6 col right
	  // eq:rd,cd=rs+2,cs+6;
      //rs+
      //   2 ->                                 +       D
      //   1 ->                               *   *   *
      //   0 ->                             S       +
      //  -1 ->
      //  -2 ->
      //
      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^ ^ ^ ^ ^
	 //	                            | | | | | | |
	 // cs+                             0 1 2 3 4 5	6
	  swap(tab[rs][cs],tab[rs+2][cs+2]);
	 swap(tab[rs+2][cs+2],tab[rs][cs+4]);
	 swap(tab[rs][cs+4],tab[rd][cd]);
	}
	else if(tab[rs-1][cs+1]!=empty_location && tab[rs-1][cs+3]!=empty_location && tab[rs+1][cs+5] !=empty_location && tab[rs-2][cs+2]==empty_location && tab[rs][cs+4]==empty_location)
	{//a move displaying jumping first below then next above upto 6 col right

	  // eq:rd,cd=rs+2,cs+6;
      //rs+
      //   2 ->                                         D
      //   1 ->                                       *
      //   0 ->                             S       +
      //  -1 ->                               *   *
      //  -2 ->                                 +
      //
      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^ ^ ^ ^ ^
	 //	                            | | | | | | |
	 // cs+                             0 1 2 3 4 5	6
	 swap(tab[rs][cs],tab[rs-2][cs+2]);
	 swap(tab[rs-2][cs+2],tab[rs][cs+4]);
	 swap(tab[rs][cs+4],tab[rd][cd]);
	}
  }
 }

 } // count 23 accomplished  scanned errors

    //---------------------******** double jump *******---------------------------------
//count 8
void Checkers::doubleJump_To_Row4()
{

 if(rd==(rs-4))
 {
   if(cd==cs-4)
   {
     if((tab[rs-1][cs-1]!=empty_location) && (tab[rs-3][cs-3]!=empty_location) && (tab[rs-2][cs-2]==empty_location))
     {//valid move
	  // eq:rd,cd=rs-4,cs-4;
      //rs+
      //   0 ->                                     S
      //  -1 ->                                   *
      //  -2 ->                                 +
      //  -3 ->                               *
      //  -4 ->                             D
      //
      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^ ^ ^
	 //	                            | | | | |
	 // cs+                            -4-3-2-1 0

	 swap(tab[rs][cs],tab[rs-2][cs-2]);
	 swap(tab[rs-2][cs-2],tab[rd][cd]);
     }
   }
  else if(cd==cs+4)
  {
   if((tab[rs-1][cs+1]!=empty_location) && (tab[rs-3][cs+3]!=empty_location) && (tab[rs-2][cs+2]==empty_location))
   {//valid move
       // eq:rd,cd=rs-4,cs+4;

       // rs+
	 // 0 ->			 S
	 //-1 ->			   *
	 //-2 ->			     +
	 //-3 ->                               *
	 //-4 ->                                 D
	 // 
	 // |
	 //row,col->

	 //	                         ^ ^ ^ ^ ^
	 //	                         | | | | |
	 //	 cs+                     0 1 2 3 4


	 swap(tab[rs][cs],tab[rs-2][cs+2]);
	 swap(tab[rs-2][cs+2],tab[rd][cd]);

   }
  }
  else if(cd==cs)
   {
     if((tab[rs-1][cs+1]!=empty_location) && (tab[rs-3][cs+1]!=empty_location) && (tab[rs-2][cs+2]==empty_location))
     {//valid move

       // eq:rd,cd=rs-4,cs;
      //rs+
      //   0 ->                             S
      //  -1 ->                               *
      //  -2 ->                                 +
      //  -3 ->                               *
      //  -4 ->                             D
      //
      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^
	 //	                            | | |
	 // cs+                             0 1 2



	 swap(tab[rs][cs],tab[rs-2][cs+2]);
	 swap(tab[rs-2][cs+2],tab[rd][cd]);
     }
    else if((tab[rs-1][cs-1]!=empty_location) && (tab[rs-3][cs-1]!=empty_location) && (tab[rs-2][cs-2]==empty_location))
     {//valid move
      // eq:rd,cd=rs-4,cs;
      //rs+
      //   0 ->                                 S
      //  -1 ->                               *
      //  -2 ->                             +
      //  -3 ->                               *
      //  -4 ->                                 D
      //
      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^
	 //	                            | | |
	 // cs+                            -2-1 0

	 swap(tab[rs][cs],tab[rs-2][cs-2]);
	 swap(tab[rs-2][cs-2],tab[rd][cd]);

     }
   }
 }



	   //---------------back move------double jump-----
 else if(rd==(rs+4))
 {
  if(cd==cs-4)
  {
   if((tab[rs+1][cs-1]!=empty_location) && (tab[rs+3][cs-3]!=empty_location) && (tab[rs+2][cs-2]==empty_location))
   {//valid move
       // eq:rd,cd=rs+4,cs-4;
      // rs+
	 // 4 ->			 D
	 // 3 ->			   *
	 // 2 ->			     +
	 // 1 ->                               *
	 // 0 ->                                 S
	 // 
	 // |
	 //row,col->

	 //	                         ^ ^ ^ ^ ^
	 //	                         | | | | |
	 //	 cs+                    -4-3-2-1 0


	 swap(tab[rs][cs],tab[rs+2][cs-2]);
	 swap(tab[rs+2][cs-2],tab[rd][cd]);
     }
   }
   else if(cd==cs+4)
   {
   if((tab[rs+1][cs+1]!=empty_location) && (tab[rs+3][cs+3]!=empty_location) && (tab[rs+2][cs+2]==empty_location))
   {//valid move
		// eq:rd,cd=rs+4,cs+4;

       // rs+
	 // 4 ->                                 D
	 // 3 ->                               *
	 // 2 ->			     +
	 // 1 ->                           *
	 // 0 ->                         S
	 // 
	 // |
	 //row,col->

	 //	                         ^ ^ ^ ^ ^
	 //	                         | | | | |
	 //	 cs+                     0 1 2 3 4



	 swap(tab[rs][cs],tab[rs+2][cs+2]);
	 swap(tab[rs+2][cs+2],tab[rd][cd]);
   }
   }

   else if(cd==cs)
   {
     if((tab[rs+1][cs+1]!=empty_location) && (tab[rs+3][cs+1]!=empty_location) && (tab[rs+2][cs+2]==empty_location))
     {//valid move
	   // eq:rd,cd=rs+4,cs;
      //rs+
      //   4 ->                             D
      //   3 ->                               *
      //   2 ->                                 +
      //   1 ->                               *
      //   0 ->                             S
      //
      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^
	 //	                            | | |
	 // cs+                             0 1 2

	 swap(tab[rs][cs],tab[rs+2][cs+2]);
	 swap(tab[rs+2][cs+2],tab[rd][cd]);

     }
     else if((tab[rs+1][cs-1]!=empty_location) && (tab[rs+3][cs-1]!=empty_location) && (tab[rs+2][cs-2]==empty_location))
     {//valid move
	   // eq:rd,cd=rs+4,cs;
      //rs+
      //   4 ->                                 D
      //   3 ->                               *
      //   2 ->                             +
      //   1 ->                               *
      //   0 ->                                 S
      //
      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^
	 //	                            | | |
	 // cs+                            -2-1 0

	 swap(tab[rs][cs],tab[rs+2][cs-2]);
	 swap(tab[rs+2][cs-2],tab[rd][cd]);


     }
   }
 }


}
//--------------------staight when row source and destination are the same
//count 4 accomplished scanned errors
void Checkers::strightJump_To_Same_Row()
{
 if(rs==rd)
 {
   if(cd==cs-4)
   {

     if((tab[rs-1][cs-1]!=empty_location) && (tab[rs-1][cs-3]!=empty_location) && (tab[rs-2][cs-2]==empty_location))
     {//valid move
	// eq:rd,cd=rs-2,cs+6;
       //rs+
	 // 0 ->                         D       S
	 //-1 ->                           *   *
	 //-2 ->                             +

	 // 
	 // |
	 //row,col:->
	 //                  	 	 ^ ^ ^ ^ ^
	 //                		 | | | | |
	 //   cs+         	        -4-3-2-1 0


	 swap(tab[rs][cs],tab[rs-2][cs-2]);
	 swap(tab[rs-2][cs-2],tab[rd][cd]);
     }
    else if((tab[rs+1][cs-1]!=empty_location) && (tab[rs+1][cs-3]!=empty_location) && (tab[rs+2][cs-2]==empty_location))
     {//valid move
	// eq:rd,cd=rs-2,cs+6;
       //rs+
	 // 2 ->                             +
	 // 1 ->                           *   *
	 // 0 ->                         D       S

	 // 
	 // |
	 //row,col:->
	 //                  	 	 ^ ^ ^ ^ ^
	 //                		 | | | | |
	 //   cs+         	   	-4-3-2-1 0


	 swap(tab[rs][cs],tab[rs+2][cs-2]);
	 swap(tab[rs+2][cs-2],tab[rd][cd]);
     }
   }
   else if(cd=cs+4)
   {
     if((tab[rs-1][cs+1]!=empty_location) && (tab[rs-1][cs+3]!=empty_location) && (tab[rs-2][cs+2]==empty_location))
     {//valid move
	// eq:rd,cd=rs-2,cs+6;
       //rs+
	 // 0 ->                         S       D
	 //-1 ->                           *   *
	 //-2 ->                             +

	 // 
	 // |
	 //row,col:->
	 //                  	 	 ^ ^ ^ ^ ^
	 //                		 | | | | |
	 //   cs+         	   	 0 1 2 3 4


	 swap(tab[rs][cs],tab[rs-2][cs+2]);
	 swap(tab[rs-2][cs+2],tab[rd][cd]);

     }
     else if((tab[rs+1][cs+1]!=empty_location) && (tab[rs+1][cs+3]!=empty_location) && (tab[rs+2][cs+2]==empty_location))
     {//valid move
	// eq:rd,cd=rs-2,cs+6;
       //rs+
	 // 2 ->                             +
	 // 1 ->                           *   *
	 // 0 ->                         S       D

	 // 
	 // |
	 //row,col:->
	 //                  	 	 ^ ^ ^ ^ ^
	 //                		 | | | | |
	 //   cs+         	   	 0 1 2 3 4


	 swap(tab[rs][cs],tab[rs+2][cs+2]);
	 swap(tab[rs+2][cs+2],tab[rd][cd]);
     }
  }

 }



}

//--------------------------	technical moves	    forward a head	---------------
//**count 17---->check one cond is mis

void Checkers::technicalJump_To_Row6()
{


 if(rd==(rs-6))
{
	//------------------------  LEFT MOVES   ----------------
  if(cd==(cs-6))
  {
    if(tab[rs-1][cs-1]!=empty_location && tab[rs-3][cs-3]!=empty_location && tab[rs-5][cs-5]!=empty_location && tab[rs-2][cs-2]==empty_location && tab[rs-4][cs-4]==empty_location)
    {//valid move

	  // eq:rd,cd=rs-6,cs-6;
      //rs+
      //   0 ->                                         S
      //  -1 ->                                       *
      //  -2 ->                                     +
      //  -3 ->                                   *
      //  -4 ->                                 +
      //  -5 ->                               *
      //  -6 ->				    D

      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^ ^ ^ ^ ^
	 //	                            | | | | | | |
	 // cs+                            -6-5-4-3-2-1 0

	 swap(tab[rs][cs],tab[rs-2][cs-2]);
	 swap(tab[rs-2][cs-2],tab[rs-4][cs-4]);
	 swap(tab[rs-4][cs-4],tab[rd][cd]);

    }
  }
  else if(cd==(cs-2))
  {
    if(tab[rs-1][cs+1]!=empty_location && tab[rs-3][cs+1]!=empty_location && tab[rs-5][cs-1]!=empty_location && tab[rs-2][cs+2]==empty_location && tab[rs-4][cs]==empty_location)
    {//valid move
	  // eq:rd,cd=rs-6,cs-2;
      //rs+
      //   0 ->                                     S
      //  -1 ->                                       *
      //  -2 ->                                         +
      //  -3 ->                                       *
      //  -4 ->                                     +
      //  -5 ->                                   *
      //  -6 ->				        D

      //   
      //   |
      //  row, col->
	 //	                                ^ ^ ^ ^ ^
	 //	                                | | | | |
	 // cs+                                -2-1 0 1 2
	 swap(tab[rs][cs],tab[rs-2][cs+2]);
	 swap(tab[rs-2][cs+2],tab[rs-4][cs]);
	 swap(tab[rs-4][cs],tab[rd][cd]);


    }
    else if(tab[rs-1][cs-1]!=empty_location && tab[rs-3][cs-3]!=empty_location && tab[rs-5][cs-3]!=empty_location && tab[rs-2][cs-2]==empty_location && tab[rs-4][cs-4]==empty_location)
    {//valid move
	  // eq:rd,cd=rs-6,cs-2;
      //rs+
      //   0 ->                                       S
      //  -1 ->                                     *
      //  -2 ->                                   +
      //  -3 ->                                 *
      //  -4 ->                               +
      //  -5 ->                                 *
      //  -6 ->				          D

      //   
      //   |
      //  row, col->
	 //	                              ^ ^ ^ ^ ^
	 //	                              | | | | |
	 // cs+                              -4-3-2-1 0

	 swap(tab[rs][cs],tab[rs-2][cs-2]);
	 swap(tab[rs-2][cs-2],tab[rs-4][cs-4]);
	 swap(tab[rs-4][cs-4],tab[rd][cd]);

     }
    else if(tab[rs-1][cs-1]!=empty_location && tab[rs-3][cs-1]!=empty_location && tab[rs-5][cs-1]!=empty_location && tab[rs-2][cs-2]==empty_location && tab[rs-4][cs]==empty_location)
    {//valid move
	  // eq:rd,cd=rs-6,cs-2;
      //rs+
      //   0 ->                                     S
      //  -1 ->                                   *
      //  -2 ->                                 +
      //  -3 ->                                   *
      //  -4 ->                                     +
      //  -5 ->                                   *
      //  -6 ->				        D

      //   
      //   |
      //  row, col->
	 //	                                ^ ^ ^
	 //	                                | | |
	 // cs+                                -2-1 0

	 swap(tab[rs][cs],tab[rs-2][cs-2]);
	 swap(tab[rs-2][cs-2],tab[rs-4][cs]);
	 swap(tab[rs-4][cs],tab[rd][cd]);
     }
  }

 //------------------------  RIGHT MOVES   ----------------
  else if(cd==(cs+6))
  {
    if(tab[rs-1][cs+1]!=empty_location && tab[rs-3][cs+3]!=empty_location && tab[rs-5][cs+5]!=empty_location && tab[rs-2][cs+2]==empty_location && tab[rs-4][cs+4]==empty_location)
    {//valid move
	  // eq:rd,cd=rs-6,cs+6;
      //rs+
      //   0 ->                             S
      //  -1 ->                               *
      //  -2 ->                                 +
      //  -3 ->                                   *
      //  -4 ->                                     +
      //  -5 ->                                       *
      //  -6 ->				                D

      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^ ^ ^ ^ ^
	 //	                            | | | | | | |
	 // cs+                             0 1 2 3 4 5 6

	 swap(tab[rs][cs],tab[rs-2][cs+2]);
	 swap(tab[rs-2][cs+2],tab[rs-4][cs+4]);
	 swap(tab[rs-4][cs+4],tab[rd][cd]);
    }
  }
  else if(cd==(cs+2))
  {
    if(tab[rs-1][cs-1]!=empty_location && tab[rs-3][cs-1]!=empty_location && tab[rs-5][cs+1]!=empty_location && tab[rs-2][cs-2]==empty_location && tab[rs-4][cs]==empty_location)
    {//valid move
      // eq:rd,cd=rs-6,cs+2;
      //rs+
      //   0 ->                                 S
      //  -1 ->                               *
      //  -2 ->                             +
      //  -3 ->                               *
      //  -4 ->                                 +
      //  -5 ->                                   *
      //  -6 ->				            D

      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^ ^ ^
	 //	                            | | | | |
	 // cs+                            -2-1 0 1 2


	 swap(tab[rs][cs],tab[rs-2][cs-2]);
	 swap(tab[rs-2][cs-2],tab[rs-4][cs]);
	 swap(tab[rs-4][cs],tab[rd][cd]);
     }
    else if(tab[rs-1][cs+1]!=empty_location && tab[rs-3][cs+3]!=empty_location && tab[rs-5][cs+3]!=empty_location && tab[rs-2][cs+2]==empty_location && tab[rs-4][cs+4]==empty_location)
    {//valid move
      // eq:rd,cd=rs-6,cs+2;
      //rs+
      //   0 ->                                 S
      //  -1 ->                                   *
      //  -2 ->                                     +
      //  -3 ->                                       *
      //  -4 ->                                         +
      //  -5 ->                                       *
      //  -6 ->				            D

      //   
      //   |
      //  row, col->
	 //	                                ^ ^ ^ ^ ^
	 //	                                | | | | |
	 // cs+                                 0 1 2 3 4


	 swap(tab[rs][cs],tab[rs-2][cs+2]);
	 swap(tab[rs-2][cs+2],tab[rs-4][cs+4]);
	 swap(tab[rs-4][cs+4],tab[rd][cd]);

    }
    else if(tab[rs-1][cs+1]!=empty_location && tab[rs-3][cs+1]!=empty_location && tab[rs-5][cs+1]!=empty_location && tab[rs-2][cs+2]==empty_location && tab[rs-4][cs]==empty_location)
    {//valid move
      // eq:rd,cd=rs-6,cs+2;
      //rs+
      //   0 ->                                 S
      //  -1 ->                                   *
      //  -2 ->                                     +
      //  -3 ->                                   *
      //  -4 ->                                 +
      //  -5 ->                                   *
      //  -6 ->				            D

      //   
      //   |
      //  row, col->
	 //	                                ^ ^ ^
	 //	                                | | |
	 // cs+                                 0 1 2


	 swap(tab[rs][cs],tab[rs-2][cs+2]);
	 swap(tab[rs-2][cs+2],tab[rs-4][cs]);
	 swap(tab[rs-4][cs],tab[rd][cd]);

    }
  }



}




//---------------------		technical moves backward 	-------------------------------------

else if(rd==(rs+6))
{
 //------------------------  RIGHT MOVES   ----------------
  if(cd==(cs-6))
  {
    if(tab[rs+1][cs-1]!=empty_location && tab[rs+3][cs-3]!=empty_location && tab[rs+5][cs-5]!=empty_location && tab[rs+2][cs-2]==empty_location && tab[rs+4][cs-4]==empty_location)
    {//valid move
	  // eq:rd,cd=rs+6,cs-6;
      //rs+
      //   6 ->                             D
      //   5 ->                               *
      //   4 ->                                 +
      //   3 ->                                   *
      //   2 ->                                     +
      //   1 ->                                       *
      //   0 ->				                S

      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^ ^ ^ ^ ^
	 //	                            | | | | | | |
	 // cs+                            -6-5-4-3-2-1 0

	 swap(tab[rs][cs],tab[rs+2][cs-2]);
	 swap(tab[rs+2][cs-2],tab[rs+4][cs-4]);
	 swap(tab[rs+4][cs-4],tab[rd][cd]);

    }
  }
  else if(cd==(cs-2))
  {
    if(tab[rs+1][cs+1]!=empty_location && tab[rs+3][cs+1]!=empty_location && tab[rs+5][cs-1]!=empty_location && tab[rs+2][cs+2]==empty_location && tab[rs+4][cs]==empty_location)
    {//valid move
		  // eq:rd,cd=rs+6,cs-2;
      //rs+
      //   6 ->                                 D
      //   5 ->                                   *
      //   4 ->                                     +
      //   3 ->                                       *
      //   2 ->                                         +
      //   1 ->                                       *
      //   0 ->                                     S

      //   
      //   |
      //  row, col->
	 //	                                ^ ^ ^ ^ ^
	 //	                                | | | | |
	 // cs+                                -2-1 0 1 2

	 swap(tab[rs][cs],tab[rs+2][cs+2]);
	 swap(tab[rs+2][cs+2],tab[rs+4][cs]);
	 swap(tab[rs+4][cs],tab[rd][cd]);

    }

    else if(tab[rs+1][cs-1]!=empty_location && tab[rs+3][cs-3]!=empty_location && tab[rs+5][cs-3]!=empty_location && tab[rs+2][cs-2]==empty_location && tab[rs+4][cs-4]==empty_location)
    {//valid move
		  // eq:rd,cd=rs+6,cs-2;
      //rs+
      //   6 ->                                 D
      //   5 ->                               *
      //   4 ->                            +
      //   3 ->                              *
      //   2 ->                                +
      //   1 ->                                  *
      //   0 ->                                    S

      //   
      //   |
      //  row, col->
	 //	                           ^ ^ ^ ^ ^
	 //	                           | | | | |
	 // cs+                           -4-3-2-1 0


	 swap(tab[rs][cs],tab[rs+2][cs-2]);
	 swap(tab[rs+2][cs-2],tab[rs+4][cs-4]);
	 swap(tab[rs+4][cs-4],tab[rd][cd]);

    }

    else if(tab[rs+1][cs-1]!=empty_location && tab[rs+3][cs-1]!=empty_location && tab[rs+5][cs-1]!=empty_location && tab[rs+2][cs-2]==empty_location && tab[rs+4][cs]==empty_location)
    {//valid move
		  // eq:rd,cd=rs+6,cs-2;
      //rs+
      //   6 ->                                 D
      //   5 ->                                   *
      //   4 ->                                     +
      //   3 ->                                   *
      //   2 ->                                 +
      //   1 ->                                   *
      //   0 ->                                     S

      //   
      //   |
      //  row, col->
	 //	                                ^ ^ ^
	 //	                                | | |
	 // cs+                                -2-1 0

	 swap(tab[rs][cs],tab[rs+2][cs+2]);
	 swap(tab[rs+2][cs-2],tab[rs+4][cs]);
	 swap(tab[rs+4][cs],tab[rd][cd]);

    }

  }


 //------------------------  LEFT MOVES   ----------------
  else if(cd==(cs+6))
  {
    if(tab[rs+1][cs+1]!=empty_location && tab[rs+3][cs+3]!=empty_location && tab[rs+5][cs+5]!=empty_location && tab[rs+2][cs+2]==empty_location && tab[rs+4][cs+4]==empty_location)
    {//valid move
	  // eq:rd,cd=rs+6,cs+6;
      //rs+
      //  6 ->                                          D
      //  5 ->                                        *
      //  4 ->                                      +
      //  3 ->                                    *
      //  2 ->                                  +
      //  1 ->                                *
      //  0 ->				    S
      //   
      //   |
      //  row, col->
	 //	                            ^ ^ ^ ^ ^ ^ ^
	 //	                            | | | | | | |
	 // cs+                             0 1 2 3 4 5 6
	 swap(tab[rs][cs],tab[rs+2][cs+2]);
	 swap(tab[rs+2][cs+2],tab[rs+4][cs+4]);
	 swap(tab[rs+4][cs+4],tab[rd][cd]);
      }
  }
  else if(cd==(cs+2))
  {
    if(tab[rs+1][cs-1]!=empty_location && tab[rs+3][cs-1]!=empty_location && tab[rs+5][cs+1]!=empty_location && tab[rs+2][cs-2]==empty_location && tab[rs+4][cs]==empty_location)
    {//valid move
	  // eq:rd,cd=rs+6,cs+2;
      //rs+
      //  6 ->                                          D
      //  5 ->                                        *
      //  4 ->                                      +
      //  3 ->                                    *
      //  2 ->                                  +
      //  1 ->                                    *
      //  0 ->				            S
      //   
      //   |
      //  row, col->
	 //	                                ^ ^ ^ ^ ^
	 //	                                | | | | |
	 // cs+                                -2-1 0 1 2
	 swap(tab[rs][cs],tab[rs+2][cs-2]);
	 swap(tab[rs+2][cs-2],tab[rs+4][cs]);
	 swap(tab[rs+4][cs],tab[rd][cd]);
    }
    else if(tab[rs+1][cs+1]!=empty_location && tab[rs+3][cs+3]!=empty_location && tab[rs+5][cs+3]!=empty_location && tab[rs+2][cs+2]==empty_location && tab[rs+4][cs+4]==empty_location)
    {//valid move
	  // eq:rd,cd=rs+6,cs+2;
      //rs+
      //  6 ->                                     D
      //  5 ->                                       *
      //  4 ->                                         +
      //  3 ->                                       *
      //  2 ->                                     +
      //  1 ->                                   *
      //  0 ->				       S

      //   
      //   |
      //  row, col->
	 //	                               ^ ^ ^ ^ ^
	 //	                               | | | | |
	 // cs+                                0 1 2 3 4

	 swap(tab[rs][cs],tab[rs+2][cs+2]);
	 swap(tab[rs+2][cs+2],tab[rs+4][cs+4]);
	 swap(tab[rs+4][cs+4],tab[rd][cd]);
     }
    else if(tab[rs+1][cs+1]!=empty_location && tab[rs+3][cs+1]!=empty_location && tab[rs+5][cs+1]!=empty_location && tab[rs+2][cs+2]==empty_location && tab[rs+4][cs]==empty_location)
    {//valid move
	  // eq:rd,cd=rs+6,cs+2;
      //rs+
      //  6 ->                                     D
      //  5 ->                                   *
      //  4 ->                                 +
      //  3 ->                                   *
      //  2 ->                                     +
      //  1 ->                                   *
      //  0 ->				       S

      //   
      //   |
      //  row, col->
	 //	                               ^ ^ ^
	 //	                               | | |
	 // cs+                                0 1 2
	 swap(tab[rs][cs],tab[rs+2][cs+2]);
	 swap(tab[rs+2][cs+2],tab[rs+4][cs]);
	 swap(tab[rs+4][cs],tab[rd][cd]);

     }
  }


  }

  }



  void Checkers::swap()
  {
    char temp;
   temp=tab[rd][cd];
   tab[rd][cd]=tab[rs][cs];
   tab[rs][cs]=temp;
   valid=1;
   display_Board();
  }



  void Checkers::swap(char &ele1,char  &ele2)
  {
    char temp;
    temp=ele1;
    ele1=ele2;
    ele2=temp;
   valid=1;
   display_Board();
   sound(A);delay(500);nosound();
   }
   void Checkers::source_Design()
   {

	valid=0;
   do{              //source validity
	rs=8;cs=8;//source is made invalid
	rd=8;cd=8;//destiny is made in valid
	display_Board();

	cout<<my_player<<"\tmove\t:\t";
	cout<<"\n\t SOURCE\t:\t ROW\t,"<<"\tCOL\t[\t\t]\b\b\b\b\b\b\b\b";
		       sound(A);delay(500);nosound();
	cin>>r_s;
	cin>>c_s;
	if(r_s=='.' || c_s=='.')
		menu();

	rs=convertion_Row(r_s);
	cs=convertion_Col(c_s);

	if ((rs<8 && rs>=0 ) && ( cs<8 && cs>=0) )
	{ //  source bound in
		if(tab[rs][cs]==my_coin)
		{      	valid=1;
			display_Board();
		}
		else
		{
	      display_Board();
	      cout<<"\n\n\t\tINVALID SOURCE\t:\t[\t"<<tab[rs][cs]<<"\t]\n";
	     sound(D);delay(500);nosound();
		}
	}
	else
	{
		 display_Board();
		 cout<<"\n\t\t\tINVALID MOVE\n\t";
		 sound(E);delay(500);nosound();
	}

    }while(valid==0);//until a success move


   }

   void Checkers::destiny_Design()
   {
	valid=0;
   do{         //destiny validity check

	rd=8;cd=8;//destiny is made in valid
	display_Board();
	cout<<my_player<<"\tmove\t:\t";
	cout<<"\n\t DESTINY\t:\t ROW\t,"<<"\tCOL\t[\t\t]\b\b\b\b\b\b\b\b";
	cin>>r_d;
	cin>>c_d;

	if(r_d=='.' || c_d=='.')
		menu();

	if(r_d=='s' || c_d=='s')
		source_Design();

	rd=convertion_Row(r_d);
	cd=convertion_Col(c_d);

	if ((rd<8 && rd>=0 ) && ( cd<8 && cd>=0) )
	{ // destiny bound in
		if(tab[rd][cd]==empty_location)
		{   //validating destiny

		normal_Jump();
		jump_To_Row2();
		strightJump_To_Same_Row();
		doubleJump_To_Row4();
		technicalJump_To_Row6();
		}
		else
		{
	      display_Board();
	      cout<<"\n\n\t\tINVALID DESTINY\t:\t[\t"<<tab[rd][cd]<<"\t]\n";
		 sound(C);delay(500);nosound();
			}
	}
	else
	{
		 display_Board();
		 cout<<"\n\t\t\tINVALID MOVE\n\t";
		    sound(D);delay(500);nosound();
	}

    }while(valid==0);//until a success move




   }
//-------------------------------move player1--------------------------------

 void Checkers::move()
{
       source_Design();
       destiny_Design();

}


//-----------------game starts-------------------------
 void Checkers::game()
{

	   char choice;

	choose_Levels();
	initialising_Players();
do
{
	my_coin=coin1;
	opp_coin=coin2;
       strcpy(my_player,p1);
       strcpy(opp_player,p2);

 display_Board();
	 move();

	my_coin=coin2;
	opp_coin=coin1;
       strcpy(my_player,p2);
       strcpy(opp_player,p1);

 display_Board();
	 move();

}while(1);

}

int Checkers::convertion_Row(char co)
{
	       if(co=='A' || co=='a')
					 return(0);
	 else if(co=='B' || co=='b')
					 return(1);
	 else if(co=='C' || co=='c')
					 return(2);
	 else if(co=='D' || co=='d')
					 return(3);
	 else if(co=='E' || co=='e')
					 return(4);
	 else if(co=='F' || co=='f')
					 return(5);
	 else if(co=='G' || co=='g')
					 return(6);
	 else if(co=='H' || co=='h')
					 return(7);
	 else if(co=='I' || co=='i')
					 return(8);
	 else
					return(-1);


}

    //	check ing the coins whether addressed at correct positions



int Checkers::convertion_Col(char coll)
{
		 if(coll=='0')
					 return(0);
		 else if(coll=='1')
					 return(1);
		 else if(coll=='2')
					 return(2);
		 else if(coll=='3')

					 return(3);
		 else if(coll=='4')

					 return(4);
		 else if(coll=='5')

					 return(5);
		 else if(coll=='6')

					 return(6);
		 else if(coll=='7')

					 return(7);
		 else if(coll=='8')
					 return(8);
		 else
					return -1;

 }


void Checkers::help_Menu()
{
clrscr();
A=1000;B=1020;C=1060;D=1110;E=1180;F=1260;G=1340;
cout<<"\n\n\n\n\n\n\t\t\t\t\tHELP-MENU";
   sound(1000);delay(250);nosound();
cout<<"\n\n\n\tSTEP:(1) \t : \tGAME CONSIST OF TWO PLAYERS";
      sound(1020);delay(250);nosound();
cout<<"\n\n\n\tSTEP:(2) \t : \tPLAYERS ARE GIVEN BY'8'or '12' COINS EACH";
	   sound(1060);delay(250);nosound();
cout<<"\n\n\n\tSTEP:(3) \t : \tEACH PLAYER GETS AN ALTERNATIVE CHANCES";
cout<<"\n\t\t\t\t  TO MOVE A CHOOSEN COIN";
   sound(1110);delay(250);nosound();
cout<<"\n\n\n\tSTEP:(4) \t : \tNORMALLY THE GAME MOVES ON  ";
cout<<"\n\t\t\t\t  BY MOVING ON A CROSS SIDE EACHTIME 1 STEP";
   sound(1180);delay(250);nosound();
cout<<"\n\n\tSTEP:(5) \t : \tWHEN A PLAYER ENCOUNTERS AN ABSTRACLE ";
cout<<"\n\t\t\t\t HE IS GIVEN A CHANCE TO JUMP OVER IT ";
  sound(1260);delay(250);nosound();
cout<<"\n\n\n\tSTEP:(6) \t : \tTHE ABOVE STEP CAN BE REPEATED  ";
cout<<"\n\t\t\t\t UNLESS THE PLAYER'S TURN IS NOT PROVIDED ";
cout<<"\n\t\t\t\tBY A BARRIER   FOR A JUMP DESTINE THE  POSITION  ";
cout<<"\n\t\t\t\t BUT FOR THE NEXT CROSS MOVE";
  sound(1340);delay(250);nosound();
cout<<"\n\n\tSTEP:(7) \t : \tSTEP :5 CAN BE REPEATED CONTINUOSLY";
cout<<"\n\t\t\t\t  IN ANALTERNATIVE JUMPS AND FOR ABNORMAL";
cout<<"\n\t\t\t\t  TERMINATION PRESS I FOR ROW OR 8 FOR COL";
 sound(1260);delay(250);nosound();
cout<<"\n\n\n\n\n\n\t\t'WIN':IF ALL THE CHECKERS OF ANY PLAYER ARE";
cout<<"\n\t\t\t ON THE OTHER SIDE OF THE PLAY ";
 sound(1180);delay(250);nosound();
cout<<"\n\t\t\t$$$***********HAVE A NICE GAME************$$$\n\n\n\n\n";
 sound(1110);delay(250);nosound();
 sound(1060);delay(250);nosound();
 sound(1020);delay(250);nosound();
 sound(1000);delay(250);nosound();
}




void Checkers::credits()
{

	clrscr();     des2=14;
	cout<<"\n\n\n\n\n\n\t\t";
	for(int j=0;j<40;j++)
			cout<<des2;

	cout<<"\n\n\n\n\t\t CREATED BY  \t:\tVENKAT RAM REDDY.K";
	cout<<"\n\n\n\t\t   COLLEGE     \t:\tCVR COLLEGE OF ENGG";
	cout<<"\n\n\n\t\t   BRANCH      \t:\tCOMPUTER SCIENCE:II";
	cout<<"\n\n\n\t\t   ADM_NO      \t:\t07B81A05C1";
	cout<<"\n\n\n\n\n\n\t\t";
	for(j=0;j<40;j++)
		cout<<des2;
				cout<<"\n";

}



 void Checkers::menu()
{      int i,j;
  char aa,bb,cc,dd,ee,ff,ss;
  aa=218;  bb=191;  cc=192;  dd=217;  ee=196;  ff=179;   ss=0;
	char garbage,ch;
do
{
	clrscr();
cout<<"\n\n\n\n";
cout<<"\n\t"<<aa;
for(i=0;i<63;i++)
cout<<ee;

cout<<bb;

for(j=0;j<8;j++)
{
cout<<"\n\t"<<ff;
for(i=0;i<63;i++)
cout<<ss;
cout<<ff;
}


   cout<<"\n\t"<<ff<<"\t\t\tCONTENTS OF THE GAME\t\t\t"<<ff;
for(j=0;j<4;j++)
{
cout<<"\n\t"<<ff;
for(i=0;i<63;i++)
cout<<ss;
cout<<ff;
}

   cout<<"\n\t"<<ff<<"\t[   1   ]\t\t:\t\tSTART GAME\t"<<ff;

for(j=0;j<4;j++)
{
cout<<"\n\t"<<ff;
for(i=0;i<63;i++)
cout<<ss;
cout<<ff;
}
   cout<<"\n\t"<<ff<<"\t[   2   ]\t\t:\t\tHELP MENU\t"<<ff;

for(j=0;j<3;j++)
{
cout<<"\n\t"<<ff;
for(i=0;i<63;i++)
cout<<ss;
cout<<ff;
}
   cout<<"\n\t"<<ff<<"\t[   3   ]\t\t:\t\tCREATOR \t"<<ff;

for(j=0;j<3;j++)
{
cout<<"\n\t"<<ff;
for(i=0;i<63;i++)
cout<<ss;
cout<<ff;
}
   cout<<"\n\t"<<ff<<"\t[   4   ]\t\t:\t\tRETURN BACK   \t"<<ff;

for(j=0;j<3;j++)
{
cout<<"\n\t"<<ff;
for(i=0;i<63;i++)
cout<<ss;
cout<<ff;
}
   cout<<"\n\t"<<ff<<"\t[   5   ]\t\t:\t\tEXIT        \t"<<ff;


for(j=0;j<3;j++)
{
cout<<"\n\t"<<ff;
for(i=0;i<63;i++)
cout<<ss;
cout<<ff;
}

cout<<"\n\t"<<cc;
for(i=0;i<63;i++)
cout<<ee;
cout<<dd;

cout<<"\n\n\n\n\n\t";
for(i=0;i<50;i++)
cout<<ss;
cout<<" [           ]\b\b\b\b\b\b";

cin>>ch;

clrscr();
switch(ch){
case '1':
	game();
	clrscr();
	break;
case '2':
	help_Menu();
	cout<<"\n\t\tPRESS ANY KEY TO CONTINUE";
	cin>>garbage;
	clrscr();
	break;
case '3':
	credits();
	cout<<"\n\t\tPRESS ANY KEY TO CONTINUE";
	cin>>garbage;
	clrscr();
	break;
case '4':return;
case '5':exit(0);
default:cout<<"\n\n\t\tENTER A VALID OPTION ";

	  }//switch
}while(ch<'5');

}
     /*
class Game1:public Checkers{

public:
char designator[8][8],dil[8][8],destination[8][8],order,destiny,source;
int loop_repeat;
char coin,player[30];

void initialise_Coin_Of_Players()
{
       loop_repeat=0;
	destiny='0';
	source='0';
	order=' ';
	char counter;
int count,xxx;

for(int i=0;i<8;i++)
	for(j=0;j<8;j++)
	 {
		designator[i][j]=' ';  // displays the possible sources
		dil[i][j]=' ';         // displays the dil symbol to distinguish clarity
		 destination[i][j]=' ';// displays the possible destination
	 }


	for(i=0;i<8;i=i+2)
	{
		xxx=0,count=1;
		 while(count++<=4)
		 {
			 tab[i][xxx]=empty_location;
			xxx=xxx+2;
			  designator[i][xxx]=empty_location;
			  dil[i][xxx]=empty_location;
		 }
	}
	for(i=1;i<8;i=i+2)
	{
	      xxx=1;count=1;
		while(count++<=4)
		{
		 tab[i][xxx]=empty_location;
			xxx=xxx+2;
			  designator[i][xxx]=empty_location;
			  dil[i][xxx]=empty_location;
		}
	}
		 //COIN 2 COINS ARE INITIALISED


tab[4][0]=coin2;
		tab[3][1]=coin2;
tab[2][0]=coin2;		tab[2][2]=coin2;
		tab[1][1]=coin2;		tab[1][3]=coin2;
tab[0][0]=coin2;		tab[0][2]=coin2;       tab[0][4]=coin2;

counter='1';
designator[4][0]=counter++;
		designator[3][1]=counter++;
designator[2][0]=counter++;	designator[2][2]=counter++;
			designator[1][1]=counter++;     designator[1][3]=counter++;
designator[0][0]=counter++;        designator[0][2]=counter++;      designator[0][4]=counter++;

dil[4][0]=dil[3][1]=dil[2][0]=dil[2][2]=dil[1][1]=dil[1][3]=dil[0][0]=dil[0][2]=dil[0][4]=3;
		//COIN 1 COINS ARE INITIALISED
dil[7][3]=dil[7][5]=dil[7][7]=dil[6][4]=dil[6][6]=dil[5][5]=dil[5][7]=dil[4][6]=dil[3][7]=3;

counter='9';

designator[7][3]=counter--;        designator[7][5]=counter--;      designator[7][7]=counter--;

		designator[6][4]=counter--;	designator[6][6]=counter--;

			  designator[5][5]=counter--;    	designator[5][7]=counter--;

					      designator[4][6]=counter--;

							designator[3][7]=counter--;


tab[7][3]=coin1;	       tab[7][5]=coin1;           tab[7][7]=coin1;
		tab[6][4]=coin1;	     tab[6][6]=coin1;
				tab[5][5]=coin1;	tab[5][7]=coin1;
					   tab[4][6]=coin1;
							tab[3][7]=coin1;
}

	// to avoid levels just over ride the method

//function of derived
void detect_A_Move()
{
		cout<<destination[row][col];
	      cout<<empty_location;

		cout<<tab[row][col];
		cout<<dil[row][col];
		cout<<designator[row][col];
}

int win(int coin_choosen)
 {
   switch(coin_choosen){

  case 1:       if(tab[4][0]==coin1 && tab[3][1]==coin1 && tab[2][0]==coin1 && tab[2][2]==coin1 && tab[1][1]==coin1 && tab[1][3]==coin1 && tab[0][0]==coin1 && tab[0][2]==coin1 &&  tab[0][4]==coin1)
			return 1;
		  else
			return 0;

  case 2:	if(tab[7][3]==coin2 && tab[7][5]==coin2 && tab[7][7]==coin2 && tab[6][4]==coin2 && tab[6][6]==coin2 && tab[5][5]==coin2 && tab[5][7]==coin2 && tab[4][6]==coin2 && tab[3][7]==coin2)
			return 2;
		  else
			return 0;
		      }

 }

//prints 			player:1
void print_Player1_In_Design()
{

a1=(25-strlen(p1));
a2=(25-strlen(p1))%2;

	for(i=0;i<20;i++)
		cout<<empty_location;
	for(i=0;i<6;i++)
		 cout<<p15;
	for(i=0;i<a1;i++)
		   cout<<empty_location;


   if(strlen(p1)>0 || strlen(p1)<25)
	   cout<<p1;
   else
  {
	       cout<<"  PLAYER:1  ";

  }
	for(i=a1+strlen(p1);i<a2;i++)
	{
	 cout<<empty_location;
	}



	for(i=0;i<4;i++)
	{
		cout<<empty_location;
	}
	for(i=0;i<4;i++)
	{
		 cout<<p15;
	}


}



//  prints			player:2
void print_Player2_In_Design()
{

a1=2*(25-strlen(p2))/2;
a2=(25-strlen(p2))%2;

	for(i=0;i<4;i++)
	{
		 cout<<p15;
	}



	for(i=0;i<a1;i++)
	{
	   cout<<empty_location;
	}

   if(strlen(p2)>0 || strlen(p2)<25)
	   cout<<p2;
   else
  {
		cout<<"  PLAYER:2  ";

  }
	for(i=a1+strlen(p2);i<a2;i++)
	{
	 cout<<empty_location;
	}


	for(i=0;i<4;i++)
	{
	 cout<<empty_location;
	}

	for(i=0;i<6;i++)
	{
		 cout<<p15;
	}

	for(i=0;i<20;i++)
		cout<<empty_location;


}
void valid_Check_Move()
{

detect_A_Move();

}
void choose_Levels()
{

	cout<<"\n\n\n\t\t\tALL THE BEST FOR THE FURUTE PLAY";

}



	//finds the possible sources

void source_Finding()
{
   for(int i=0;i<8;i++)
   {
     for(int j=0;j<8;j++)
     {
	       if(tab[i][j]==coin )
	       {
//		 if((tab[i+1][j+1]==' ' && i<7 && j<7)||( tab[i+1][j-1]==' ' && i<7 && j>0) || (tab[i-1][j+1]==' ' && i>0 && j<7) ||(tab[i-1][j-1]==' ' && i>0 && j>0) ||( tab[i+1][j+1]!=' ' && tab[i+2][j+2]==' ' && i<6 && j<6)|| (tab[i+1][j-1]!=' ' && tab[i+2][j-2]==' ' && i<6 && j>1) || (tab[i-1][j+1]!=' ' && tab[i-2][j+2]==' ' && i>1 && j<6) ||(tab[i-1][j-1]!=' ' && tab[i-2][j-2]==' ' && i>1 && j>1) )
		{
			  em_l=1;
			  destination[i][j]='*';
		}


	       }
	       else
	       {
		    destination[i][j]=' ';
		    em_l=empty_location;
	       }
    }

  }



}
void display_Destiny_Moves()
{
   for(int i=0;i<8;i++)
   {
     for(int j=0;j<8;j++)
     {
	      if(i==rs && j==cs)
	      {
		destination[i][j]='*';//shows the destination when a player destines
		 em_l=1;
	       }

	      else if(i==rs-1 && j==cs-1)
	      {
		if(tab[rs-1][cs-1]==empty_location && rs>=1 && cs>=1 && loop_repeat==0)
		 {       destination[i][j]='a';loop_repeat=0;}

		  else
			      destination[i][j]=' ';
				em_l=2;
	       }
	     else if(i==rs-1 && j==cs+1)
	     {
	       if(tab[rs-1][cs+1]==empty_location && rs>=0 && cs<7 && loop_repeat==0)
		{	 destination[i][j]='b'; loop_repeat=0;}
			else
				 destination[i][j]=' ';
			em_l=2;
	      }
	      else if(i==rs+1 && j==cs-1)
	      {
		if(tab[rs+1][cs-1]==empty_location && rs<7 && cs>=0 && loop_repeat==0)
		   {      destination[i][j]='c';loop_repeat=0;  }
		 else
				      destination[i][j]=' ';
			 em_l=2;
	       }
	       else if(i==rs+1 && j==cs+1)
	       {
			if(tab[rs+1][cs+1]==empty_location && rs<7 && cs<7 && loop_repeat==0 && loop_repeat==0)
			 {   destination[i][j]='d';loop_repeat=0;}
			else
				       destination[i][j]=' ';
				em_l=2;
		}


  //----------------------------------double jump


       else if(i==rs+2 && j==cs+2)
       {
	 if((tab[rs+2][cs+2]==empty_location) && (tab[rs+1][cs+1]!=empty_location) && rs<6 && cs<6)
	  { 		destination[i][j]='e';loop_repeat=1;}
	 else
				destination[i][j]=' ';
	    em_l=2;
	  }

      else if(i==rs-2 && j==cs-2)
      {

	 if((tab[rs-2][cs-2]==empty_location) && (tab[rs-1][cs-1]!=empty_location)&& rs>=1 && cs>=1)
	 { 	destination[i][j]='f'; loop_repeat=1;}
	 else
			destination[i][j]=' ';

		    em_l=2;
      }

      else if(i==rs-2 && j==cs+2)
      {

	if((tab[rs-2][cs+2]==empty_location) && (tab[rs-1][cs+1]!=empty_location) && rs>=1 && cs<6)
	 { 		destination[i][j]='g';loop_repeat=1;}
	else
			destination[i][j]=' ';
	    em_l=2;

       }
      else if(i==rs+2 && j==cs-2)
       {
	 if((tab[rs+2][cs-2]==empty_location) && (tab[rs+1][cs-1]!=empty_location)&& rs<6 && cs>=1)
	 { 		destination[i][j]='h'; loop_repeat=1;}
	 else
		destination[i][j]=' ';
	    em_l=2;
       }
		 else
		 {      loop_repeat=0;
			  destination[i][j]=' ';
			  em_l=empty_location;
		 }
    } // ||
    }//for loops
}


void looping_Destinies()
{

    for(int i=0;i<8;i++)
    {
     for(int j=0;j<8;j++)
     {

       if(i==rs+2 && j==cs+2)
       {
	 if((tab[rs+2][cs+2]==empty_location) && (tab[rs+1][cs+1]!=empty_location) && rs<6 && cs<6)
	 {			destination[i][j]='i';loop_repeat=1;rs=rs+2;cs=cs+2;}
	 else
				destination[i][j]=' ';
	    em_l=2;
       }

      else if(i==rs-2 && j==cs-2)
      {
	 if((tab[rs-2][cs-2]==empty_location) && (tab[rs-1][cs-1]!=empty_location)&& rs>1 && cs>1)
	 {		destination[i][j]='j';     loop_repeat=1;rs=rs-2;cs=cs-2;}
	 else
			destination[i][j]=' ';

		    em_l=2;
      }

      else if(i==rs-2 && j==cs+2)
      {

	if((tab[rs-2][cs+2]==empty_location) && (tab[rs-1][cs+1]!=empty_location) && rs>1 && cs<6)
	      {		destination[i][j]='k';loop_repeat=1;rs=rs-2;cs=cs+2;}
	else
			destination[i][j]=' ';
	    em_l=2;
      }
      else if(i==rs+2 && j==cs-2)
      {
	 if((tab[rs+2][cs-2]==empty_location) && (tab[rs+1][cs-1]!=empty_location)&& rs<6 && cs>1)
	       {	destination[i][j]='l';    loop_repeat=1;rs=rs+2;cs=cs-2;}
	 else
			destination[i][j]=' ';
	    em_l=2;
      }
		 else
		 {
				loop_repeat=0;
			  destination[i][j]=' ';
			em_l=empty_location;
		 }
    } // ||
    }//for loops

}

void tell_Destiny(char dest)
{
   for(int i=0;i<8;i++)
   {
     for(int j=0;j<8;j++)
     {
	      if(destination[i][j]==dest)
	      {
		    rd=i;
		    cd=j;
		 valid=1;
	       }
     } // ||
   }//for loops
     if(valid!=1)
     {
	    cout<<"\n\t\tUNSUCESSFUL ATTEMPT , ATTEMPT AGAIN";
     }
}

//displays the possible sources
void initialise_Source(char sour)
{
for(int i=0;i<8;i++)
{
	for(int j=0;j<8;j++)
	{
		if(designator[i][j]==sour && tab[i][j]==coin)
		{	rs=i;cs=j; }
	}
}
}

void move()
{
	coin=my_coin;

       valid=0;loop_repeat=0;
     char rss,css,aaa;
   do{
	rd=8;cd=8;

	source_Finding();//finds one of the possible sources
	display_Board();  // displaces the above possibilities

	cout<<my_player<<"\t****ENTER 1 OF THE POSSIBLE SOURCE NO'S!!!!";
	cout<<"\n\t\t:\t[\t]\b\b\b\b\b";
	cin>>source;//reads a possible source from user


	if(source=='.')	//	abnormal termination
	       menu();

	initialise_Source(source);//initialises rs,cs
	 rss=rs;css=cs;


	if(rs>=0 &&rs<8 && cs>=0 && cs<8)//include safe move cond
	{ //  source validity
		if(tab[rs][cs]==my_coin)
		{
			sound(1500);delay(150);
			sound(2000);delay(180);
			sound(1800);delay(600);//nosound();
			sound(1850);delay(400);//nosound();
			sound(1200);delay(160);
			sound(1300);delay(165);
			sound(1350);delay(170);nosound();
			sound(1350);delay(170);nosound();
			display_Destiny_Moves();//calculates possible destinations
			display_Board();    //displays possible destinations

	cout<<"\n\t-**ENTER ONE OF THE DESTINY NO'S!!!!!\n\t\t\tAND '.' TO ENTER SOURCE AGAIN\t\t[\t\t]\b\b\b\b\b\b";
	cin>>destiny;
	if(destiny=='.')
		menu();

			tell_Destiny(destiny);
			display_Board();

			if(valid==1)
			{
			rs=rss;cs=css;
			char temp1,temp2,temp3;
		temp1=tab[rs][cs];
		tab[rs][cs]=tab[rd][cd];
		tab[rd][cd]=temp1;

		temp2=designator[rs][cs];
		designator[rs][cs]=designator[rd][cd];
		designator[rd][cd]=temp2;

		temp3=dil[rs][cs];
		dil[rs][cs]=dil[rd][cd];
		dil[rd][cd]=temp3;
				}
		}
		else
		{
	      display_Board();
	      cout<<"\n\n\t\tINVALID SOURCE\n";
			sound(A);delay(500);nosound();
		}
	}
	else
	{
		 display_Board();
		 cout<<"\n\t\t\tINVALID MOVE\n\t";
		    sound(B);delay(500);nosound();
	}

    }while(valid!=1 || destiny=='.');//until a success move
}

void help_Menu()
{
clrscr();
A=1000;B=1020;C=1060;D=1110;E=1180;F=1260;G=1340;
cout<<"\n\n\n\n\n\n\t\t\t\t\tHELP-MENU";
   sound(A);delay(500);nosound();
cout<<"\n\n\n\tSTEP:(1) \t : \tGAME CONSIST OF TWO PLAYERS";
      sound(B);delay(500);nosound();
cout<<"\n\n\n\tSTEP:(2) \t : \tPLAYERS ARE GIVEN BY'9' COINS EACH";
	   sound(C);delay(500);nosound();
cout<<"\n\n\n\tSTEP:(3) \t : \tEACH PLAYER GETS AN ALTERNATIVE CHANCES";
cout<<"\n\t\t\t\t  TO MOVE A CHOOSEN COIN BY SPECIFING ";
cout<<"\n\t\t\t\t  THE DESIGNATOR PROVIDED BESIDE DIL SYMBOL";
   sound(D);delay(500);nosound();
cout<<"\n\n\n\tSTEP:(4) \t : \tNORMALLY THE GAME MOVES ON  ";
cout<<"\n\t\t\t\t  BY MOVING ON A CROSS SIDE EACHTIME 1 STEP";
   sound(E);delay(500);nosound();
cout<<"\n\n\tSTEP:(5) \t : \tWHEN A PLAYER ENCOUNTERS AN ABSTRACLE ";
cout<<"\n\t\t\t\t HE IS GIVEN A CHANCE TO JUMP OVER IT ";
   sound(F);delay(500);nosound();
cout<<"\n\n\n\tSTEP:(6) \t : \tTHE ABOVE STEP CAN BE REPEATED  ";
cout<<"\n\t\t\t\t UNLESS THE PLAYER'S TURN IS NOT PROVIDED ";
cout<<"\n\t\t\t\tBY A BARRIER   FOR A JUMP DESTINE THE   ";
cout<<"\n\t\t\t\tPOSITION  BUT FOR THE NEXT CROSS MOVE";
   sound(G);delay(500);nosound();
cout<<"\n\t\t\t\t IN ANALTERNATIVE JUMPS ";
cout<<"\n\n\n\t\t\t\t FOR ABNORMAL TERMINATION PRESS I FOR";
cout<<"\n\t\t\t\t ROW OR 8 FOR COL";
   sound(F);delay(500);nosound();
cout<<"\n\n\n\n\n\n\t\t'WIN':IF ALL THE CHECKERS OF ANY PLAYER ARE";
cout<<"\n\t\t\t ON THE OTHER SIDE OF THE PLAY ";
   sound(E);delay(500);nosound();
cout<<"\n\t\t\t$$$***********HAVE A NICE GAME************$$$\n\n\n\n\n";
     sound(D);delay(500);nosound();
     sound(C);delay(500);nosound();
     sound(B);delay(500);nosound();
     sound(A);delay(500);nosound();
}
   };
	    */

   //CHESS HIERARCHY
struct board{
    char status_source;
    char status_coin;
    char status_color;
    char status_index;
    char status_destiny;
	    };
class ChessF:public Checkers
{
public:
board chess[9][9];
//over written
void game();
void credits();
void help_Menu();
void initialising_Players();
void move();
int win();
//------------defined here

void tell_Possible_Sources();
void verify_Source();
void tell_possible_Destinies();
void verify_Destiny();
void tell_Indices(char ,char );

void visibility(char ,char );
void refresh_Visibility();
void give_A_Life();

void destiny_Sepoy();
void destiny_Elephant();
void destiny_Horse();
void destiny_Camel();
void destiny_Queen();
void destiny_King();
void  move_Destiny();
void check_Mate_Move();
void is_check();

void tell_Prev_Source();
void tell_Prev_Destiny();

//-------------do
    char var,my_color,opp_color,dest,coin,index,black_color,white_color;
    char queen_index_B,horse_index_B,elephant_index_B,camel_index_B;
    char queen_index_W,horse_index_W,elephant_index_W,camel_index_W;
     char prev_s,prev_d;
     int no_moves;
    int cast,valid_source,valid_destiny,rsss,csss,check;


 void initialise_Ascii()
{

A=1000;B=1020;C=1060;D=1110;E=1180;F=1260;G=1340;

	for(int i=0;i<8;i++)
		for(int j=0;j<8;j++)
			design[i][j]=' ';
  des2=14;
  x=72;
  p15=15;
  rrr=1;
  a=218;
  b=191;
  c=192;
  d=217;
  e=196;
  f=179;
  g=194;
  h=193;
  l=195;
  m1=180;
  n=197;
  p=201;
  q=187;
  r=200;
  t=188;
  u=205;
  v=186;
  w=178;
  cdc=176;
  cdcd=177;
  empty_location=0; //---------------------?!

  initialise_Coin_Of_Players();//initialises the board

}



void initialise_Coin_Of_Players()
{

//------------
 no_moves=0;
prev_s=' ';
prev_d=' ';
black_color=1;white_color=2;
queen_index_B='1';
horse_index_B='2';
elephant_index_B='2';
camel_index_B='2';

queen_index_W='1';
horse_index_W='2';
elephant_index_W='2';
camel_index_W='2';

//---------------

       char ppp='0';
for(int i=0;i<8;i++)
{	for(int j=0;j<8;j++)
	{
		chess[i][j].status_source=' ';
		chess[i][j].status_destiny=' ';
		chess[i][j].status_coin=' ';
		chess[i][j].status_index=' ';
		chess[i][j].status_color=' ';
	}
}

for(j=0;j<8;j++)
{
	chess[6][j].status_color=white_color;
	chess[6][j].status_coin='s';
	chess[6][j].status_index=ppp+j;
	ppp='0';
	chess[1][j].status_color=black_color;
	chess[1][j].status_coin='s';
	chess[1][j].status_index=ppp+j;
}

chess[7][0].status_coin='e';chess[7][0].status_index='1';chess[7][0].status_color=white_color;
chess[7][7].status_coin='e';chess[7][7].status_index='2';chess[7][7].status_color=white_color;
chess[0][0].status_coin='e';chess[0][0].status_index='1';chess[0][0].status_color=black_color;
chess[0][7].status_coin='e';chess[0][7].status_index='2';chess[0][7].status_color=black_color;

chess[7][1].status_coin='h';chess[7][1].status_index='1';chess[7][1].status_color=white_color;
chess[7][6].status_coin='h';chess[7][6].status_index='2';chess[7][6].status_color=white_color;
chess[0][1].status_coin='h';chess[0][1].status_index='1';chess[0][1].status_color=black_color;
chess[0][6].status_coin='h';chess[0][6].status_index='2';chess[0][6].status_color=black_color;

chess[7][2].status_coin='c';chess[7][2].status_index='1';chess[7][2].status_color=white_color;
chess[7][5].status_coin='c';chess[7][5].status_index='2';chess[7][5].status_color=white_color;
chess[0][2].status_coin='c';chess[0][2].status_index='1';chess[0][2].status_color=black_color;
chess[0][5].status_coin='c';chess[0][5].status_index='2';chess[0][5].status_color=black_color;

chess[7][3].status_coin='q';chess[7][3].status_index='1';chess[7][3].status_color=white_color;
chess[0][3].status_coin='q';chess[0][3].status_index='1';chess[0][3].status_color=black_color;


chess[7][4].status_coin='k';chess[7][4].status_index='1';chess[7][4].status_color=white_color;
chess[0][4].status_coin='k';chess[0][4].status_index='1';chess[0][4].status_color=black_color;

}
		     //1 d  fuctions
//this fun is used to print the checker

 void valid_Check_Move()
{
     cout<<chess[row][col].status_source;
     cout<<chess[row][col].status_coin;
     cout<<chess[row][col].status_color;
     cout<<chess[row][col].status_index;
     cout<<chess[row][col].status_destiny;

}



//colored the altenative boxes--only 1line of box

void invalid_Check_Move()
{   char w_=w=254;


	 rrr=0;

	 cout<<w;
	 cout<<w_;
	 cout<<w_;
	 cout<<w_;
	 cout<<w;


}

//---------------------------------:::::::::
//prints the total line of the cheker placement
void total_First_Box()
{    		 cout<<v;

		display_HGFEDCBA_For_Row();
		cout<<f;
		col=0;
		for(j=0;j<4;j++)
		{

			valid_Check_Move();
			cout<<f;
			col++;
			valid_Check_Move();
			cout<<f;
			col++;
		}
			spaces_5();
		      cout<<v;
		      cout<<endl;
		      x--;
}

//prints the checker placement but the first box is shaded

void total_Second_Box()
{
		 cout<<v;
		display_HGFEDCBA_For_Row();
		cout<<f;
		      col=0;
		for(j=0;j<4;j++)
		{       valid_Check_Move();
			cout<<f;
			col++;
			valid_Check_Move();
			cout<<f;
			col++;
		}
		spaces_5();
	      cout<<v;
	      cout<<endl;   x--;
}

//--middle of the game where actual game slides over here

void total_Middle_Box3()
{
		 cout<<v;
		display_HGFEDCBA_For_Row();
		cout<<f;
		    col=0;
	for(j=0;j<4;j++)
	{
		valid_Check_Move();
		cout<<f;
		col++;
		valid_Check_Move();
		cout<<f;
		col++;
	}
	spaces_5();
      cout<<v;
      cout<<endl;   x--;
}

//alt of the above function

void total_Middle_Box4()
{
		 cout<<v;
		display_HGFEDCBA_For_Row();
		cout<<f;
		      col=0;
	for(j=0;j<4;j++)
	{
		valid_Check_Move();
		cout<<f;
		col++;
		valid_Check_Move();
		cout<<f;
		col++;
	}
	spaces_5();
      cout<<v;
      cout<<endl;   x--;
}




//prints the first box of a ChessF col

void total_Middle_Box7()
{
		 cout<<v;
		display_HGFEDCBA_For_Row();
		cout<<f;
		     col=0;
	for(j=0;j<4;j++)
	{
		valid_Check_Move();
		cout<<f;
		col++;
		valid_Check_Move();
		cout<<f;
		col++;
	}
	spaces_5();
      cout<<v;
      cout<<endl;   x--;
}

    //alt to above fun

void total_Middle_Box8()
{
		 cout<<v;
		display_HGFEDCBA_For_Row();
		cout<<f;
	      col=0;
	for(j=0;j<4;j++)
	{
		valid_Check_Move();
		cout<<f;
		col++;
		valid_Check_Move();
		cout<<f;
		col++;
	}
	spaces_5();
      cout<<v;
      cout<<endl;   x--;
}


//prints 			player:1
void print_Player1_In_Design()
{

a1=2*(12-str_len(p1))/2;
a2=(12-str_len(p1))%2;

	for(i=0;i<18;i++)
		cout<<empty_location;

	for(i=18;i<24;i++)
	{
		 cout<<p15;
	}

		for(i=0;i<a1;i++)
	{
	   cout<<empty_location;
	}



   if(str_len(p1)>0 || str_len(p1)<12)
	   cout<<p1;
   else
  {
		 i=8;
		p1[i+1]='.';//creates a dube to player 1
		p1[i+2]='.';
		p1[i+3]='.';
		p1[i+4]='\0';
  }
	for(i=a1+str_len(p1);i<a2;i++)
	{
	 cout<<empty_location;
	}



	for(i=32;i<36;i++)
	{
		cout<<empty_location;
	}
	for(i=36;i<42;i++)
	{
		 cout<<p15;
	}


	for(i=42;i<56;i++)
		cout<<empty_location;
}

//  prints			player:2
void print_Player2_In_Design()
{

a1=2*(12-str_len(p2))/2;
a2=(12-str_len(p2))%2;
	for(i=0;i<18;i++)
		cout<<empty_location;
	for(i=18;i<24;i++)
	{
		 cout<<p15;
	}



		for(i=0;i<a1;i++)
	{
	   cout<<empty_location;
	}

   if(str_len(p2)>0 || str_len(p2)<12)
	   cout<<p2;
   else
  {
		 i=8;
		p2[i+1]='.';
		p2[i+2]='.';
		p2[i+3]='.';
		p2[i+4]='\0';
  }
	for(i=a1+str_len(p2);i<a2;i++)
	{
	 cout<<empty_location;
	}


	for(i=32;i<36;i++)
	{
		cout<<empty_location;
	}

	for(i=36;i<42;i++)
	{
		 cout<<p15;
	}

	for(i=42;i<56;i++)
	cout<<empty_location;
}

//this function checks whether the 2 strings are matched :return 1 or not :return 0

int str_cmp(char abc[8],char pqr[8])
{
	 int sri=0;
	for(int i=0;i<strlen(abc);i++)
	{
		 if(abc[i]!=pqr[i])
		 {
		   sri=1;
		 }

	}
	if(sri==0)
		return 0;
	else
		return 1;


}

//calculates string length

int str_len(char *player)
{
int i=0;
	while(player[i++]!='\0')
	{}
	       return(i);

}
};




//checks the validation of players and alters if not valid(in case of duplicate's)

void ChessF::initialising_Players()
{

 p1[0]='\0';
 p2[0]='\0';
	char ch,coins1[10],coins2[10];
clrscr();
	cout<<"\n\n\n\n\nPLAYER:1->\t[\t\t]\b\b\b\b\b\b\b\b\b\b\b";
cin>>p1;
sound(780);   delay(500);   nosound();
		clrscr();
cout<<"\n\n\n\n\nPLAYER2:2->\t[\t\t]\b\b\b\b\b\b\b\b\b\b\b";
cin>>p2;
sound(380);   delay(500);   nosound();
	if(str_cmp(p1,p2)==0)//checks whether the player are valid or not
	{             int j=str_len(p1);


		p2[j-1]='2';//creates a dube to player 1
		p2[j]='\0';
			cout<<"\n\nPLAYER 2\t:\tIS DUPLICATED to:\t"<<p2;
			sound(580);   delay(200); nosound();

	}


clrscr();
cout<<"\n\n\n\n\n\n\n\n\n\n\n\n";
cout<<p1<<"\t IS THE PLAYER:1";

cout<<"\n\n\n\n\n\n\n\n\n\n\n\n";
cout<<p2<<"\t IS THE PLAYER:2";
sound(780);   delay(300); nosound();

	initialise_Ascii();//		to view go to Line:39
}



void ChessF::tell_Prev_Source()
{
  cout<<"\n\tLAST MOVE:->";
 switch(prev_s)
 {
  case 'c':cout<<"CAMEL";break;
  case 'e':cout<<"ELEPHANT";break;
  case 'q':cout<<"QUEEN";break;
  case 'k':cout<<"KING";break;
  case 's':cout<<"SOLDIER";break;
  default:cout<<"   ";
 }
 cout<<" at";

}
void ChessF::tell_Prev_Destiny()
{

  switch(prev_d){
  case 'c':cout<<" is killing CAMEL at";break;
  case 'e':cout<<"is killing ELEPHANT at";break;
  case 'q':cout<<"is killing QUEEN at";break;
  case 'k':cout<<"is killing KING at";break;
  case 's':cout<<"is killing SOLDIER at";break;
  case ' ':cout<<" is moving to EMPTY LOCATION AT";break;
  default:cout<<"   ";
		 }
  }
void ChessF::move()
{
char r_s=rs+65,chan,r_d=rd+65;



valid_source=0;
do{
	if(win()==1)
	{
		cout<<"\n\t\-~YAHOO  !!~- **  "<<p1<<"  **\tHAVE WON THE DESTINY";
		cout<<"\n\t----WOULD U LIKE TO PLAY-AGAIN/DECLAIN :P/D---";
			sound(100);delay(1000);nosound();
			sound(100);delay(1000);nosound();
		cin>>chan;
		if(chan=='P' || chan=='p')
			menu();
		 else
			exit(0);
	}
       else if(win()==2)
	{
		cout<<"\n\t\-~YAHOO  !!~- **  "<<p2<<"  **\tHAVE WON THE DESTINY";
		cout<<"\n\t----WOULD U LIKE TO PLAY-AGAIN/DECLAIN :P/D---";
		cin>>chan;
			sound(100);delay(1000);nosound();
			sound(100);delay(1000);nosound();

		if(chan=='P' || chan=='p')
			menu();
		 else
			exit(0);
	}


	 tell_Possible_Sources();//calculates sources / for sources
	 display_Board();
       if(no_moves!=0 )//&& valid_source!=0 && valid_destiny!=0)
       {
	tell_Prev_Source();
	cout<<r_s<<cs;
	tell_Prev_Destiny();
	cout<<r_d<<cd;
		sound(100);delay(500);nosound();
	}
	is_check();
	if(check==1)
	{
		cout<<"\n\t-----	!!^^^  CHECK  ^^^!!	-----";
			sound(1350);delay(1000);nosound();
	}
	else
	{
	 cout<<"\n";
	}
	 cout<<"\n\t"<<my_player<<" ENTER A SOURCE WHICH HAS '*'";
	 cout<<" SPECIFY AS COIN,INDEX  :  [  ####  ]\b\b\b\b\b\b";
		 cin>>coin>>index;

	 if(coin=='.')
	menu();
	verify_Source();

}while(valid_source==0);//until a success source entered


 valid_destiny=0;

do{
	  tell_possible_Destinies();//tells possible destinies for rs,cs coin
	  display_Board();

	     if(my_color==white_color && (chess[7][2].status_destiny=='C' || chess[7][6].status_destiny=='C'))
			 cout<<"\n !!* CASTLING IS POSSIBLE !!";
	     else if(my_color==black_color && (chess[0][2].status_destiny=='C' || chess[0][6].status_destiny=='C'))
			 cout<<"\n !!* CASTLING IS POSSIBLE !!";

	   cout<<"\n\t"<<my_player<<"\tENTER A -DESTINY- WHICH HAS 'a'..";
	 cout<<"\n\t\t SPECIFY COIN,INDEX \t:\t[^~~~~~~^]\b\b\b\b\b\b";
	  cin>>dest;
	 if(dest=='.')
	 menu();

	   verify_Destiny();//takes care of move logic


  }while(valid_destiny==0);

	no_moves++;

  }

  int ChessF::win()
  {
      int count1=0,count2=0;
   for(int i=0;i<8;i++)
   {
	for(int j=0;j<8;j++)
	{
	  if(chess[i][j].status_coin=='k')
	  {
	     if(chess[i][j].status_color==black_color)
		      count1++;
	     else if(chess[i][j].status_color==white_color)
		      count2++;
	  }
	}
    }

    if(count1==0)
	return 1;
     else if(count2==0)
	return 2;
     else
	return 0;

  }
void ChessF::tell_Possible_Sources()
{
tell_Indices('e','1');visibility('e','1');
tell_Indices('e','2');visibility('e','2');
tell_Indices('e','3');visibility('e','3');
tell_Indices('e','4');visibility('e','4');
tell_Indices('e','5');visibility('e','5');
tell_Indices('e','6');visibility('e','6');


tell_Indices('h','1');visibility('h','1');
tell_Indices('h','2');visibility('h','2');
tell_Indices('h','3');visibility('h','3');
tell_Indices('h','4');visibility('h','4');
tell_Indices('h','5');visibility('h','5');
tell_Indices('h','6');visibility('h','6');

tell_Indices('c','1');visibility('c','1');
tell_Indices('c','2');visibility('c','2');
tell_Indices('c','3');visibility('c','3');
tell_Indices('c','4');visibility('c','4');
tell_Indices('c','5');visibility('c','5');
tell_Indices('c','6');visibility('c','6');

tell_Indices('q','1');visibility('q','1');
tell_Indices('q','2');visibility('q','2');
tell_Indices('q','3');visibility('q','3');
tell_Indices('q','4');visibility('q','4');
tell_Indices('q','5');visibility('q','5');
tell_Indices('q','6');visibility('q','6');
tell_Indices('q','7');visibility('q','7');
tell_Indices('q','8');visibility('q','8');
tell_Indices('q','9');visibility('q','9');


tell_Indices('k','1');visibility('k','1');//1 is ascii dil

tell_Indices('s','0');visibility('s','0');
tell_Indices('s','1');visibility('s','1');
tell_Indices('s','2');visibility('s','2');
tell_Indices('s','3');visibility('s','3');
tell_Indices('s','4');visibility('s','4');
tell_Indices('s','5');visibility('s','5');
tell_Indices('s','6');visibility('s','6');
tell_Indices('s','7');visibility('s','7');


}


void ChessF::tell_Indices(char cn,char ind)
{

   for(int i=0;i<8;i++)
   {
	for(int j=0;j<8;j++)
	{
     if(chess[i][j].status_coin==cn && chess[i][j].status_index==ind && chess[i][j].status_color==my_color)
	    {

		     rs=i;cs=j;
	    }
	}
   }


}

//tells if '*' a valid move
// and if ' ' invalid move

void ChessF::visibility(char cn,char ind)
{

    switch(cn){

    case 'e':{
	      if((chess[rs+1][cs].status_color!=my_color && rs<7) || (chess[rs][cs-1].status_color!=my_color && cs>0) ||( chess[rs-1][cs].status_color!=my_color && rs>0) ||( chess[rs][cs+1].status_color!=my_color && cs<7))
	       {
//		if(threat==0)
		chess[rs][cs].status_source='*';
  //		else
    //		chess[rs][cs].status_source=' ';


	       }
	      break;
	     }

    case 'h':{
	       if((chess[rs+2][cs-1].status_color!=my_color && rs<6 && cs>0) || (chess[rs+2][cs+1].status_color!=my_color && rs<6 && cs<7) || (chess[rs+1][cs-2].status_color!=my_color && rs<7 && cs>1) || (chess[rs+1][cs+2].status_color!=my_color && rs<7 && cs<6) || (chess[rs-2][cs-1].status_color!=my_color && rs>1 && cs>0) || (chess[rs-2][cs+1].status_color!=my_color && rs>1 && cs<7)|| (chess[rs-1][cs-2].status_color!=my_color && rs>0 && cs>1)||( chess[rs-1][cs+2].status_color!=my_color && rs>0 && cs<6))
	       {

    //		if(threat==0)
		chess[rs][cs].status_source='*';
      //		else
	//	chess[rs][cs].status_source=' ';

	       }
	      break;

	     }
    case 'c':{
	       if((chess[rs+1][cs+1].status_color!=my_color && rs<7 && cs<7) || (chess[rs+1][cs-1].status_color!=my_color && rs<7 && cs>0) || (chess[rs-1][cs+1].status_color!=my_color && rs>0 && cs<7) || (chess[rs-1][cs-1].status_color!=my_color && rs>0 && cs>0))
	       {
//		if(threat==0)
		chess[rs][cs].status_source='*';
  //		else
 //		chess[rs][cs].status_source=' ';

	       }
	      break;
	     }
    case 'k':  {
	       if((chess[rs+1][cs+1].status_color!=my_color && rs<7 && cs<7) || (chess[rs+1][cs-1].status_color!=my_color && rs<7 && cs>0) || (chess[rs-1][cs+1].status_color!=my_color && rs>0 && cs<7) || (chess[rs-1][cs-1].status_color!=my_color && rs>0 && cs>0) || (chess[rs+1][cs].status_color!=my_color && rs<7) || (chess[rs][cs-1].status_color!=my_color && cs>0) ||( chess[rs-1][cs].status_color!=my_color && rs>0) ||( chess[rs][cs+1].status_color!=my_color && cs<7) )
	       {
		chess[rs][cs].status_source='*';
	       }
		 break;
	      }
    case 'q':{
	       if((chess[rs+1][cs+1].status_color!=my_color && rs<7 && cs<7) || (chess[rs+1][cs-1].status_color!=my_color && rs<7 && cs>0) || (chess[rs-1][cs+1].status_color!=my_color && rs>0 && cs<7) || (chess[rs-1][cs-1].status_color!=my_color && rs>0 && cs>0)|| (chess[rs+1][cs].status_color!=my_color && rs<7) || (chess[rs][cs-1].status_color!=my_color && cs>0) ||( chess[rs-1][cs].status_color!=my_color && rs>0) ||( chess[rs][cs+1].status_color!=my_color && cs<7) )
	       {
   //		if(threat==0)
		chess[rs][cs].status_source='*';
     //		else
       //		chess[rs][cs].status_source=' ';

	       }
	      break;
	     }

    case 's':{
	       if(my_color==black_color)
	       {
	       if((chess[rs+1][cs+1].status_color==opp_color && rs<7 && cs<7)||( chess[rs+1][cs-1].status_color==opp_color && rs<7 && cs>0) || (chess[rs+1][cs].status_color==' ' && rs<7))
	       {//	if(threat==0)
		chess[rs][cs].status_source='*';
	       //	else
		//chess[rs][cs].status_source=' ';
	       }
	       else if(rs==1 && chess[rs+2][cs].status_color==' ' && chess[rs+1][cs].status_color==' ')
	       {
	       //	if(threat==0)
		chess[rs][cs].status_source='*';
	       //	else
	     //	chess[rs][cs].status_source=' ';

	       }

	       }

	       else if(my_color==white_color)
	       {
	       if((chess[rs-1][cs+1].status_color==opp_color && rs>0 && cs<7)|| (chess[rs-1][cs-1].status_color==opp_color && rs>0 && cs>0) || (chess[rs-1][cs].status_color==' ' && rs>0 ))
	       {
	       //		if(threat==0)
		chess[rs][cs].status_source='*';
	       //	else
		//chess[rs][cs].status_source=' ';

	       }
	       else if(rs==6 && chess[rs-2][cs].status_color==' ' && chess[rs-1][cs].status_color==' ')
	       {
		//	if(threat==0)
		chess[rs][cs].status_source='*';
	      //	else
	       //	chess[rs][cs].status_source=' ';

	       }
	       }


	      break;
	     }
    default:cout<<"\n\t	NO POSSIBLE SOURCES ARE THERE ";

	  }
}

void  ChessF::verify_Source()
{

	if(my_color==white_color)
	{
		switch(coin)
		{
			case 'e':
				if(index>='1' && index<=elephant_index_W)
					valid_source=1;
				break;

			case 'h':
				if(index>='1' && index<=horse_index_W)
					valid_source=1;
				break;

			case 'c':
				if(index>='1' && index<=camel_index_W)
					valid_source=1;
				break;

			case 'q':
				if(index>='1' && index<=queen_index_W)
					valid_source=1;
				break;

			case 'k':
				if(index=='1')
				{
					valid_source=1;
				break;
				}
			case 's':
				if(index>='0' && index <='7')
					valid_source=1;
				break;
			default:
			{
				cout<<"enter a valid input\n";
				valid_source=0;
			}
		}
	}

	else if(my_color==black_color)
	{
		switch(coin)
		{
			case 'e':
				if(index>='1' && index<=elephant_index_B)
					valid_source=1;
				break;

			case 'h':
				if(index>='1' && index<=horse_index_B)
					valid_source=1;
				break;

			case 'c':
				if(index>='1' && index<=camel_index_B)
					valid_source=1;
				break;

			case 'q':
				if(index>='1' && index<=queen_index_B)
					valid_source=1;
				break;

			case 'k':
				if(index=='1')
					valid_source=1;
				break;

			case 's':
				if(index>='0' && index <='7')
					valid_source=1;
				break;
			default:
			{
				cout<<"enter a valid input\n";
				valid_source=0;
			}
		}
	}

if(valid_source==1)
	tell_Indices(coin,index);
else
{valid_source=0;return;}

 if(chess[rs][cs].status_source=='*')
 {
 refresh_Visibility();

 chess[rs][cs].status_source='*';
 valid_source=1;

 }
 else
	valid_source=0;
}

void ChessF::refresh_Visibility()
{
 for(int i=0;i<8;i++)
	for(int j=0;j<8;j++)
	       chess[i][j].status_source=' ';
}

void ChessF::tell_possible_Destinies()
{

switch(coin)
{
case 'e': var='a';	destiny_Elephant();
		 break;
case 'h': var='a';      destiny_Horse();
		 break;
case 'c': var='a';      destiny_Camel();
		 break;
case 'q': var='a';      destiny_Queen();
		 break;
case 'k': var='a';      destiny_King();
		 break;
case 's': var='a';      destiny_Sepoy();
		 break;
}
}

void ChessF::destiny_Sepoy()
{
   if(my_color==black_color )
   {
    if(chess[rs+1][cs+1].status_color==opp_color && rs<7 && cs<7)
    chess[rs+1][cs+1].status_destiny=var++;

    if(chess[rs+1][cs-1].status_color==opp_color && rs<7 && cs>0)
	chess[rs+1][cs-1].status_destiny=var++;

    if(rs==1 && chess[rs+1][cs].status_color==' ' && chess[rs+2][cs].status_color==' ')
	chess[rs+2][cs].status_destiny=var++;

    if(chess[rs+1][cs].status_color==' ' && rs<7)
	chess[rs+1][cs].status_destiny=var++;

   }
   else if(my_color==white_color)
   {
    if(chess[rs-1][cs+1].status_color==opp_color && rs>0 && cs<7)//kill move
    chess[rs-1][cs+1].status_destiny=var++;

    if(chess[rs-1][cs-1].status_color==opp_color && rs>0 && cs>0)//kill move
    chess[rs-1][cs-1].status_destiny=var++;

     if(rs==6 && chess[rs-1][cs].status_color==' ' && chess[rs-2][cs].status_color==' ')
	chess[rs-2][cs].status_destiny=var++;

    if(chess[rs-1][cs].status_color==' ' && rs>0)
	chess[rs-1][cs].status_destiny=var++;
   }
}

void ChessF::destiny_Elephant()
{
	flag=1;

  for(int p=1;p<8;p++)
  {
	 if(chess[rs+p][cs].status_color!=my_color && rs+p<8 && flag==1)
	  {
		if(chess[rs+p][cs].status_color!=' ')
		{	chess[rs+p][cs].status_destiny=var++;flag=0;}
		else if(chess[rs+p][cs].status_color==' ')
			chess[rs+p][cs].status_destiny=var++;
	  }
	    else
	  break;
  }
  flag=1;
  for(p=1;p<8;p++)
  {	  if(chess[rs-p][cs].status_color!=my_color && rs-p>=0 && flag==1)
	  {
		if(chess[rs-p][cs].status_color!=' ')
		{	chess[rs-p][cs].status_destiny=var++;flag=0;}
		else if(chess[rs-p][cs].status_color==' ')
			chess[rs-p][cs].status_destiny=var++;
	  }
	    else
	  break;
  }
  flag=1;
  for(p=1;p<8;p++)
  {	  if(chess[rs][cs+p].status_color!=my_color && cs+p<8 && flag==1)
	  {
		if(chess[rs][cs+p].status_color!=' ')
		{	chess[rs][cs+p].status_destiny=var++;flag=0;}
		else if(chess[rs][cs+p].status_color==' ')
			chess[rs][cs+p].status_destiny=var++;
	  }
	  else
	  break;
  }

  flag=1;

  for(p=1;p<8;p++)
  {	  if(chess[rs][cs-p].status_color!=my_color && cs-p>=0 && flag==1)
	  {
		if(chess[rs][cs-p].status_color!=' ')
		{	chess[rs][cs-p].status_destiny=var++;flag=0;}
		else if(chess[rs][cs-p].status_color==' ')
			chess[rs][cs-p].status_destiny=var++;
	  }
	    else
	  break;
  }


}
void ChessF::destiny_Horse()
{
if(chess[rs+2][cs+1].status_color!=my_color && rs<6 && cs<7)
{ chess[rs+2][cs+1].status_destiny=var++;}

if(chess[rs+2][cs-1].status_color!=my_color && rs<6 && cs>=1)
{  chess[rs+2][cs-1].status_destiny=var++; }

if(chess[rs+1][cs+2].status_color!=my_color && rs<7 && cs<6)
{  chess[rs+1][cs+2].status_destiny=var++;}

if(chess[rs+1][cs-2].status_color!=my_color && rs<7 && cs>1)
{  chess[rs+1][cs-2].status_destiny=var++;}


if(chess[rs-1][cs-2].status_color!=my_color && rs>=1 && cs>=2)
{  chess[rs-1][cs-2].status_destiny=var++;  }

if(chess[rs-1][cs+2].status_color!=my_color && rs>=1 && cs<6)
{  chess[rs-1][cs+2].status_destiny=var++; }

if(chess[rs-2][cs-1].status_color!=my_color && rs>=2 && cs>=1)
{  chess[rs-2][cs-1].status_destiny=var++;   }

if(chess[rs-2][cs+1].status_color!=my_color && rs>=2 && cs<7)
{  chess[rs-2][cs+1].status_destiny=var++;   }



}
void ChessF::destiny_Camel()
{
  flag=1;
  for(int p=1;p<8;p++)
  {	  if(chess[rs+p][cs+p].status_color!=my_color && rs+p<8 && cs+p<8 && flag==1)
	  {
		if(chess[rs+p][cs+p].status_color!=' ')
		{	chess[rs+p][cs+p].status_destiny=var++;flag=0;}
		else if(chess[rs+p][cs+p].status_color==' ')
			chess[rs+p][cs+p].status_destiny=var++;
	  }
	  else
	  break;
  }

    flag=1;
  for(p=1;p<8;p++)
  {	  if(chess[rs-p][cs-p].status_color!=my_color && rs-p>=0 && cs-p>=0 && flag==1)
	  {
		if(chess[rs-p][cs-p].status_color!=' ')
		{	chess[rs-p][cs-p].status_destiny=var++;flag=0;}
		else if(chess[rs-p][cs-p].status_color==' ')
			chess[rs-p][cs-p].status_destiny=var++;
	  }
	    else
	  break;
  }
    flag=1;
  for(p=1;p<8;p++)
  {	  if(chess[rs-p][cs+p].status_color!=my_color && rs-p>=0 && cs+p<8 && flag==1)
	  {
		if(chess[rs-p][cs+p].status_color!=' ')
		{	chess[rs-p][cs+p].status_destiny=var++;flag=0;}
		else if(chess[rs-p][cs+p].status_color==' ')
			chess[rs-p][cs+p].status_destiny=var++;
	  }
	    else
	  break;
  }
  flag=1;
  for(p=1;p<8;p++)
  {	  if(chess[rs+p][cs-p].status_color!=my_color && rs+p<8 && cs-p>=0 && flag==1)
	  {
		if(chess[rs+p][cs-p].status_color!=' ')
		{	chess[rs+p][cs-p].status_destiny=var++;flag=0;}
		else if(chess[rs+p][cs-p].status_color==' ')
			chess[rs+p][cs-p].status_destiny=var++;
	  }
	    else
	  break;
  }
}
void ChessF::destiny_Queen()
{
destiny_Elephant();
destiny_Camel();
}

void ChessF::destiny_King()
{
   cast=0;
 if(chess[rs-1][cs-1].status_color!=my_color && rs>0 && cs>0)
	chess[rs-1][cs-1].status_destiny=var++;

 if(chess[rs-1][cs].status_color!=my_color && rs>0 )
	chess[rs-1][cs].status_destiny=var++;

 if(chess[rs-1][cs+1].status_color!=my_color && rs>0 && cs<7)
	chess[rs-1][cs+1].status_destiny=var++;
 if(chess[rs][cs+1].status_color!=my_color && cs<7)
	chess[rs][cs+1].status_destiny=var++;
 if(chess[rs+1][cs+1].status_color!=my_color && rs<7 && cs<7)
	chess[rs+1][cs+1].status_destiny=var++;
 if(chess[rs+1][cs].status_color!=my_color && rs<7)
	chess[rs+1][cs].status_destiny=var++;
 if(chess[rs+1][cs-1].status_color!=my_color && rs<7 && cs>0)
	chess[rs+1][cs-1].status_destiny=var++;
 if(chess[rs][cs-1].status_color!=my_color && cs>0)
	chess[rs][cs-1].status_destiny=var++;
 //---------------	castling
 if(my_color==white_color && rs==7 && cs==4)
 {
   if((chess[7][0].status_coin=='e' && chess[7][0].status_index=='1')&& (chess[7][1].status_coin==' ' && chess[7][1].status_index==' ')&&(chess[7][2].status_coin==' ' && chess[7][2].status_index==' ')&&(chess[7][3].status_coin==' ' && chess[7][3].status_index==' '))
   {
      chess[7][2].status_destiny='C'; cast=1;
   }
   else if((chess[7][7].status_coin=='e' && chess[7][7].status_index=='2')&& (chess[7][6].status_coin==' ' && chess[7][6].status_index==' ')&&(chess[7][5].status_coin==' ' && chess[7][5].status_index==' '))
   {
      chess[7][6].status_destiny='C'; cast=2;
   }
   else
   cast=0;

 }
 else if(my_color==black_color && rs==0 && cs==4)
 {
   if((chess[0][0].status_coin=='e' && chess[0][0].status_index=='1')&& (chess[0][1].status_coin==' ' && chess[0][1].status_index==' ')&&(chess[0][2].status_coin==' ' && chess[0][2].status_index==' ')&&(chess[0][3].status_coin==' ' && chess[0][3].status_index==' '))
   {
      chess[0][2].status_destiny='C';  cast=1;

   }
   else if((chess[0][7].status_coin=='e' && chess[0][7].status_index=='2')&& (chess[0][6].status_coin==' ' && chess[0][6].status_index==' ')&&(chess[0][5].status_coin==' ' && chess[0][5].status_index==' '))
   {
      chess[0][6].status_destiny='C';  cast=2;
   }


 }



}
void ChessF::verify_Destiny()
{                         char aaa;
  for(int i=0;i<8;i++)
   {
	for(int j=0;j<8;j++)
	{
		if(dest==chess[i][j].status_destiny)
		{
		 rd=i;cd=j;
		}

	}
   }


   if(chess[rd][cd].status_color!=my_color && chess[rd][cd].status_destiny==dest)
   {
		 valid_destiny=1;
		move_Destiny();

//		 threat_Finder();

		display_Board();

	       refresh_Visibility();

		    give_A_Life();


	       //   technical_Check_Mate();
   }
   else
   {

	 valid_destiny=0;

   }


	     //refreshing destiny
	     for(i=0;i<8;i++)
	      {
		for(j=0;j<8;j++)
		 {
			chess[i][j].status_destiny=' ';
		 }
	      }



}

void ChessF::is_check()
{
   check=0;
   char aa,d15=15;
   int ii,jj;
 for(int i=0;i<8;i++)
 {
	for(int j=0;j<8;j++)
	{

		if(chess[i][j].status_coin=='k' && chess[i][j].status_color==my_color)
		{
			rs=i;
			cs=j;
		}
	}
 }
	  //	rs,cs are noted

 for(i=0;i<8;i++)
 {
	for(j=0;j<8;j++)
	{
		//camel
	  if(chess[i][j].status_coin=='c'  && chess[i][j].status_color==opp_color)
	  {
		  var='a';
		  destiny_Camel();

	      if(chess[i][j].status_destiny!=' ')
	       {	  //camel or queen
	       chess[i][j].status_source=d15;
		  check=1;
	       }
   for(ii=0;ii<8;ii++)
	for(jj=0;jj<8;jj++)
	    chess[ii][jj].status_destiny=' ';

	  }
		// queen
	 if(chess[i][j].status_coin=='q'  && chess[i][j].status_color==opp_color)
	  {
		  var='a';
		  destiny_Camel();
		  destiny_Elephant();
	      if(chess[i][j].status_destiny!=' ')
	       {	  //camel or queen
		chess[i][j].status_source=d15;
		  check=1;
	       }
	  for(ii=0;ii<8;ii++)
		for(jj=0;jj<8;jj++)
		    chess[ii][jj].status_destiny=' ';

	  }



		//elephant
	 if(chess[i][j].status_coin=='e'  && chess[i][j].status_color==opp_color)
	 {
		 var='a';
		 destiny_Elephant();
	      if(chess[i][j].status_destiny!=' ')
	      {
	       chess[i][j].status_source=d15;
		check=1;
	      }
	  for(ii=0;ii<8;ii++)
		for(jj=0;jj<8;jj++)
		    chess[ii][jj].status_destiny=' ';

	 }
	 if(chess[i][j].status_coin=='h' && chess[i][j].status_color==opp_color)
	 {
			//horse
		  var='a';
		  destiny_Horse();

	      if(chess[i][j].status_destiny!=' ')
	      {
	       chess[i][j].status_source=d15;
		check=1;
	      }
	  for(ii=0;ii<8;ii++)
		for(jj=0;jj<8;jj++)
		    chess[ii][jj].status_destiny=' ';

	 }
	 if(chess[i][j].status_coin=='s' && chess[i][j].status_color==opp_color)
	 {
	  //sepoy
	 var='a';

	   //destiny_sepoy--
     if(my_color==black_color )
     {
      if(chess[rs+1][cs+1].status_color==opp_color && rs<7 && cs<7)
	chess[rs+1][cs+1].status_destiny=var++;

      if(chess[rs+1][cs-1].status_color==opp_color && rs<7 && cs>0)
	chess[rs+1][cs-1].status_destiny=var++;
     }
     else if(my_color==white_color)
     {
      if(chess[rs-1][cs+1].status_color==opp_color && rs>0 && cs<7)//kill move
	chess[rs-1][cs+1].status_destiny=var++;

      if(chess[rs-1][cs-1].status_color==opp_color && rs>0 && cs>0)//kill move
      chess[rs-1][cs-1].status_destiny=var++;
     }

	 if(chess[i][j].status_destiny!=' ')
	 {
	       chess[i][j].status_source=d15;
		check=1;
	 }
	  for(ii=0;ii<8;ii++)
		for(jj=0;jj<8;jj++)
		    chess[ii][jj].status_destiny=' ';

      }//for j
 }  //for i

 }

 for(i=0;i<8;i++)
	for(j=0;j<8;j++)
	    chess[i][j].status_destiny=' ';


}
void ChessF::give_A_Life()
{
      char choices;

	if(rd==7 && chess[rd][cd].status_coin=='s' && chess[rd][cd].status_color==black_color)
	{
   do{
	cout<<"\n\t\tENTER A COIN U WANT TO GIVE A NEW LIFE";
	cout<<"\n\tSPECIFY Q-QUEEN ,H-HORSE...[\t]\b\b\b\b\b";
	cin>>choices;
	switch(choices){
	case 'q':
		{
		chess[rd][cd].status_source=' ';
		chess[rd][cd].status_destiny=' ';
		chess[rd][cd].status_color=black_color;
		chess[rd][cd].status_coin='q';
		chess[rd][cd].status_index=++queen_index_B;
		break;
		}
	case 'e':
		{
		chess[rd][cd].status_source=' ';
		chess[rd][cd].status_destiny=' ';
		chess[rd][cd].status_color=black_color;
		chess[rd][cd].status_coin='e';
		chess[rd][cd].status_index=++elephant_index_B;
		break;
		}

	case 'h':
		{
		chess[rd][cd].status_source=' ';
		chess[rd][cd].status_destiny=' ';
		chess[rd][cd].status_color=black_color;
		chess[rd][cd].status_coin='h';
		chess[rd][cd].status_index=++horse_index_B;
		break;
		}
	case 'c':
		{
		chess[rd][cd].status_source=' ';
		chess[rd][cd].status_destiny=' ';
		chess[rd][cd].status_color=black_color;
		chess[rd][cd].status_coin='c';
		chess[rd][cd].status_index=++camel_index_B;
		break;
		}
	default:cout<<"\n\tINVALID COIN";

			}//SWITCH
    }while(choices!='c' && choices!='h' && choices!='e' && choices!='q');
	}

	if(rd==0 && chess[rd][cd].status_coin=='s' && chess[rd][cd].status_color==white_color)
	{
      do
      {
	cout<<"\n\t\t\aENTER A COIN U WANT TO GIVE A NEW LIFE";
	cout<<"\n\tSPECIFY Q-QUEEN ,H-HORSE...[\t]\b\b\b\b\b\a";
	cin>>choices;
	switch(choices){
	case 'q':
		{
		chess[rd][cd].status_source=' ';
		chess[rd][cd].status_destiny=' ';
		chess[rd][cd].status_color=white_color;
		chess[rd][cd].status_coin='q';
		chess[rd][cd].status_index=++queen_index_W;
		break;
		}
	case 'e':
		{
		chess[rd][cd].status_source=' ';
		chess[rd][cd].status_destiny=' ';
		chess[rd][cd].status_color=white_color;
		chess[rd][cd].status_coin='e';
		chess[rd][cd].status_index=++elephant_index_W;
		break;
		}

	case 'h':
		{
		chess[rd][cd].status_source=' ';
		chess[rd][cd].status_destiny=' ';
		chess[rd][cd].status_color=white_color;
		chess[rd][cd].status_coin='h';
		chess[rd][cd].status_index=++horse_index_W;
		break;
		}
	case 'c':
		{
		chess[rd][cd].status_source=' ';
		chess[rd][cd].status_destiny=' ';
		chess[rd][cd].status_color=white_color;
		chess[rd][cd].status_coin='c';
		chess[rd][cd].status_index=++camel_index_W;
		break;
		}
	default:cout<<"\n\tINVALID COIN";

			}//SWITCH
	cout<<"\a";
      }while(choices!='c' && choices!='h' && choices!='e' && choices!='q');


	  //refreshing source
	  for(int i=0;i<8;i++)
	  {
		for(int j=0;j<8;j++)
		{
			chess[i][j].status_source=' ';
		}
	  }

	}
}

void ChessF::move_Destiny()
{
	prev_s=chess[rs][cs].status_coin;
	prev_d=chess[rd][cd].status_coin;

	 sound(1500);delay(150);
			sound(2000);delay(180);
  if(dest=='C')
  {

	chess[rd][cd].status_source=chess[rs][cs].status_source;
	chess[rs][cs].status_source=' ';


		sound(1800);delay(600);//nosound();
			sound(1850);delay(400);//nosound();

	chess[rd][cd].status_coin=chess[rs][cs].status_coin;
	chess[rs][cs].status_coin=' ';
		sound(1200);delay(160);


	chess[rd][cd].status_color=chess[rs][cs].status_color;
	chess[rs][cs].status_color=' ';

				sound(1300);delay(165);


	chess[rd][cd].status_index=chess[rs][cs].status_index;
	chess[rs][cs].status_index=' ';

				sound(1350);delay(170);nosound();


	chess[rd][cd].status_destiny=chess[rs][cs].status_destiny;
	chess[rs][cs].status_destiny=' ';

			sound(1350);delay(170);nosound();


//---elephant swap
	if(cast==1)
	{
	chess[rs][cs-1].status_source=chess[rs][cs-4].status_source;
	chess[rs][cs-4].status_source=' ';


		sound(1800);delay(600);//nosound();
		sound(1850);delay(400);//nosound();

	chess[rs][cs-1].status_coin=chess[rs][cs-4].status_coin;
	chess[rs][cs-4].status_coin=' ';
		sound(1200);delay(160);


	chess[rs][cs-1].status_color=chess[rs][cs-4].status_color;
	chess[rs][cs-4].status_color=' ';

				sound(1300);delay(165);


	chess[rs][cs-1].status_index=chess[rs][cs-4].status_index;
	chess[rs][cs-4].status_index=' ';

				sound(1350);delay(170);nosound();


	chess[rs][cs-1].status_destiny=chess[rs][cs-4].status_destiny;
	chess[rs][cs-4].status_destiny=' ';

			sound(1350);delay(170);nosound();
	}
      else if(cast==2)
      {
	chess[rs][cs+1].status_source=chess[rs][cs+3].status_source;
	chess[rs][cs+3].status_source=' ';


		sound(1800);delay(600);//nosound();
			sound(1850);delay(400);//nosound();

	chess[rs][cs+1].status_coin=chess[rs][cs+3].status_coin;
	chess[rs][cs+3].status_coin=' ';
		sound(1200);delay(160);


	chess[rs][cs+1].status_color=chess[rs][cs+3].status_color;
	chess[rs][cs+3].status_color=' ';

				sound(1300);delay(165);


	chess[rs][cs+1].status_index=chess[rs][cs+3].status_index;
	chess[rs][cs+3].status_index=' ';

				sound(1350);delay(170);nosound();


	chess[rs][cs+1].status_destiny=chess[rs][cs+3].status_destiny;
	chess[rs][cs+3].status_destiny=' ';

			sound(1350);delay(170);nosound();
	}



  }
  else //cast is not 1
  {

	chess[rd][cd].status_source=chess[rs][cs].status_source;
	chess[rs][cs].status_source=' ';

		sound(1800);delay(600);//nosound();
			sound(1850);delay(400);//nosound();

	chess[rd][cd].status_coin=chess[rs][cs].status_coin;
	chess[rs][cs].status_coin=' ';
		sound(1200);delay(160);


	chess[rd][cd].status_color=chess[rs][cs].status_color;
	chess[rs][cs].status_color=' ';

				sound(1300);delay(165);


	chess[rd][cd].status_index=chess[rs][cs].status_index;
	chess[rs][cs].status_index=' ';

				sound(1350);delay(170);nosound();


	chess[rd][cd].status_destiny=chess[rs][cs].status_destiny;
	chess[rs][cs].status_destiny=' ';

			sound(1350);delay(170);nosound();


  }
}
//-----------------game starts-------------------------
 void ChessF::game()
{

	   char choice;
	initialising_Players();
do
{
 strcpy(my_player,p1);
 strcpy(opp_player,p2);

 my_color=white_color;
 opp_color=black_color;
 display_Board();
	 move();

 strcpy(my_player,p2);
 strcpy(opp_player,p1);

 my_color=black_color;
 opp_color=white_color;
 display_Board();
	 move();

}while(1);

}





void ChessF::help_Menu()
{
clrscr();
A=1000;B=1020;C=1060;D=1110;E=1180;F=1260;G=1340;
cout<<"\n\n\n\n\n\n\t\t\t\t\tHELP-MENU";
   sound(A);delay(1000);nosound();
cout<<"\n\n\t-> GAME CONSIST OF TWO PLAYERS";
      sound(B);delay(1000);nosound();
cout<<"\n\n\t-> EACH PLAYER HAS HIS OWN KINGDOM PROVIDED";
cout<<"\n\n\t-> WITH KING,QUEEN,CAMELS,ELEPHANTS,HORSES";
cout<<"\n\n\t-> SOLDIERS TO CONQUER THEIR PREDETER ";
	   sound(C);delay(1000);nosound();
cout<<"\n\n\t-> EACH OF THE COIN MOVES ON ITS OWN BEHAVIOR";
 sound(D);delay(1000);nosound();
cout<<"\n\n\n\t[  KING     ]-> CAN MOVE OR CAPTURE ONE SQUARE IN ANY";
cout<<"\n\t\t\t\t DIRECTION ";
 sound(E);delay(1000);nosound();
cout<<"\n\n\n\t[  QUEEN    ] -> CAN MOVE OR CAPTURE ANY NO OF MOVES";
cout<<"\n\t\t\t HORIZONTALLY OR VERTICALLY OR DIAGONALLY ";
  sound(F);delay(1000);nosound();
cout<<"\n\n\n\t[  CAMEL    ] -> CAN MOVE OR CAPTURE ANY NO OF MOVES";
cout<<"\n\t\t\t DIAGONALLY ";
   sound(G);delay(1000);nosound();
cout<<"\n\n\n\t[  ELEPHANT ] -> CAN MOVE OR CAPTURE ANY NO OF MOVES";
cout<<"\n\t\t\tHORIZONTALLY OR VERTICALLY  ";
   sound(F);delay(1000);nosound();
cout<<"\n\n\n\t[  HORSE    ] -> CAN MOVE OR CAPTURE ANY NO OF MOVES";
cout<<"\n\t\t\tIN A 'L' PATTERN INDICATED ";
cout<<"\n\t\t\tIT IS THE ONLY PIECE THAT CAN JUMP OVER OTHER PIECE ";
   sound(E);delay(1000);nosound();
cout<<"\n\n\n\t[	SOLDIER   ] -> CAN MOVE ONLY STRAIGHT A HEAD";
cout<<"\n\t\t\tAND CAN CAPTURE DIAGONALLY 1 SQUARE  ";
cout<<"\n\t\t\tIT IS THE ONLY PIECE THAT CAN GIVE ";
cout<<"\n\t\t\tA NEW LIFE FOR OTHER COINS EXCEPT KING ";
cout<<"\n\t\t\tTHE PLAYER IS GIVEN A CHANCE TO TAKE ";
cout<<"\n\t\t\tANY ONE OF THAT COINS WHEN A SOLDIER ";
cout<<"\n\t\t\tMOVES TO THE OTHER END ";
   sound(D);delay(1000);nosound();
cout<<"\n\n\t	[ ****	CHECK  **** ]	";
cout<<"\n\n\tANY MOVE THAT ATTACKS A KING IS A CHECK";
   sound(C);delay(1000);nosound();
cout<<"\n\n\n\t   [ ****	CHECK MATE  **** ]	";
cout<<"\n\n\tIF CHECK IS SO IMMEMSE THAT THE KING CANNOT ";
cout<<"\n\t\t\tTOLERATE ANY GIVES UP";
   sound(B);delay(1000);nosound();
cout<<"\n\t\t\t$$$***********HAVE A NICE GAME************$$$\n\n\n\n\n";



   sound(A);delay(1000);nosound();
}



void ChessF::credits()
{
	clrscr();
	cout<<"\n\n-~'~-.,.-~'~-.,.-~'~-.,.-~'~-.,.-~'~-.,.-~'~-.,.-~'~-.,.-~'~-\n\n";
	cout<<"-~'~-.,.-~'~-.,.-~'~-.,.-~'~-.,.-~'~-.,.-~'~-.,.-~'~-.,.-~'~-\n\n";
	cout<<"\a   a PRoGRaM BY THe STuDeNT oF CvR CoLLeGe oF eNGiNeeRiNG!\n\n\n";
	cout<<"\n\nInspired by\t:\tMy previous program of ChessF\n\n";
	cout<<"\nSpecial thanks\t:\tTo my parents for their immense support\n\n\t\t\tTo the faculty of our College\n\n";
	cout<<"\a\nProgrammed by\t:\tK. Venkat Ram Reddy,\n\t\t\tCSE IIyear,\n\t\t\tCVR College of Engg.\n\n";
	cout<<"\n\t\t:\tC. S. Srikanth,\n\t\t\tCSE IIyear,\n\t\t\tCVR College of Engg.\n\n";
	cout<<"\a\n\n  -.,.-~ '~-.,.-~'~-.,.-~'~-.,.-~'~-.,.-~'~-.,.-~'~-.,.-~'~-.,-~\n";
	cout<<"    ,.-~'~-.,.-~'~-,.-~'~-.,. -~'~-.,.-~'~-..-~'~-.,.-~'~-.,.-~'~-\n";
	cout<<"\n,.-~'~-.,.- ~'~-. ,.-~'~-.,.-~'~-.,.-~'~-.,.-~'~-.,.-~'~-.,-~\n";
	cout<<" -.,. -~'-.,.-~'~-.,.-~'.,.-~'~-..-~'~-.,.-~'~-. ,.-~'~-.,-~\n";
	cout<<"\n,.-~'~-.,.- ~' ~-.,.-~ '~ -.,.-~ -.,.-~'~-.,.-~'~ -.,.-~'~-.,.-~'~-\n";
	cout<<"  ,.-~'~-.,.-~'~-., .-~'~.,.-~'~-.,.-~'~-.,.-~'~-.,.-~'~-.,-~\n";
	cout<<"\n\n\nFinal note\t:\tThe flow of thoughts and effort are never going to stop!\n\n\n";

}




void main()
{
int i,j;
char urchoice,a,b,c,d,e,f,s;
  s=0;  a=218;  b=191;  c=192;  d=217;  e=196;  f=179;

do{

clrscr();

cout<<"\n\n\n\n";
cout<<"\n\t"<<a;
for(i=0;i<63;i++)
cout<<e;
cout<<b;

for(j=0;j<7;j++)
{
cout<<"\n\t"<<f;
for(i=0;i<63;i++)
cout<<s;
cout<<f;

}

cout<<"\n\t"<<f;
for(i=0;i<25;i++)
cout<<s;

cout<<"  !~    ~!   ";

for(i=0;i<25;i++)
cout<<s;
cout<<f;

for(j=0;j<3;j++)
{
cout<<"\n\t"<<f;
for(i=0;i<63;i++)
cout<<s;
cout<<f;

}

cout<<"\n\t"<<f<<"\t[\t1\t]\t:\tANCIENTINDIAN CHECKERS  "<<f;
for(j=0;j<4;j++)
{
cout<<"\n\t"<<f;
for(i=0;i<63;i++)
cout<<s;
cout<<f;
}

cout<<"\n\t"<<f<<"\t[\t2\t]\t:\t MODERN INDIAN CHECHERS "<<f;

for(j=0;j<4;j++)
{
cout<<"\n\t"<<f;
for(i=0;i<63;i++)
cout<<s;
cout<<f;
}
cout<<"\n\t"<<f<<"\t[\t3\t]\t:\tINTELLECTUAL CHESS GAME "<<f;
for(j=0;j<4;j++)
{
cout<<"\n\t"<<f;
for(i=0;i<63;i++)
cout<<s;
cout<<f;
}

cout<<"\n\t"<<f;
for(i=0;i<63;i++)
cout<<s;
cout<<f;

cout<<"\n\t"<<f<<"\t[\t4\t]\t:\t\tEXIT     \t"<<f;
for(j=0;j<8;j++)
{
cout<<"\n\t"<<f;
for(i=0;i<63;i++)
cout<<s;
cout<<f;
}
cout<<"\n\t"<<c;
for(i=0;i<63;i++)
cout<<e;
cout<<d;


cout<<"\n\n\n\t";
for(i=0;i<49;i++)
cout<<s;
cout<<"[	    ]\b\b\b\b\b\b\b\b";


cin>>urchoice;

Checkers *CH;          //usage of base class reference
switch(urchoice)
{
case '1':
Checkers C1;
		CH=&C1;
		CH->menu();
		break;
case '2':
	break;
case '3':
ChessF Ches;
		CH=&Ches;
		CH->menu();
		break;
case '4':	exit(0);
default:cout<<"\n\n\t\tFOLLOW THE INSTRUCTIONS\t:";

}
}while(urchoice!='2' || urchoice!='1');
getch();

}