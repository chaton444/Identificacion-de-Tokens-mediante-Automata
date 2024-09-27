/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chato
 */
public class automata {
 enum State {
        START, 
        IF, 
        MAIN, 
        ELSE, 
        SWITCH, 
        CASE, 
        DEFAULT, 
        FOR, 
        DO, 
        WHILE, 
        BREAK,
        INT, 
        STRING, 
        DOUBLE, 
        CHAR, 
        PRINT,
        IDENTIFICADOR, 
        OPERADOR_RELACIONAL, 
        OPERADOR_LOGICO, 
        OPERADOR_ARITMETICO,
        INCREMENTO, 
        DECREMENTO, 
        ASIGNACION, 
        ENTERO, 
        DECIMAL, 
        STRING_LITERAL,
        COMMENT, 
        LINEA_COMENTARAIO, 
        PARENTESIS, 
        BRACE, 
        ERROR
    }
   private static final Map<String, State> Palabras_Reservadas = new HashMap<>();
       static {
        Palabras_Reservadas .put("if", State.IF);
        Palabras_Reservadas .put("main", State.MAIN);
        Palabras_Reservadas .put("else", State.ELSE);
        Palabras_Reservadas .put("switch", State.SWITCH);
        Palabras_Reservadas .put("case", State.CASE);
        Palabras_Reservadas .put("default", State.DEFAULT);
        Palabras_Reservadas .put("for", State.FOR);
        Palabras_Reservadas .put("do", State.DO);
        Palabras_Reservadas .put("while", State.WHILE);
        Palabras_Reservadas .put("break", State.BREAK);
        Palabras_Reservadas .put("int", State.INT);
        Palabras_Reservadas .put("String", State.STRING);
        Palabras_Reservadas .put("double", State.DOUBLE);
        Palabras_Reservadas .put("char", State.CHAR);
        Palabras_Reservadas .put("print", State.PRINT);
    }
   
}
