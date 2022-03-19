package business.abstracts;

public interface CrudRepository {
	 void add() ;
	
	 void list() ;
	
	 void update() ;
	
	 void remove();
}

//interfaceler sadece imza tutar. 
//default publictir yazmaya gerek yok.
// public void add(){sysout("demo")} 
//yular�daki kodda sysout k�sm� interfacelerde yaz�lmaz.
// sadece void add(); gibi imzalar yaz�l�r.