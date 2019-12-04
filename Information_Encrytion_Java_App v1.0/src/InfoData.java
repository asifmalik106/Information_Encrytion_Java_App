/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asifc
 */
public class InfoData {
    
    
    
    public String encString(String s){
        String output = s.toLowerCase();
        char[] charArray = output.toCharArray();
        output = "";
        for(int i = 0; i<charArray.length; i++){
            output += Character.toString(encChar(charArray[i]));
        }
        return output;
    }

    private char encChar(char c){
        char r = ' ';
        switch(c){
            case 'a':
                r = 'K';
                break;
            case 'b':
                r = '<';
                break;
            case 'c':
                r = '0';
                break;
            case 'd':
                r = 'm';
                break;
            case 'e':
                r = '7';
                break;
            case 'f':
                r = '?';
                break;
            case 'g':
                r = 'z';
                break;
            case 'h':
                r = 'k';
                break;
            case 'i':
                r = '8';
                break;
            case 'j':
                r = '4';
                break;
            case 'k':
                r = 'q';
                break;
            case 'l':
                r = '!';
                break;
            case 'm':
                r = 'A';
                break;
            case 'n':
                r = 'v';
                break;
            case 'o':
                r = 'n';
                break;
            case 'p':
                r = '-';
                break;
            case 'q':
                r = '/';
                break;
            case 'r':
                r = 'c';
                break;
            case 's':
                r = 'a';
                break;
            case 't':
                r = 'u';
                break;
            case 'u':
                r = 'O';
                break;
            case 'v':
                r = '1';
                break;
            case 'w':
                r = '9';
                break;
            case 'x':
                r = 'M';
                break;
            case 'y':
                r = 'H';
                break;
            case 'z':
                r = '2';
                break;
            case '0':
                r = 'x';
                break;
            case '1':
                r = 'h';
                break;
            case '2':
                r = '>';
                break;
            case '3':
                r = 'C';
                break;
            case '4':
                r = '}';
                break;
            case '5':
                r = '.';
                break;
            case '6':
                r = ';';
                break;
            case '7':
                r = ')';
                break;
            case '8':
                r = '{';
                break;
            case '9':
                r = '(';
                break;
            case ',':
                r = '%';
                break;
            case '.':
                r = '#';
                break;
            case '!':
                r = '@';
                break;
            case '@':
                r = 'B';
                break;
            case ' ':
                r = 'N';
                break;
            case '?':
                r = '=';
                break;
            default:
                break;
        }
        return r;
    }
    
    public String decString(String s){
        String output = "";
        char[] charArray = s.toCharArray();
       
        for(int i = 0; i<charArray.length; i++){
            output += Character.toString(decChar(charArray[i]));
        }
        return output;
    }

    private static char decChar(char c){
        char r = ' ';
        switch(c){
            case 'K':
                r = 'a';
                break;
            case '<':
                r = 'b';
                break;
            case '0':
                r = 'c';
                break;
            case 'm':
                r = 'd';
                break;
            case '7':
                r = 'e';
                break;
            case '?':
                r = 'f';
                break;
            case 'z':
                r = 'g';
                break;
            case 'k':
                r = 'h';
                break;
            case '8':
                r = 'i';
                break;
            case '4':
                r = 'j';
                break;
            case 'q':
                r = 'k';
                break;
            case '!':
                r = 'l';
                break;
            case 'A':
                r = 'm';
                break;
            case 'v':
                r = 'n';
                break;
            case 'n':
                r = 'o';
                break;
            case '-':
                r = 'p';
                break;
            case '/':
                r = 'q';
                break;
            case 'c':
                r = 'r';
                break;
            case 'a':
                r = 's';
                break;
            case 'u':
                r = 't';
                break;
            case 'O':
                r = 'u';
                break;
            case '1':
                r = 'v';
                break;
            case '9':
                r = 'w';
                break;
            case 'M':
                r = 'x';
                break;
            case 'H':
                r = 'y';
                break;
            case '2':
                r = 'z';
                break;
            case 'x':
                r = '0';
                break;
            case 'h':
                r = '1';
                break;
            case '>':
                r = '2';
                break;
            case 'C':
                r = '3';
                break;
            case '}':
                r = '4';
                break;
            case '.':
                r = '5';
                break;
            case ';':
                r = '6';
                break;
            case ')':
                r = '7';
                break;
            case '{':
                r = '8';
                break;
            case '(':
                r = '9';
                break;
            case '%':
                r = ',';
                break;
            case '#':
                r = '.';
                break;
            case '@':
                r = '!';
                break;
            case 'B':
                r = '@';
                break;
            case 'N':
                r = ' ';
                break;
            case '=':
                r = '?';
                break;
            default:
                break;
        }
        return r;
    }
    
}
