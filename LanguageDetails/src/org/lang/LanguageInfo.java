package org.lang;
//Child Class
public class LanguageInfo {
private void tamilLanguage() {
	System.out.println("Tamil language");
}
private void englishLanguage() {
	System.out.println("EnglishLanguage");

}
private void hindiLanguage() {
	System.out.println("Hindi language");
}
public static void main(String[] args) {
	LanguageInfo a=new LanguageInfo();
	a.tamilLanguage();
	a.englishLanguage();
	a.hindiLanguage();
	
	StateDetails b=new StateDetails();
	b.southIndia();
	b.northIndia();
	
}
}
