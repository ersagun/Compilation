/*
 * analyseur lexical du langage exemple-expr:
 * (voir support de cours CUP)
 *
 * auteur : azim.roussanaly@univ-lorraine.fr
 * (c) 2015
 */

package fr.ul.miage.exemple.generated;
import java_cup.runtime.Symbol;

%%

/* options */
%line
%public
%cupsym ParserSym
%cup

/* macros */
SEP     =   [ \t]
NUM     =   [0-9]+

%%

/* regles */

"+"         { return new Symbol(ParserSym.ADD);}
"*"         { return new Symbol(ParserSym.MUL);}
"("         { return new Symbol(ParserSym.PO);}
")"         { return new Symbol(ParserSym.PF);}
{NUM}       { return new Symbol(ParserSym.NUM);}

{SEP}       { ; }
"\r"		{ return new Symbol(ParserSym.EOF);}

