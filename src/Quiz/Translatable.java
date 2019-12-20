package Quiz;
/*Et interface er en samling navne på metoder
Et interface kan implementeres af en klasse og dermed kan klassen bruge interfacets
 metoder, der beskriver, hvad der skal ske, når metoderne kaldes.
*/

public interface Translatable {

   static String translate(String Language){
       return Language;
   }

}
