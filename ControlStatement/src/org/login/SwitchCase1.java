package org.login;

public class SwitchCase1 {
private void heroORNot(String hero) {
	switch(hero) {
	case("Iron Man"):{
		System.out.println("Iron man is super hero");
		break;
	}
	case("Captain America"):{
		System.out.println("Captain America is super hero");
		break;
	}
	case("Bat Man"):{
		System.out.println("Bat man is super hero");
		break;
	}
	default:{
		System.out.println("not a hero");
	}
	}

}
public static void main(String[] args) {
	SwitchCase1 a=new SwitchCase1();
	a.heroORNot("Bat Man");
}
}
